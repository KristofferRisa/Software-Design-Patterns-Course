package model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Processnode {

	ByteArrayInputStream source = null; // tekstkilden
	ByteArrayOutputStream result = null; // resultatet
	ByteArrayOutputStream errors = null; // feil og andre meldinger

	public Processnode(String sourcetext) {
		source = new ByteArrayInputStream(sourcetext.getBytes());
		result = new ByteArrayOutputStream();
		errors = new ByteArrayOutputStream();
	}

	public String execute(String[] commandlist) {
		try {
			Runtime rt = Runtime.getRuntime();
			Process proc = rt.exec(commandlist);
			
			for (String s:commandlist) System.out.print(s+" ");
			System.out.println();

			// motta tekst fra source
			Kakler read = new Kakler(source, proc.getOutputStream());

			// send behandlet tekst til result
			Kakler write = new Kakler(proc.getInputStream(), result);

			// send feilmeldinger og varsler til errors
			Kakler messages = new Kakler(proc.getErrorStream(), errors);

			join(read, write, messages); // synkroniser
		} catch (Exception e) {
			return e.toString();
		}
		return new String(result.toByteArray());
	}

	public String getErrors() {
		return new String(errors.toByteArray());
	}

	private void join(Thread... objects) throws Exception {
		for (Thread t : objects) {
			t.join();
		}
	}

}
