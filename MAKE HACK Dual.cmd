cd %~dp0

copy TheNamelessHeroes.gba TheNamelessHeroes_EngTrans.gba

cd "%~dp0Event Assembler"

Core A FE8 "-output:%~dp0TheNamelessHeroes_EngTrans.gba" "-input:%~dp0ROM Buildfile.event"

cd ".."

if exist "%~dp0ups/ups.exe" (
    cd "%~dp0ups"
    ups diff -b "%~dp0FE8_clean.gba" -m "%~dp0TheNamelessHeroes_EngTrans.gba" -o "%~dp0ups/TNH_EngTrans/TNH_EngTrans.ups"
    ups diff -b "%~dp0FE8J_clean.gba" -m "%~dp0TheNamelessHeroes_EngTrans.gba" -o "%~dp0ups/FE8J_TNH_EngTrans.ups"
)

cd %~dp0

if exist "%~dp0TheNamelessHeroesFatigue.gba" (

	copy TheNamelessHeroesFatigue.gba TheNamelessHeroesFatigue_EngTrans.gba

	cd "%~dp0Event Assembler"

	Core A FE8 "-output:%~dp0TheNamelessHeroesFatigue_EngTrans.gba" "-input:%~dp0ROM Buildfile.event"

	cd ".."

	if exist "%~dp0ups/ups.exe" (
	    cd "%~dp0ups"
	    ups diff -b "%~dp0FE8_clean.gba" -m "%~dp0TheNamelessHeroesFatigue_EngTrans.gba" -o "%~dp0ups/TNH_EngTrans/TNHFatigue_EngTrans.ups"
	    ups diff -b "%~dp0FE8J_clean.gba" -m "%~dp0TheNamelessHeroesFatigue_EngTrans.gba" -o "%~dp0ups/FE8J_TNHFatgiue_EngTrans.ups"
	)

)

pause
