import java.util.Random;
import java.util.Scanner;

public class morraCinese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int utente;
		
		Random r = new Random();
		int generato = r.nextInt(3)+1;
		
		String risposta = null;
		int punteggio1 = 0;
		int punteggio2 = 0;
		
		System.out.println("n 1 è sasso, n 2 è forbice, n 3 è carta");
		do {
		do {
		System.out.print("Digita la tua mossa:");
		utente = sc.nextInt();
		sc.nextLine();
		
		if (generato == utente)
			System.out.println("Pareggio");
		
		else if (generato == 1 && utente == 2) {
			System.out.println("Hai perso");
			punteggio1++;
		} else if (generato == 2 && utente == 1) {
			System.out.println("hai vinto");
			punteggio2++;
		} else if (generato == 2 && utente == 3) {
			System.out.println("hai perso");
			punteggio1++;
		} else if (generato == 3 && utente == 2) {
			System.out.println("Hai vinto");
			punteggio2++;
		}else if (generato == 1 && utente == 3) {
			System.out.println("Hai perso");
			punteggio1++;
		}else if (generato == 3 && utente == 1) {
			System.out.println("Hai vinto");
			punteggio2++;
		}
		if (generato == 1)
			System.out.println("Il computer ha giocato sasso.");
		else if (generato == 2)
			System.out.println("Il computer ha giocato forbice.");
		else 
			System.out.println("Il computer ha giocato carta");
		
		System.out.println("Il punteggio del computer è: "+punteggio1);
		System.out.println("Il tuo punteggio è: "+punteggio2);
			
		} while (punteggio1 < 5 && punteggio2 < 5);
		
		System.out.println("Vuoi rigiocare? Sì/No");
		risposta = sc.nextLine().toLowerCase();
		
		} while (risposta.equals("Sì"));
		
	}

}
