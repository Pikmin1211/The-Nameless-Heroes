cd %~dp0

copy Seihou.gba Seihou_EngTrans.gba

cd "%~dp0Text"

echo: | (textprocess_v2 text_buildfile.txt)

cd "%~dp0Event Assembler"

Core A FE8 "-output:%~dp0Seihou_EngTrans.gba" "-input:%~dp0ROM Buildfile.event"

pause
