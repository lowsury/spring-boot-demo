
set curdir=%~dp0
@echo %curdir%
cd %curdir%
call java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite
pause