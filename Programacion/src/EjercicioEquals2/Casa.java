package EjercicioEquals2;

public class Casa {
	private char michar;
	private Salon a;
	
	public Casa (char michar, Salon a) {
		this.michar = michar;
		this.a = a;
	}	
	public boolean equals (Casa b) {
		return(
			this.michar == b.michar &&
			this.a.equals(b.a)
		);
	}
}
