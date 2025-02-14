import tkinter as tk
from PIL import Image, ImageTk
import random
import os
import ctypes
import pygame
import threading

# 🛑 MINIMIZAR TODAS LAS VENTANAS + OCULTAR LA BARRA DE TAREAS 🛑
def minimizar_todo():
    # Minimizar la ventana de la consola de Python
    ctypes.windll.user32.ShowWindow(ctypes.windll.kernel32.GetConsoleWindow(), 6)

    # Minimizar todas las ventanas activas
    os.system('powershell -Command "(New-Object -ComObject Shell.Application).MinimizeAll()"')

    # Ocultar la barra de tareas
    ctypes.windll.user32.ShowWindow(ctypes.windll.user32.FindWindowW("Shell_TrayWnd", None), 0)

minimizar_todo()

# Obtener la ruta del script actual
script_dir = os.path.dirname(os.path.abspath(__file__))

# Cargar la imagen y sonido desde la misma carpeta donde está el script
imagen_path = os.path.join(script_dir, "freddy.png")
sonido_path = os.path.join(script_dir, "tindross.mp3")  # Ruta del sonido

# Verificar si la imagen existe
if not os.path.exists(imagen_path):
    print(f"Error: No se encontró la imagen {imagen_path}")
    exit()

# Verificar si el sonido existe
if not os.path.exists(sonido_path):
    print(f"Error: No se encontró el sonido {sonido_path}")
    exit()

# Inicializar pygame mixer de manera segura
pygame.mixer.init()

# Cargar la imagen para obtener su tamaño original
img_original = Image.open(imagen_path)
img_width, img_height = img_original.size  # Tamaño original de la imagen

# Número de imágenes flotantes
repeticiones = 10

# Lista para almacenar las ventanas
ventanas = []

# Función para mover las imágenes aleatoriamente
def mover_ventana(ventana):
    screen_width = ventana.winfo_screenwidth()
    screen_height = ventana.winfo_screenheight()
    
    x = random.randint(0, screen_width - img_width)
    y = random.randint(0, screen_height - img_height)
    
    ventana.geometry(f"{img_width}x{img_height}+{x}+{y}")
    ventana.after(500, lambda: mover_ventana(ventana))  # Se mueve cada 500ms

# Función para reproducir sonido cuando aparece una imagen
def reproducir_sonido():
    pygame.mixer.music.load(sonido_path)
    pygame.mixer.music.play()

# Crear ventana oculta de Tkinter para evitar que aparezca la ventana principal
root = tk.Tk()
root.withdraw()  # Oculta la ventana principal

# Crear múltiples ventanas flotantes con la imagen
for _ in range(repeticiones):
    top = tk.Toplevel()  # Crear una nueva ventana flotante
    top.overrideredirect(True)  # Sin bordes
    top.attributes("-topmost", True)  # Siempre arriba
    top.attributes("-transparentcolor", "black")  # Hace transparente el fondo negro

    # Cargar la imagen sin modificar su tamaño
    img = ImageTk.PhotoImage(img_original)

    # Crear un canvas para mostrar la imagen
    canvas = tk.Canvas(top, width=img_width, height=img_height, highlightthickness=0, bg="black")
    canvas.pack()
    canvas.create_image(img_width//2, img_height//2, image=img)

    # Iniciar movimiento
    mover_ventana(top)

    # Reproducir sonido en un hilo separado para evitar bloqueos
    threading.Thread(target=reproducir_sonido, daemon=True).start()

    ventanas.append((top, img))  # Guardamos la ventana y la imagen para que no se cierre

# Mantener las ventanas abiertas
root.mainloop()
