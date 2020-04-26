package exo.puissamce.quatre.pquatre;
import java.awt.*;
 abstract public class Joueur {
	 
protected   Color couleur;
/*declaration des methodes abstraits*/

 abstract public void joue();/*cette methode definit le comportement d'un joueur*/
 
  public Color  getCouleur(){
	 
	 return couleur;
 }
 
  public void setCouleur(Color couleur){
	  
  }
}
