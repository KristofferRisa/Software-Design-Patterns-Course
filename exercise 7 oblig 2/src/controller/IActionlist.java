/*
 * Created on 14.jun.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package controller;

import easylib.controller.Usecase;

/**
 * @author v. holmstedt
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public interface IActionlist {
	Usecase LOAD = new Usecase("til Min Datamaskin", null);
	Usecase STORE = new Usecase("til Felleslageret", null);
	Usecase EDITPROPS = new Usecase("egenskaper", null);
	Usecase STRPROPS = new Usecase("lagre verdier", null);	
	Usecase REFRESH = new Usecase("oppfrisk", null);
	Usecase SETPASSWORD = new Usecase("passord", null);
}
