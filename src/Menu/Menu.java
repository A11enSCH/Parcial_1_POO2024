package Menu;
import java.util.Scanner;

import Logica.*;

public class Menu {

	/*public void menu() {
		this.opcion();
	}
	public static void main(String[] args) {
		new Menu();
	}
	
	private void opcion() {
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
		TMB h;
		System.out.println("Ingrese el peso");
		double peso_k = sc.nextDouble();
		System.out.println("Ingrese la altura");
		double altura_cen = sc.nextDouble();
		System.out.println("Ingrese la edad");
		double edad = sc.nextDouble();
		h = new TMBmujeres(peso_k, altura_cen, edad);
		System.out.println(h.calculo());
	}*/ // No se porque no funciona el menu, le agradesco si me puede explicar porque.
	public static void main(String[] args) {
		TMB h;
		h = new TMBhombres(75.3,172,21);
		System.out.println(h.calculo());
		h = new TMBmujeres(75.3,172,21);
		System.out.println(h.calculo());
	} 
}