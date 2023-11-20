package EjercicioEquals2;

public class Persona {
	private int edad;
	private Salon a;
	private Casa b;
	
	public Persona (int x, Salon a, Casa b) {
		this.edad = x;
		this.a = a;
		this.b = b;
	}
	
	public boolean equals (Persona c) {
		return(
			this.edad == c.edad && 
			this.a.equals(c.a) && //Le estoy diciendo a c que sea igual q a
			this.b.equals(c.b)
		);
				
	}

}
