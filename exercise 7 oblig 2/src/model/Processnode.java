package model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

class Processnode {

	ByteArrayInputStream source = null; // tekstkilden
	ByteArrayOutputStream target = null; // resultatet
	ByteArrayOutputStream errors = null; // feil og meldinger

	Processnode(String sourcetext) {
		source = new ByteArrayInputStream(sourcetext.getBytes());
		target = new ByteArrayOutputStream();
		errors = new ByteArrayOutputStream();
	}

	String execute(String[] commandlist) {
		try {
			Runtime rt = Runtime.getRuntime();
			Process proc = rt.exec(commandlist);
			Kakler read = new Kakler(source, proc.getOutputStream());
			Kakler write = new Kakler(proc.getInputStream(), target);
			Kakler messages = new Kakler(proc.getErrorStream(), errors);
			join(read, write, messages); // synkroniser
		} catch (Exception e) {
			return e.toString();		}
		return new String(target.toByteArray());
	}

	String getErrors() {
		return new String(errors.toByteArray());
	}

	private void join(Thread... objects) throws Exception {
		for (Thread t : objects) {
			t.join();
		}
	}

}
