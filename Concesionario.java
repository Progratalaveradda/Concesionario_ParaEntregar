
import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {

	Scanner sc = new Scanner(System.in);

	ArrayList<Coche> cochesEnVenta;
	ArrayList<Cliente> clientes;
	ArrayList<Vendedor> vendedores;
	ArrayList<Exposicion> exposiciones;
	ArrayList<Coche> cochesEnReparacion;

	// CONSTRUCTOR

	public Concesionario() {
		this.cochesEnVenta = new ArrayList<Coche>();
		this.clientes = new ArrayList<Cliente>();
		this.vendedores = new ArrayList<Vendedor>();
		this.exposiciones = new ArrayList<Exposicion>();
		this.cochesEnReparacion = new ArrayList<Coche>();
	}

	// GETTERS

	public ArrayList<Coche> getCochesEnVenta() {
		return cochesEnVenta;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}

	public ArrayList<Exposicion> getExposiciones() {
		return exposiciones;
	}

	public ArrayList<Coche> getCochesEnReparacion() {
		return cochesEnReparacion;
	}

	// MÉTODOS VENDEDOR

	public Vendedor crearVendedorComision() throws ExParametrosNoValidos {

		System.out.print("Nuevo nombre : ");
		String nombre = sc.nextLine();

		System.out.print("Nuevo DNI : ");
		String dni = sc.nextLine();

		System.out.print("Nueva dirección : ");
		String direccion = sc.nextLine();

		System.out.print("Nuevo telefono : ");
		int telefon = sc.nextInt();
		Vendedor v = new Vendedor(nombre, dni, direccion, telefon);

		return v;

	}

	public void altaVendedorComision(Vendedor v) {
		this.vendedores.add(v);
	}

	public void bajaVendedorComision(int a) {

		this.vendedores.remove(a - 1);
	}

	public void mofidicarVendedorComision(int b) {
		Vendedor v = this.vendedores.get(b - 1);

		System.out.print("Nuevo nombre : ");
		String nombre = sc.nextLine();
		v.setNombre(nombre);

		System.out.print("Nuevo DNI : ");
		String dni = sc.nextLine();
		v.setDNI(dni);

		System.out.print("Nueva dirección : ");
		String direccion = sc.nextLine();
		v.setDomicilio(direccion);

		System.out.print("Nuevo telefono : ");
		int telefon = sc.nextInt();
		v.setTelefono(telefon);

	}

	public void visualizarVendedorComision() {
		int i = 1;
		for (Vendedor ven : this.vendedores) {
			System.out.println(i + " : " + ven.toString());
			i++;
		}

	}

	// MÉTODOS EXPOSICIONES

	public Exposicion crearExposicion() throws ExParametrosNoValidos {

		System.out.print("Numero : ");
		int numero = sc.nextInt();

		sc.nextLine();

		System.out.print("Direccion : ");
		String direccion = sc.nextLine();

		System.out.print("Telefono: ");
		int telefono = sc.nextInt();

		Exposicion ex = new Exposicion(numero, direccion, telefono);

		return ex;

	}

	public void altaExposicion(Exposicion ex) {
		this.exposiciones.add(ex);
	}

	public void bajaExposicion(int a) {

		this.exposiciones.remove(a - 1);
	}

	public void mofidicarExposicion(int b) {
		Exposicion v = this.exposiciones.get(b - 1);

		System.out.print("Nuevo numero de exposicion: ");
		int numero = sc.nextInt();
		v.setNumExposicion(numero);
		sc.nextLine();

		System.out.print("Nueva direccion : ");
		String direccion = sc.nextLine();
		v.setDireccion(direccion);
		System.out.print("Nuevo telefono : ");
		int telefono = sc.nextInt();
		v.setTelefono(telefono);

	}

	public void visualizarExposiciones() {
		int i = 1;
		for (Exposicion e : this.exposiciones) {
			System.out.println(i + " : " + e.toString());
			i++;
		}
	}

	public void moverCocheExposicion(int a, int b) {
		Coche c = this.cochesEnVenta.get(a - 1);
		Exposicion e = this.exposiciones.get(b - 1);
		if (c.getExposicion() == null) {
			c.setExposicion(e);
			e.añadirCoche(c);
		} else {
			c.getExposicion().borrarCoche(c);
			c.setExposicion(e);
			e.añadirCoche(c);
		}

	}

	// MÉTODOS COCHE

	public Coche crearCoche() throws ExParametrosNoValidos {

		System.out.print("Nueva marca : ");
		String marca = sc.nextLine();

		System.out.print("Nuevo modelo : ");
		String modelo = sc.nextLine();

		System.out.print("Nueva matricula : ");
		String matricula = sc.nextLine();

		System.out.print("Nuevo precio de venta:(NUMEROS ENTEROS) ");
		double precioVenta = (double) sc.nextInt();

		System.out.print("Nuevo tipo coche : ");
		String tipo = sc.nextLine();

		sc.nextLine();

		Coche c = new Coche(marca, modelo, matricula, precioVenta, tipo);
		return c;

	}

	public void altaCoche(Coche co) {

		this.cochesEnVenta.add(co);
	}

	public void bajaCoche(int a) {

		this.cochesEnVenta.remove(a - 1);
	}

	public void mofidicarCoche(int b) {
		Coche c = this.cochesEnVenta.get(b - 1);

		System.out.print("Nueva marca : ");
		String marca = sc.nextLine();
		c.setMarca(marca);

		System.out.print("Nuevo modelo : ");
		String modelo = sc.nextLine();
		c.setModelo(modelo);
		System.out.print("Nueva matricula : ");
		String matricula = sc.nextLine();
		c.setMatricula(matricula);

		System.out.print("Nuevo precio de venta :(NUMEROS ENTEROS) ");
		double precioVenta = sc.nextDouble();
		c.setPrecioVenta(precioVenta);

	}

	public void visualizarCoches() {
		int i = 1;
		for (Coche c : this.cochesEnVenta) {
			System.out.println(i + " : " + c.toString());
			i++;
		}
	}

	// REPARACIONES

	public void visualizarCochesEnReparacion() {
		int i = 1;
		for (Coche c : this.cochesEnReparacion) {
			System.out.println(i + " : " + c.toString());
			i++;
		}
	}

	public void llevarCocheReparar(int a, String tipo) throws ExParametrosNoValidos {
		Coche c = this.cochesEnVenta.get(a - 1);
		Reparacion r = new Reparacion(tipo);
		this.cochesEnVenta.remove(a - 1);
		this.cochesEnReparacion.add(c);
		c.añadirReparacion(r);

	}

	public void cocheReparado(int a) {
		Coche c = this.cochesEnReparacion.get(a - 1);
		this.cochesEnReparacion.remove(c);
		this.cochesEnVenta.add(c);
		c.reparaciones.last().setResuelta(true);
	}

	// MÉTODOS CLIENTE

	public Cliente crearCliente() throws ExParametrosNoValidos {

		System.out.print("Nombre : ");
		String nombre = sc.nextLine();

		System.out.print("DNI : ");
		String DNI = sc.nextLine();

		System.out.print("Domicilio : ");
		String domicilio = sc.nextLine();

		System.out.print("Telefono: ");
		int telefono = sc.nextInt();

		Cliente cli = new Cliente(nombre, DNI, domicilio, telefono);

		return cli;

	}

	public void altaCliente(Cliente cli) {

		this.clientes.add(cli);
	}

	public void bajaCliente(int a) {

		this.clientes.remove(a - 1);

	}

	public void mofidicarCliente(int b) {

		Cliente cli = this.clientes.get(b - 1);

		System.out.print("Nuevo nombre : ");

		String nombre = sc.nextLine();
		cli.setNombre(nombre);

		System.out.print("Nuevo DNI : ");
		String DNI = sc.nextLine();
		cli.setDNI(DNI);

		System.out.print("Nueva domicilio : ");
		String domicilio = sc.nextLine();
		cli.setDomicilio(domicilio);

		System.out.print("Nuevo telefono : ");
		int telefono = sc.nextInt();
		cli.setTelefono(telefono);
	}

	public void visualizarCliente() {
		int i = 1;
		for (Cliente c : this.clientes) {
			System.out.println(i + " : " + c.toString());
			i++;
		}
	}

	// MÉTODOS RESERVAS

	public void reservarCoche(Cliente cli, int b) {
		Coche c = this.cochesEnVenta.get(b - 1);
		cli.agregarCocheReservado(c);
		this.cochesEnVenta.remove(c);
		c.setReservado(true);
	}

	public void cancelarReservaCoche(Cliente cli, int b) {
		ArrayList<Coche> reservasArray = new ArrayList<>(cli.getCochesReservados());
		Coche c = reservasArray.get(b - 1);
		cli.cancelarCocheReservado(c);
		this.cochesEnVenta.add(c);
		c.setReservado(false);
	}

	// VENTAS

	public void venderCoche(Coche coche, Cliente c) {

		this.cochesEnVenta.remove(coche);
		c.agregarCocheComprado(coche);
		coche.setVendido(true);
		coche.setCliente(c);
	}

	public void venderCocheEnReserva(Coche coche, Cliente c) {

		c.getCochesReservados().remove(coche);
		c.agregarCocheComprado(coche);
		coche.setVendido(true);
		coche.setCliente(c);
	}

	// CONSULTAS/INFORMES

	public void visualizarCochesReservados() {

		for (Cliente cli : clientes) {
			int j = 1;
			for (Coche c : cli.getCochesReservados()) {
				System.out.print(j + " : " + c.toString());
				j++;
			}
		}
	}

	public ArrayList<Cliente> listaClientesConReserva() {
		ArrayList<Cliente> clientesConReserva = new ArrayList<>();
		for (Cliente cli : this.clientes) {
			if (!cli.getCochesReservados().isEmpty()) {
				clientesConReserva.add(cli);
			}
		}
		return clientesConReserva;
	}

	public void informeClientesConReservas() {
		int i = 1;
		for (Cliente cli : listaClientesConReserva()) {

			System.out.println(i + " : " + cli.toString());
			int j = 1;

			for (Coche co : cli.getCochesReservados()) {
				System.out.println("     " + j + " : " + co.toString());
				j++;
			}

			i++;
		}
	}

	public ArrayList<Coche> cochesVendidos() {
		ArrayList<Coche> cochesVendidos = new ArrayList<>();
		for (Vendedor v : vendedores) {
			for (Coche c : v.getCochesVendidos()) {
				cochesVendidos.add(c);
			}
		}
		return cochesVendidos;
	}

	public void listarCochesVenta(ArrayList<Coche> cochesVendidos) {

		for (Coche co : cochesVendidos) {
			System.out.println(co);
		}

	}

	public void listarCochesReserva(ArrayList<Coche> cochesReservados) {

		for (Coche co : cochesReservados) {
			System.out.println(co);
		}
	}

}