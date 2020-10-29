package me.juegotrivia;

import javax.swing.JOptionPane;

import me.juegotrivia.utils.Utils;

public class Main {

	public static void main(String ars[]) {
		inicioTrivial();
	}

	public static void inicioTrivial() {
		System.out.println("            # _  .-')   #   ('-.     #     .-') _  #\r\n"
				+ "            #( \\( -O )  #  ( OO ).-. #    ( OO ) ) #\r\n"
				+ "   ,------. # ,------.  #  / . --. / #,--./ ,--,'  #\r\n"
				+ "('-| _.---' # |   /`. ' #  | \\-.  \\  #|   \\ |  |\\  #\r\n"
				+ "(OO|(_\\     # |  /  | | #.-'-'  |  | #|    \\|  | ) #\r\n"
				+ "/  |  '--.  # |  |_.' | # \\| |_.'  | #|  .     |/  #\r\n"
				+ "\\_)|  .--'  # |  .  '.' #  |  .-.  | #|  |\\    |   #\r\n"
				+ "  \\|  |_)   # |  |\\  \\  #  |  | |  | #|  | \\   |   #\r\n"
				+ "   `--'     ## `--' '--' ##  `--' `--' ##`--'  `--'   ##\n\n"
				+ "Bienvenido al juego trivial, selecciona un numero para empezar el programa.");
		menu();
	}

	public static void menu() {
		boolean menu = false;

		while (menu == false) {
			menu = false;
			System.out
					.println("Menu de seleccion\n" + "1. Jugar\n" + "2. Contador de puntos\n" + "0. Salir del juego\n");

			String seleccion = JOptionPane.showInputDialog("Selecciona accion.");
			int seleccionmenu = Integer.parseInt(seleccion);

			if (seleccionmenu == 1) {
				menu = true;
				juego();
			} else {
				if (seleccionmenu == 2) {
					menu = true;

				} else {
					if (seleccionmenu == 0) {
						menu = true;
						System.exit(0);
					}
				}
			}
		}
	}

	public static void juego() {

		System.out.println("El juego va a comenzar.\n\n" + "1. software PC\n" + "2. Software PC\n" + "3. Futbol\n");

		String seleccion = JOptionPane.showInputDialog("Selecciona una tematica.");
		int seleccionum = Integer.parseInt(seleccion);

		if (seleccionum == 1) {
			hardware();
		} else {
			if (seleccionum == 2) {
				software();
			} else {
				if (seleccionum == 3) {
				} else {
					juego();
				}
			}
		}
	}

	public static int intentos = 0;
	public static int hardware = 0;
	public static int software = 0;
	public static int futbol = 0;
	public static int puntuaje = hardware + software + futbol;

	public static void hardware() {
		boolean confirmacion = false;

		if (hardware > 0) {
			System.out.println("Ya has intentado una vez esta tematica. No puedes realizarlo ninguna vez mas.");
		} else {
			// Primera pregunta de Hardware
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Primera pregunta :\n" + "¿Es verdad que los RGB te dan mas FPS?\n"
						+ "(1) : Verdadero\n" + "(2) : Falso\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						hardware = hardware + 1;
						intentos = intentos + 1;
					} else {
						System.out.println("Seleccione una respuesta valida");
					}
				}
			}

			confirmacion = false;

			// Segunda pregunta de Hardware
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Segunda pregunta :\n" + "¿Que SSD es mas rapido?\n" + "(1) : IDE\n" + "(2) : Sata\n"
						+ "(3) : m.2\n" + "(4) : Nvme\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						intentos = intentos + 1;
					} else {
						if (respuesta == 3) {
							confirmacion = true;
							System.out.println("Ha seleccionado la respuesta 3");
							intentos = intentos + 1;
						} else {
							if (respuesta == 4) {
								confirmacion = true;
								System.out.println("Ha seleccionado la respuesta 4");
								hardware = hardware + 1;
								intentos = intentos + 1;
							} else {
								System.out.println("Seleccione una respuesta valida");
							}
						}
					}
				}
			}
			confirmacion = false;

			// Tercera pregunta de Hardware
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Tercera pregunta :\n" + "¿Que tipo de RAM es mas rapido?\n" + "(1) : DRR4\n"
						+ "(2) : Estatica\n" + "(3) : DRR5\n" + "(4) : SDRR4\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						hardware = hardware + 1;
						intentos = intentos + 1;
					} else {
						if (respuesta == 3) {
							confirmacion = true;
							System.out.println("Ha seleccionado la respuesta 3");
							intentos = intentos + 1;
						} else {
							if (respuesta == 4) {
								confirmacion = true;
								System.out.println("Ha seleccionado la respuesta 4");
								intentos = intentos + 1;
							} else {
								System.out.println("Seleccione una respuesta valida");
							}
						}
					}
				}
			}
			confirmacion = false;

			// Cuarta pregunta de Hardware
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Cuarta pregunta :\n" + "¿Que tipo de CPU tengo si tengo un Ryzen 9 3900X?\n"
						+ "(1) : LGA\n" + "(2) : PGA\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						hardware = hardware + 1;
						intentos = intentos + 1;
					} else {
						System.out.println("Seleccione una respuesta valida");
					}
				}
			}
			confirmacion = false;

			// Quinta pregunta de Hardware
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Quinta pregunta :\n" + "¿Que es el hardware?\n"
						+ "(1) : Son los componentes virtuales del PC\n" + "(2) : Son los componentes fisicos del PC\n"
						+ "(3) : Es un película de acción muy conocida\n"
						+ "(4) : Es el disco duro y los archivos que contiene\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						hardware = hardware + 1;
						intentos = intentos + 1;
					} else {
						if (respuesta == 3) {
							confirmacion = true;
							System.out.println("Ha seleccionado la respuesta 3");
							intentos = intentos + 1;
						} else {
							if (respuesta == 4) {
								confirmacion = true;
								System.out.println("Ha seleccionado la respuesta 4");
								intentos = intentos + 1;
							} else {
								System.out.println("Seleccione una respuesta valida");
							}
						}
					}
				}
			}
			confirmacion = false;

			// Sexta pregunta de Hardware
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Sexta pregunta :\n"
						+ "¿En cual componente del computador se guarda la información de manera permanente?\n"
						+ "(1) : RAM\n" + "(2) : CPU\n" + "(3) : La nube\n" + "(4) : Disco Duro\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						intentos = intentos + 1;
					} else {
						if (respuesta == 3) {
							confirmacion = true;
							System.out.println("Ha seleccionado la respuesta 3");
							intentos = intentos + 1;
						} else {
							if (respuesta == 4) {
								confirmacion = true;
								System.out.println("Ha seleccionado la respuesta 4");
								intentos = intentos + 1;
								hardware = hardware + 1;
							} else {
								System.out.println("Seleccione una respuesta valida");
							}
						}
					}
				}
			}
			confirmacion = false;

			// Septima pregunta de Hardware
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Septima pregunta :\n"
						+ "¿La Placa Base sirve para conectar todas las partes internas de un computador\n"
						+ "(1) : Verdadero\n" + "(2) : Falso\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
					hardware = hardware + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						intentos = intentos + 1;
					} else {
						System.out.println("Seleccione una respuesta valida");
					}
				}
			}
			confirmacion = false;

			// Octava pregunta de Hardware
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Octava pregunta :\n" + "Podemos definir el procesador de un como:\n"
						+ "(1) : El circuito mas pequeño del computador\n"
						+ "(2) : El controlador del video de nuestro equipo\n"
						+ "(3) : El que mide el rendimiento del pc\n" + "(4) : El cerebro del computador\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						intentos = intentos + 1;
					} else {
						if (respuesta == 3) {
							confirmacion = true;
							System.out.println("Ha seleccionado la respuesta 3");
							intentos = intentos + 1;
						} else {
							if (respuesta == 4) {
								confirmacion = true;
								System.out.println("Ha seleccionado la respuesta 4");
								intentos = intentos + 1;
								hardware = hardware + 1;
							} else {
								System.out.println("Seleccione una respuesta valida");
							}
						}
					}
				}
			}
			confirmacion = false;

			// Novena pregunta de Hardware
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Novena pregunta :\n" + "¿Que significa CPU?\n" + "(1) : Comida para umanos\n"
						+ "(2) : Control para usuarios\n" + "(3) : Unidad Central de Proceso\n"
						+ "(4) : Cambio por unidades\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");

						intentos = intentos + 1;
					} else {
						if (respuesta == 3) {
							confirmacion = true;
							System.out.println("Ha seleccionado la respuesta 3");
							hardware = hardware + 1;
							intentos = intentos + 1;
						} else {
							if (respuesta == 4) {
								confirmacion = true;
								System.out.println("Ha seleccionado la respuesta 4");
								intentos = intentos + 1;
							} else {
								System.out.println("Seleccione una respuesta valida");
							}
						}
					}
				}
			}
			confirmacion = false;

			// Decima pregunta de Hardware
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Decima pregunta :\n" + " ¿Qué es la BIOS?\n"
						+ "(1) : Programa que mantiene cierta información básica en el arranque de la computadora\n"
						+ "(2) : Es el cerebro que se encarga de controlar todo el sistema\n"
						+ "(3) : Donde se almacenan los datos\n"
						+ "(4) : Donde se conectan todos los componentes del ordenador\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
					hardware = hardware + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						intentos = intentos + 1;
					} else {
						if (respuesta == 3) {
							confirmacion = true;
							System.out.println("Ha seleccionado la respuesta 3");
							intentos = intentos + 1;
						} else {
							if (respuesta == 4) {
								confirmacion = true;
								System.out.println("Ha seleccionado la respuesta 4");
								intentos = intentos + 1;
							} else {
								System.out.println("Seleccione una respuesta valida");
							}
						}
					}
				}
			}
		}
		Utils.borrarConsola();
	}
	
	public static void software() {
		boolean confirmacion = false;

		if (software > 0) {
			System.out.println("Ya has intentado una vez esta tematica. No puedes realizarlo ninguna vez mas.");
		} else {
			// Primera pregunta de software
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Primera pregunta :\n" + "¿Es verdad que los RGB te dan mas FPS?\n"
						+ "(1) : Verdadero\n" + "(2) : Falso\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						software = software + 1;
						intentos = intentos + 1;
					} else {
						System.out.println("Seleccione una respuesta valida");
					}
				}
			}

			confirmacion = false;

			// Segunda pregunta de software
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Segunda pregunta :\n" + "¿Que SSD es mas rapido?\n" + "(1) : IDE\n" + "(2) : Sata\n"
						+ "(3) : m.2\n" + "(4) : Nvme\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						intentos = intentos + 1;
					} else {
						if (respuesta == 3) {
							confirmacion = true;
							System.out.println("Ha seleccionado la respuesta 3");
							intentos = intentos + 1;
						} else {
							if (respuesta == 4) {
								confirmacion = true;
								System.out.println("Ha seleccionado la respuesta 4");
								software = software + 1;
								intentos = intentos + 1;
							} else {
								System.out.println("Seleccione una respuesta valida");
							}
						}
					}
				}
			}
			confirmacion = false;

			// Tercera pregunta de software
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Tercera pregunta :\n" + "¿Que tipo de RAM es mas rapido?\n" + "(1) : DRR4\n"
						+ "(2) : Estatica\n" + "(3) : DRR5\n" + "(4) : SDRR4\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						software = software + 1;
						intentos = intentos + 1;
					} else {
						if (respuesta == 3) {
							confirmacion = true;
							System.out.println("Ha seleccionado la respuesta 3");
							intentos = intentos + 1;
						} else {
							if (respuesta == 4) {
								confirmacion = true;
								System.out.println("Ha seleccionado la respuesta 4");
								intentos = intentos + 1;
							} else {
								System.out.println("Seleccione una respuesta valida");
							}
						}
					}
				}
			}
			confirmacion = false;

			// Cuarta pregunta de software
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Cuarta pregunta :\n" + "¿Que tipo de CPU tengo si tengo un Ryzen 9 3900X?\n"
						+ "(1) : LGA\n" + "(2) : PGA\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						software = software + 1;
						intentos = intentos + 1;
					} else {
						System.out.println("Seleccione una respuesta valida");
					}
				}
			}
			confirmacion = false;

			// Quinta pregunta de software
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Quinta pregunta :\n" + "¿Que es el software?\n"
						+ "(1) : Son los componentes virtuales del PC\n" + "(2) : Son los componentes fisicos del PC\n"
						+ "(3) : Es un película de acción muy conocida\n"
						+ "(4) : Es el disco duro y los archivos que contiene\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						software = software + 1;
						intentos = intentos + 1;
					} else {
						if (respuesta == 3) {
							confirmacion = true;
							System.out.println("Ha seleccionado la respuesta 3");
							intentos = intentos + 1;
						} else {
							if (respuesta == 4) {
								confirmacion = true;
								System.out.println("Ha seleccionado la respuesta 4");
								intentos = intentos + 1;
							} else {
								System.out.println("Seleccione una respuesta valida");
							}
						}
					}
				}
			}
			confirmacion = false;

			// Sexta pregunta de software
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Sexta pregunta :\n"
						+ "¿En cual componente del computador se guarda la información de manera permanente?\n"
						+ "(1) : RAM\n" + "(2) : CPU\n" + "(3) : La nube\n" + "(4) : Disco Duro\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						intentos = intentos + 1;
					} else {
						if (respuesta == 3) {
							confirmacion = true;
							System.out.println("Ha seleccionado la respuesta 3");
							intentos = intentos + 1;
						} else {
							if (respuesta == 4) {
								confirmacion = true;
								System.out.println("Ha seleccionado la respuesta 4");
								intentos = intentos + 1;
								software = software + 1;
							} else {
								System.out.println("Seleccione una respuesta valida");
							}
						}
					}
				}
			}
			confirmacion = false;

			// Septima pregunta de software
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Septima pregunta :\n"
						+ "¿La Placa Base sirve para conectar todas las partes internas de un computador\n"
						+ "(1) : Verdadero\n" + "(2) : Falso\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
					software = software + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						intentos = intentos + 1;
					} else {
						System.out.println("Seleccione una respuesta valida");
					}
				}
			}
			confirmacion = false;

			// Octava pregunta de software
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Octava pregunta :\n" + "Podemos definir el procesador de un como:\n"
						+ "(1) : El circuito mas pequeño del computador\n"
						+ "(2) : El controlador del video de nuestro equipo\n"
						+ "(3) : El que mide el rendimiento del pc\n" + "(4) : El cerebro del computador\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						intentos = intentos + 1;
					} else {
						if (respuesta == 3) {
							confirmacion = true;
							System.out.println("Ha seleccionado la respuesta 3");
							intentos = intentos + 1;
						} else {
							if (respuesta == 4) {
								confirmacion = true;
								System.out.println("Ha seleccionado la respuesta 4");
								intentos = intentos + 1;
								software = software + 1;
							} else {
								System.out.println("Seleccione una respuesta valida");
							}
						}
					}
				}
			}
			confirmacion = false;

			// Novena pregunta de software
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Novena pregunta :\n" + "¿Que significa CPU?\n" + "(1) : Comida para umanos\n"
						+ "(2) : Control para usuarios\n" + "(3) : Unidad Central de Proceso\n"
						+ "(4) : Cambio por unidades\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");

						intentos = intentos + 1;
					} else {
						if (respuesta == 3) {
							confirmacion = true;
							System.out.println("Ha seleccionado la respuesta 3");
							software = software + 1;
							intentos = intentos + 1;
						} else {
							if (respuesta == 4) {
								confirmacion = true;
								System.out.println("Ha seleccionado la respuesta 4");
								intentos = intentos + 1;
							} else {
								System.out.println("Seleccione una respuesta valida");
							}
						}
					}
				}
			}
			confirmacion = false;

			// Decima pregunta de software
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Decima pregunta :\n" + " ¿Qué es la BIOS?\n"
						+ "(1) : Programa que mantiene cierta información básica en el arranque de la computadora\n"
						+ "(2) : Es el cerebro que se encarga de controlar todo el sistema\n"
						+ "(3) : Donde se almacenan los datos\n"
						+ "(4) : Donde se conectan todos los componentes del ordenador\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
					software = software + 1;
				} else {
					if (respuesta == 2) {
						confirmacion = true;
						System.out.println("Ha seleccionado la respuesta 2");
						intentos = intentos + 1;
					} else {
						if (respuesta == 3) {
							confirmacion = true;
							System.out.println("Ha seleccionado la respuesta 3");
							intentos = intentos + 1;
						} else {
							if (respuesta == 4) {
								confirmacion = true;
								System.out.println("Ha seleccionado la respuesta 4");
								intentos = intentos + 1;
							} else {
								System.out.println("Seleccione una respuesta valida");
							}
						}
					}
				}
			}
		}
		Utils.borrarConsola();
	}
}

