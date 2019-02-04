package src.main.java.eu.ensg.hiba.fibonacci.core;

public class SuiteFibonnaci
{
    public static int fibo(int n)
    {
        if (n < 2) return(n);
        return( fibo(n-2) + fibo(n-1) );
    }

}
