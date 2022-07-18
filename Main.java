import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			Concesionario con1 = new Concesionario();
			String opcion = "";
			Coche coche1 = new Coche("OPEL", "INSIGNIA", "7654ABC", 17000, "TURISMO");
			Coche coche2 = new Coche("JEEP", "RENEGADE", "232JKC", 32000, "TODOTERRENO");
			Coche coche3 = new Coche("MERCEDES", "VITO", "5555HFB", 47000, "INDUSTRIALES");
			Cliente cli1 = new Cliente("AROA", "04228227F", "CALLE SAN ISIDRO,12", 666555444);
			Cliente cli2 = new Cliente("DANI", "07555476J", "CALLE TRINIDAD, 41", 699338800);
			Cliente cli3 = new Cliente("DIEGO", "01876736B", "AVENIDA DEL PRINCIPE,16", 665431222);
			Vendedor ven1 = new Vendedor("MARTIN", "08255227G", "AVENIDA CONSTITUCION,26", 649276534);
			Vendedor ven2 = new Vendedor("CLAUDIA", "09113777M", "CALLE CERERIAS,2", 674529736);
			Vendedor ven3 = new Vendedor("FRAN", "06854332H", "PLAZA DEL RELOJ, 50", 612310874);
			Exposicion expo1 = new Exposicion(001, "CALLE RAMON Y CAJAL, 23", 925803466);
			Exposicion expo2 = new Exposicion(002, "CALLE SAN FRANCISCO, 105", 925600743);

			con1.altaCoche(coche1);
			con1.altaCoche(coche2);
			con1.altaCoche(coche3);
			con1.altaCliente(cli1);
			con1.altaCliente(cli2);
			con1.altaCliente(cli3);
			con1.altaVendedorComision(ven1);
			con1.altaVendedorComision(ven2);
			con1.altaVendedorComision(ven3);
			con1.altaExposicion(expo1);
			con1.altaExposicion(expo2);

			while (!opcion.equals("5")) {

				System.out.println("\n<<<<<<<<<<<<<<BIENVENDIDO AL CONCESIONARIO>>>>>>>>>>>>>>>>>\n");
				System.out.println("SELECCIONA ACCESO: \n");
				System.out.println("[1] -- DIRECTOR COMERCIAL");
				System.out.println("[2] -- VENDEDOR");
				System.out.println("[3] -- MECANICO");
				System.out.println("[4] -- CLIENTE");
				System.out.println("[5] -- SALIR");
				System.out.print("Opcion: ");
				opcion = teclado.nextLine();

				switch (opcion) {
				case "1":
					System.out.println("----DIRECTOR COMERCIAL----");
					String contraseña;

					do {
						System.out.println("Introduce la contraseña");
						contraseña = teclado.nextLine();

					} while (!contraseña.equalsIgnoreCase("DC"));

					String opcion2 = " ";
					while (!opcion2.equals("9")) {
						System.out.println("[1] -- GESTIONAR VENDEDORES A COMISION");
						System.out.println("[2] -- ACCESO A EXPOSICIONES");
						System.out.println("[3] -- GESTION DE COCHES DEL CONCESIONARIO");
						System.out.println("[4] -- GESTION DE CLIENTES");
						System.out.println("[5] -- REPARACIONES");
						System.out.println("[6] -- RESERVAS");
						System.out.println("[7] -- VENTAS");
						System.out.println("[8] -- CONSULTAS/INFORMES");
						System.out.println("[9] -- ATRAS");
						System.out.println("Opcion: ");
						opcion2 = teclado.nextLine();
						switch (opcion2) {
						case "1":
							System.out.println("----GESTIONAR VENDEDORES A COMISION----");
							String opcion3 = " ";
							while (!opcion3.equals("4")) {
								System.out.println("[1] -- ALTA VENDEDOR A COMISION");
								System.out.println("[2] -- BAJA VENDEDOR A COMISION");
								System.out.println("[3] -- MODIFICAR VENDEDOR A COMISION");
								System.out.println("[4] -- ATRAS");
								System.out.println("Opcion: ");
								opcion3 = teclado.nextLine();
								switch (opcion3) {
								case "1":

									System.out.println("----ALTA VENDEDOR A COMISION----");

									Vendedor v1 = con1.crearVendedorComision();
									con1.altaVendedorComision(v1);
									con1.visualizarVendedorComision();

									break;

								case "2":

									System.out.println("----BAJA VENDEDORES A COMISION----");

									if (con1.vendedores.isEmpty()) {
										System.out.println("No hay vendedores para dar de baja");
										break;
									}

									con1.visualizarVendedorComision();
									System.out.print("Selecciona el vendedor que quieres dar de baja : ");
									int a = sc.nextInt();
									con1.bajaVendedorComision(a);
									con1.visualizarVendedorComision();

									break;

								case "3":

									System.out.println("----MODIFICAR VENDEDOR A COMISION----");

									if (con1.vendedores.isEmpty()) {
										System.out.println("No hay vendedores para modificar");

									} else {

										con1.visualizarVendedorComision();
										System.out.println("Selecciona el vendedor que quieres modificar : ");
										int b = sc.nextInt();
										con1.mofidicarVendedorComision(b);
										con1.visualizarVendedorComision();

									}
									break;

								case "4":
									break;

								default:
									System.out.println("Opcion equivocada");
								}

							}
							break;
						case "2":
							System.out.println("----ACCESO A EXPOSICIONES----");
							String opcion4 = " ";
							while (!opcion4.equals("3")) {
								System.out.println("[1] -- GESTIONAR EXPOSICIONES");
								System.out.println("[2] -- MOVER COCHE A EXPOSICION");
								System.out.println("[3] -- ATRAS");
								System.out.println("Opcion: ");
								opcion4 = teclado.nextLine();
								switch (opcion4) {
								case "1":
									System.out.println("----GESTIONAR EXPOSICIONES----");
									String opcion5 = " ";
									while (!opcion5.equals("5")) {
										System.out.println("[1] -- ALTA EXPOSICION");
										System.out.println("[2] -- BAJA EXPOSICION");
										System.out.println("[3] -- MODIFICAR EXPOSICION");
										System.out.println("[4] -- VISUALIZAR EXPOSICION");
										System.out.println("[5] -- ATRAS");
										System.out.println("Opcion: ");
										opcion5 = teclado.nextLine();
										switch (opcion5) {
										case "1":
											System.out.println("----ALTA EXPOSICION----");

											Exposicion ex1 = con1.crearExposicion();
											con1.altaExposicion(ex1);
											con1.visualizarExposiciones();
											break;
										case "2":
											System.out.println("----BAJA EXPOSICION----");
											if (con1.exposiciones.isEmpty()) {
												System.out.println("No hay exposiciones para dar de baja");

											} else {
												con1.visualizarExposiciones();
												System.out.print("Selecciona la exposicion que quieres dar de baja : ");
												int a = sc.nextInt();
												con1.bajaExposicion(a);
												con1.visualizarExposiciones();
											}
											break;

										case "3":
											System.out.println("----MODIFICAR EXPOSICION----");
											if (con1.exposiciones.isEmpty()) {
												System.out.println("No hay exposiciones para modificar");

											} else {
												con1.visualizarExposiciones();
												System.out.println("Elige la exposicion a modificar");
												int b = sc.nextInt();
												con1.mofidicarExposicion(b);
												con1.visualizarExposiciones();
											}
											break;
										case "4":
											System.out.println("----VISUALIZAR EXPOSICION----");
											con1.visualizarExposiciones();
											break;
										case "5":
											break;

										default:
											System.out.println("Opcion equivocada");
										}

									}
									break;
								case "2":
									System.out.println("----MOVER COCHE A EXPOSICION----");
									System.out.println("Elige el coche: ");
									con1.visualizarCoches();
									int b = sc.nextInt();
									System.out.println("Elige la exposicion : ");
									con1.visualizarExposiciones();
									int a = sc.nextInt();
									con1.moverCocheExposicion(b, a);
									break;
								}

							}
							break;
						case "3":
							System.out.println("GESTION COCHES DEL CONCESIONARIO");
							String opcion7 = " ";
							while (!opcion7.equals("5")) {
								System.out.println("[1] -- ALTA DE COCHE");
								System.out.println("[2] -- BAJA DE COCHE");
								System.out.println("[3] -- MODIFICAR COCHE");
								System.out.println("[4] -- VISUALIZAR COCHE");
								System.out.println("[5] -- ATRAS");
								System.out.println("Opcion: ");
								opcion7 = teclado.nextLine();
								switch (opcion7) {
								case "1":
									System.out.println("---ALTA COCHE---");
									Coche c = con1.crearCoche();
									con1.altaCoche(c);
									break;
								case "2":
									System.out.println("----BAJA COCHE---");
									if (con1.cochesEnVenta.isEmpty()) {
										System.out.println("No hay coches en venta para dar de baja");
									} else {
										con1.visualizarCoches();
										System.out.print("Selecciona el coche que quieres dar de baja : ");
										int a = sc.nextInt();
										con1.bajaCoche(a);
										con1.visualizarCoches();
									}
									break;
								case "3":
									System.out.println("----MODIFICAR COCHE----");
									if (con1.cochesEnVenta.isEmpty()) {
										System.out.println("No hay coches para modificar");

									} else {
										con1.visualizarCoches();
										System.out.println("Elige el coche a modificar");
										int b = sc.nextInt();
										con1.mofidicarCoche(b);
									}
									break;
								case "4":
									System.out.println("----VISUALIZARCOCHE----");
									if (!con1.cochesEnVenta.isEmpty()) {
										System.out.println("<<<COCHES EN VENTA>>>");
										con1.visualizarCoches();
									}
									if (!con1.listaClientesConReserva().isEmpty()) {
										System.out.println("<<<COCHES RESERVADOS>>>");
										con1.visualizarCochesReservados();
									}
									if (!con1.cochesEnReparacion.isEmpty()) {
										System.out.println("<<<COCHES EN REPARACION>>>");
										con1.visualizarCochesEnReparacion();
									}

									break;
								case "5":
									break;
								default:
									System.out.println("Opcion equivocada");
								}

							}
							break;
						case "4":
							System.out.println("----GESTION DECLIENTES----");
							String opcion8 = " ";
							while (!opcion8.equals("4")) {
								System.out.println("[1] -- ALTA DE CLIENTE");
								System.out.println("[2] -- BAJA DE CLIENTE");
								System.out.println("[3] -- MODIFICAR CLIENTE");
								System.out.println("[4] -- ATRAS");
								System.out.println("Opcion: ");
								opcion8 = teclado.nextLine();
								switch (opcion8) {
								case "1":
									System.out.println("----ALTA DE CLIENTE----");
									Cliente c = con1.crearCliente();
									con1.altaCliente(c);
									break;
								case "2":
									System.out.println("----BAJA DE CLIENTE----");
									if (con1.clientes.isEmpty()) {
										System.out.println("No hay clientes para dar de baja");
									} else {
										con1.visualizarCliente();
										System.out.print("Selecciona el cliente que quieres dar de baja : ");
										int a = sc.nextInt();
										if ((con1.clientes.get(a - 1).getCochesComprados().isEmpty())
												&& (con1.clientes.get(a - 1).getCochesReservados().isEmpty())) {
											con1.bajaCliente(a);
											con1.visualizarCliente();
										} else {
											System.out.println(
													"No se puede dar de baja el cliente por tener coches comprados o reservados ");
											con1.visualizarCliente();
										}

									}
									break;
								case "3":
									System.out.println("----MODIFICAR CLIENTE----");
									con1.visualizarCliente();
									System.out.println("Selecciona el cliente que quieres modificar : ");
									int a = sc.nextInt();
									con1.mofidicarCliente(a);
									con1.visualizarCliente();
									break;
								case "4":
									break;
								default:
									System.out.println("Opcion equivocada");
								}

							}
							break;

						case "5":
							System.out.println("----REPARACIONES----");
							String opcion9 = " ";
							while (!opcion9.equals("4")) {
								System.out.println("[1] -- CAMBIA UN COCHE DE ESTADO EN VENTA A ESTADO REPARACION");
								System.out.println("[2] -- REPARAR COCHE DE LISTA DE COCHES EN REPARACION");
								System.out
										.println("[3] -- CONSULTA REPARACIONES DE UN (ORDENADAS POR FECHA REPARACION)");
								System.out.println("[4] -- ATRAS");
								System.out.println("Opcion: ");
								opcion9 = teclado.nextLine();
								switch (opcion9) {
								case "1":
									if ((con1.cochesEnVenta.isEmpty())) {
										System.out.println("No hay coches en venta para reparar");
									} else {

										System.out.println("Elige al coche para reparar");
										con1.visualizarCoches();
										int b = sc.nextInt();
										System.out.println("Elige el tipo de reparacion");
										String opcion988 = " ";
										while (!opcion988.equals("5")) {
											System.out.println("[1] -- MECANICA");
											System.out.println("[2] -- ELECTRICA");
											System.out.println("[3] -- CHAPA");
											System.out.println("[4] -- REVISION");
											System.out.println("[5] -- ATRAS");
											System.out.println("Opcion: ");
											opcion988 = teclado.nextLine();
											String tipo = " ";
											switch (opcion988) {

											case "1":
												tipo = "mecanica";
												con1.llevarCocheReparar(b, tipo);
												break;

											case "2":
												tipo = "electrica";
												con1.llevarCocheReparar(b, tipo);
												break;
											case "3":
												tipo = "chapa";
												con1.llevarCocheReparar(b, tipo);
												break;
											case "4":
												tipo = "revision";
												con1.llevarCocheReparar(b, tipo);
												break;
											case "5":
												break;
											default:
												System.out.println("Opcion equivocada");

											}
											break;

										}

									}

									break;
								case "2":
									System.out.println("----REPARAR COCHE DE LISTA DE COCHES EN REPARACION----");
									if (con1.cochesEnReparacion.isEmpty()) {
										System.out.println("No hay coches en reparacion para reparar");
									} else {
										System.out.println("Elige al coche ");
										con1.visualizarCochesEnReparacion();
										int b = sc.nextInt();
										con1.cocheReparado(b);
									}
									break;
								case "3":
									System.out.println(
											"---CONSULTA REPARACIONES DE UN COCHE(ORDENADAS POR FECHA REPARACION)----");
									String opcion93 = " ";
									while (!opcion93.equals("3")) {

										System.out.println("[1] -- COCHES EN VENTA");
										System.out.println("[2] -- COCHES EN REPARACION");
										System.out.println("[3] -- ATRAS");
										System.out.print("Opcion: ");
										opcion93 = teclado.nextLine();

										switch (opcion93) {

										case "1":

											if (con1.cochesEnVenta.isEmpty()) {
												System.out.println("No hay coches en venta");
											} else {
												System.out.println("Elige al coche para ver las reparaciones");
												con1.visualizarCoches();
												int b = sc.nextInt();
												Coche c = con1.getCochesEnVenta().get(b - 1);
												if (c.reparaciones.isEmpty()) {
													System.out.println("No tiene reparaciones disponibles");
												} else {
													c.visualizarReparaciones();
												}

											}

											break;
										case "2":
											if (con1.cochesEnReparacion.isEmpty()) {
												System.out.println("No hay coches en reparacion");
											} else {
												System.out.println("Elige al coche para ver las reparaciones");
												con1.visualizarCochesEnReparacion();
												int b = sc.nextInt();
												Coche c = con1.getCochesEnReparacion().get(b - 1);
												if (c.reparaciones.isEmpty()) {
													System.out.println("No tiene reparaciones disponibles");
												} else {
													c.visualizarReparaciones();
												}
											}

											break;

										case "3":
											break;
										default:
											System.out.println("opcion equivocada");
											break;

										}

									}
									break;
								case "4":
									break;
								default:
									System.out.println("Opcion equivocada");
								}

							}
							break;

						case "6":
							System.out.println("RESERVAS");
							String opcion10 = " ";
							while (!opcion10.equals("3")) {
								System.out.println("[1] -- RESERVAR UN COCHE");
								System.out.println("[2] -- CANCELAR RESERVA DE UN COCHE");
								System.out.println("[3] -- ATRAS");
								System.out.println("Opcion: ");
								opcion10 = teclado.nextLine();
								switch (opcion10) {
								case "1":
									System.out.println("----RESERVAR UN COCHE----");
									if (con1.clientes.isEmpty()) {
										System.out.println("No hay clientes");
									} else {
										System.out.println("Elige el cliente que va a reservar : ");
										con1.visualizarCliente();
										int a = sc.nextInt();
										Cliente c = con1.clientes.get(a - 1);
										if (con1.cochesEnVenta.isEmpty()) {
											System.out.println("No hay coches en venta");
										}

										else {
											System.out.println("Elige el coche que va a reservar");
											con1.visualizarCoches();
											int b = sc.nextInt();
											con1.reservarCoche(c, b);
										}
									}
									break;
								case "2":
									System.out.println("----CANCELAR RESERVA DE UN COCHE----");
									if (con1.listaClientesConReserva().isEmpty()) {
										System.out.println("No hay clientes con reserva");
									} else {
										System.out.println("Elige el cliente que va a cancelar la reserva");
										con1.informeClientesConReservas();
										int b2 = sc.nextInt();
										Cliente cli = con1.clientes.get(b2 - 1);
										if (cli.getCochesReservados().isEmpty())
											System.out.println("Este cliente no tiene coches reservados");
										else {
											System.out.println("Elige el coche que va a dejar de reservar");
											cli.visualizarCochesReservados();
											int b3 = sc.nextInt();
											con1.cancelarReservaCoche(cli, b3);
										}
									}

									break;
								case "3":
									break;
								default:
									System.out.println("Opcion equivocada");
								}

							}
							break;

						case "7":
							System.out.println("VENTAS");
							String opcion11 = " ";
							while (!opcion11.equals("2")) {
								System.out.println("[1] -- VENDER COCHE");
								System.out.println("[2] -- ATRAS");
								System.out.println("Opcion: ");
								opcion11 = teclado.nextLine();
								switch (opcion11) {
								case "1":
									System.out.println("--VENDER COCHE--");

									String opcion933 = " ";
									while (!opcion933.equals("3")) {

										System.out.println("[1] -- LISTADO COCHES EN VENTA");
										System.out.println("[2] -- LISTADO COCHES RESERVADOS POR CLIENTE");
										System.out.println("[3] -- ATRAS");
										System.out.print("Opcion: ");
										opcion933 = teclado.nextLine();

										switch (opcion933) {

										case "1":

											if (con1.cochesEnVenta.isEmpty()) {
												System.out.println("No hay coches en venta");
											} else {
												System.out.println("Elige el coche que se va a comprar");
												con1.visualizarCoches();
												int a = sc.nextInt();
												Coche c = con1.getCochesEnVenta().get(a - 1);
												if (con1.getVendedores().isEmpty()) {
													System.out.println("No hay vendedores disponlibles");
												} else {
													System.out.println("Elige vendedor va ha realizar la venta ");
													con1.visualizarVendedorComision();
													int a1 = sc.nextInt();
													Vendedor v = con1.getVendedores().get(a1 - 1);
													if (con1.getClientes().isEmpty()) {
														System.out.println("No hay clientes disponibles");
													} else {
														System.out.println("Elige el cliente que va a comprar ");
														con1.visualizarCliente();
														int a2 = sc.nextInt();
														con1.venderCoche(c, con1.getClientes().get(a2 - 1));
														v.venderCoche(c);
													}
												}
											}

											break;

										case "2":
											System.out.println("COCHES RESERVADOS");
											if (con1.listaClientesConReserva().isEmpty()) {
												System.out.println("No hay clientes con coches reservados");
											} else {
												System.out.println("Elige el cliente que va a comprar ");
												con1.visualizarCliente();
												int a2 = sc.nextInt();
												Cliente c = con1.getClientes().get(a2 - 1);
												if (c.getCochesReservados().isEmpty()) {
													System.out.println("Este cliente no tiene coches reservados : ");
												} else {
													System.out.println("Elige el coche que se va a comprar");
													c.visualizarCochesReservados();
													int a = sc.nextInt();
													ArrayList<Coche> cochesArray = new ArrayList<>(
															c.getCochesReservados());
													Coche coch = cochesArray.get(a - 1);
													if (con1.getVendedores().isEmpty()) {
														System.out.println("No hay vendedores disponlibles");
													} else {
														System.out.println("Elige vendedor va ha realizar la venta ");
														con1.visualizarVendedorComision();
														int a1 = sc.nextInt();
														Vendedor v = con1.getVendedores().get(a1 - 1);
														v.venderCoche(coch);
														con1.venderCocheEnReserva(coch, c);

													}
												}
											}

											break;

										case "3":
											System.out.println("ATRAS");

											break;

										default:
											System.out.println("opcion equivocada");
											break;

										}

									}
									break;

								case "2":
									break;
								default:
									System.out.println("Opcion equivocada\n");
								}

							}
							break;

						case "8":
							System.out.println("CONSULTAS/INFORMES");
							String opcion12 = " ";
							while (!opcion12.equals("7")) {
								System.out.println("[1] -- LISTADO DE COCHES EN VENTA");
								System.out.println("[2] -- LISTADO DE COCHES RESERVADOS");
								System.out.println("[3] -- LISTADO DE COCHES EN REPARACION");
								System.out.println("[4] -- LISTADO DE COCHESVENDIDOS POR UN VENDEDOR(SUELDO)");
								System.out.println(
										"[5] -- LISTADO COCHES RESERVADOS POR UN CLIENTE(DATOS CLIENTE Y COCHE)");
								System.out.println("[6] -- MOSTRAR QUE CLIENTE COMPRA UN COCHE");
								System.out.println("[7] -- ATRAS");
								System.out.println("Opcion: ");
								opcion12 = teclado.nextLine();
								switch (opcion12) {
								case "1":
									System.out.println("----LISTADO DE COCHES EN VENTA----");
									if (con1.cochesEnVenta.isEmpty()) {
										System.out.println("No hay coches en venta disponibles");
									} else {
										con1.visualizarCoches();
									}

									break;
								case "2":
									System.out.println("----LISTADO DE COCHES RESERVADOS----");
									if (con1.listaClientesConReserva().isEmpty()) {
										System.out.println("No hay coches reservados disponibles");
									} else {
										con1.visualizarCochesReservados();
									}

									break;
								case "3":
									System.out.println("----LISTADO DE COCHES EN REPARACION----");
									if (con1.cochesEnReparacion.isEmpty()) {
										System.out.println("No hay coches en reparación para mostrar");
									} else {
										con1.visualizarCochesEnReparacion();
									}
									break;
								case "4":
									System.out.println("----LISTADO DE COCHESVENDIDOS POR UN VENDEDOR(SUELDO)----");
									if (con1.vendedores.isEmpty()) {
										System.out.println("No hay vendedores a comisión para mostrar");
									} else {
										System.out.println(
												"Elige un vendedor para comprobar sus coches vendidos y sueldo");
										con1.visualizarVendedorComision();
										int a = sc.nextInt();
										Vendedor v = con1.getVendedores().get(a - 1);
										System.out.println("Coches vendidos : " + v.cochesVendidos());
										System.out.println("Sueldo :  " + v.sueldo() + " Euros");
									}
									break;
								case "5":
									System.out.println(
											"----LISTADO COCHES RESERVADOS POR UN CLIENTE(DATOS CLIENTE Y COCHE)----");
									con1.informeClientesConReservas();
									break;
								case "6":
									System.out.println("----MOSTRAR QUE CLIENTE COMPRA UN COCHE----");
									System.out.println("Elige un coche vendido para saber quien lo compro");
									ArrayList<Coche> cochesVendidos = con1.cochesVendidos();
									int k = 1;
									for (Coche coch : cochesVendidos) {
										System.out.println(k + " : " + coch.toString());
										k++;
									}
									int a3 = sc.nextInt();
									System.out.println(cochesVendidos.get(a3 - 1).getCliente());
									break;
								case "7":
									break;
								default:
									System.out.println("Opcion equivocada\n");
								}

							}
							break;

						case "9":
							break;
						default:
							System.out.println("Opcion equivocada");

						}

					}

					break;

				case "2":
					System.out.println("ERES VENDEDOR");

					String contraseña2;

					do {
						System.out.println("Introduce contraseña");
						contraseña2 = teclado.nextLine();

					} while (!contraseña2.equalsIgnoreCase("V"));

					String opcion22 = " ";
					while (!opcion22.equals("7")) {
						System.out.println("[1] -- ACCESO A EXPOSICIONES");
						System.out.println("[2] -- GESTION DE COCHES DEL CONCESIONARIO");
						System.out.println("[3] -- REPARACIONES");
						System.out.println("[4] -- RESERVAS");
						System.out.println("[5] -- VENTAS");
						System.out.println("[6] -- CONSULTAS/INFORMES");
						System.out.println("[7] -- ATRAS");
						System.out.println("Opcion: ");
						opcion22 = teclado.nextLine();
						switch (opcion22) {

						case "1":
							System.out.println("----ACCESO A EXPOSICIONES----");
							String opcion42 = " ";
							while (!opcion42.equals("2")) {
								System.out.println("[1] -- GESTIONAR EXPOSICIONES");
								System.out.println("[2] -- ATRAS");
								System.out.println("Opcion: ");
								opcion42 = teclado.nextLine();
								switch (opcion42) {
								case "1":

									String opcion52 = " ";
									while (!opcion52.equals("2")) {

										System.out.println("[1] -- VISUALIZA REXPOSICION");
										System.out.println("[2] -- ATRAS");
										System.out.println("Opcion: ");
										opcion52 = teclado.nextLine();
										switch (opcion52) {

										case "1":
											System.out.println("----VISUALIZAR EXPOSICION----");
											con1.visualizarExposiciones();
											break;
										case "2":
											break;
										default:
											System.out.println("Opcion equivocada");
										}

									}
									break;
								}

							}
							break;
						case "2":
							System.out.println("----GESTION DE COCHES DEL CONCESIONARIO----");
							String opcion72 = " ";
							while (!opcion72.equals("2")) {

								System.out.println("[1] -- VISUALIZAR COCHE");
								System.out.println("[2] -- ATRAS");
								System.out.println("Opcion: ");
								opcion72 = teclado.nextLine();
								switch (opcion72) {

								case "1":
									System.out.println("----VISUALIZARCOCHE----");
									if (!con1.cochesEnVenta.isEmpty()) {
										System.out.println("<<<COCHES EN VENTA>>>");
										con1.visualizarCoches();
									}
									if (!con1.listaClientesConReserva().isEmpty()) {
										System.out.println("<<<COCHES RESERVADOS>>>");
										con1.visualizarCochesReservados();
									}
									if (!con1.cochesEnReparacion.isEmpty()) {
										System.out.println("<<<COCHES EN REPARACION>>>");
										con1.visualizarCochesEnReparacion();
									}

									break;
								case "2":
									break;
								default:
									System.out.println("Opcion equivocada");
								}

							}
							break;

						case "3":
							System.out.println("----REPARACIONES----");
							String opcion92 = " ";
							while (!opcion92.equals("2")) {
								System.out.println("[1] -- CONSULTA REPARACIONES(ORDENADAS POR FECHA REPARACION)");
								System.out.println("[2] -- ATRAS");
								System.out.println("Opcion: ");
								opcion92 = teclado.nextLine();
								switch (opcion92) {

								case "1":
									System.out.println(
											"---CONSULTA REPARACIONES DE UN COCHE(ORDENADAS POR FECHA REPARACION)----");
									String opcion93 = " ";
									while (!opcion93.equals("3")) {

										System.out.println("[1] -- COCHES EN VENTA");
										System.out.println("[2] -- COCHES EN REPARACION");
										System.out.println("[3] -- ATRAS");
										System.out.print("Opcion: ");
										opcion93 = teclado.nextLine();

										switch (opcion93) {

										case "1":

											if (con1.cochesEnVenta.isEmpty()) {
												System.out.println("No hay coches en venta");
											} else {
												System.out.println("Elige al coche para ver las reparaciones");
												con1.visualizarCoches();
												int b = sc.nextInt();
												Coche c = con1.getCochesEnVenta().get(b);
												if (c.reparaciones.isEmpty()) {
													System.out.println("No tiene reparaciones disponibles");
												} else {
													c.visualizarReparaciones();
												}
											}

											break;
										case "2":
											if (con1.cochesEnReparacion.isEmpty()) {
												System.out.println("No hay coches en reparacion");
											} else {
												System.out.println("Elige al coche para ver las reparaciones");
												con1.visualizarCoches();
												int b = sc.nextInt();
												Coche c = con1.getCochesEnReparacion().get(b);
												if (c.reparaciones.isEmpty()) {
													System.out.println("No tiene reparaciones disponibles");
												} else {
													c.visualizarReparaciones();
												}
											}

											break;

										case "3":
											break;
										default:
											System.out.println("opcion equivocada");
											break;

										}

									}
									break;
								case "2":
									break;
								default:
									System.out.println("Opcion equivocada");
								}

							}
							break;

						case "4":
							System.out.println("RESERVAS");
							String opcion102 = " ";
							while (!opcion102.equals("3")) {
								System.out.println("[1] -- RESERVAR COCHE");
								System.out.println("[2] -- CANCELAR RESERVA");
								System.out.println("[3] -- ATRAS");
								System.out.println("Opcion: ");
								opcion102 = teclado.nextLine();
								switch (opcion102) {
								case "1":
									System.out.println("----RESERVAR COCHE----");
									if (con1.clientes.isEmpty()) {
										System.out.println("No hay clientes");
									} else {
										System.out.println("Elige el cliente que va a reservar : ");
										con1.visualizarCliente();
										int a = sc.nextInt();
										Cliente c = con1.clientes.get(a - 1);
										if (con1.cochesEnVenta.isEmpty()) {
											System.out.println("No hay coches en venta");
										}

										else {
											System.out.println("Elige el coche que va a reservar");
											con1.visualizarCoches();
											int b = sc.nextInt();
											con1.reservarCoche(c, b);
										}
									}
									break;
								case "2":
									System.out.println("----CANCELAR RESERVA----");
									if (con1.listaClientesConReserva().isEmpty()) {
										System.out.println("No hay clientes con reserva");
									} else {
										System.out.println("Elige el cliente que va a cancelar la reserva");
										con1.informeClientesConReservas();
										int b2 = sc.nextInt();
										Cliente cli = con1.clientes.get(b2 - 1);
										if (cli.getCochesReservados().isEmpty())
											System.out.println("Este cliente no tiene coches reservados");
										else {
											System.out.println("Elige el coche que va a dejar de reservar");
											cli.visualizarCochesReservados();
											int b3 = sc.nextInt();
											con1.cancelarReservaCoche(cli, b3);
										}
									}

									break;
								case "3":
									break;
								default:
									System.out.println("Opcion equivocada");
								}

							}
							break;

						case "5":
							System.out.println("VENTAS");
							String opcion11 = " ";
							while (!opcion11.equals("2")) {
								System.out.println("[1] -- VENDER COCHE");
								System.out.println("[2] -- ATRAS");
								System.out.println("Opcion: ");
								opcion11 = teclado.nextLine();
								switch (opcion11) {
								case "1":
									System.out.println("----VENDER COCHE----");
									String opcion933 = " ";
									while (!opcion933.equals("3")) {

										System.out.println("[1] -- LISTADO COCHES EN VENTA");
										System.out.println("[2] -- LISTADO COCHES RESERVADOS POR CLIENTE");
										System.out.println("[3] -- ATRAS");
										System.out.print("Opcion: ");
										opcion933 = teclado.nextLine();

										switch (opcion933) {

										case "1":

											if (con1.cochesEnVenta.isEmpty()) {
												System.out.println("No hay coches en venta");
											} else {
												System.out.println("Elige el coche que se va a comprar");
												con1.visualizarCoches();
												int a = sc.nextInt();
												Coche c = con1.getCochesEnVenta().get(a - 1);
												if (con1.getVendedores().isEmpty()) {
													System.out.println("No hay vendedores disponlibles");
												} else {
													System.out.println("Elige vendedor va ha realizar la venta ");
													con1.visualizarVendedorComision();
													int a1 = sc.nextInt();
													Vendedor v = con1.getVendedores().get(a1 - 1);
													if (con1.getClientes().isEmpty()) {
														System.out.println("No hay clientes disponibles");
													} else {
														System.out.println("Elige el cliente que va a comprar ");
														con1.visualizarCliente();
														int a2 = sc.nextInt();
														con1.venderCoche(c, con1.getClientes().get(a2 - 1));
														v.venderCoche(c);
													}
												}
											}

											break;

										case "2":
											System.out.println("COCHES RESERVADOS");
											if (con1.listaClientesConReserva().isEmpty()) {
												System.out.println("No hay clientes con coches reservados");
											} else {
												System.out.println("Elige el cliente que va a comprar ");
												con1.visualizarCliente();
												int a2 = sc.nextInt();
												Cliente c = con1.getClientes().get(a2 - 1);
												if (c.getCochesReservados().isEmpty()) {
													System.out.println("Este cliente no tiene coches reservados : ");
												} else {
													System.out.println("Elige el coche que se va a comprar");
													c.visualizarCochesReservados();
													int a = sc.nextInt();
													ArrayList<Coche> cochesArray = new ArrayList<>(
															c.getCochesReservados());
													Coche coch = cochesArray.get(a - 1);
													if (con1.getVendedores().isEmpty()) {
														System.out.println("No hay vendedores disponlibles");
													} else {
														System.out.println("Elige vendedor va ha realizar la venta ");
														con1.visualizarVendedorComision();
														int a1 = sc.nextInt();
														Vendedor v = con1.getVendedores().get(a1 - 1);
														v.venderCoche(coch);
														con1.venderCocheEnReserva(coch, c);

													}
												}
											}

											break;

										case "3":
											System.out.println("ATRAS");

											break;

										default:
											System.out.println("opcion equivocada");
											break;

										}

									}
									break;

								case "2":
									break;
								default:
									System.out.println("Opcion equivocada\n");
								}

							}
							break;

						case "6":
							System.out.println("CONSULTAS/INFORMES");
							String opcion12 = " ";
							while (!opcion12.equals("6")) {
								System.out.println("[1] -- LISTADO DE COCHES EN VENTA");
								System.out.println("[2] -- LISTADO DE COCHES RESERVADOS");
								System.out.println("[3] -- LISTADO DE COCHES EN REPARACION");
								System.out.println(
										"[4] -- LISTADO COCHES RESERVADOS POR UN CLIENTE(DATOS CLIENTE Y COCHE)");
								System.out.println("[5] -- MOSTRAR QUE CLIENTE COMPRA UN COCHE");
								System.out.println("[6] -- ATRAS");
								System.out.println("Opcion: ");
								opcion12 = teclado.nextLine();
								switch (opcion12) {
								case "1":
									System.out.println("----LISTADO DE COCHES EN VENTA----");
									if (con1.cochesEnVenta.isEmpty()) {
										System.out.println("No hay coches en venta disponibles");
									} else {
										con1.visualizarCoches();
									}

									break;
								case "2":
									System.out.println("----LISTADO DE COCHES RESERVADOS----");
									if (con1.listaClientesConReserva().isEmpty()) {
										System.out.println("No hay coches reservados disponibles");
									} else {
										con1.visualizarCochesReservados();
									}

									break;
								case "3":
									System.out.println("----LISTADO DE COCHES EN REPARACION----");
									if (con1.cochesEnReparacion.isEmpty()) {
										System.out.println("No hay coches en reparación para mostrar");
									} else {
										con1.visualizarCochesEnReparacion();
									}
									break;
								case "4":
									System.out.println(
											"----LISTADO COCHES RESERVADOS POR UN CLIENTE(DATOS CLIENTE Y COCHE)----");
									con1.informeClientesConReservas();
									break;
								case "5":
									System.out.println("----MOSTRAR QUE CLIENTE COMPRA UN COCHE----");
									System.out.println("Elige un coche vendido para saber quien lo compro");
									ArrayList<Coche> cochesVendidos = con1.cochesVendidos();
									int k = 1;
									for (Coche coch : cochesVendidos) {
										System.out.println(k + " : " + coch.toString());
										k++;
									}
									int a3 = sc.nextInt();
									System.out.println(cochesVendidos.get(a3 - 1).getCliente());
									break;
								case "6":
									break;
								default:
									System.out.println("Opcion equivocada\n");
								}

							}
							break;
						case "7":
							break;

						default:
							System.out.println("Opcion equivocada");

						}

					}

					break;

				case "3":
					System.out.println("ERES MECANICO");
					String contraseña3;

					do {
						System.out.println("Introduce contraseña");
						contraseña3 = teclado.nextLine();

					} while (!contraseña3.equalsIgnoreCase("M"));

					String opcion23 = " ";
					while (!opcion23.equals("2")) {

						System.out.println("[1] -- REPARACIONES");
						System.out.println("[2] -- ATRAS");

						System.out.println("Opcion: ");
						opcion23 = teclado.nextLine();
						switch (opcion23) {

						case "1":
							System.out.println("----REPARACIONES----");
							String opcion9 = " ";
							while (!opcion9.equals("4")) {
								System.out.println("[1] -- CAMBIA UN COCHE DE ESTADO EN VENTA A ESTADO REPARACION");
								System.out.println("[2] -- REPARAR COCHE DE LISTA DE COCHES EN REPARACION");
								System.out
										.println("[3] -- CONSULTA REPARACIONES DE UN (ORDENADAS POR FECHA REPARACION)");
								System.out.println("[4] -- ATRAS");
								System.out.println("Opcion: ");
								opcion9 = teclado.nextLine();
								switch (opcion9) {
								case "1":
									if ((con1.cochesEnVenta.isEmpty())) {
										System.out.println("No hay coches en venta para reparar");
									} else {

										System.out.println("Elige al coche para reparar");
										con1.visualizarCoches();
										int b = sc.nextInt();
										System.out.println("Elige el tipo de reparacion");
										String opcion988 = " ";
										while (!opcion988.equals("5")) {
											System.out.println("[1] -- MECANICA");
											System.out.println("[2] -- ELECTRICA");
											System.out.println("[3] -- CHAPA");
											System.out.println("[4] -- REVISION");
											System.out.println("[5] -- ATRAS");
											System.out.println("Opcion: ");
											opcion988 = teclado.nextLine();
											String tipo = " ";
											switch (opcion988) {

											case "1":
												tipo = "mecanica";
												con1.llevarCocheReparar(b, tipo);
												break;
											case "2":
												tipo = "electrica";
												con1.llevarCocheReparar(b, tipo);
												break;
											case "3":
												tipo = "chapa";
												con1.llevarCocheReparar(b, tipo);
												break;
											case "4":
												tipo = "revision";
												con1.llevarCocheReparar(b, tipo);
												break;
											case "5":
												break;

											default:
												System.out.println("Opcion equivocada");

											}

											break;

										}

									}

									break;
								case "2":
									System.out.println("----REPARAR COCHE DE LISTA DE COCHES EN REPARACION----");
									if (con1.cochesEnReparacion.isEmpty()) {
										System.out.println("No hay coches en reparacion para reparar");
									} else {
										System.out.println("Elige al coche ");
										con1.visualizarCochesEnReparacion();
										int b = sc.nextInt();
										con1.cocheReparado(b);
									}
									break;
								case "3":
									System.out.println(
											"---CONSULTA REPARACIONES DE UN COCHE(ORDENADAS POR FECHA REPARACION)----");
									String opcion93 = " ";
									while (!opcion93.equals("4")) {

										System.out.println("[1] -- COCHES EN VENTA");
										System.out.println("[2] -- COCHES EN REPARACION");
										System.out.println("[3] -- ATRAS");
										System.out.print("Opcion: ");
										opcion93 = teclado.nextLine();

										switch (opcion93) {

										case "1":

											if (con1.cochesEnVenta.isEmpty()) {
												System.out.println("No hay coches en venta");
											} else {
												System.out.println("Elige al coche para ver las reparaciones");
												con1.visualizarCoches();
												int b = sc.nextInt();
												Coche c = con1.getCochesEnVenta().get(b - 1);
												if (c.reparaciones.isEmpty()) {
													System.out.println("No tiene reparaciones disponibles");
												} else {
													c.visualizarReparaciones();
												}
											}

											break;
										case "2":
											if (con1.cochesEnReparacion.isEmpty()) {
												System.out.println("No hay coches en reparacion");
											} else {
												System.out.println("Elige al coche para ver las reparaciones");
												con1.visualizarCochesEnReparacion();
												int b = sc.nextInt();
												Coche c = con1.getCochesEnReparacion().get(b - 1);
												if (c.reparaciones.isEmpty()) {
													System.out.println("No tiene reparaciones disponibles");
												} else {
													c.visualizarReparaciones();
												}
											}

											break;

										case "3":
											break;
										default:
											System.out.println("opcion equivocada");
											break;

										}

									}
									break;
								case "4":
									break;
								default:
									System.out.println("Opcion equivocada");
								}

							}
							break;

						case "2":
							break;
						default:
							System.out.println("Opcion equivocada");

						}

					}

					break;

				case "4":
					System.out.println("ERES CLIENTE");

					String contraseña4;

					do {
						System.out.println("Introduce contraseña");
						contraseña4 = teclado.nextLine();

					} while (!contraseña4.equalsIgnoreCase("C"));

					String opcion24 = " ";
					while (!opcion24.equals("3")) {

						System.out.println("[1] -- GESTION DE COCHES DEL CONCESIONARIO");
						System.out.println("[2] -- CONSULTAS/INFORMES");
						System.out.println("[3] -- ATRAS");
						System.out.println("Opcion: ");
						opcion24 = teclado.nextLine();
						switch (opcion24) {

						case "1":
							System.out.println("----GESTION DE COCHES DEL CONCESIONARIO----");
							String opcion74 = " ";
							while (!opcion74.equals("2")) {
								System.out.println("[1] -- VISUALIZAR COCHES");
								System.out.println("[2] -- ATRAS");
								System.out.println("Opcion: ");
								opcion74 = teclado.nextLine();
								switch (opcion74) {

								case "1":
									System.out.println("----VISUALIZAR COCHES----");
									if (!con1.cochesEnVenta.isEmpty()) {
										System.out.println("<<<COCHES EN VENTA>>>");
										con1.visualizarCoches();
									}
									if (!con1.listaClientesConReserva().isEmpty()) {
										System.out.println("<<<COCHES RESERVADOS>>>");
										con1.visualizarCochesReservados();
									}
									if (!con1.cochesEnReparacion.isEmpty()) {
										System.out.println("<<<COCHES EN REPARACION>>>");
										con1.visualizarCochesEnReparacion();
									}

									break;
								case "2":
									break;
								default:
									System.out.println("Opcion equivocada");
								}

							}
							break;

						case "2":
							System.out.println("----CONSULTAS/INFORMES----");
							String opcion124 = " ";
							while (!opcion124.equals("2")) {
								System.out.println("[1] -- LISTADO DE COCHES EN VENTA");
								System.out.println("[2] -- ATRAS");
								System.out.println("Opcion: ");
								opcion124 = teclado.nextLine();
								switch (opcion124) {
								case "1":
									System.out.println("----LISTADO DE COCHES EN VENTA----");
									con1.visualizarCoches();
									break;

								case "2":
									break;
								default:
									System.out.println("Opcion equivocada\n");

								}

							}
							break;

						case "3":
							break;

						default:
							System.out.println("Opcion equivocada");

						}

					}

					break;

				case "5":
					System.out.println("HAS SALIDO DEL MENU");
					break;

				default:
					System.out.println("Opcion equivocada");
				}
			}
			sc.close();

		} catch (ExParametrosNoValidos e) {
			e.printStackTrace();
		}

	}
}