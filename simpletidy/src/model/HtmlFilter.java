package model;

import java.io.File;

import javax.swing.filechooser.FileFilter;



public class HtmlFilter extends FileFilter {

	public boolean accept(File f) {
		String s = f.getName();
		boolean ok = s.endsWith("html") || s.endsWith("htm") || f.isDirectory();
		return ok;
	}

	public String getDescription() {
		return "html-filer";
	}

}
