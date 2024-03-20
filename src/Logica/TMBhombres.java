package Logica;

public class TMBhombres extends TMB{

	public TMBhombres (double peso_k, double edad, double altura_cen) {
		super (peso_k, edad, altura_cen);
	}


	@Override
	public double calculo() {
		return ((88.362+(13.197*peso_k))+(4.799*altura_cen)-(4.33*edad));
	}
	
}
