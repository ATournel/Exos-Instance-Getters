
public class Verre {

	String nomVerre;
	String forme;
	String taille;
	Liquide l = new Liquide();
		
	String methodVerre() {
		
		return l.quantit� + " cl de " + l.nomLiquide + " dans le " + nomVerre + " " + taille + " et " + forme;
		
	}

}
