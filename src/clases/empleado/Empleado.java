package clases.empleado;

import javax.swing.JOptionPane;

import clases.Persona;

public class Empleado extends Persona {
	
	private int numeroHorasExtras;
	private String codigoDeEmpleado;
	private String fechaDeIngreso;
	private String area;
	private String cargo;
	
	@Override
	
	public void registrarDatos() {
		super.registrarDatos();
		
		codigoDeEmpleado=JOptionPane.showInputDialog("Ingrese el numero del empleado");
		numeroHorasExtras=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas Extras"));
		fechaDeIngreso=JOptionPane.showInputDialog("Ingrese la fecha de ingreso (dd/mm/aaaa)");
		area=JOptionPane.showInputDialog("Ingrese el area");
		cargo=JOptionPane.showInputDialog("Ingrese el cargo");
	}
	
	public int getNumeroHorasExtras() {
		return numeroHorasExtras;
	}
	public void setNumeroHorasExtras(int numeroHorasExtras) {
		this.numeroHorasExtras = numeroHorasExtras;
	}
	public String getCodigoDeEmpleado() {
		return codigoDeEmpleado;
	}
	public void setCodigoDeEmpleado(String codigoDeEmpleado) {
		this.codigoDeEmpleado = codigoDeEmpleado;
	}
	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}
	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
@Override
	public void imprimirDatosPersona(String datos) {
		super.imprimirDatosPersona(datos);
		
		datos="Codigo de empleado: "+codigoDeEmpleado+"\n";
		datos+="Numero de horas extras: "+numeroHorasExtras+"\n";
		datos+="Fecha de ingreso: "+fechaDeIngreso+"\n";
		datos+="Area: "+area+"\n";
		datos+="Cargo: "+cargo+"\n";
		
		JOptionPane.showMessageDialog(null, datos);
	}

}
