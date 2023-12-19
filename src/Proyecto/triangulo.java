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
		System.out.println("Intro la altura");
		altura=in.nextInt();
		System.out.println("Introduce el radio del cilindro");
		radio=in.nextDouble();
		System.out.println("El area de el cilindro es: "+areaCilindro(radio, altura));
		
		System.out.println("Introduce dos lados del rectángulo");
		double lado1=in.nextDouble();
		double lado2=in.nextDouble();
		System.out.println("El area del rectángulo es: "+areaRectangulo(lado1,lado2));
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
	}
