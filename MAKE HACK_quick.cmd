cd %~dp0

copy TheNamelessHeroes.gba TheNamelessHeroes_EngTrans.gba

cd "%~dp0Event Assembler"

Core A FE8 "-output:%~dp0TheNamelessHeroes_EngTrans.gba" "-input:%~dp0ROM Buildfile.event"

cd ".."

start /w FEBuilder/FEBuilderGBA.exe --translate --fromrom=TheNamelessHeroes_EngTrans.gba --torom=FE8_Clean.gba --importfont TheNamelessHeroes_EngTrans.gba

pause
