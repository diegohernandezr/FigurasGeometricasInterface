package org.Generation;

public class romboide implements FiguraGeometrica {
	private String nombre;
	private double base;
	private double altura;
	private double lado1;
	private double lado2;
	
	public romboide(String nombre, double base, double altura, double lado1, double lado2) {
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;		
		this.lado2 = lado2;
	}//1. constructor
	
	public double calcularArea() {
		return(base*altura);
	}//calcularArea
	
	public double calcularPerimetro() {
		return(lado1+lado2+lado1+lado2);
	}//Perimetro
	
	
	
	public String getNombre() {
		return nombre;
	}//getNombre
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	
	public double getBase() {
		return base;
	}//getBase
	
	public void setBase(double base) {
		this.base = base;
	}//setBase
	
	public double getAltura() {
		return altura;
	}//getAltura
	
	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura
	
	public double getLado() {
		return lado1;
	}//getLado
	
	public void setLado(double lado1) {
		this.lado1 = lado1;
	}//setLado
	//2. getter and Setters
	
	@Override
	public String toString() {
		return "romboide [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado1=" + lado1 + "]";
	}	//3. toString(9)
	
	
	

	

}//class cuadrado
