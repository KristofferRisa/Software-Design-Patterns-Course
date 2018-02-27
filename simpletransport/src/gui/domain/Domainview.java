/*
 * Created on 14.sep.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gui.domain;

import easylib.propertyeditor.PropEd;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.table.TableModel;

import model.Model;
import controller.Controller;

/**
 * @author Viggo
 * 
 */
public class Domainview extends JPanel {

	Listpane remote = new Listpane("Felleslageret", Controller.aload);
	Listpane local = new Listpane("Min maskin", Controller.astore);
	private JTextArea textpane = new JTextArea();
	private JSplitPane upper = new JSplitPane();
	private JSplitPane lower = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
	private Model model = new Model();
	private PWDialog password = new PWDialog();
	private PropEd editor = PropEd.getInstance(model);

	public Domainview() {
		setLayout(new BorderLayout());
		upper.setLeftComponent(local);
		upper.setRightComponent(remote);
		lower.setTopComponent(upper);
		lower.setBottomComponent(new JScrollPane(textpane));
		add(lower);
	}

	private void listfiles(TableModel loc, TableModel rem) {
		local.listfiles(loc);
		remote.listfiles(rem);
		upper.setDividerLocation(0.5);
		lower.setDividerLocation(0.85);
	}

	public void putline(String s) {
		textpane.append(s + "\n");
	}

	public void storefiles() {
		model.storefiles(password.get());
		refresh();
	}

	public void loadfiles() {
		model.loadfiles(password.get());
		refresh();
	}

	public void refresh() {
		listfiles(model.listclient(), model.listserver(password.get()));
	}

	public void password() {
		password.password();
	}

	public void storeproperties() {
		model.storeConfig(editor.getProperties());
	}

	public void editproperties() {
		editor.showProped();
	}

}
