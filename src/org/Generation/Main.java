package org.Generation;

public class Main {

	public static void main(String[] args) {
		Triangulo bermudas = new Triangulo("bermudas",20,10,15);
		Triangulo t = new Triangulo("TrianguloTe", 250, 175, 145);
		cuadrado cuadrado = new cuadrado("cuadrado", 25, 10, 10, 25);
		rectangulo r = new rectangulo("r", 20, 5, 20, 5);
		rombo rombito = new rombo("rombito", 10, 40, 10, 40);
		romboide zote = new romboide("zote", 50, 20, 50, 20);
		Trapecio Te= new Trapecio("Te", 100, 50,20);
		
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		imprimirCalculo(cuadrado);
		imprimirCalculo(r);
		imprimirCalculo(rombito);
		imprimirCalculo(zote);
		imprimirCalculo(Te);
		
		

	}//main

	public static void imprimirCalculo(Triangulo bermudas) {
		System.out.println(bermudas.toString());
		System.out.println("+========================");
		System.out.println("| El área de ["+ bermudas.getNombre()
				+ "] es : " + bermudas.calcularArea() );
		System.out.println("| El Perimetro de [" + bermudas.getNombre()
				+ "] es : " + bermudas.calcularPerimetro());
		System.out.println("+========================");		
	}//imprimirCalculo Triangulo bermudas
	
	public static void imprimirCalculo(cuadrado cuadrado) {
		System.out.println(cuadrado.toString());
		System.out.println("+========================");
		System.out.println("| El área de ["+ cuadrado.getNombre()
				+ "] es : " + cuadrado.calcularArea() );
		System.out.println("| El Perimetro de [" + cuadrado.getNombre()
				+ "] es : " + cuadrado.calcularPerimetro());
		System.out.println("+========================");		
	}//imprimirCalculo cuadrado cuadrado
	
	public static void imprimirCalculo(rectangulo r) {
		System.out.println(r.toString());
		System.out.println("+========================");
		System.out.println("| El área de ["+ r.getNombre()
				+ "] es : " + r.calcularArea() );
		System.out.println("| El Perimetro de [" + r.getNombre()
				+ "] es : " + r.calcularPerimetro());
		System.out.println("+========================");		
	}//imprimirCalculo rectangulo r
	
	public static void imprimirCalculo(rombo rombito) {
		System.out.println(rombito.toString());
		System.out.println("+========================");
		System.out.println("| El área de ["+ rombito.getNombre()
				+ "] es : " + rombito.calcularArea() );
		System.out.println("| El Perimetro de [" + rombito.getNombre()
				+ "] es : " + rombito.calcularPerimetro());
		System.out.println("+========================");		
	}//imprimirCalculo rombo rombito
	
	public static void imprimirCalculo(romboide zote) {
		System.out.println(zote.toString());
		System.out.println("+========================");
		System.out.println("| El área de ["+ zote.getNombre()
				+ "] es : " + zote.calcularArea() );
		System.out.println("| El Perimetro de [" + zote.getNombre()
				+ "] es : " + zote.calcularPerimetro());
		System.out.println("+========================");		
	}//imprimirCalculo romboide zote
	
	public static void imprimirCalculo(Trapecio Te) {
		System.out.println(Te.toString());
		System.out.println("+========================");
		System.out.println("| El área de ["+ Te.getNombre()
				+ "] es : " + Te.calcularArea() );
		System.out.println("| El Perimetro de [" + Te.getNombre()
				+ "] es : " + Te.calcularPerimetro());
		System.out.println("+========================");		
	}//imprimirCalculo Trapecio Te
	
	
	
}//class main
