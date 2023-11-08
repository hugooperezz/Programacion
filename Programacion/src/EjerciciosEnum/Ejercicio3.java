package EjerciciosEnum;

import java.util.Scanner;

public class Ejercicio3 {
	
	enum Mes{
		Enero, Febrero, Marzo, Mayo, Abril, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre
	}
	
	public static void main(String[] args) {
		
			Scanner scn = new Scanner(System.in);
			System.out.println("Inserta un número del 1 al 12");
			int mes = scn.nextInt();
			
			Mes nombreMes= Mes.values() [mes - 1];
			
			if (mes == 1 ||mes == 3 ||mes == 5 ||mes == 7 ||mes == 8 ||mes == 10 ||mes == 12) {
				System.out.println("El nr del mes que ha introducido " + mes + " es el mes " + nombreMes + " este mes cuenta con 31 días ");
			}else if(mes == 2){
				System.out.println("El nr del mes que ha introducido " + mes + " es el mes " + nombreMes + " este mes cuenta con 29 días");
			}else if (mes == 4 ||mes == 6 ||mes == 9 ||mes == 11) {
				System.out.println("El nr del mes que ha introducido " + mes + " es el mes " + nombreMes +  " este mes cuenta con 30 días");
			}else {
				System.out.println("El mes introducido no es un número válido");
			}


	}

}
