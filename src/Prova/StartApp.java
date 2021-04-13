package Prova;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StartApp {

	static Scanner scan = new Scanner(System.in);
	static Veiculo[] list = new Veiculo[10];
	static Competidor comp = new Competidor();
	static Veiculo comp2 = new Veiculo();
	static Random ran = new Random();
	
	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			System.out.println("Cadastre o competidor: ");
				comp.setApelido(scan.nextLine());
				
			System.out.println("Digite 1 para Carro e 2 para Moto: ");
				comp.setVeiculo(readInteger());
				
				veiculoCarOrMoto();
			
			list[i] = comp;
		}
		loop();
		
		scan.close();
	}
	
	private static void loop() {
		for (int i=0; i<10; i++) {
			comp.getApelido();
			comp2.acelerar(ran.nextInt(21));
			if (comp2.acelerar() < 5) {
				break;
			}
			
		}
	}
	
	private static void winner() {
		for (int i=0; i<10; i++) {
			
		}
	}
	
	private static int readInteger() {
		int value = scan.nextInt();    scan.nextLine();
		return value;
	}
	
	private static void veiculoCarOrMoto() {
		
		if (comp.getVeiculo() == 1) {
			comp.getVeiculo() = "Carro";
			
			
		} else if (comp.getVeiculo() == 2) {
			comp.getVeiculo() = "Moto";
			
		} else {
			System.out.println("Opção inválida, digite novamente");
				comp.setVeiculo(readInteger());
		}
		System.out.println(comp.getApelido() + " " + comp.getVeiculo());
	}

}
