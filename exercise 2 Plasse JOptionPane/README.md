# Plassere JOptionPane
Etabler prosjektet easyeditor fra kildesamlingen.

Studer prosjektet.

Ett av prosjektets use-cases er å lukke programmet. Programmet tilbyr tre ulike muligheter for å gjennomføre dette use-caset.

Når brukeren velger en av de tre mulighetene, lukkes programmet uten betingelser. Dette skjer i en klasse som ikke har sammenheng med ansvar for gui.

Oppgaven er å forandre programmet, slik at når brukeren velger hvilken som helst av de tre mulighetene for å lukke programmet, skal brukeren møte en dialog, der hun kan velge om programmet skal lukkes eller ikke. 

Bruk JOptionPane.showConfirmDialog(null, "Lukke?")==JOptionPane.OK_OPTIONfor å la brukeren velge.

Siden JOptionPane er en komponent med ansvar for gui, må dialogen plasseres i en eksisterende komponent som allerede har ansvar for gui. Du må derfor kanskje forlenge CoR litt for å få til dette.

Du må realisere lukkingen på et sted i CoR som allerede er tilgjengelig for alle de tre brukerkontrollene som lar brukeren stoppe easyeditor.