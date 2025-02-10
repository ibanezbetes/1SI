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

:: Restaurar la barra de tareas (explorer.exe)
echo Restaurando la barra de tareas...
taskkill /F /IM explorer.exe
start explorer.exe
echo Barra de tareas restaurada.

pause
exit
