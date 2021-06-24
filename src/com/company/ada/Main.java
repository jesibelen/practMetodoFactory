package com.company.ada;

import java.util.ArrayList;
import java.util.List;

public class Main {
     /*
        Un instituto necesita modelar su sistema de gestión de empleados.
            Utilizar el método Factory para armar un esquema que permita crear objetos de tipo:
            - Docente
            - Directivo
            - Jefe de departamento
            - Administrativo

            Los objetos de cada clase deben poder indicar su cargo, salario y nombre.
         */
    public static void main(String[] args) {

      //  InterfazEmpl nuevoEmpleado = EmpleadoFactory.getEmpleado("Lisa", Cargo.JEFE_DEPARTAMENTO, 43354.4);

        ArrayList<InterfazEmpl> empleados =  new ArrayList<>(
        List.of(EmpleadoFactory.getEmpleado("Pablo", Cargo.DOCENTE, 1234.78),
                EmpleadoFactory.getEmpleado("Ringo", Cargo.JEFE_DEPARTAMENTO, 43354.4),
                EmpleadoFactory.getEmpleado("John", Cargo.ADMINISTRATIVO, 5423.5)
        ));

        System.out.println(empleados);

















    }
}
