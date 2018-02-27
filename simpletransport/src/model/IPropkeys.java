/*
 * Created on 14.jun.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package model;

/**
 * @author v. holmstedt
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
interface IPropkeys {

	String CLIENTHOME = "clienthome";
	String USER = "username";
	String HOST = "hostname";
	String HOSTHOME = "hosthome";
	String PSCPHOME = "pscphome";

	String CLIENTHOME_TEXT = "lokal arbeidsmappe";
	String USER_TEXT = "ditt brukernavn på tjenermaskinen";
	String HOST_TEXT = "tjenermaskinens navn";
	String HOSTHOME_TEXT = "fellesmappen på tjenermaskinen";
	String PSCPHOME_TEXT = "kjernemappen med pscp.exe";

	String[][] PROPS = { { CLIENTHOME, CLIENTHOME_TEXT }, { USER, USER_TEXT },
			{ HOST, HOST_TEXT }, { HOSTHOME, HOSTHOME_TEXT },
			{ PSCPHOME, PSCPHOME_TEXT } };

}
