package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("{ ");

		for (int i : tabell)
			System.out.printf("%d ", i);

		System.out.print("}");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String streng = "[";

		for (int i = 0; i < tabell.length; i++) {
			streng += tabell[i];

			if (i + 1 != tabell.length)
				streng += ",";
		}

		streng += "]";

		return streng;
		
	}

	// c)
	public static int summer(int[] tabell) {
		
		if (tabell.length == 0) {
			System.out.println("Kan ikke summere tom tabell");
			return 0;
		}
		
		int sum = tabell[0];

		for (int i = 1; i < tabell.length; i++)
			sum += tabell[i];

//		int j = 1;
//		
//		while (j < tabell.length)
//			sum += tabell[j++];

//		-Hvis denne metoden skal fungere så må sum deklareres med 0 som verdi, istedenfor første indeks i tabellen.
//		for (int i : tabell)
//			sum += i;

		return sum;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int num : tabell)
			if (num == tall)
				return true;

		return false;
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		for (int i = 0; i < tabell.length; i++)
			if (tabell[i] == tall)
				return i;
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] reversert = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++)
			reversert[i] = tabell[tabell.length - 1 - i];

		return reversert;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;

		for (int i = 0; i < tabell.length - 1; i++)
			if (tabell[i] > tabell[i + 1])
				sortert = false;

		return sortert;
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sammensatt = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length + tabell2.length; i++) {
			if (i < tabell1.length)
				sammensatt[i] = tabell1[i];
			else
				sammensatt[i] = tabell2[i - tabell1.length];
		}

		return sammensatt;
		
	}
}
