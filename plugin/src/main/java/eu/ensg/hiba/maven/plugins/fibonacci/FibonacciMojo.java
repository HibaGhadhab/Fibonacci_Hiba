package eu.ensg.hiba.maven.plugins.fibonacci;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import src.main.java.eu.ensg.hiba.fibonacci.core.SuiteFibonnaci;

/**
 * Plugin Maven pour le calcul de la suite de Fibonacci
 **/
@Mojo(name="Fibonacci")
public class FibonacciMojo extends AbstractMojo
{
    /**
     * L'entier donné en paramètre pour calculer la suite de Fibonacci
     **/
    @Parameter(property="myNumber", required=true)
    private long myNumber;

    /**
     * Affichage du résultat de la suite de Fibonacci calculé
     **/
    public void execute() {
        System.out.println("Your Fibonacci result is...");
        System.out.println(String.valueOf(SuiteFibonnaci.fibo(myNumber)));
    }
}
