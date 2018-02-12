/*
 * Created on 27.okt.2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gui.domain;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

import model.ConfigInfo;
import model.Processnode;

public class Domainview extends JPanel {

	private JSplitPane vertical = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
	private JSplitPane horizontal = new JSplitPane();
	private Sourcepane sourcepane = new Sourcepane();
	private Targetpane targetpane = new Targetpane();
	private Errorpane errorpane = new Errorpane();

	public Domainview() {
		setLayout(new BorderLayout());
		horizontal.setLeftComponent(sourcepane);
		horizontal.setRightComponent(targetpane);
		vertical.setTopComponent(horizontal);
		vertical.setBottomComponent(errorpane);
		add(vertical);
	}

	public void setDividers() {
		vertical.setDividerLocation(0.75);
		horizontal.setDividerLocation(0.5);
	}

	public void open() {
		vertical.setDividerLocation(0.95);
		horizontal.setDividerLocation(0.5);
		sourcepane.open();
	}

	public void tidy() {
		setDividers();
		Processnode tidyNode = new Processnode(sourcepane.getText());
		targetpane.setText(tidyNode.execute(ConfigInfo.getCommandlist()));
		errorpane.setText(tidyNode.getErrors());
	}

	public void save() {
		targetpane.save();
	}

}
