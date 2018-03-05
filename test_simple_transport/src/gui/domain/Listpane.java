/*
 * Created on 14.sep.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gui.domain;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import easylib.controller.SuperAction;

/**
 * @author Viggo
 * 
 */
public class Listpane extends JPanel {

	private JScrollPane jsp = null;

	public Listpane(String title, SuperAction action) {
		setLayout(new BorderLayout());
		JLabel header = new JLabel(title, JLabel.CENTER);
		header.setFont(new Font("sansserif", Font.PLAIN, 14));
		add(header, BorderLayout.NORTH);
		add(new JPanel(), BorderLayout.WEST); // margdekor
		add(new JPanel(), BorderLayout.EAST); // margdekor
		JButton command = new JButton(action);
		command.addMouseListener(action); // for setStatustext
		add(command, BorderLayout.SOUTH);
	}

	public void listfiles(TableModel model) {
		JTable jtable = new JTable(model);
		jtable.setEnabled(false);
		jtable.setFont(new Font("monospace", Font.PLAIN, 12));
		TableColumnModel tcm = jtable.getColumnModel();
		tcm.getColumn(0).setMaxWidth(55);
		tcm.getColumn(0).setCellRenderer(new FilesizeRenderer());
		tcm.getColumn(1).setCellRenderer(new DateRenderer());
		if (jsp != null) {
			remove(jsp);
		}
		jsp = new JScrollPane(jtable);
		add(jsp);
	}

}
