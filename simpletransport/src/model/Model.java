/*
 * Created on 14.sep.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package model;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.table.TableModel;

public class Model extends ConfigDomain {

	public Model() {
		loadConfig();
	}

	public void loadfiles(String pw) {
		String[] cmdar = { pscplocation + PSCP, PW, pw,
				account + ":" + serversource, clienthome };
		Helper.process(cmdar);
	}

	public void storefiles(String pw) {
		String[] cmdar = { pscplocation + PSCP, PW, pw, clientsource,
				account + ":" + serverhome };
		Helper.process(cmdar);
	}

	private Object[][] remotefilelist(String pw) {
		String[] cmdar = { pscplocation + PSCP, PW, pw, "-ls",
				account + ":" + serverhome };
		return Helper.process(cmdar);
	}

	private Object[][] localfilelist() {
		ArrayList<Object[]> a = new ArrayList<Object[]>();
		try {
			File f = new File(clienthome);
			for (File n : f.listFiles()) {
				a.add(new Object[] { new Integer((int) n.length()),
						new Date(n.lastModified()), n.getName() });
			}
		} catch (Exception e) {
		}
		return a.toArray(new Object[0][0]);
	}

	public TableModel listclient() {
		return Helper.tablemodel(localfilelist());
	}

	public TableModel listserver(String pw) {
		return Helper.tablemodel(remotefilelist(pw));
	}

}
