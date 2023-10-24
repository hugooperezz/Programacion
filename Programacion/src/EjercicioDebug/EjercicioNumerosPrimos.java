package EjercicioDebug;

public class EjercicioNumerosPrimos {

	public static void main(String[] args) {
		int i = 1;
        int contador = 1;

        while (i <= 10000) {
            int esPrimo = 1;

            for (int h = 2; h * h <= i; h++) {
                if (i % h == 0) {
                    esPrimo = 0;
                    break;
                }
            }

            if (esPrimo == 1) {
                System.out.println("Numero primo " + i + " y ocupa la posición " + contador);
                contador++;
            }

            i++;
		
        }
        
	}

}
