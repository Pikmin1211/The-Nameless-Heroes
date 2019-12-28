cd %~dp0

copy TheNamelessHeroes.gba TheNamelessHeroes_EngTrans.gba

cd "%~dp0Event Assembler"

Core A FE8 "-output:%~dp0TheNamelessHeroes_EngTrans.gba" "-input:%~dp0ROM Buildfile.event"

cd ".."

if exist "%~dp0ups/ups.exe" (
    cd "%~dp0ups"
    ups diff -b "%~dp0FE8J_clean.gba" -m "%~dp0TheNamelessHeroes_EngTrans.gba" -o "%~dp0TheNamelessHeroes_EngTrans.ups"
)

pause
