package exo.puissamce.quatre.pquatre.model;



public class Grille {
private final Pion[][] cases;


public Grille(Pion[][] cases) {
	super();
	this.cases = cases;
}

public Grille() {
	super();
}


public Pion getPion(int ligne,int colonne) throws Exception{
	if(ligne<cases.length&&colonne<cases[ligne].length)
	return cases[ligne][colonne];
	throw new Exception("Vous avez depassé les bornes de la grille"); 
}

}
