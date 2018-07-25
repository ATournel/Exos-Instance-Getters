
public class Cuisine {

	
	
	public static void main(String[] args) {
		
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		Verre v1 = new Verre();
		Verre v2 = new Verre();
		Liquide l1 = new Liquide();
		Liquide l2 = new Liquide();
		
		p1.nom = "Dupont";
		p1.prenom = "Robert";
		p1.tel = "06.01.02.03.04";
		p1.mail = "r.dupont@gmail.com";
			
		p2.nom = "Duval";
		p2.prenom = "Alain";
		p2.tel = "06.09.08.07.06";
		p2.mail = "a.duval@gmail.com";
		
		v1.nomVerre = "verre Bob l'éponge";
		v1.forme = "carré";
		v1.taille = "petit";
		v1.l.nomLiquide = "eau";
		v1.l.quantité = 25;
		
		v2.nomVerre = "verre Patrick";
		v2.forme = "cylindrique";
		v2.taille = "grand";
		v2.l.nomLiquide = "jus";
		v2.l.quantité = 15;
		
		
		
		
		String resultP1 = p1.methodPersonne();
		String resultP2 = p2.methodPersonne();
		String resultV1 = v1.methodVerre();
		String resultV2 = v2.methodVerre();
		
		System.out.println(resultP1 + " a bu " + resultV1 +".");
		System.out.println(resultP2 + " a bu " + resultV2 +".");

	}

}
