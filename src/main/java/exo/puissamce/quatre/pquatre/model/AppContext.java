package exo.puissamce.quatre.pquatre.model;

import java.io.PrintStream;

/** Cette classe est pour declarer les dependances */
public abstract class AppContext {

	/* exemple */
	public static PrintStream getConsole() {
		return System.out;
	}

}
