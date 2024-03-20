package Logica;

public abstract class TMB {
	protected double peso_k, altura_cen, edad;
	
	public double getPeso_k() {
		return peso_k;
	}
	public void setPeso_k(double peso_k) {
		this.peso_k = peso_k;
	}
	public double getAltura_cen() {
		return altura_cen;
	}
	public void setAltura_cen(double altura_cen) {
		this.altura_cen = altura_cen;
	}
	public int getEdad() {
		return (int) edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public TMB(double peso_k, double altura_cen, double edad) {
		this.peso_k = peso_k;
		this.altura_cen = altura_cen;
		this.edad = edad;
	}
	
	public TMB() {
		this.peso_k = 0;
		this.altura_cen = 0;
		this.edad= 0 ;
	}

	public abstract double calculo();
	
}
