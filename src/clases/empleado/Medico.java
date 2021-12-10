package clases.empleado;

import javax.swing.JOptionPane;

public class Medico extends EmpleadoPlanilla {
	
	private String especialidad;
	private int numeroDeConsultorios;
	
	@Override
	public void registrarDatos() {
		super.registrarDatos();
		
		especialidad=JOptionPane.showInputDialog("Ingrese su especialidad");
		numeroDeConsultorios=Integer.parseInt(JOptionPane.showInputDialog("num Consultorio"));
		
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public int getNumeroDeConsultorios() {
		return numeroDeConsultorios;
	}
	public void setNumeroDeConsultorios(int numeroDeConsultorios) {
		this.numeroDeConsultorios = numeroDeConsultorios;
	}
	
}
