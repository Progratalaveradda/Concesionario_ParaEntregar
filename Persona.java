
public class Persona {

	private String nombre;
	private String DNI;
	private String domicilio;
	private int telefono;

	// CONSTRUCTOR

	public Persona(String nombre, String DNI, String domicilio, int telefono) throws ExParametrosNoValidos {
		if (nombre == null)
			throw new ExParametrosNoValidos("Nombre de la persona no valido");
		this.nombre = nombre;
		if ((DNI == null) || (DNI.length() < 9))
			throw new ExParametrosNoValidos("DNI de la persona no valido");
		this.DNI = DNI;
		if (domicilio == null)
			throw new ExParametrosNoValidos("Domicilio de la persona no valido");
		this.domicilio = domicilio;
		if (telefono == 0)
			throw new ExParametrosNoValidos("Telefono de la persona no valido");
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "nombre='" + nombre + '\'' + ", DNI='" + DNI + '\'' + ", domicilio='" + domicilio + '\'' + ", telefono="
				+ telefono + '}';
	}
}