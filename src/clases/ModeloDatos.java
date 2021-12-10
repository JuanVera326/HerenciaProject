package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

import clases.empleado.EmpleadoEventual;
import clases.empleado.EmpleadoPlanilla;
import clases.empleado.Medico;

public class ModeloDatos {
	
	HashMap<String, Pacientes> pacientesMap;
	HashMap<String,EmpleadoPlanilla> empleadosPlanillaMap;
	HashMap<String, EmpleadoEventual> empleadosEventualMap;
	HashMap<String, Medico> medicosMap;
	ArrayList<CitaMedica> citasList;
	
	public ModeloDatos() {
		pacientesMap=new HashMap<String, Pacientes>();
		empleadosEventualMap=new HashMap<String, EmpleadoEventual>();
		medicosMap=new HashMap<String, Medico>();
		empleadosPlanillaMap=new HashMap<String, EmpleadoPlanilla>();
		citasList=new ArrayList<CitaMedica>();
	}
	
	public void registrarPersona(Pacientes miPacientes) {
		pacientesMap.put(miPacientes.getNumeroDeDNI(), miPacientes);
		JOptionPane.showMessageDialog(null, "Se ha registrado el pciente "+miPacientes.getNombre()+" satisfactoriamente");
	}
	public void registrarPersona(EmpleadoPlanilla miEmpleadoPlanilla) {
		empleadosPlanillaMap.put(miEmpleadoPlanilla.getNumeroDeDNI(), miEmpleadoPlanilla);
		JOptionPane.showMessageDialog(null, "Se ha registrado el empleado por planilla "+miEmpleadoPlanilla.getNombre()+" satisfactoriamente");
	}
	public void registrarPersona(EmpleadoEventual miEmpleadoEventual) {
		empleadosEventualMap.put(miEmpleadoEventual.getNumeroDeDNI(), miEmpleadoEventual);
		JOptionPane.showMessageDialog(null, "Se ha registrado el empleado eventual "+miEmpleadoEventual.getNombre()+" satisfactoriamente");
		
	}
	public void registrarPersona(Medico mimMedico) {
		medicosMap.put(mimMedico.getNumeroDeDNI(), mimMedico);
		JOptionPane.showMessageDialog(null, "Se ha registrado el medico "+mimMedico.getNombre()+" satisfactoriamente");
	}

	public void imprimirMedicos() {
		String msj="MEDICOS REGISTRADOS\n";
		Iterator<String> iterador=medicosMap.keySet().iterator();
		
		while (iterador.hasNext()) {
			String clave=iterador.next();
			medicosMap.get(clave).imprimirDatosPersona(msj);
		}
	}

	public void imprimirEmpleadosPorPlanilla() {
		String msj="EMPLEADOS POR PLANILLA REGISTRADOS\n";
		Iterator<String> iterador=empleadosPlanillaMap.keySet().iterator();
		
		while (iterador.hasNext()) {
			String clave=iterador.next();
			empleadosPlanillaMap.get(clave).imprimirDatosPersona(msj);
		}
	}

	public void imprimirEmpleadosEvetuales() {
		String msj="EMPLEADOS EVENTUALES REGISTRADOS\n";
		Iterator<String> iterador=empleadosEventualMap.keySet().iterator();
		
		while (iterador.hasNext()) {
			String clave=iterador.next();
			empleadosEventualMap.get(clave).imprimirDatosPersona(msj);
		}
	}

	public void imprimirPacientes() {
		String msj="PACIENTES REGISTRADOS\n";
		Iterator<String> iterador=pacientesMap.keySet().iterator();
		
		while (iterador.hasNext()) {
			String clave=iterador.next();
			pacientesMap.get(clave).imprimirDatosPersona(msj);
		}
	}
	
	public Pacientes consultarPacientePorDocumento(String documentoPaciente) {
		Pacientes miPaciente=null;
		if (pacientesMap.containsKey(documentoPaciente)) {
			miPaciente=pacientesMap.get(documentoPaciente);
		}
		return miPaciente;
	}
	
	public Medico consultarMedicoPorNombre(String nombreMedico) {
		for (Medico medico : medicosMap.values()) {
			if (medico.getNombre().equalsIgnoreCase(nombreMedico)) {
				return medico;
			} 
		}
		return null;
	}
	
	public void registrarCitaMedica(CitaMedica miCita) {
		citasList.add(miCita);
		JOptionPane.showMessageDialog(null, "Se ha registrado exitosamente\n"+miCita.informacionCitaMedica());
	}

	public void imprimirCitasMedicasProgramadas() {
		String msj="CITAS MEDICAS PROGRAMADAS\n";
		CitaMedica miCita=null;
		
		JOptionPane.showInputDialog(msj+"\n");
		if (citasList.size()>0) {
			for (int i = 0; i < citasList.size(); i++) {
				miCita=citasList.get(i);
				JOptionPane.showInputDialog(miCita.informacionCitaMedica());
			}
		}else {
			JOptionPane.showInputDialog("No existen citas programadas");
		}
	}
	
}
