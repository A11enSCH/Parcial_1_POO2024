package Logica;

public class TMBmujeres extends TMB{

	public TMBmujeres (double peso_k, double edad, double altura_cen) {
		super (peso_k, edad, altura_cen);
	}
	
	public TMBmujeres() {
		super();
	}
	
	@Override
	public double calculo() {
		return ((447.593+(9.247*peso_k))+(3.089*altura_cen)-(4.33*edad));
	}
	
}
