package reto6;

import java.util.Scanner;
import java.util.TimeZone;

public class Reto6 {
	public static void main (String[] args) {
		organizadorDeHoraMoneda();
		diasFestivos();
		cambioIdioma();
		quiz();
	}


	public static void organizadorDeHoraMoneda() {
		mostrarHoraMalasia();
		convertirMoneda();
	}

	public static void mostrarHoraMalasia() {
		// Obtener la zona horaria actual de Malasia
		TimeZone malasiaTimeZone = TimeZone.getTimeZone("Asia/Kuala_Lumpur");

		// Establecer la zona horaria predeterminada para la aplicación
		TimeZone.setDefault(malasiaTimeZone);

		// Imprimir la hora actual en Malasia
		System.out.println("Hora actual en Malasia: " + new java.util.Date());
	}

	public static void convertirMoneda() {
		Scanner scanner = new Scanner(System.in);

		// Tasas de cambio
		double tasaEUR_MYR = 4.75; // Euro a Ringgit de Malasia
		double tasaMYR_EUR = 1 / tasaEUR_MYR; // Ringgit de Malasia a Euro

		// Solicitar al usuario que ingrese la cantidad de euros a convertir
		System.out.print("Ingrese la cantidad de euros que desea cambiar a ringgits de Malasia: ");
		double cantidadEuros = scanner.nextDouble();

		// Realizar el cálculo de euros a ringgits de Malasia
		double resultadoMYR = cantidadEuros * tasaEUR_MYR;

		// Mostrar el resultado
		System.out.println("La cantidad de " + cantidadEuros + " euros equivale a " + resultadoMYR + " ringgits de Malasia (MYR)");

		// Solicitar al usuario que ingrese la cantidad de ringgits de Malasia a convertir
		System.out.print("Ingrese la cantidad de ringgits de Malasia que desea cambiar a euros: ");
		double cantidadMYR = scanner.nextDouble();

		// Realizar el cálculo de ringgits de Malasia a euros
		double resultadoEUR = cantidadMYR * tasaMYR_EUR;

		// Mostrar el resultado
		System.out.println("La cantidad de " + cantidadMYR + " ringgits de Malasia equivale a " + resultadoEUR + " euros (EUR)");

		scanner.close(); // Cerrar el scanner al finalizar
		System.out.println("Fin de programa");
	}



	public static void diasFestivos() {

		int[][] festivos1 = {
				{1, 1}, {14, 1}, {15, 1}, {1, 2}, {7, 2}, {10, 2}, {11, 2},
				{14, 2}, {4, 3}, {11, 3}, {20, 3}, {23, 3}, {27, 3}, {29, 3},
				{31, 3}, {10, 4}, {11, 4}, {15, 4}, {26, 4}, {1, 5}, {7, 5},
				{30, 5}, {31, 5}, {1, 6}, {2, 6}, {3, 6}, {17, 6}, {18, 6},
				{21, 6}, {7, 7}, {8, 7}, {13, 7}, {17, 7}, {22, 7}, {12, 8},
				{31, 8}, {16, 9}, {22, 9}, {5, 10}, {11, 10}, {12, 10}, {24, 10},
				{1, 11}, {11, 11}, {12, 11}, {11, 12}, {21, 12}, {24, 12},
				{25, 12}, {31, 12}
		};

		String[] meses = {
				"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
				"Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
		};
		System.out.println("Los dias Festivos de Malasia son: ");
		for (int mes = 0; mes < meses.length; mes++) {
			System.out.println("Mes de " + meses[mes] + ":");
			for (int i = 0; i < festivos1.length; i++) {
				if (festivos1[i][1] == mes + 1) {
					System.out.println(festivos1[i][0] + " de " + meses[mes]);
				}
			}
			System.out.println();
		}
	}

	public static void cambioIdioma() {
		// Definir el diccionario de traducción español - inglés - malayo como un array tridimensional
		String[][][] diccionario = {
				{
					{"hola", "hello", "helo"},
					{"adios", "goodbye", "selamat tinggal"},
					{"buenos dias", "good morning", "selamat pagi"},
					{"buenas tardes", "good afternoon", "selamat petang"},
					{"buenas noches", "good evening", "selamat malam"},
					{"como estas", "how are you", "Apa khabar"},
					{"mi nombre es", "my name is", "Nama saya ialah"},
					{"cual es tu puesto de trabajo","What is your job title?", "Apakah jawatan anda?"},
					{"Quieres ir a Malasia?","Do you want to go to Malaysia?", "Adakah anda mahu pergi ke Malaysia?"},
					{"si", "yes", "Ya"},
					{"no", "no", "Tidak"},
					{"que hobbys tienes","What hobbies do you have?", "Hobi apa yang anda ada?"},
					{"que estudios tienes","What studies do you have?", "Apakah kajian yang anda ada?"},
					{"que edad tienes", "How old are you", "Berapa umur awak"},
					{"que tipo de planes se pueden hacer en Malasia","What kind of plans can be made in Malaysia", "Apa jenis rancangan yang boleh dibuat di Malaysia"},
					{"cuales son los sitios emblematicos e historicos de Malasia","What are the Iconic and Historical Sites of Malaysia?", "Apakah Tapak Ikonik dan Sejarah Malaysia?"}
				}
		};

		// Solicitar al usuario que ingrese una frase en español
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Ingresa una frase en español: ");
		String fraseEspañol = sc.nextLine().toLowerCase(); // Convertir la entrada a minúsculas

		// Validar si la frase está vacía
		if (fraseEspañol.isEmpty()) {
			System.out.println("No has ingresado ninguna frase.");
			return;
		}

		// Traducir la frase al inglés
		String traduccionIngles = fraseEspañol;
		for (String[][] dic : diccionario) {
			for (String[] entrada : dic) {
				if (traduccionIngles.contains(entrada[0])) {
					// Reemplazar la frase en español con su traducción al inglés
					traduccionIngles = traduccionIngles.replace(entrada[0], entrada[1]);
				}
			}
		}

		// Traducir la frase al malayo
		String traduccionMalayo = fraseEspañol;
		for (String[][] dic : diccionario) {
			for (String[] entrada : dic) {
				if (traduccionMalayo.contains(entrada[0])) {
					// Reemplazar la frase en español con su traducción al malayo
					traduccionMalayo = traduccionMalayo.replace(entrada[0], entrada[2]);
				}
			}
		}

		// Mostrar las traducciones
		System.out.println("La traducción al inglés es: " + traduccionIngles);
		System.out.println("La traducción al malayo es: " + traduccionMalayo);

		sc.close();
	}

	public static void quiz() {
		int i = 0;
		int correcto = 0;
		int incorrecto = 0;
		String respuesta = "";

		String[][] pregunta = new String[10][4];
		String[] respuestaCorrecta = new String[10];

		pregunta[0][0] = "1. ¿En qué continente se encuentra Malasia?";
		pregunta[0][1] = "A) Europa";
		pregunta[0][2] = "B) Asia";
		pregunta[0][3] = "C) América";
		respuestaCorrecta[0] = "B";

		pregunta[1][0] = "2. ¿Qué mar separa Malasia Occidental y Malasia Oriental?";
		pregunta[1][1] = "A) El mar de la China Meridional";
		pregunta[1][2] = "B) El mar de Sulú";
		pregunta[1][3] = "C) El mar de Célebes";
		respuestaCorrecta[1] = "A";

		pregunta[2][0] = "3. ¿Cómo se llama la variedad de pan que consumen en Malasia?";
		pregunta[2][1] = "A) Naan";
		pregunta[2][2] = "B) Challah";
		pregunta[2][3] = "C) Chapati";
		respuestaCorrecta[2] = "A";

		pregunta[3][0] = "4. ¿Cuál es el plato típico de Malasia?";
		pregunta[3][1] = "A) Satay";
		pregunta[3][2] = "B) Hokkien Mee";
		pregunta[3][3] = "C) Wantan Mee";
		respuestaCorrecta[3] = "C";

		pregunta[4][0] = "5. ¿Por qué países está influenciada la cultura de Malasia?";
		pregunta[4][1] = "A) China e India";
		pregunta[4][2] = "B) Filipinas e Indonesia";
		pregunta[4][3] = "C) Camboya y Vietnam";
		respuestaCorrecta[4] = "A";

		pregunta[5][0] = "6. ¿En cuanto hablamos de la cultura de Malasia qué dos ámbitos destacan?";
		pregunta[5][1] = "A) Las danzas y costumbres";
		pregunta[5][2] = "B) Las artes y la música";
		pregunta[5][3] = "C) La gastronomía y la historia";
		respuestaCorrecta[5] = "B";

		pregunta[6][0] = "7. ¿Cuál es el nombre del famoso mercado nocturno en Kuala Lumpur, conocido por sus deliciosas brochetas?";
		pregunta[6][1] = "A) Batu Ferringhi";
		pregunta[6][2] = "B) Jalan Masjid";
		pregunta[6][3] = "C) Jalan Alor";
		respuestaCorrecta[6] = "C";

		pregunta[7][0] = "8. ¿Qué animal otorga un carácter único al parque nacional de Bako?";
		pregunta[7][1] = "A) La macaca Cangrejera";
		pregunta[7][2] = "B) El orangután de Borneo";
		pregunta[7][3] = "C) El mono narigudo";
		respuestaCorrecta[7] = "C";

		pregunta[8][0] = "9. ¿Cada cuántos años se cambia de monarca?";
		pregunta[8][1] = "A) Cada cuatro años";
		pregunta[8][2] = "B) Cada cinco años";
		pregunta[8][3] = "C) Cada tres años";
		respuestaCorrecta[8] = "B";

		pregunta[9][0] = "10. ¿Quién gobierna Malasia actualmente?";
		pregunta[9][1] = "A) Pakatan Harapan";
		pregunta[9][2] = "B) Wan Azizah";
		pregunta[9][3] = "C) Abdul Razak";
		respuestaCorrecta[9] = "A";

		Scanner scanner = new Scanner(System.in);

		do {
			respuesta = preguntar(pregunta[i], scanner);
			if (respuesta.equals("ABORTAR"))
				return;
			if (esCorrecto(respuestaCorrecta[i], respuesta))
				correcto += 1;
			else
				incorrecto += 1;

			i++;
		} while (i < pregunta.length);

		mostrarNota(correcto, incorrecto);
	}

	private static boolean esValido(String a) {
		a = a.toLowerCase();
		return a.equals("a") || a.equals("b") || a.equals("c");
	}

	private static String preguntar(String[] a, Scanner scanner) {
		String pregunta = "";
		String respuesta = "";

		for (int i = 0; i < a.length; i++)
			pregunta += a[i] + "\n";

		do {
			System.out.println(pregunta);
			respuesta = scanner.nextLine();
			if (respuesta.equalsIgnoreCase("ABORTAR")) {
				System.out.println("¿Estás seguro de que quieres salirte? (Sí/No)");
				String decision = scanner.nextLine();
				if (decision.equalsIgnoreCase("Sí"))
					return "ABORTAR";
				else
					continue;
			}
		} while (!(esValido(respuesta)));

		return respuesta;
	}

	private static boolean esCorrecto(String a, String r) {
		r = r.toUpperCase();
		if (a.equals(r)) {
			System.out.println("Correcto!");
			return true;
		} else {
			System.out.println("Incorrecto! La respuesta correcta es: \n" + a);
			return false;
		}
	}

	public static void mostrarNota(int c, int i) {
		int numeroPregunta = c + i;
		String total = "";
		int puntosPorPregunta = 100 / numeroPregunta;
		int nota = c * puntosPorPregunta;

		total += "Has respondido " + c + " correctamente y " + i + " incorrectamente\n";
		total += "Tu nota es: " + nota + "%";

		System.out.println(total);
	}
}
