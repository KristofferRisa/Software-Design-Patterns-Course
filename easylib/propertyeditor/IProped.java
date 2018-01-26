package easylib.propertyeditor;

import java.util.Properties;

import javax.swing.Action;

interface IProped {
	Action getAction();
	String[][] getList();
	Properties loadConfig();
	String getTitle();
}
