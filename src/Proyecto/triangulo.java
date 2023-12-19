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

			}
	public static double areaTriangulo(int base, int altura) {
		return (base*altura)/2;
	}

	}
