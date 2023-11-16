package EjercicioEquals;

public class B {
	private int z;
	
	public B ( int z ) {
		this.z = z;
	}
	
	public boolean equals ( B b ) {
		return this.z == b.z;
	}
}
