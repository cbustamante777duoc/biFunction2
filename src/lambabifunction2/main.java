
package lambabifunction2;

import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {
        
        //convierte una lista de empleados a un arreglo
        List<Empleado> listaEmpleados = Arrays.asList(
            new Empleado("nayeon", 100),
            new Empleado("lalisa", 90),
            new Empleado("jennie", 99),
            new Empleado("rose", 90),
            new Empleado("jisoo", 85),
            new Empleado("others", 60),
            new Empleado("others 2", 62),
            new Empleado("others 3", 63),
            new Empleado("others 4", 64),
            new Empleado("others 11", 65),
            new Empleado("millie", 95)
        );
        
        biFuntcion2 bFuntcion2 = new biFuntcion2();
        
      List<Double> salarioAumento =   bFuntcion2.cal((salario,incremento) ->
                salario + (salario*(incremento/100)), listaEmpleados, 10.0);
      
      //se recorre la lista de salrioAumento
        for (Double salario : salarioAumento) {
            System.out.println(salario);
        }
    }
    
}
