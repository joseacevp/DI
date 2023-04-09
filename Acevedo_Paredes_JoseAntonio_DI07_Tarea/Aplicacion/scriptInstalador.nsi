;Utilizamos Modern UI

!include "MUI2.nsh"

Name "Instalador Tarea 7 Desarrollo Interfaces"
OutFile "instaladorTarea7.exe"
Unicode True
InstallDir "$PROGRAMFILES\Tarea7DI"
InstallDirRegKey HKCU "Software\Tarea7DI" ""
RequestExecutionLevel user
!define MUI_ABORTWARNING

!insertmacro MUI_PAGE_COMPONENTS
!insertmacro MUI_PAGE_DIRECTORY
!insertmacro MUI_PAGE_INSTFILES
!insertmacro MUI_UNPAGE_CONFIRM
!insertmacro MUI_UNPAGE_INSTFILES

!insertmacro MUI_LANGUAGE "Spanish"

Section "Fichero jar" SecDummy
SetOutPath "INSTDIR"
File Acevedo_Paredes_JoseAntonio_DI07_Tarea.jar
WriteRegStr HKCU : Software\Software\Tarea7DI
WriteUninstaller "$INSTDIR\Uninstall.exe"
SectionEnd

LangString DESC_SecDummy ${LANG_SPANISH}
!insertmacro MUI_FUNCTION_DESCRIPTION_BEGIN
!insertmacro MUI_DESCRIPTION_TEXT ${SecDummy} $(DESC_SecDummy)
!insertmacro MUI_FUNCTION_DESCRIPTION_END

Section "Desinstalar"
Delete "$INSTDIR\Uninstall.exe"
RMDir "$INSTDIR"
DeleteRegKey /ifempty HKCU "Software\Tarea7DI"
SectionEnd