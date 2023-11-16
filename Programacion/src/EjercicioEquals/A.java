package EjercicioEquals;

public class A {
	private int x;
	private B b;
	
	public A ( int x, B b ) {
		this.x = x;
		this.b = b;
	}
	
	public boolean equals ( A a ) {
		return (
				this.x == a.x 
				&&
				this.b.equals( a.b )
		);
	}
}
