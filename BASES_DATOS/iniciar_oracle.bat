@echo off
echo Iniciando los servicios de Oracle...
net start OracleMTSRecoveryService
net start OracleMTSRecoveryService
net start OracleServiceXE
net start OracleServiceXE
net start OracleXEClrAgent
net start OracleXEClrAgent
net start OracleXETNSListener
net start OracleXETNSListener
echo Servicios de Oracle iniciados correctamente.
pause
