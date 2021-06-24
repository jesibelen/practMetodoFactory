package com.company.ada;

public abstract class EmpleadoFactory implements InterfazEmpl{
    public static InterfazEmpl getEmpleado(String nombre, Cargo cargo, Double salario){

        InterfazEmpl nuevoEmpleado= switch (cargo){
            case DOCENTE -> new Docente();
            case DIRECTIVO -> new Directivo();
            case JEFE_DEPARTAMENTO -> new JefeDepa();
            case ADMINISTRATIVO -> new Administrativo();
            default -> null;

        };
        nuevoEmpleado.guardarDatos(nombre,cargo,salario);

        return nuevoEmpleado;
    }


}
