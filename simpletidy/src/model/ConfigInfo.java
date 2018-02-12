package model;

public class ConfigInfo {

	static private final String TIDY = "tidy.exe";
	static private String tidylocation = "c:/tidy/";

	static private String[] body_only = { tidylocation + TIDY,
			"--show-body-only", "y", "-indent", "-latin1", "--clean", "y", "-asxml" };

	static private String[] classic = { tidylocation + TIDY, "-indent",
			"-latin1", "--clean", "y", "-asxml" };

	public static String[] getCommandlist() {		
		// return classic;
		return body_only;
	}

}
