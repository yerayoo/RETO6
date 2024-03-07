package reto6;

public class Dias_Festivos_De_Malasia {
	/*Enero 1	Lunes	Día de Año Nuevo	Fiesta Nacional
	Enero 14	Domingo	Cumpleaños de Yang di-Pertuan Besar	Fiesta local común
	Enero 15	Lunes	Cumpleaños de Yang di-Pertuan Besar observado	Fiesta local común
	Febrero 1	Jueves	Día Territorio Federal	Día festivo
	Febrero 7	Miércoles	Isra y Mi'raj	Fiesta musulmana
	Febrero 10	Sábado	Día de Año Nuevo lunar chino	Fiesta Nacional
	Febrero 11	Domingo	Segundo día de Año Nuevo Lunar chino	Fiesta Nacional
	Febrero 14	Miércoles	Día de San Valentín	Observancia
	Marzo 4		Lunes	Aniversario de la coronación del sultán de Terengganu	Fiesta local común
	Marzo 11	Lunes	Ramadán comienza	Fiesta musulmana
	Marzo 20	Miércoles	Equinoccio de marzo	Temporada
	Marzo 23	Sábado	Cumpleaños del sultán de Johor	Fiesta local común
	Marzo 27	Miércoles	Nuzul Al-Quran	Fiesta local común
	Marzo 29	Viernes	Buen viernes	Día de silencio
	Marzo 31	Domingo	Domingo de Pascua	Observancia
	Abril 10	Miércoles	Hari Raya Puasa	Fiesta Nacional
	Abril 11	Jueves	Día 2 Hari Raya Puasa	Federal día festivo
	Abril 15	Lunes	Declaración de Malaca como ciudad histórica.	Fiesta local común
	Abril 26	Viernes	Cumpleaños del sultán de Terengganu	Fiesta local común
	Mayo 1	Miércoles	Día del Trabajo	Fiesta Nacional
	Mayo 7	Martes	Fiesta estatal de Pahang	Fiesta local común
	Mayo 30	Jueves	Fiesta de la cosecha	Fiesta local común
	Mayo 31	Viernes	Festival de la cosecha Día 2	Fiesta local común
	Junio 1	Sábado	Gawai Dayak	Fiesta local común
	Junio 1	Sábado	Cumpleaños Yang di-Pertuan Agong de	Federal día festivo
	Junio 2	Domingo	Gawai Dayak Holiday	Fiesta local común
	Junio 3	Lunes	Fiesta de Gawai Dayak observada	Fiesta local común
	Junio 17	Lunes	Hari Raya Haji	Federal día festivo
	Junio 18	Martes	Hari Raya Haji (Día 2)	Fiesta local común
	Junio 21	Viernes	Solsticio de junio	Temporada
	Julio 7	Domingo	Día de la ciudad de George Town Patrimonio de la humanidad	Fiesta local
	Julio 8	Lunes	Muharram / Año Nuevo	Fiesta musulmana
	Julio 13	Sábado	Cumpleaños del gobernador de Penang	Fiesta local común
	Julio 17	Miércoles	Cumpleaños de la Raja de Perlis	Fiesta local
	Julio 22	Lunes	Día de la Independencia de Sarawak	Fiesta local común
	Agosto 12	Lunes	Día de Almarhum Sultan Iskandar Hol	Fiesta local común
	Agosto 31	Sábado	Día Nacional de Malasia	Federal día festivo
	Septiembre 16	Lunes	Día de Malasia	Federal día festivo
	Septiembre 16	Lunes	Cumpleaños del profeta Mahoma	Día festivo
	Septiembre 22	Domingo	Equinoccio de septiembre	Temporada
	Octubre 5	Sábado	Cumpleaños del Gobernador de Sabah	Fiesta local común
	Octubre 11	Viernes	Cumpleaños del Gobernador de Malaca	Fiesta local común
	Octubre 12	Sábado	Cumpleaños del gobernador de sarawak	Fiesta local común
	Octubre 24	Jueves	Cumpleaños del sultán de Pahang	Fiesta local común
	Noviembre 1	Viernes	Cumpleaños del sultán de Perak	Fiesta local común
	Noviembre 11	Lunes	Cumpleaños del sultán de Kelantan	Fiesta local común
	Noviembre 12	Martes	Cumpleaños del sultán de Kelantan (Día 2)	Fiesta local común
	Diciembre 11	Miércoles	Cumpleaños del sultán de Selangor	Fiesta local común
	Diciembre 21	Sábado	Solsticio de diciembre	Temporada
	Diciembre 24	Martes	Nochebuena	Día de silencio
	Diciembre 25	Miércoles	Día de Navidad	Fiesta Nacional
	Diciembre 31	Martes	Vispera de Año Nuevo	Observancia */
	public static void main(String[] args) {

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
}