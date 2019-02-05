package src.main.java.eu.ensg.hiba.fibonacci.core;

/**
 * Calcul de la suite de Fibonacci
 **/
public class SuiteFibonnaci
{
    /**
     * Calcul de la suite de Fibonacci à partir d'un entier donnée en paramètre
     * @param n l'entier à calculer
     * @return La valeur de la suite de Fibonacci de nombre entré en paramètre, type de retour long
     **/
    public static long fibo(long n)
    {
        if (n<=0) return 0;
        else if (n < 2) return(n);
        return( fibo(n-2) + fibo(n-1) );
    }
}
