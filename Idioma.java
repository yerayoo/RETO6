package reto6;

import java.util.Scanner;

public class Idioma {
    public static void main(String[] args) {
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
}
