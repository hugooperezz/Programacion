package EjercicioEquals2;

public class Salon {
	
/**
* Atributos de la clase Salon
*/
	
	private int Salon1;
	private int Salon2;
	
/*
 * Constructora
 */
	
	public Salon (int muebles1, int muebles2) {
		this.Salon1 = muebles1;
		this.Salon2 = muebles2;
	}
	
/*
 * Metodo de equals
 */
	
	public boolean equals (Salon a) {
		return(
			this.Salon1 == a.Salon1 &&
			this.Salon2 == a.Salon2
		);
	
	}
	
}
