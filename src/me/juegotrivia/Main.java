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
		System.out.println("Menu de seleccion\n"
				+ "1. Jugar\n"
				+ "2. Contador de puntos\n"
				+ "0. Salir del juego");
	}
	
	public static void juego() {
		System.out.println("El juego va a comenzar.\n\n"
				+ "1. Hardware PC\n"
				+ "2. Software PC\n"
				+ "3. Futbol\n");	
		
		String seleccion = JOptionPane.showInputDialog("Selecciona una tematica.");
		int seleccionum = Integer.parseInt(seleccion);
		
		if (seleccionum == 1) {
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
}
