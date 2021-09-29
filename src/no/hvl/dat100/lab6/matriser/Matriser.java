package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		int teller;

		for (int[] i : matrise) {

			teller = 0;
			System.out.print("{");

			for (int j : i) {
				
				if (teller + 1 == i.length)
					System.out.print(j);
				else
					System.out.print(j + ",");
				
				teller++;
				
			}

			System.out.print("}\n");
			
		}
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String s = "";

		for (int[] i : matrise) {
			
			for (int j : i)
				s += j + " ";
			
			s += "\n";
			
		}

		return s;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] r = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {

			r[i] = new int[matrise[i].length];

			for (int j = 0; j < r[i].length; j++)
				r[i][j] = matrise[i][j] * tall;

		}

		return r;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		if (a.length != b.length) {

			return false;

		}

		for (int i = 0; i < a.length; i++) {

			if (a[i].length != b[i].length) {

				return false;

			}

			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] != b[i][j]) {

					return false;

				}
			}
		}

		return true;
		
	}
	
	// e)	
	public static int[][] speile(int[][] matrise) {
		
		int[][] speilet = new int[matrise[0].length][matrise.length];
		
		for (int i = 0; i < matrise.length; i++) {
			
			for (int j = 0; j < matrise.length; j++) {
				
				speilet[j][i] = matrise[i][j];
				
			}
			
		}
		
		return speilet;
		
	}


	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int[][] resultat = new int[a.length][b[0].length];

		if (a[0].length == b.length) {

			for (int i = 0; i < resultat[0].length; i++) {

				for (int j = 0; j < a.length; j++) {

					resultat[j][i] = 0;

					for (int k = 0; k < a[0].length; k++) {

						resultat[j][i] += a[j][k] * b[k][i];

					}

				}

			}

		}

		return resultat;
	
	}
}
