package eu.ensg.hiba.maven.plugins.fibonacci;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import src.main.java.eu.ensg.hiba.fibonacci.core.SuiteFibonnaci;

@Mojo(name="Fibonacci")
public class FibonacciMojo extends AbstractMojo
{
    @Parameter(property="myNumber", required=true)
    private long myNumber;

    public void execute() {
        System.out.println("Calculating your Fibonacci result is...");
        System.out.println(String.valueOf(SuiteFibonnaci.fibo(myNumber)));
    }
}
