package com.edu.cesde;

public class Empleado extends Persona {
    private Double salario;
    private String horario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", salario=" + salario +
                ", horario='" + horario + '\'' +
                '}';
    }
}
