package reto6;
import java.util.Scanner;
import java.util.TimeZone;
//Clase principal que contiene el menú y las funciones principales del programa.

public class Reto6 {
	/**
     * Método principal que ejecuta el programa.
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
	public static void main (String[] args) {
	
		  Scanner sc = new Scanner(System.in);
	       int opcion;
		
		do {
	
            // Mostrar el menú de opciones
            System.out.println("Menu Principal:");
            System.out.println("1. Mostrar Hora en Malasia");
            System.out.println("2. Convertir Moneda");//error
            System.out.println("3. Mostrar Dias Festivos");
            System.out.println("4. Cambio de Idioma");//error
            System.out.println("5. Quiz sobre Malasia");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opcion: ");

            // Leer la opción seleccionada por el usuario
            opcion = sc.nextInt();

            // Realizar acciones basadas en la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Mostrando hora en Malasia...");
                    mostrarHoraMalasia();
                    break;
                case 2:
                    System.out.println("Convertir Moneda...");
                    convertirMoneda();
                    break;
                case 3:
                    System.out.println("Mostrando Dias Festivos...");
                    diasFestivos();
                    break;
                case 4:
                    System.out.println("Mostrando Dias Festivos...");
                    cambioIdioma();
                    break;
                    
                case 5:
                    System.out.println("Iniciando Quiz sobre Malasia...");
                    quiz();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, selecciona una opcion valida.");
                    break;
            }
        } while (opcion != 6);

        // Cerrar el scanner al finalizar
        sc.close();
	}

	/**
	 * Muestra la hora actual en Malasia.
	 * Este método obtiene la zona horaria actual de Malasia, la establece como la zona horaria predeterminada
	 * para la aplicación y luego imprime la hora actual en Malasia.
	 * Utiliza la clase TimeZone para obtener la zona horaria y la clase Date para obtener la hora actual.
	 * La zona horaria utilizada es "Kuala Lumpur".
	 */
	public static void mostrarHoraMalasia() {
		// Obtener la zona horaria actual de Malasia
		TimeZone malasiaTimeZone = TimeZone.getTimeZone("Kuala Lumpur");

		// Establecer la zona horaria predeterminada para la aplicación
		TimeZone.setDefault(malasiaTimeZone);

		// Imprimir la hora actual en Malasia
		System.out.println("Hora actual en Malasia: " + new java.util.Date());
	}
	/**
	 * Convierte entre euros y ringgits de Malasia.
	 * Este método permite al usuario ingresar una cantidad de euros y realiza la conversión a ringgits de Malasia (MYR),
	 * y también permite al usuario ingresar una cantidad de ringgits de Malasia y realiza la conversión a euros (EUR).
	 * Utiliza una tasa de cambio fija para realizar las conversiones.
	 * 
	 * Se solicita al usuario que ingrese las cantidades de euros y ringgits de Malasia.
	 * Luego, se realizan los cálculos de conversión utilizando las tasas de cambio predefinidas.
	 * Finalmente, se muestra el resultado de cada conversión.
	 * 
	 * @throws InputMismatchException si el usuario ingresa un valor no válido para las cantidades de euros o ringgits de Malasia.
	 */
	public static void convertirMoneda() {
		Scanner sc = new Scanner(System.in);

		// Tasas de cambio
		double tasaEUR_MYR = 4.75; // Euro a Ringgit de Malasia
		double tasaMYR_EUR = 1 / tasaEUR_MYR; // Ringgit de Malasia a Euro

		// Solicitar al usuario que ingrese la cantidad de euros a convertir
		System.out.print("Ingrese la cantidad de euros que desea cambiar a ringgits de Malasia: ");
		double cantidadEuros = sc.nextDouble();

		// Realizar el cálculo de euros a ringgits de Malasia
		double resultadoMYR = cantidadEuros * tasaEUR_MYR;

		// Mostrar el resultado
		System.out.println("La cantidad de " + cantidadEuros + " euros equivale a " + resultadoMYR + " ringgits de Malasia (MYR)");

		// Solicitar al usuario que ingrese la cantidad de ringgits de Malasia a convertir
		System.out.print("Ingrese la cantidad de ringgits de Malasia que desea cambiar a euros: ");
		double cantidadMYR = sc.nextDouble();

		// Realizar el cálculo de ringgits de Malasia a euros
		double resultadoEUR = cantidadMYR * tasaMYR_EUR;

		// Mostrar el resultado
		System.out.println("La cantidad de " + cantidadMYR + " ringgits de Malasia equivale a " + resultadoEUR + " euros (EUR)");

		
		System.out.println("Fin de programa");
		
	}
	/**
	 * Muestra los días festivos de Malasia por mes.
	 * Este método imprime los días festivos de Malasia por mes, utilizando una matriz de festivos predefinida
	 * y un arreglo de nombres de meses para mostrar los festivos correspondientes a cada mes.
	 * 
	 * Los festivos se almacenan en una matriz bidimensional donde cada fila representa un festivo.
	 * La primera columna de la matriz representa el día y la segunda columna representa el mes en el que ocurre el festivo.
	 * 
	 * Se itera sobre cada mes y se comprueba si hay festivos correspondientes a ese mes en la matriz de festivos.
	 * Si se encuentra un festivo para el mes actual, se imprime el día del festivo junto con el nombre del mes.
	 * 
	 * @see <a href="https://en.wikipedia.org/wiki/Public_holidays_in_Malaysia">Public Holidays in Malaysia</a> para obtener más información sobre los festivos de Malasia.
	 */
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
	/**
	 * Permite al usuario traducir una frase del español al inglés y al malayo.
	 * Este método solicita al usuario que ingrese una frase en español, luego la traduce
	 * al inglés y al malayo utilizando un diccionario predefinido de traducción.
	 * 
	 * El diccionario de traducción se define como un array tridimensional donde cada entrada
	 * contiene tres elementos: la palabra en español, su traducción al inglés y su traducción al malayo.
	 * 
	 * Después de ingresar la frase en español, se valida si la frase está vacía. Si lo está,
	 * se muestra un mensaje indicando que ninguna frase ha sido ingresada.
	 * 
	 * Luego, se traduce la frase ingresada al inglés y al malayo. Para ello, se iteran sobre todas
	 * las entradas del diccionario y se reemplazan las palabras en español con sus respectivas traducciones.
	 * 
	 * Finalmente, se muestran las traducciones al inglés y al malayo en la consola.
	 * 
	 * @see <a href="https://en.wikipedia.org/wiki/Languages_of_Malaysia">Languages of Malaysia</a> para obtener más información sobre los idiomas de Malasia.
	 */
	public static void cambioIdioma() {
		System.out.println();
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

	}
	 
	/**
	 * Realiza un cuestionario sobre Malasia, donde se hacen diez preguntas con opciones de respuesta
	 * múltiple y se muestra la nota final al finalizar el cuestionario.
	 * 
	 * Se inicializan las preguntas y las respuestas correctas en arreglos. Luego, se utiliza un bucle
	 * para iterar a través de cada pregunta, solicitando al usuario que seleccione una respuesta. La
	 * validez de la respuesta ingresada se verifica y se muestra si es correcta o incorrecta. La función
	 * continua hasta que se hayan realizado todas las preguntas o el usuario decida abortar el cuestionario.
	 * 
	 * Se proporcionan funciones auxiliares para verificar la validez de la respuesta, preguntar al usuario
	 * por una respuesta y mostrar la nota final.
	 */
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
	/**
	Verifica si la respuesta proporcionada es válida.
	La respuesta válida debe ser "a", "b" o "c", sin importar mayúsculas o minúsculas.
	@param a La respuesta proporcionada por el usuario.
	@return true si la respuesta es válida, false de lo contrario.
	*/
	private static boolean esValido(String a) {
		a = a.toLowerCase();
		return a.equals("a") || a.equals("b") || a.equals("c");
	}
	/**
	Realiza una pregunta mostrando las opciones disponibles y espera una respuesta del usuario.
	Si el usuario proporciona una respuesta válida, la devuelve.
	Si el usuario ingresa "ABORTAR", solicita confirmación para salir.
	@param a Arreglo de strings que contiene las opciones de la pregunta.
	@param scanner Scanner para leer la entrada del usuario.
	@return La respuesta proporcionada por el usuario.
	*/
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
	/**
	Verifica si la respuesta dada por el usuario es correcta.
	@param a La respuesta correcta.
	@param r La respuesta proporcionada por el usuario.
	@return true si la respuesta del usuario es correcta, false de lo contrario.
	*/
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
	/**
	Muestra la nota obtenida en el quiz.
	@param c El número de respuestas correctas.
	@param i El número de respuestas incorrectas.
	*/
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
