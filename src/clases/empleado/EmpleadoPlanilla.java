package clases.empleado;

import javax.swing.JOptionPane;

public class EmpleadoPlanilla extends Empleado {
	
	private double salarioMensual;
	private double porcentajeAdicionalPorHoraExtra;
	
	
	@Override
	public void registrarDatos() {
		super.registrarDatos();
		try {
			salarioMensual=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario Mensual"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Por favor ingresar Cantidad en numeros");			
			salarioMensual=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario Mensual"));
		}
		try {
			porcentajeAdicionalPorHoraExtra=Double.parseDouble(JOptionPane.
					showInputDialog("Ingrese el porcentaje Adicional por hora Extra"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Por favor ingresar Cantidad en numeros");
			porcentajeAdicionalPorHoraExtra=Double.parseDouble(JOptionPane.
					showInputDialog("Ingrese el porcentaje Adicional por hora Extra"));
		}
	}
	@Override
	public void imprimirDatosPersona(String datos) {
		super.imprimirDatosPersona(datos);
		
		datos="Salario mensual: "+salarioMensual+"\n";
		datos+="Porcentaje adicional por hora extra: "+porcentajeAdicionalPorHoraExtra+"\n";
		
		JOptionPane.showMessageDialog(null, datos);
	}

	public double getSalarioMensual() {
		return salarioMensual;
	}
	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	public double getPorcentajeAdicionalPorHoraExtra() {
		return porcentajeAdicionalPorHoraExtra;
	}
	public void setPorcentajeAdicionalPorHoraExtra(double porcentajeAdicionalPorHoraExtra) {
		this.porcentajeAdicionalPorHoraExtra = porcentajeAdicionalPorHoraExtra;
	}
	
}
