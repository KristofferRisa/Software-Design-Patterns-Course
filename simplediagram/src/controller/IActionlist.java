/*
 * Created on 14.jun.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package controller;

import easylib.controller.Usecase;


/**
 * @author segovia
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
interface IActionlist {
	Usecase DELETE = new Usecase("fjern", null);
	Usecase INSERT = new Usecase("ny figur", null);
	Usecase CONNECT = new Usecase("koble figurer", null);
	Usecase STORESVG = new Usecase("lagre som svg", null);
	Usecase SHADOW = new Usecase("skygge", null);
	Usecase EDTEXT = new Usecase("rediger tekst", null);
}
