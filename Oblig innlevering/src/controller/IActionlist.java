package controller;

import easylib.controller.Usecase;




/*
 * Det er behov for en lett tilgjengelig liste 
 * over brukstilfeller og ikoner
 * Dette er den viktigste begrunnelsen 
 * for IActionlist og klassen Usecase.
 * 
 * IActionlist skal ha korte linjer. 
 * Hver actionklasse skal ha tekst som forenkler 
 * gjenkjennelsen.
 * Disse er de to viktigste grunnene til at klassen 
 * Usecase ikke inneholder all nødvendig informasjon.  
 */

interface IActionlist {
	Usecase COLOR = new Usecase("farge", null);
	Usecase SHAPE = new Usecase("form", null);
}
