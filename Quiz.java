package reto6;
import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args)
	{
		int i = 0; // iterator to be used later for the askQuestion loop
		int correcto = 0; // number of correct answers
		int incorrecto = 0; // number of incorrect answers
		String respuesta = ""; // holds the answer the user supplied temporarily

		/*
		 * I know multi-dimensional arrays are not till next chapter but
		 * I already knew about them and felt that it really was the best 
		 * option for this assignment
		 */

		String[][] pregunta = new String[10][4]; // Array to store questions
		String[] respuestaCorrecta = new String[10]; // Array to store correct answers

		pregunta[0][0] = "1. ¿En que continente se encuentra Malasia?";
		pregunta[0][1] = "A) Europa";
		pregunta[0][2] = "B) Asia";
		pregunta[0][3] = "C) America";
		respuestaCorrecta[0] = "B";

		pregunta[1][0] = "2. ¿Qué mar separa Malasia Occidental y Malasia Oriental?";
		pregunta[1][1] = "A) El mar de la China Meridional";
		pregunta[1][2] = "B) El mar de Sulú";
		pregunta[1][3] = "C) El mar de Célebes";
		respuestaCorrecta[1] = "A";

		//
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

		//

		pregunta[4][0] = "5. ¿Por qué países está influenciada la cultura de Malasia?";
		pregunta[4][1] = "A) China e India";
		pregunta[4][2] = "B) Filipinas e Indonesia";
		pregunta[4][3] = "C) Camboya y Vietnam";
		respuestaCorrecta[4] = "A";

		pregunta[5][0] = "6. ¿En cuanto hablamos de la cultura de Malasia que dos ámbitos destacan?";
		pregunta[5][1] = "A) Las danzas y costumbres";
		pregunta[5][2] = "B) Las artes y la música";
		pregunta[5][3] = "C) La gastronomia y la historia";
		respuestaCorrecta[5] = "B";

		//

		pregunta[6][0] = "7. ¿Cuál es el nombre del famoso mercado nocturno en Kuala Lumpur, conocido por sus deliciosas brochetas?";
		pregunta[6][1] = "A) Batu Ferringhi";
		pregunta[6][2] = "B) Jalan Masjid";
		pregunta[6][3] = "C) Jalan Alor";
		respuestaCorrecta[6] = "C";

		pregunta[7][0] = "8. ¿Qué animal otorga un carácter único al parque nacional de Bako?";
		pregunta[7][1] = "A) La macaca Cangrejera";
		pregunta[7][2] = "B) El orangutan de Borneo";
		pregunta[7][3] = "C) El mono narigudo";
		respuestaCorrecta[7] = "C";

		//

		pregunta[8][0] = "9. ¿Cada cuantos años se cambia de monarca?";
		pregunta[8][1] = "A) Cada cuatro años";
		pregunta[8][2] = "B) Cada cinco años,";
		pregunta[8][3] = "C) Cada tres años";
		respuestaCorrecta[8] = "B";

		pregunta[9][0] = "10. ¿Quién gobierna Malasia actualmente?";
		pregunta[9][1] = "A) Pakatan Harapan";
		pregunta[9][2] = "B) Wan Azizah";
		pregunta[9][3] = "C) Abdul Razak";
		respuestaCorrecta[9] = "A";

		// loop through the question array asking each one
		do 
		{
			respuesta = preguntar(pregunta[i]);
			if(respuesta.equals("ABORTAR"))
				return;
			if(esCorrecto(respuestaCorrecta[i], respuesta))
				correcto += 1;
			else
				incorrecto += 1;

			i++;
		} while(i < pregunta.length);

		mostarNota(correcto, incorrecto);
	}


	private static boolean esValido(String a) {
		a = a.toLowerCase();
		if(a.equals("a") || a.equals("b") || a.equals("c"))
		{
			return true;
		} 
		else
		{
			JOptionPane.showMessageDialog(null, "Seleccione A, B, or C");
			return false;
		}
		/**
		 * askQuestion recieves an array containing the question and all the
		 * answers. Returning the user input as a String
		 */
	}

	private static String preguntar(String[] a) {
		String pregunta = ""; // String to hold the formatted question
		String respuesta = "";

		for(int i = 0; i < a.length; i++)
			pregunta += a[i] + "\n";

		do 
		{
			respuesta = JOptionPane.showInputDialog(null, pregunta);
			if(respuesta == null)
			{
				int quit = JOptionPane.showConfirmDialog(null, "¿Estas seguro de que quieres salirte?", "Salir", JOptionPane.YES_NO_OPTION);
				if(quit == 0)
					return "ABORTAR";
				else
					continue;
			}
		} while (respuesta == null || !(esValido(respuesta)));

		return respuesta;
		/**
		 * isCorrect recieves two values a (correct answer) and r (incorrect
		 * answer). Returning a boolean value if the answer is correct or not
		 */
	}

	private static boolean esCorrecto(String a, String r) // a = correct answer, r = user response
	{
		r = r.toUpperCase();
		if(a.equals(r)) 
		{
			JOptionPane.showMessageDialog(null, "Correcto!");
			return true;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrecto! La respuesta correcta es: \n" + a);
			return false;
		}
	}
	/**
	 * showGrade accepts two values c (total correct answers) and i (total
	 * incorrect answers). A message dialog is displayed stating the total
	 * coreect, incorrect, and the grade for the test
	 */

	public static void mostarNota(int c, int i)
	{
		int numeroPregunta = c + i;
		String total = "";
		int puntosPorPregunta = 100 / numeroPregunta;
		int nota = c * puntosPorPregunta;

		total += "Has respondido " + c + " correctamente y " + i + " incorrectamente";
		total += "\n Tu nota es: " + nota + "%";

		JOptionPane.showMessageDialog(null, total);
	}




}
