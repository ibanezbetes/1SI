@echo off
title Cerrar SISTEMAS INOFRMATICOS.exe y restaurar barra de tareas
color 0C
echo Cerrando SISTEMAS INOFRMATICOS.exe y restaurando la barra de tareas...

:: Cerrar SISTEMAS INOFRMATICOS.exe si está en ejecución
tasklist | findstr /I "SISTEMAS INOFRMATICOS.exe" >nul
if %errorlevel% equ 0 (
    taskkill /F /IM "SISTEMAS INOFRMATICOS.exe"
    echo SISTEMAS INOFRMATICOS.exe ha sido cerrado.
) else (
    echo No se encontró SISTEMAS INOFRMATICOS.exe en ejecución.
)

:: Cerrar todas las ventanas de CMD
echo Cerrando todas las ventanas de CMD...
taskkill /F /IM cmd.exe /T

:: Cerrar completamente explorer.exe
echo Cerrando explorer.exe...
taskkill /F /IM explorer.exe /T
timeout /t 3 /nobreak >nul

:: Intentar eliminar cualquier instancia residual de explorer.exe
tasklist | findstr /I "explorer.exe" >nul
if %errorlevel% equ 0 (
    echo Explorer.exe sigue ejecutándose, intentando de nuevo...
    taskkill /F /IM explorer.exe /T
    timeout /t 3 /nobreak >nul
)

:: Asegurar que explorer.exe ha sido eliminado completamente antes de reiniciarlo
echo Verificando si explorer.exe sigue corriendo...
tasklist | findstr /I "explorer.exe" >nul
if %errorlevel% equ 0 (
    echo ERROR: No se pudo cerrar explorer.exe. Intenta cerrarlo manualmente en el Administrador de Tareas.
    pause
    exit
)

:: Reiniciar explorer.exe desde su ubicación original
echo Restaurando la barra de tareas...
start "" "C:\Windows\explorer.exe"
timeout /t 3 >nul

:: Verificar si explorer.exe se inició correctamente
tasklist | findstr /I "explorer.exe" >nul
if %errorlevel% neq 0 (
    echo ERROR: Explorer no se inició correctamente. Intentando nuevamente...
    start "" "C:\Windows\explorer.exe"
    timeout /t 3 >nul
)

:: Confirmar que explorer.exe ha sido restaurado
tasklist | findstr /I "explorer.exe" >nul
if %errorlevel% equ 0 (
    echo Barra de tareas restaurada correctamente.
) else (
    echo ERROR: No se pudo restaurar la barra de tareas. Reinicia el equipo manualmente.
)

pause
exit
