package Menu;
import java.util.Scanner;

import Logica.*;

public class Menu {

	private void menu() {
		Scanner sc = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("Seleccione su opcion>");
			System.out.println("0. salir");
			System.out.println("1. Saber TMB en hombres");
			System.out.println("Saber TMB en mujeres");
			op = sc.nextInt();
			if (op==1)
			{
				this.SaberTMBhombres(sc);
			}else if(op==2) {
				this.SaberTMBmujeres(sc);
			}
		}while(op!=0);
		sc.close();
	}

	private void SaberTMBhombres(Scanner sc) {
		TMB h;
		System.out.println("Ingrese el peso");
		double peso_k = sc.nextDouble();
		System.out.println("Ingrese la altura");
		double altura_cen = sc.nextDouble();
		System.out.println("Ingrese la edad");
		double edad = sc.nextDouble();
		h = new TMBhombres(peso_k, altura_cen, edad);
		System.out.println(h.calculo());
	}

	private void SaberTMBmujeres(Scanner sc) {
		TMB m;
		System.out.println("Ingrese el peso");
		double peso_k = sc.nextDouble();
		System.out.println("Ingrese la altura");
		double altura_cen = sc.nextDouble();
		System.out.println("Ingrese la edad");
		double edad = sc.nextDouble();
		m = new TMBmujeres(peso_k, altura_cen, edad);
		System.out.println(m.calculo());
	}
}