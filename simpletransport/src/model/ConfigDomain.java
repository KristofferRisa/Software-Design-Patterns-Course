package model;

import java.util.Properties;

import javax.swing.Action;

import controller.Controller;
import easylib.propertyeditor.Configmodel;

abstract class ConfigDomain extends Configmodel implements IPropkeys {

	protected final String PSCP = "pscp.exe";
	protected final String PW = "-pw";
	protected String pscplocation;
	protected String account;
	protected String serversource;
	protected String serverhome;
	protected String clientsource;
	protected String clienthome;

	protected void properties2attributes(Properties p) {
		account = p.getProperty(USER) + "@" + p.getProperty(HOST);
		serversource = p.getProperty(HOSTHOME) + "/*";
		serverhome = p.getProperty(HOSTHOME) + "/";
		clientsource = p.getProperty(CLIENTHOME) + "/*";
		clienthome = p.getProperty(CLIENTHOME) + "/";
		pscplocation = p.getProperty(PSCPHOME) + "/";
	}

	public Action getAction() {
		return Controller.astoreprops;
	}

	public String[][] getList() {
		return PROPS;
	}

	public String getTitle() {
		return "Stier og brukernavn";
	}

}
