package com.company.ada;

public abstract class Empleado implements InterfazEmpl{
    private String nombre;
    private Cargo cargo;
    private Double salario;

    @Override
    public void guardarDatos(String nombre, Cargo cargo, Double salario){
       this.nombre=nombre;
       this.cargo= cargo;
       this.salario= salario;
    }
    public Empleado(){}

    public Empleado(String nombre, Cargo cargo, Double salario){
        this.nombre=nombre;
        this.cargo= cargo;
        this.salario=salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre=" + nombre +
                " cargo=" + cargo +
                " salario=" + salario +
                "}\n";
    }
}
