import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	public static void main(String[] args) {
		int skaitlis, reizes;
		Random rand = new Random();
<<<<<<< HEAD
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mest kauliņu?");
		reizes = scan.nextInt();
		
		for(int i=0; i<reizes; i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkritis skaitlis: "+skaitlis);
		}
		scan.close();
=======
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkritis skaitlis: "+skaitlis);
		System.out.println("Papildus rindiņa");
>>>>>>> idejuZars
	}
}