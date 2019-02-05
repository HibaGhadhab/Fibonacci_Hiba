package src.main.java.eu.ensg.hiba.fibonacci.core;

public class SuiteFibonnaci
{
    public static long fibo(long n)
    {
        if (n<=0) return 0;
        else if (n < 2) return(n);
        return( fibo(n-2) + fibo(n-1) );
    }

}
