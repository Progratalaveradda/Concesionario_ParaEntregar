
import java.util.HashSet;
import java.util.Objects;

public class Exposicion {

	private int numExposicion;
	private String direccion;
	private int telefono;
	private HashSet<Coche> cochesEnExposicion;

	// CONSTRUCTOR
	public Exposicion(int numExposicion, String direccion, int telefono) throws ExParametrosNoValidos {
		if (numExposicion < 0)
			throw new ExParametrosNoValidos(" Numero de la exposicion no valido ");
		this.numExposicion = numExposicion;
		if (direccion == null)
			throw new ExParametrosNoValidos(" Direccion de la exposicion no valida ");
		this.direccion = direccion;
		if (telefono < 0)
			throw new ExParametrosNoValidos(" Telefono de la exposicion no valido");
		this.telefono = telefono;
		if (cochesEnExposicion != null)
			this.cochesEnExposicion = cochesEnExposicion;
		else
			this.cochesEnExposicion = new HashSet();

	}

	public Exposicion(int numExposicion, String direccion, int telefono, String tipo, Coche coche)
			throws ExParametrosNoValidos {
		if (numExposicion < 0)
			throw new ExParametrosNoValidos(" Numero de la exposicion no valido ");
		this.numExposicion = numExposicion;
		if (direccion == null)
			throw new ExParametrosNoValidos(" Direccion de la exposicion no valida ");
		this.direccion = direccion;
		if (telefono < 0)
			throw new ExParametrosNoValidos(" Telefono de la exposicion no valido");
		this.telefono = telefono;
		if (coche == null)
			throw new ExParametrosNoValidos("Coche de la exposicion no valido valido");
		else {
			this.cochesEnExposicion = new HashSet<>();
			this.cochesEnExposicion.add(coche);
		}

	}

	public int getNumExposicion() {
		return numExposicion;
	}

	public void setNumExposicion(int numExposicion) {
		this.numExposicion = numExposicion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public HashSet<Coche> getCochesEnExposicion() {
		return cochesEnExposicion;
	}

	public void setCochesEnExposicion(HashSet<Coche> cochesEnExposicion) {
		this.cochesEnExposicion = cochesEnExposicion;
	}

	public void añadirCoche(Coche coche) {

		cochesEnExposicion.add(coche);

	}

	public void borrarCoche(Coche coche) {

		cochesEnExposicion.remove(coche);

	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Exposicion that = (Exposicion) o;
		return cochesEnExposicion.equals(that.cochesEnExposicion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cochesEnExposicion);
	}

	@Override
	public String toString() {
		return "Exposicion{" + "numExposicion=" + numExposicion + ", direccion='" + direccion + '\'' + ", telefono="
				+ telefono + ", cochesEnExposicion=" + cochesEnExposicion + '}';
	}
}