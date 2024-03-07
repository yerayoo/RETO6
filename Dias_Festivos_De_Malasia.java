package reto6;

public class Dias_Festivos_De_Malasia {
	/*Enero 1	Lunes	D�a de A�o Nuevo	Fiesta Nacional
	Enero 14	Domingo	Cumplea�os de Yang di-Pertuan Besar	Fiesta local com�n
	Enero 15	Lunes	Cumplea�os de Yang di-Pertuan Besar observado	Fiesta local com�n
	Febrero 1	Jueves	D�a Territorio Federal	D�a festivo
	Febrero 7	Mi�rcoles	Isra y Mi'raj	Fiesta musulmana
	Febrero 10	S�bado	D�a de A�o Nuevo lunar chino	Fiesta Nacional
	Febrero 11	Domingo	Segundo d�a de A�o Nuevo Lunar chino	Fiesta Nacional
	Febrero 14	Mi�rcoles	D�a de San Valent�n	Observancia
	Marzo 4		Lunes	Aniversario de la coronaci�n del sult�n de Terengganu	Fiesta local com�n
	Marzo 11	Lunes	Ramad�n comienza	Fiesta musulmana
	Marzo 20	Mi�rcoles	Equinoccio de marzo	Temporada
	Marzo 23	S�bado	Cumplea�os del sult�n de Johor	Fiesta local com�n
	Marzo 27	Mi�rcoles	Nuzul Al-Quran	Fiesta local com�n
	Marzo 29	Viernes	Buen viernes	D�a de silencio
	Marzo 31	Domingo	Domingo de Pascua	Observancia
	Abril 10	Mi�rcoles	Hari Raya Puasa	Fiesta Nacional
	Abril 11	Jueves	D�a 2 Hari Raya Puasa	Federal d�a festivo
	Abril 15	Lunes	Declaraci�n de Malaca como ciudad hist�rica.	Fiesta local com�n
	Abril 26	Viernes	Cumplea�os del sult�n de Terengganu	Fiesta local com�n
	Mayo 1	Mi�rcoles	D�a del Trabajo	Fiesta Nacional
	Mayo 7	Martes	Fiesta estatal de Pahang	Fiesta local com�n
	Mayo 30	Jueves	Fiesta de la cosecha	Fiesta local com�n
	Mayo 31	Viernes	Festival de la cosecha D�a 2	Fiesta local com�n
	Junio 1	S�bado	Gawai Dayak	Fiesta local com�n
	Junio 1	S�bado	Cumplea�os Yang di-Pertuan Agong de	Federal d�a festivo
	Junio 2	Domingo	Gawai Dayak Holiday	Fiesta local com�n
	Junio 3	Lunes	Fiesta de Gawai Dayak observada	Fiesta local com�n
	Junio 17	Lunes	Hari Raya Haji	Federal d�a festivo
	Junio 18	Martes	Hari Raya Haji (D�a 2)	Fiesta local com�n
	Junio 21	Viernes	Solsticio de junio	Temporada
	Julio 7	Domingo	D�a de la ciudad de George Town Patrimonio de la humanidad	Fiesta local
	Julio 8	Lunes	Muharram / A�o Nuevo	Fiesta musulmana
	Julio 13	S�bado	Cumplea�os del gobernador de Penang	Fiesta local com�n
	Julio 17	Mi�rcoles	Cumplea�os de la Raja de Perlis	Fiesta local
	Julio 22	Lunes	D�a de la Independencia de Sarawak	Fiesta local com�n
	Agosto 12	Lunes	D�a de Almarhum Sultan Iskandar Hol	Fiesta local com�n
	Agosto 31	S�bado	D�a Nacional de Malasia	Federal d�a festivo
	Septiembre 16	Lunes	D�a de Malasia	Federal d�a festivo
	Septiembre 16	Lunes	Cumplea�os del profeta Mahoma	D�a festivo
	Septiembre 22	Domingo	Equinoccio de septiembre	Temporada
	Octubre 5	S�bado	Cumplea�os del Gobernador de Sabah	Fiesta local com�n
	Octubre 11	Viernes	Cumplea�os del Gobernador de Malaca	Fiesta local com�n
	Octubre 12	S�bado	Cumplea�os del gobernador de sarawak	Fiesta local com�n
	Octubre 24	Jueves	Cumplea�os del sult�n de Pahang	Fiesta local com�n
	Noviembre 1	Viernes	Cumplea�os del sult�n de Perak	Fiesta local com�n
	Noviembre 11	Lunes	Cumplea�os del sult�n de Kelantan	Fiesta local com�n
	Noviembre 12	Martes	Cumplea�os del sult�n de Kelantan (D�a 2)	Fiesta local com�n
	Diciembre 11	Mi�rcoles	Cumplea�os del sult�n de Selangor	Fiesta local com�n
	Diciembre 21	S�bado	Solsticio de diciembre	Temporada
	Diciembre 24	Martes	Nochebuena	D�a de silencio
	Diciembre 25	Mi�rcoles	D�a de Navidad	Fiesta Nacional
	Diciembre 31	Martes	Vispera de A�o Nuevo	Observancia */
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