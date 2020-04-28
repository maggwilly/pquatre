package exo.puissamce.quatre.pquatre.model;



public class Grille {
private Pion[][] cases ={{},{}};

public Grille(Pion[][] cases ){
		
	this.cases=cases;
}
/*definition des methodes*/

public Pion[][] getCases() {
	return cases;
}

public void setCases(Pion[][] cases) {
	this.cases = cases;
}
/* methode permettant de retourner un pion*/

public Pion getPion(int ligne,int colonne){
	
	return cases[6][7]; 
}



}
