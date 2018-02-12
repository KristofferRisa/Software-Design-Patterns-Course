/*
 * Created on 14.jun.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package controller;

import easylib.controller.Usecase;


public interface IActionlist  {
	Usecase OPEN = new Usecase("velg kildefil", null);
	Usecase TIDY = new Usecase("utfør tidy", null);
	Usecase SAVE = new Usecase("lagre ny versjon", null);
}
