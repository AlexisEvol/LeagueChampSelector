; The name of the installer
Name "LeagueRandomizer"

; The file to write
OutFile "LeagueChampChooser.exe"

; Request application privileges for Windows Vista
RequestExecutionLevel admin

; Build Unicode installer
Unicode True

; The default installation directory
InstallDir $DESKTOP

; Pages
Page components
Page directory
Page instfiles
UninstPage uninstConfirm
UninstPage instfiles

; The stuff to install

Section "Stuff that does stuff" required_files
    SectionIn RO
	CreateDirectory $LOCALAPPDATA\RandomChampion\stuff
    CreateDirectory $LOCALAPPDATA\RandomChampion\images
    SetOutPath $INSTDIR
    File Chooser.jar
    SetOutPath "$LOCALAPPDATA\RandomChampion\stuff"
    File gson-2.8.7.jar
    SetOutPath "$LOCALAPPDATA\RandomChampion\stuff"
    File champs.txt
    SetOutPath "$LOCALAPPDATA\RandomChampion\images"
    File images\*.*
SectionEnd