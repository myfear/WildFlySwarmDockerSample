@echo off
cls
:loop
curl http://wildfly-swarm.vagrant.f8/rs/customer
sleep 2
echo.

goto loop