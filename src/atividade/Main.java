package atividade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		Scanner entrada = new Scanner(System.in);
		Piramide p = new Piramide();
		System.out.println("AB: ");
		double raio = entrada.nextDouble();
		p.setRaio(raio);
		System.out.print("H: ");
		double h = entrada.nextDouble();
		System.out.print("Tipo de tinta : 1,2 ou 3: ");
		int tipo = entrada.nextInt();
		p.setH(h);
		p.setTipo(tipo);
		
		System.out.println("ab: " + p.getRaio());
		System.out.println("h: " + p.getH());
		System.out.println("a1: " + p.g());
		System.out.println("Área Triângulo: " + p.areatriangulo());
		System.out.println("Área Base: " + p.areabase());
		System.out.println("Área Total: " + p.areatotal());
		System.out.println("Tipo de Tinta: " + p.getTipo());
		System.out.println("Litros: " + p.litros());
		System.out.println("Latas: " + p.latas());
		System.out.println("Preço: " + p.preco());
		System.out.println("Volume: " + p.volume());
		
		entrada.close();
	}
}
