package Proyecto;

import java.util.Scanner;

public class triangulo {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		int base=pedirbase();
		int altura=pedirAltura();
		System.out.println("El area del triangulo es: "+areaTriangulo(base,altura));
		
		double radio=pedirRadio();
		System.out.println("El area de la circunferencia es: "+areaCircun(radio));
		System.out.println("El perimetro de la circunferencia es: "+perimetroCircun(radio));
		
		altura=pedirAltura();
		radio=pedirRadio();
		System.out.println("El area de el cilindro es: "+areaCilindro(radio, altura));
		
		double lado1=pedirLado();
		double lado2=pedirLado();
		System.out.println("El area del rectángulo es: "+areaRectangulo(lado1,lado2));
		
		lado1=pedirLado();
		System.out.println("El volumen de un cubo es: "+volumenCubo(lado1));
		
		lado1=pedirLado();
		System.out.println("El area del cubo es: "+ areaCubo(lado1));
		System.out.println("Fin del trabajo");
		//no fin
	}
	public static int pedirbase() {
		System.out.println("Intro la base");
		int base=in.nextInt();
		return base;
	}
	public static int pedirAltura() {
		System.out.println("Intro la altura");
		int altura=in.nextInt();
		return altura;
	}
	public static double pedirRadio() {
		System.out.println("Introduce el radio");
		double radio=in.nextDouble();
		return radio;
	}
	public static double pedirLado() {
		System.out.println("Introduce un lado");
		double lado=in.nextDouble();
		return lado;
	}
	public static double areaTriangulo(int base, int altura) {
		return (base*altura)/2;
	}
	public static double areaCircun(double radio) {
		return 3.14*radio*radio;
	}
	public static double perimetroCircun(double radio) {
		return 2*3.14*radio;
	}
	public static double areaCilindro(double radio,int altura) {
		return 3.14*(radio*radio)*altura;
	}
	public static double areaRectangulo(double lado1,double lado2) {
		return lado1*lado2;
	}
	public static double volumenCubo(double lado) {
		return lado*lado*lado;
	}
	public static double areaCubo(double lado) {
		return 6*lado*lado;
	}
	}
