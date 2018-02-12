package model;

import java.io.InputStream;
import java.io.OutputStream;

class Kakler extends Thread {

	private OutputStream target;
	private InputStream source;

	Kakler(InputStream source, OutputStream target) {
		this.target = target;
		this.source = source;
		start();
	}

	public void run() {
		try {
			int n = -1;
			while ((n = source.read()) != -1) {
				target.write(n);
			}
			target.close();
		} catch (Exception ioe) {
		}
	}

}
