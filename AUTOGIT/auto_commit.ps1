# Obtiene la fecha y hora en el formato [dd/mm/yyyy] hh:mm
$date = Get-Date -Format "[dd/MM/yyyy] HH:mm"

# Cambia al directorio del repositorio si no estás ya en él (opcional)
Set-Location "C:\Users\daniz\Documents\GitHub\1SI"

# Añade los cambios al stage
git add .

# Hace el commit con el mensaje que incluye la fecha
git commit -m $date

# Envía los cambios al repositorio remoto
git push
