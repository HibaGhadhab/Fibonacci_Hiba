package src.main.java.eu.ensg.hiba.fibonacci.webapp.eu.ensg.mmargolle.fibonacci.webapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import src.main.java.eu.ensg.hiba.fibonacci.core.SuiteFibonnaci;

@RestController
public class FiboController {

    @GetMapping("/fibonacci/{my_number}")
    public String fibonacci(@PathVariable long my_number) {
        return String.valueOf(SuiteFibonnaci.fibo(my_number));
    }

}
