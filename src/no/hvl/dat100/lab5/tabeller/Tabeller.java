package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		for (int i : tabell) {
			  System.out.print(i + " ");
			}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		String result = "[";
			for (int i : tabell) {
				result += i + ",";
			}
			int a = result.length();
			if (a <= 1) {
				result = "[]";
			}
			result = result.substring(0, result.length() - 1) + "]";
			return result;
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		int result = 0;
		for (int i : tabell) {
			result += i;
		}
		return result;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		boolean funnet = false;
		int pos = 0;
		
		while (!funnet && pos < tabell.length) {
			
			if (tall == tabell[pos]) {
				funnet = true;
			}
			
			pos++;
		}
		
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		boolean funnet = false;
		int pos = 0;
		
		while (!funnet && pos < tabell.length) {
			
			if (tall == tabell[pos]) {
				funnet = true;
				return pos;
			}
			
			pos++;
		}
		
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		int[] nytabell = new int[tabell.length];
		int i = 0;
		
		for (int pos = tabell.length - 1; pos >= 0; pos--) {
			nytabell[i] = tabell[pos];
			i++;
			}
		
		return nytabell;
		}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		int pos = 0;
		
		while (pos < tabell.length - 1) {
			
			if (tabell[pos] > tabell[pos + 1]) {
				return false;
			}
			pos++;
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		int[] nytabell = new int[tabell1.length + tabell2.length];
		
		for (int pos = 0; pos < tabell1.length; pos++) {
			nytabell[pos] = tabell1[pos];
		}
		
		for (int pos = 0; pos < tabell2.length; pos++) {
			nytabell[pos + tabell1.length] = tabell2[pos];
		}
		return nytabell;
	}
}
