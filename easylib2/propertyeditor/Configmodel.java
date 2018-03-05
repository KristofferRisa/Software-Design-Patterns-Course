package easylib.propertyeditor;

import java.util.Properties;

abstract public class Configmodel implements IProped {

	abstract protected void properties2attributes(Properties p);

	public void storeConfig(Properties p) {
		if (XMLProperties.properties2xmlfile(p)) {
			properties2attributes(p);
		}
	}

	public Properties loadConfig() {
		Properties p = XMLProperties.xmlfile2properties();
		properties2attributes(p);
		return p;
	}

}
