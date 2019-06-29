package br.unilasalle;

import java.util.Scanner;

public class Menu {
	public static int opc;
	public static int aux = 0;
	
	Scanner in = new Scanner(System.in);
	
	
	public static void main(String [] args) {
		do {
			
			System.out.println("-----UrbanBike-----");
			System.out.println("(1) Adicionar Ciclista");
			System.out.println("(2) Remover Ciclista");
			System.out.println("(3) Procurar Ciclista");
			System.out.println("(4) Sair");
			
			switch(opc) {
				case 1: 
					break;
				case 2:
					break;
				case 3:
					break;
				case 4: aux = -1;
					break;
			}
			
		}while(aux == -1);
	}
}
