package gui.domain;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.table.DefaultTableCellRenderer;

class DateRenderer extends DefaultTableCellRenderer {

	private Format formatter;

	DateRenderer() {
		this.formatter = new SimpleDateFormat("EEEE d MMMM yyyy HH:mm");
	}

	protected void setValue(Object o) {
		setText(o instanceof Date ? formatter.format(o) : o.toString());
	}
}
