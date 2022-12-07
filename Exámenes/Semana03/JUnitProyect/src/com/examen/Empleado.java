package com.examen;

public class Empleado {
    private String nombre;
    private String puesto;
    private double sueldoHora;
    int horasTrabajo;
	public Empleado(String nombre, String puesto, double sueldoHora, int horasTrabajo) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.sueldoHora = sueldoHora;
		this.horasTrabajo = horasTrabajo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public double getSueldoHora() {
		return sueldoHora;
	}
	public void setSueldo(double sueldoHora) {
		this.sueldoHora = sueldoHora;
	}
	public int getHorasTrabajo() {
		return horasTrabajo;
	}
	public void setHorasTrabajo(int horasTrabajo) {
		this.horasTrabajo = horasTrabajo;
	}
	public Double calculoSalario() {
		return (this.horasTrabajo * this.sueldoHora);
	}
	public boolean trabajoExtra() {
		if(this.horasTrabajo <= 8)
		return false;
		else if(this.horasTrabajo > 8)
			return true;
		else return false;
	}
	public double pagoHorasExtra() {
		int horasExtra = 0;
		double pagoHorasExtra = 0;
		if(this.trabajoExtra())
			 horasExtra = this.getHorasTrabajo() - 8;
		pagoHorasExtra = horasExtra * (this.getSueldoHora() * 2);
		return pagoHorasExtra;
	}
	public boolean validaNombre() {
		boolean cN = this.getNombre().matches(".*[0-9].*");
		return cN;
	}
	

}
