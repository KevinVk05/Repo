package Proyecto;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Intro la base");
		int base=in.nextInt();
		System.out.println("Intro la altura");
		int altura=in.nextInt();
		System.out.println("El area del triangulo es: "+areaTriangulo(base,altura));

		System.out.println("Introduce el radio de la circunferencia");
		double radio=in.nextDouble();
		System.out.println("El area de la circunferencia es: "+areaCircun(radio));
		System.out.println("El perimetro de la circunferencia es: "+perimetroCircun(radio));
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

	}
