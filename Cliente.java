import java.util.HashSet;
import java.util.Objects;

public class Cliente extends Persona {

	private HashSet<Coche> cochesComprados;
	private HashSet<Coche> cochesReservados;

	// CONSTRUCTOR

	public Cliente(String nombre, String DNI, String domicilio, int telefono) throws ExParametrosNoValidos {
		super(nombre, DNI, domicilio, telefono);
		if (cochesComprados != null)
			this.cochesComprados = cochesComprados;
		else
			this.cochesComprados = new HashSet();

		if (cochesReservados != null)
			this.cochesReservados = cochesReservados;
		else
			this.cochesReservados = new HashSet();

	}

	public Cliente(String nombre, String DNI, String domicilio, int telefono, Coche cocheComprado, Coche cocheReservado)
			throws ExParametrosNoValidos {
		super(nombre, DNI, domicilio, telefono);
		if (cocheComprado == null)
			throw new ExParametrosNoValidos("Coche comprado del cliente no valido");
		else {
			this.cochesComprados = new HashSet<>();
			this.cochesComprados.add(cocheComprado);
		}
		if (cocheReservado == null)
			throw new ExParametrosNoValidos("Coche reservado del cliente no valido");
		else {
			this.cochesReservados = new HashSet<>();
			this.cochesReservados.add(cocheReservado);
		}
	}

	public HashSet<Coche> getCochesComprados() {
		return cochesComprados;
	}

	public HashSet<Coche> getCochesReservados() {
		return cochesReservados;
	}

	public void agregarCocheComprado(Coche coche) {

		this.cochesComprados.add(coche);

	}

	public void agregarCocheReservado(Coche coche) {

		this.cochesReservados.add(coche);

	}

	public void cancelarCocheReservado(Coche coche) {

		this.cochesReservados.remove(coche);

	}

	public void venderCoche(Coche coche) {

		this.cochesComprados.add(coche);

	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Cliente cliente = (Cliente) o;
		return Objects.equals(cochesComprados, cliente.cochesComprados)
				&& Objects.equals(cochesReservados, cliente.cochesReservados);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cochesComprados, cochesReservados);
	}

	public void visualizarCochesReservados() {
		int i = 1;
		for (Coche c : this.cochesReservados) {
			System.out.println(i + " : " + c.toString());
			i++;
		}
	}

	@Override
	public String toString() {
		return "Cliente [" + super.toString() + "]";
	}

}