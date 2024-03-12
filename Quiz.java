package reto6;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        int i = 0;
        int correcto = 0;
        int incorrecto = 0;
        String respuesta = "";

        String[][] pregunta = new String[10][4];
        String[] respuestaCorrecta = new String[10];

        pregunta[0][0] = "1. ¿En que continente se encuentra Malasia?";
        pregunta[0][1] = "A) Europa";
        pregunta[0][2] = "B) Asia";
        pregunta[0][3] = "C) America";
        respuestaCorrecta[0] = "B";

        pregunta[1][0] = "2. ¿Que mar separa Malasia Occidental y Malasia Oriental?";
        pregunta[1][1] = "A) El mar de la China Meridional";
        pregunta[1][2] = "B) El mar de Sulu";
        pregunta[1][3] = "C) El mar de Celebes";
        respuestaCorrecta[1] = "A";

        pregunta[2][0] = "3. ¿Como se llama la variedad de pan que consumen en Malasia?";
        pregunta[2][1] = "A) Naan";
        pregunta[2][2] = "B) Challah";
        pregunta[2][3] = "C) Chapati";
        respuestaCorrecta[2] = "A";

        pregunta[3][0] = "4. ¿Cual es el plato tipico de Malasia?";
        pregunta[3][1] = "A) Satay";
        pregunta[3][2] = "B) Hokkien Mee";
        pregunta[3][3] = "C) Wantan Mee";
        respuestaCorrecta[3] = "C";

        pregunta[4][0] = "5. ¿Por que paises esta influenciada la cultura de Malasia?";
        pregunta[4][1] = "A) China e India";
        pregunta[4][2] = "B) Filipinas e Indonesia";
        pregunta[4][3] = "C) Camboya y Vietnam";
        respuestaCorrecta[4] = "A";

        pregunta[5][0] = "6. ¿En cuanto hablamos de la cultura de Malasia que dos ambitos destacan?";
        pregunta[5][1] = "A) Las danzas y costumbres";
        pregunta[5][2] = "B) Las artes y la musica";
        pregunta[5][3] = "C) La gastronomia y la historia";
        respuestaCorrecta[5] = "B";

        pregunta[6][0] = "7. ¿Cual es el nombre del famoso mercado nocturno en Kuala Lumpur, conocido por sus deliciosas brochetas?";
        pregunta[6][1] = "A) Batu Ferringhi";
        pregunta[6][2] = "B) Jalan Masjid";
        pregunta[6][3] = "C) Jalan Alor";
        respuestaCorrecta[6] = "C";

        pregunta[7][0] = "8. ¿Que animal otorga un caracter unico al parque nacional de Bako?";
        pregunta[7][1] = "A) La macaca Cangrejera";
        pregunta[7][2] = "B) El orangután de Borneo";
        pregunta[7][3] = "C) El mono narigudo";
        respuestaCorrecta[7] = "C";

        pregunta[8][0] = "9. ¿Cada cuantos años se cambia de monarca?";
        pregunta[8][1] = "A) Cada cuatro años";
        pregunta[8][2] = "B) Cada cinco años";
        pregunta[8][3] = "C) Cada tres años";
        respuestaCorrecta[8] = "B";

        pregunta[9][0] = "10. ¿Quien gobierna Malasia actualmente?";
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
