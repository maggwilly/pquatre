package exo.puissamce.quatre.pquatre.model;

import java.io.PrintStream;
import java.lang.*;

/**
 * Lancement de l'application!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PrintStream console=AppContext.getConsole();
    	console.println( "Hello World!" );
    	Pion p =new Pion(Couleur.jaune);
    	Pion p1 =new Pion(Couleur.jaune);
    	
    	
    	
   
    Humain h=new Humain();
   
  h.setNom("anoussi");
  h.setEmail("anousssi@gmail.com");
  h.setCouleur(Couleur.rouge);
 Partie pa=new Partie();
 pa.isStatut();
 
 try{
   pa.ajouterJoueur( h); 

   
 }catch(Exception e){}
 
    }
}
