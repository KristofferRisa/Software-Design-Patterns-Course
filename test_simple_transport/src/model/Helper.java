package model;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.Controller;

final class Helper {

	private static Object[][] filterinfo(String[] v) {
		ArrayList<Object[]> a = new ArrayList<Object[]>();
		for (Object s : v) {
			String[] st = ((String) s).split("\\s *", 9);
			if (st[0].endsWith("-") && st.length > 8) {
				a.add(new Object[] { new Integer(st[4]), // størrelse
					st[5] + " " + st[6] + " " + st[7], // tidspunkt
					st[8] // filnavn
				});
			}
		}
		return a.toArray(new Object[0][0]);
	}

	static TableModel tablemodel(Object[][] data) {
		String[] columnNames = { "størrelse", "tidspunkt", "filnavn" };
		Arrays.sort(data, new Arraycomparator());		
		return new DefaultTableModel(data, columnNames);
	}

	static Object[][] process(String[] cmdar) {
		debugcmd(cmdar);
		Processnode pn = new Processnode("y\n");
		String[] output = pn.execute(cmdar).split("\\n");
		debugexec(output);
		Controller.setStatustext(pn.getErrors());
		return filterinfo(output);
	}

	static private void debugcmd(String[] cmdar) {
		String s = "";
		for (String cmd : cmdar) {
			s += cmd + " ";
		}
		Controller.putline(s + "\n");
	}

	static private void debugexec(String[] liste) {
		for (String l : liste) {
			Controller.putline(l);
		}
	}

}
