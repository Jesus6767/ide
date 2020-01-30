	import java.util.Scanner;
	public class meses{
		public static void main(String[] args) {

	//Creamos registro
		int dia1;
		String mes;
		Scanner s = new Scanner(System.in);
	//Pedir datos
			
			System.out.println("Dame el dia del 1 al 21");
			dia1 = s.nextInt();
			
			System.out.println("Dame el mes");
			mes = s.nextLine();
	//Operaciones

			switch (mes){
				case "enero":
					System.out.println("es invierno");
				case "febrero":
					System.out.println("es invierno");
					break;
				case "marzo":
				if(dia1 < 21){
					System.out.println("es invierno");

				}//if
				break;


			}

		}
	}


