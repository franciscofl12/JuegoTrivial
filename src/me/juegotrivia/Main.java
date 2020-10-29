package me.juegotrivia;

import javax.swing.JOptionPane;

import me.juegotrivia.utils.Utils;

public class Main {

	public static void main(String ars[]) {
		inicioTrivial();
	}

	public static void inicioTrivial() {
		System.out.println("                                            .---. \r\n"
				+ "                 .--..----.     .----.       |   | \r\n"
				+ "                 |__| \\    \\   /    /        |   | \r\n"
				+ "     .|  .-,.--. .--.  '   '. /'   /         |   | \r\n"
				+ "   .' |_ |  .-. ||  |  |    |'    /    __    |   | \r\n"
				+ " .'     || |  | ||  |  |    ||    | .:--.'.  |   | \r\n"
				+ "'--.  .-'| |  | ||  |  '.   `'   .'/ |   \\ | |   | \r\n"
				+ "   |  |  | |  '- |  |   \\        / `\" __ | | |   | \r\n"
				+ "   |  |  | |     |__|    \\      /   .'.''| | |   | \r\n"
				+ "   |  '.'| |              '----'   / /   | |_'---' \r\n"
				+ "   |   / |_|                       \\ \\._,\\ '/      \r\n"
				+ "   `'-'                             `--'  `\"       " + "Creado por franciscofl12.\n\n"
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
					contador();
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

		System.out.println("El juego va a comenzar.\n\n" + "1. Hardware PC\n" + "2. Software PC\n" + "3. Futbol\n");

		String seleccion = JOptionPane.showInputDialog("Selecciona una tematica.");
		int seleccionum = Integer.parseInt(seleccion);

		if (seleccionum == 1) {
			hardware();
		} else {
			if (seleccionum == 2) {
				software();
			} else {
				if (seleccionum == 3) {
					futbol();
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

		System.out.println("                     _                        \r\n"
				+ "  /\\  /\\__ _ _ __ __| |_      ____ _ _ __ ___ \r\n"
				+ " / /_/ / _` | '__/ _` \\ \\ /\\ / / _` | '__/ _ \\\r\n"
				+ "/ __  / (_| | | | (_| |\\ V  V / (_| | | |  __/\r\n"
				+ "\\/ /_/ \\__,_|_|  \\__,_| \\_/\\_/ \\__,_|_|  \\___|\r\n"
				+ "                                              ");

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
		menu();
	}

	public static void software() {
		boolean confirmacion = false;

		System.out.println(" __        __ _                          \r\n"
				+ "/ _\\ ___  / _| |___      ____ _ _ __ ___ \r\n"
				+ "\\ \\ / _ \\| |_| __\\ \\ /\\ / / _` | '__/ _ \\\r\n"
				+ "_\\ \\ (_) |  _| |_ \\ V  V / (_| | | |  __/\r\n"
				+ "\\__/\\___/|_|  \\__| \\_/\\_/ \\__,_|_|  \\___|\r\n" + "                                         ");

		if (software > 0) {
			System.out.println("Ya has intentado una vez esta tematica. No puedes realizarlo ninguna vez mas.");
		} else {
			// Primera pregunta de software
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Primera pregunta :\n" + "¿Que sistema operativo es mas antiguo?\n"
						+ "(1) : Windows Vista\n" + "(2) : Windows XP\n");

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
				System.out.println("Segunda pregunta :\n" + "¿Qué es el software?\n"
						+ "(1) : Es el conjunto de instrucciones electrónicas que le dicen al hardware lo que debe hacer.\n"
						+ "(2) : Conjunto de elementos físicos o materiales que constituyen una computadora o un sistema informático.\n"
						+ "(3) :  Memoria principal de la computadora, donde residen programas y datos, sobre la que se pueden efectuar operaciones de lectura y escritura\n"
						+ "(4) :  Área de almacenamiento dedicada a los datos usados o solicitados con más frecuencias para su recuperación a gran velocidad.\n");

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
			confirmacion = false;

			// Tercera pregunta de software
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Tercera pregunta :\n" + "¿Cuál es el primer paso para ejecutar un programa?\n"
						+ "(1) :  Guardarlo en la memoria USB.\n"
						+ "(2) :  Archivarlo en el dispositivo de almacenamiento.\n" + "(3) : Guardarlo en la CPU.\n"
						+ "(4) : Guardarlo en la RAM.\n");

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

			// Cuarta pregunta de software
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Cuarta pregunta :\n"
						+ "¿Cuáles son las dos categorías en las que se divide el software?\n"
						+ "(1) : Software de sistemas y comunicacion\n" + "(2) : Software de sistemas y aplicacion\n");

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
						+ "Es la categoría del programa software que le dice al computador como usar sus propios componentes.\n"
						+ "(1) : Software de comunicación.\n" + "(2) : Software de sistema.\n"
						+ "(3) : Software de aplicacion.\n" + "(4) : Software de programa.\n");

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
						software = software + 1;
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

			// Septima pregunta de software
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Septima pregunta :\n" + "Qué es el software de aplicación\n"
						+ "(1) : Le dice al computador como realizar tareas especificas para el usuario.\n"
						+ "(2) :  Le dice al computador como manejar los programas.\n");

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
				System.out.println("Octava pregunta :\n"
						+ "   A la categoría de software de sistema pertenecen los programas de:\n"
						+ "(1) : Sistema matematico.\n" + "(2) : Sistema comunicativo.\n"
						+ "(3) : Sistema aplicativo.\n" + "(4) : Sistema operativo.\n");

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
				System.out.println("Novena pregunta :\n" + "Son dibujos que representan los recursos del computador\n"
						+ "(1) : Imagen\n" + "(2) : Ventanas\n" + "(3) : Iconos\n" + "(4) : Unidades\n");

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
				System.out.println("Decima pregunta :\n" + " ¿Qué significa 'Solicitudes de Interrupción'?\n"
						+ "(1) : Es una señal enviada por el sistema operativo a la CPU, solicitando tiempo de procesamiento para una tarea específica\n"
						+ "(2) : Es la muestra enviada por el sistema informático para solicitar el tiempo de descarga.\n"
						+ "(3) : Es donde se almacenan los datos\n"
						+ "(4) : Es la señal enviada por la memoria principal para solicitar los dispositivos de entrada.\n");

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
		menu();
	}

	public static void futbol() {
		boolean confirmacion = false;

		System.out.println("   ___      _   _           _ \r\n" + "  / __\\   _| |_| |__   ___ | |\r\n"
				+ " / _\\| | | | __| '_ \\ / _ \\| |\r\n" + "/ /  | |_| | |_| |_) | (_) | |\r\n"
				+ "\\/    \\__,_|\\__|_.__/ \\___/|_|\r\n" + "                              ");

		if (futbol > 0) {
			System.out.println("Ya has intentado una vez esta tematica. No puedes realizarlo ninguna vez mas.");
		} else {
			// Primera pregunta de futbol
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Primera pregunta :\n" + "¿Que significa FC?\n" + "(1) : Futbol Club\n"
						+ "(2) : Federacion Club\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
					futbol = futbol + 1;
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

			// Segunda pregunta de futbol
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Segunda pregunta :\n" + "¿Quien tiene mas balones de oro?\n"
						+ "(1) : Cristiano Ronaldo empatado con Lionel Messi.\n" + "(2) : Cristiano Ronaldo.\n"
						+ "(3) : Lionel Messi.\n" + "(4) : Pele.\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
					futbol = futbol + 1;
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
			confirmacion = false;

			// Tercera pregunta de futbol
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Tercera pregunta :\n" + "¿Como se llama la liga espanola?\n" + "(1) : Liga BBVA.\n"
						+ "(2) : Liga espanola.\n" + "(3) : Liga Santander.\n" + "(4) : La liga.\n");

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
								futbol = futbol + 1;
							} else {
								System.out.println("Seleccione una respuesta valida");
							}
						}
					}
				}
			}
			confirmacion = false;

			// Cuarta pregunta de futbol
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Cuarta pregunta :\n" + "¿Cuanto dura un partido de futbol?\n" + "(1) : 90 minutos\n"
						+ "(2) : 110 minutos\n");

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
						futbol = futbol + 1;
						intentos = intentos + 1;
					} else {
						System.out.println("Seleccione una respuesta valida");
					}
				}
			}
			confirmacion = false;

			// Quinta pregunta de futbol
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Quinta pregunta :\n" + "¿Que es el futbol?\n" + "(1) : Un deporte\n"
						+ "(2) : Una adiccion\n" + "(3) : Una mierda\n" + "(4) : Un tipo de arbol\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
					futbol = futbol + 1;
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
			confirmacion = false;

			// Sexta pregunta de futbol
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Sexta pregunta :\n" + "Un tipo de falta es:\n" + "(1) : Fuera de juego.\n"
						+ "(2) : Meter un gol.\n" + "(3) : Darle con la cabeza al balon.\n" + "(4) : Correr.\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
					futbol = futbol + 1;
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
			confirmacion = false;

			// Septima pregunta de futbol
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println(
						"Septima pregunta :\n" + "Cuantos arbitros hay en un partido?\n" + "(1) : 4\n" + "(2) : 3\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
					futbol = futbol + 1;
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

			// Octava pregunta de futbol
			while (confirmacion == false) {
				confirmacion = false;
				System.out
						.println("Octava pregunta :\n" + "Con cuantos anios se puede jugar profesionalmente a futbol:\n"
								+ "(1) : 17.\n" + "(2) : 15.\n" + "(3) : 18.\n" + "(4) : 16.\n");

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
								futbol = futbol + 1;
							} else {
								System.out.println("Seleccione una respuesta valida");
							}
						}
					}
				}
			}
			confirmacion = false;

			// Novena pregunta de futbol
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Novena pregunta :\n" + "Cuantos jugadores juegan un partido de futbol\n"
						+ "(1) : 11\n" + "(2) : 20\n" + "(3) : 22\n" + "(4) : 23\n");

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
							futbol = futbol + 1;
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

			// Decima pregunta de futbol
			while (confirmacion == false) {
				confirmacion = false;
				System.out.println("Decima pregunta :\n" + " Mayor goleador del Real Madrid.\n"
						+ "(1) : Cristiano Ronaldo\n"
						+ "(2) : Benzema\n"
						+ "(3) : Raul Gonzalez\n"
						+ "(4) : Sergio Ramos\n");

				String respuestas = JOptionPane.showInputDialog("Introduzca su respuesta: ");
				int respuesta = Integer.parseInt(respuestas);

				if (respuesta == 1) {
					confirmacion = true;
					System.out.println("Ha seleccionado la respuesta 1");
					intentos = intentos + 1;
					futbol = futbol + 1;
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
		menu();
	}

	public static void contador() {
		if (intentos == 0) {
			System.out.println("No has respondido todavia ninguna pregunta");
		} else {
			System.out.println(
					"Analizando preguntas respondidas...\n\n" + "Preguntas respondidas = " + puntuaje + "/" + intentos);
		}
		menu();
	}
}
