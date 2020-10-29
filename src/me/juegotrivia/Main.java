package me.juegotrivia;

import javax.swing.JOptionPane;

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
		boolean menu = false ;
		
		while (menu==false) {
			menu = false;
			System.out.println("Menu de seleccion\n"
					+ "1. Jugar\n"
					+ "2. Contador de puntos\n"
					+ "0. Salir del juego");
			
			String seleccion = JOptionPane.showInputDialog("Selecciona accion.");
			int seleccionmenu = Integer.parseInt(seleccion);
			
			if (seleccionmenu == 1) {
				menu = true;
				juego();
			}
			else {
				if (seleccionmenu == 2) {
					menu = true;
				
				}
				else {
					if (seleccionmenu == 3) {
						menu = true;
						
					}
				}
			}
		}
	}
	
	public static void juego() {
		
		System.out.println("El juego va a comenzar.\n\n"
				+ "1. Hardware PC\n"
				+ "2. Software PC\n"
				+ "3. Futbol\n");	
		
		String seleccion = JOptionPane.showInputDialog("Selecciona una tematica.");
		int seleccionum = Integer.parseInt(seleccion);
		
		if (seleccionum == 1) {
			hardware();
		}
		else {
			if (seleccionum == 2) {
			}
			else {
				if (seleccionum == 3) {
				}
				else {
					juego();
				}
			}
		}	
	}
	
	public static void hardware() {
		int hardware = 0;
		boolean confirmacion = false;
		
		// Primera pregunta de Hardware
		while (confirmacion==false) {
			confirmacion=false;
			System.out.println("Primera pregunta :\n"
				+ "¿Es verdad que los RGB te dan mas FPS?\n"
				+ "(A) : Verdadero\n"
				+ "(B) : Falso");
		
			String respuesta = JOptionPane.showInputDialog("Introduzca su respuesta: ");
			respuesta = respuesta.toUpperCase();
			
			if (respuesta=="A") {
				confirmacion=true;
				System.out.println("Ha seleccionado la respuesta A.");
				hardware = hardware + 1;
			}
			else {
				if (respuesta=="B") {
					confirmacion=true;
					System.out.println("Ha seleccionado la respuesta B");
				}
			}
		}
	}
}
