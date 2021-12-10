package clases;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pacientes extends Persona{
	
	private int numeroHistoriaClinica;
	private String sexo;
	private String grupoSanguineo;
	private ArrayList<String> listaMedicamentosAlergico;
	
@Override

	public void registrarDatos() {
	
	super.registrarDatos();
	
	listaMedicamentosAlergico=new ArrayList<String>();
	numeroHistoriaClinica=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la historia clinica"));
	sexo=JOptionPane.showInputDialog("Ingrese el sexo");
	grupoSanguineo=JOptionPane.showInputDialog("Ingrese el grupo sanguineo");
	
	String pregunta=JOptionPane.showInputDialog("�Es alergico a algun medicamento?");
	
	if (pregunta.equalsIgnoreCase("si")) {
		String medicamento="";
		String continuar="";
		
		do {
			medicamento=JOptionPane.showInputDialog("Ingrese el nombre del medicamneto al que es alergico");
			listaMedicamentosAlergico.add(medicamento);
			continuar=JOptionPane.showInputDialog("Ingrese si, si desea continuar");
		} while (continuar.equalsIgnoreCase("si"));
	}
}

@Override

	public void imprimirDatosPersona(String datos) {
	super.imprimirDatosPersona(datos);
	
	datos="Numeros Historia Clinica: "+numeroHistoriaClinica+"\n";
	datos+="Sexo: "+sexo+"\n";
	datos+="Grupo Sanguineo "+grupoSanguineo+"\n";
		
		if (listaMedicamentosAlergico.size()>0) {
			datos+="Lista de medicamentos a los que es alergico\n";
			for (int i = 0; i < listaMedicamentosAlergico.size(); i++) {
				datos+="\t"+listaMedicamentosAlergico.get(i)+"\n";
			}
		}else {
			datos+="El paciente no alergico a ningun medicamento";
		}
	JOptionPane.showMessageDialog(null, datos);
}

	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}
	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}
	public ArrayList<String> getListaMedicamentosAlergico() {
		return listaMedicamentosAlergico;
	}
	public void setListaMedicamentosAlergico(ArrayList<String> listaMedicamentosAlergico) {
		this.listaMedicamentosAlergico = listaMedicamentosAlergico;
	}
	public int getNumeroHistoriaClinica() {
		return numeroHistoriaClinica;
	}
	public void setNumeroHistoriaClinica(int numeroHistoriaClinica) {
		this.numeroHistoriaClinica = numeroHistoriaClinica;
	}
}
