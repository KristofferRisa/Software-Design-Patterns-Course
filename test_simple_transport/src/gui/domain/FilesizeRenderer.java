package gui.domain;

import java.text.Format;
import java.text.NumberFormat;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

class FilesizeRenderer extends DefaultTableCellRenderer {

	private Format formatter;

	FilesizeRenderer() {
		formatter = NumberFormat.getInstance();
		setHorizontalAlignment(SwingConstants.RIGHT);
	}

	protected void setValue(Object obj) {
		setText(obj == null ? "" : formatter.format(obj) + " ");
	}
}