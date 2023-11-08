package EjerciciosEnum;

public class Ejercicio4 {

	enum ColorArcoiris {
	       ROJO, NARANJA, AMARILLO, VERDE, AÑIL, AZUL, VIOLETA
	   }
	
	public static void main(String[] args) {
			
				
				 ColorArcoiris[] n = new ColorArcoiris[7];
						
				 n[0] = ColorArcoiris.ROJO;
				 n[1] = ColorArcoiris.NARANJA;
				 n[2] = ColorArcoiris.AMARILLO;
				 n[3] = ColorArcoiris.VERDE;
				 n[4] = ColorArcoiris.AÑIL;
				 n[5] = ColorArcoiris.AZUL;
				 n[6] = ColorArcoiris.VIOLETA;
				
				 System.out.println(n[0] + " " + n[1] + " " + n[2] + " " + n[3] + " " + n[4] + " " + n[5] + " " + n[6]);
			 }


	

}
