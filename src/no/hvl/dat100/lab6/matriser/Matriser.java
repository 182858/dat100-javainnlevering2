package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		for (int rad = 0; rad < matrise.length; rad++) {
		  
			for (int kol = 0; kol < matrise[rad].length; kol++) {
				System.out.printf("%5d", matrise[rad][kol]);
			}
		
		System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		String resultat = "";
		for (int rad = 0; rad < matrise.length; rad++) {
			
			for (int kol = 0; kol < matrise[rad].length; kol++) {
				resultat = resultat + matrise[rad][kol] + " ";
			}
			resultat = resultat + "\n";
		}
		resultat = resultat.substring(0, resultat.length() - 1) + "\n";
		return resultat;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		int[][] nyMatrise = new int [matrise.length][matrise.length];
		
		for (int rad = 0; rad < matrise.length; rad++) {	
			for (int kol = 0; kol < matrise[rad].length; kol++) {
				nyMatrise[rad][kol] = matrise[rad][kol];
				nyMatrise[rad][kol] = tall * nyMatrise[rad][kol];
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		int[][] matA = a;
		int[][] matB = b;
		boolean lik = false;
		
		for (int i = 0; i < matA.length; i++) {
			for (int j = 0; j < matB.length; j++) {
				if (matA [i][j] == matB [i][j]) {
					lik = true;
				}
			}
		}
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
