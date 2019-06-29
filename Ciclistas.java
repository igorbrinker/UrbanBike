package br.unilasalle;

import java.util.ArrayList;
import java.util.Scanner;


public class Ciclistas {
	Scanner input = new Scanner(System.in);
	public ArrayList<UrbanBike> pedal = new ArrayList<>();
	
	public void inserir() {
		for(UrbanBike ped: pedal) {
			int i = 0;
			i++;
			ped.setNumeroConta(i);
			ped.setCarteira(0);
			ped.setCredito(0);
			ped.setKm(0);
			ped.setPremium(false);
			pedal.add(ped);
			System.out.println("Usuario " + i + " inserido com sucesso!");
		}
	}
	
	public void remover() {
		System.out.println("Digite o codigo de pedal a ser removido: ");
		int i;
		i = input.nextInt();
		pedal.remove(i);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void procurar() {
		int i = 0;
		System.out.println("Insira o pedal que voce deseja procurar: ");
		i = input.nextInt();
		if(pedal.contains(i)) {
		pedal.remove(i);
		System.out.println("Ciclista removido!");
		}else System.out.println("Nenhum ciclista encontrado!");
	}
}