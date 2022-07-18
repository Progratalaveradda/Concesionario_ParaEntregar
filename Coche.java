
import java.util.TreeSet;

public class Coche {

	private String marca;
	private String modelo;
	private String matricula;
	private tipoCoche tipo;
	private double precioVenta;
	private boolean reservado;
	private boolean vendido;

	private Exposicion exposicion;
	private Cliente cliente;
	TreeSet<Reparacion> reparaciones;

	public enum tipoCoche {
		Todoterreno, Turismo, Industriales
	}

	// CONSTRUCTOR

	public Coche(String marca, String modelo, String matricula, double precioVenta, String tipo)
			throws ExParametrosNoValidos {
		if (marca == null)
			throw new ExParametrosNoValidos(" Marca del coche no valida ");
		this.marca = marca;
		if (modelo == null)
			throw new ExParametrosNoValidos(" Modelo del coche no valido ");
		this.modelo = modelo;
		if (matricula == null)
			throw new ExParametrosNoValidos(" Matricula del coche no valida ");
		this.matricula = matricula;
		if (precioVenta < 0)
			throw new ExParametrosNoValidos(" Precio venta del coche no valido ");
		this.precioVenta = precioVenta;
		this.reparaciones = new TreeSet<>(new FechaComparator());

	}

	public void añadirReparacion(Reparacion r) {
		this.reparaciones.add(r);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public tipoCoche getTipo() {
		return tipo;
	}

	public void setTipo(tipoCoche tipo) {
		this.tipo = tipo;

	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public Exposicion getExposicion() {
		return exposicion;
	}

	public void setExposicion(Exposicion exposicion) {
		this.exposicion = exposicion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Coche{" + "marca='" + marca + '\'' + ", modelo='" + modelo + '\'' + ", matricula='" + matricula + '\''
				+ ", precioVenta=" + precioVenta +

				'}';
	}

	public void visualizarReparaciones() {
		int i = 1;
		for (Reparacion r : this.reparaciones) {
			System.out.println(i + " :" + r.toString());
			i++;
		}
	}

}