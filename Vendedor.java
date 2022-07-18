
import java.util.HashSet;
import java.util.Objects;

public class Vendedor extends Persona {

	private HashSet<Coche> cochesVendidos;

	public Vendedor(String nombre, String DNI, String domicilio, int telefono) throws ExParametrosNoValidos {
		super(nombre, DNI, domicilio, telefono);
		this.cochesVendidos = new HashSet<>();

	}

	public void venderCoche(Coche c) {
		this.cochesVendidos.add(c);
	}

	public HashSet<Coche> getCochesVendidos() {
		return cochesVendidos;
	}

	public int cochesVendidos() {
		return cochesVendidos.toArray().length;
	}

	public double sueldo() {
		return (cochesVendidos() * 200);
	}

	public void agregarCocheVendido(Coche c) {
		this.cochesVendidos.add(c);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Vendedor vendedor = (Vendedor) o;
		return cochesVendidos.equals(vendedor.cochesVendidos);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cochesVendidos);
	}

	@Override
	public String toString() {
		return "Vendedor [" + super.toString() + "]";
	}

}