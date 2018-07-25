import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Personne2 p2 = new Personne2();
		
		//p2.creerInfos();
		//System.out.println(p2.nom);
		
		System.out.println("Entrez votre nom:");
		p2.setNom(scan.nextLine());
		String p2Nom = p2.getNom();
		
		System.out.println("Entrez votre prénom:");
		p2.setPrenom(scan.nextLine());
		String p2Prenom = p2.getPrenom();
		
		System.out.println("Entrez votre email:");
		p2.setEmail(scan.nextLine());
		String p2mail = p2.getEmail();
		
		System.out.println("Entrez votre n° de teléphone:");
		p2.setTel(Integer.parseInt(scan.nextLine()));
		int p2tel = p2.getTel();
		
		System.out.println("Entrez votre ville/pays:");
		p2.setAdresse_localisation(scan.nextLine());
		String p2Loc = p2.getAdresse_localisation();
		
		
		System.out.println("\n"+"\n"+p2Prenom + " " + p2Nom +"\n"+"+33"+ p2tel +"\n"+ p2mail +"\n"+ p2Loc);
		
		
	}
	
}
