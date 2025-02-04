@echo off
echo Deteniendo los servicios de Oracle...
net stop OracleMTSRecoveryService
net stop OracleMTSRecoveryService
net stop OracleServiceXE
net stop OracleServiceXE
net stop OracleXEClrAgent
net stop OracleXEClrAgent
net stop OracleXETNSListener
net stop OracleXETNSListener
echo Servicios de Oracle detenidos correctamente.
pause
