import java.util.Random;

public class EjerciciosLógicosJorgeyFabrizio{
	public static void main(String[] args) {
		System.out.println();
		System.out.println("ej1: " + (5 > 3 && 10 < 20));
		System.out.println("ej2: " + (7 == 7 || 4 <= 2));
		System.out.println("ej3: " + (!(6 == 6)));
		System.out.println("ej4: " + ((8 != 8) || (9 >= 9)));
		System.out.println("ej5: " + ((3 < 2) && (2 > 1)));
		System.out.println("ej6: " + (("JS" == "js") || ("Node" == "Node")));
		System.out.println("ej7: " + ((10 % 2 == 0) && (15 % 2 == 1)));
		System.out.println("ej8: " + (!(true && false)));
		System.out.println("ej9: " + ((5 == 5) && (5 == 5)));
		System.out.println("ej10: " + ((2 * 2 == 4) || (3 + 2 == 10)));
		System.out.println("ej11: " + (("hola".length() == 4) && ("adios".length() > 3)));
		System.out.println("ej12: " + (false || (true && true)));
		System.out.println("ej13: " + (!(false) && (2 * 3 == 8)));
		System.out.println("ej14: " + ((100 / 10 == 10) || (50 / 5 == 20)));
		System.out.println("ej15: " + (('A' < 'B') && ('a' > 'Z')));
		System.out.println("ej16: " + ((5 >= 5) && (10 < 5)));
		System.out.println("ej17: " + ((3 != 2) || (3 != 3)));
		System.out.println("ej18: " + (!(7 > 3 && 2 < 5)));
		
		System.out.println("ej20: " + ((1 + 2 * 3 == 7) && (4 * 2 == 8)));
	}	
}