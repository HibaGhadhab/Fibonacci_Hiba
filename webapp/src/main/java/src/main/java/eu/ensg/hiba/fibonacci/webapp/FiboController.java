package src.main.java.eu.ensg.hiba.fibonacci.webapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import src.main.java.eu.ensg.hiba.fibonacci.core.SuiteFibonnaci;

/**
 * L'API Rest SpringBoot
 **/
@RestController
public class FiboController
{
    /**
     * Calculer la suite de Fibonacci d'un nombre donnée en paramètre
     * @param my_number Le nombre qu'on veut calculer sa suite de Fibonacci
     * @return La valeur de la suite de Fibonacci de nombre entré en paramètre, type de retour String
     **/
    @GetMapping("/fibonacci/{my_number}")
    public String fibonacci(@PathVariable long my_number)
    {
        return String.valueOf(SuiteFibonnaci.fibo(my_number));
    }
}

