cd %~dp0

copy TheNamelessHeroes.gba TheNamelessHeroes_EngTrans.gba

cd "%~dp0Text"

echo: | (text-process-classic text_buildfile.txt --parser-exe "%~dp0Event Assembler/Tools/ParseFile.exe")

cd "%~dp0Event Assembler"

Core A FE8 "-output:%~dp0TheNamelessHeroes_EngTrans.gba" "-input:%~dp0ROM Buildfile.event"

pause
