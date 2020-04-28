package exo.puissamce.quatre.pquatre.model;



public class Grille {
<<<<<<< HEAD
private final Pion[][] cases;


public Grille(Pion[][] cases) {
	super();
	this.cases = cases;
}
=======
private Pion[][] cases = new Pion[7][6];

public Grille() {
	super();
}

>>>>>>> 26bb81648469eac005cf409167118a06486fca72


<<<<<<< HEAD

public Pion getPion(int ligne,int colonne) throws Exception{
	if(ligne<cases.length&&colonne<cases[ligne].length)
	return cases[ligne][colonne];
	throw new Exception("Vous avez depassé les bornes de la grille"); 
}

=======
>>>>>>> 26bb81648469eac005cf409167118a06486fca72
}
