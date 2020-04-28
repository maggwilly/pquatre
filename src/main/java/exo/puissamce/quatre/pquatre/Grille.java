package exo.puissamce.quatre.pquatre;



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





}
