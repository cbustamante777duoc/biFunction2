
package lambabifunction2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class biFuntcion2 {
    
    /*
    * func recibe 2 paramentros (listaEmpleado y Double) y retorna un double
    * funcion que retorna una lista de Double con el aumento de los empleados
    * recibe Double(sueldo) y Double(porcetaje)
    */
    
    //ver
    
    public List<Double> cal(BiFunction<Double,Double,Double> bi, 
            List<Empleado>ListaEmpleado,Double incremento){
        
        //se crea un lista que va a contener los nuevos salarios
        List<Double> listaSalarios = new ArrayList<>();
        
        //se recorre la lista de empleados y se agregan a la lista de nuevos salarios
        for (Empleado empleado : ListaEmpleado) {
           listaSalarios.add( bi.apply(empleado.getSalario(), incremento));
        }
    
      return listaSalarios;
    }
       
    
}
