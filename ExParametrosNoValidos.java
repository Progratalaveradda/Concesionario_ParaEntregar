
public class ExParametrosNoValidos extends Exception {

	public ExParametrosNoValidos(String message) {

		super("ERROR: " + message);
	}

	public ExParametrosNoValidos() {

	}
}