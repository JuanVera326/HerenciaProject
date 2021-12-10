package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;
import Procesos.Procesos;
import clases.empleado.EmpleadoEventual;
import clases.empleado.EmpleadoPlanilla;
import clases.empleado.Medico;

public class ModeloDatos {
	
	Procesos proceso=new Procesos;
	
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
		if (pacientesMap.containsKey(miPacientes.getNumeroDeDNI())) {
			JOptionPane.showMessageDialog(null, "El numero de DNI "+miPacientes.getNumeroDeDNI()+" ya esta registrado, por favor ingrese nuevamente los datos");
		}else if(empleadosPlanillaMap.containsKey(miPacientes.getNumeroDeDNI())){
			JOptionPane.showMessageDialog(null, "El numero de DNI "+miPacientes.getNumeroDeDNI()+" ya esta registrado, por favor ingrese nuevamente los datos");
		}else if(empleadosEventualMap.containsKey(miPacientes.getNumeroDeDNI())){
			JOptionPane.showMessageDialog(null, "El numero de DNI "+miPacientes.getNumeroDeDNI()+" ya esta registrado, por favor ingrese nuevamente los datos");
		}else if(medicosMap.containsKey(miPacientes.getNumeroDeDNI())){
			JOptionPane.showMessageDialog(null, "El numero de DNI "+miPacientes.getNumeroDeDNI()+" ya esta registrado, por favor ingrese nuevamente los datos");
		}else {
			pacientesMap.put(miPacientes.getNumeroDeDNI(),miPacientes);
			JOptionPane.showMessageDialog(null, "Se ha registrado el paciente "+miPacientes.getNombre()+" exitosamente");
		}
	}
	public void registrarPersona(EmpleadoPlanilla miEmpleadoPlanilla) {
		if (pacientesMap.containsKey(miEmpleadoPlanilla.getNumeroDeDNI())) {
			JOptionPane.showMessageDialog(null, "El numero de DNI "+miEmpleadoPlanilla.getNumeroDeDNI()+" ya esta registrado, por favor ingrese nuevamente los datos");
		}else if(empleadosPlanillaMap.containsKey(miEmpleadoPlanilla.getNumeroDeDNI())){
			JOptionPane.showMessageDialog(null, "El numero de DNI "+miEmpleadoPlanilla.getNumeroDeDNI()+" ya esta registrado, por favor ingrese nuevamente los datos");
		}else if(empleadosEventualMap.containsKey(miEmpleadoPlanilla.getNumeroDeDNI())){
			JOptionPane.showMessageDialog(null, "El numero de DNI "+miEmpleadoPlanilla.getNumeroDeDNI()+" ya esta registrado, por favor ingrese nuevamente los datos");
		}else if(medicosMap.containsKey(miEmpleadoPlanilla.getNumeroDeDNI())){
			JOptionPane.showMessageDialog(null, "El numero de DNI "+miEmpleadoPlanilla.getNumeroDeDNI()+" ya esta registrado, por favor ingrese nuevamente los datos");
		}else {
			empleadosPlanillaMap.put(miEmpleadoPlanilla.getNumeroDeDNI(), miEmpleadoPlanilla);
			JOptionPane.showMessageDialog(null, "Se ha registrado el paciente "+miEmpleadoPlanilla.getNombre()+" exitosamente");
		}
	}
	public void registrarPersona(EmpleadoEventual miEmpleadoEventual) {
		if (pacientesMap.containsKey(miEmpleadoEventual.getNumeroDeDNI())) {
			JOptionPane.showMessageDialog(null, "El numero de DNI "+miEmpleadoEventual.getNumeroDeDNI()+" ya esta registrado, por favor ingrese nuevamente los datos");
		}else if(empleadosPlanillaMap.containsKey(miEmpleadoEventual.getNumeroDeDNI())){
			JOptionPane.showMessageDialog(null, "El numero de DNI "+miEmpleadoEventual.getNumeroDeDNI()+" ya esta registrado, por favor ingrese nuevamente los datos");
		}else if(empleadosEventualMap.containsKey(miEmpleadoEventual.getNumeroDeDNI())){
			JOptionPane.showMessageDialog(null, "El numero de DNI "+miEmpleadoEventual.getNumeroDeDNI()+" ya esta registrado, por favor ingrese nuevamente los datos");
		}else if(medicosMap.containsKey(miEmpleadoEventual.getNumeroDeDNI())){
			JOptionPane.showMessageDialog(null, "El numero de DNI "+miEmpleadoEventual.getNumeroDeDNI()+" ya esta registrado, por favor ingrese nuevamente los datos");
		}else {
			empleadosEventualMap.put(miEmpleadoEventual.getNumeroDeDNI(), miEmpleadoEventual);
			JOptionPane.showMessageDialog(null, "Se ha registrado el paciente "+miEmpleadoEventual.getNombre()+" exitosamente");
		}
	}
	public void registrarPersona(Medico mimMedico) {
		if (pacientesMap.containsKey(mimMedico.getNumeroDeDNI())) {
			JOptionPane.showMessageDialog(null, "El numero de DNI "+mimMedico.getNumeroDeDNI()+" ya esta registrado, por favor ingrese nuevamente los datos");
		}else if(empleadosPlanillaMap.containsKey(mimMedico.getNumeroDeDNI())){
			JOptionPane.showMessageDialog(null, "El numero de DNI "+mimMedico.getNumeroDeDNI()+" ya esta registrado, por favor ingrese nuevamente los datos");
		}else if(empleadosEventualMap.containsKey(mimMedico.getNumeroDeDNI())){
			JOptionPane.showMessageDialog(null, "El numero de DNI "+mimMedico.getNumeroDeDNI()+" ya esta registrado, por favor ingrese nuevamente los datos");
		}else if(medicosMap.containsKey(mimMedico.getNumeroDeDNI())){
			JOptionPane.showMessageDialog(null, "El numero de DNI "+mimMedico.getNumeroDeDNI()+" ya esta registrado, por favor ingrese nuevamente los datos");
		}else {
			medicosMap.put(mimMedico.getNumeroDeDNI(), mimMedico);
			JOptionPane.showMessageDialog(null, "Se ha registrado el paciente "+mimMedico.getNombre()+" exitosamente");
		}
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

	public void consultarPorDNI(String key) {
		if (pacientesMap.containsKey(key)) {
			pacientesMap.get(key).imprimirDatosPersona("Corresponde a Paciente\n\n");
		}else if(empleadosPlanillaMap.containsKey(key)) {
			empleadosPlanillaMap.get(key).imprimirDatosPersona("Corresponde a Empleado de Planilla\n\n");
		}else if(empleadosEventualMap.containsKey(key)) {
			empleadosEventualMap.get(key).imprimirDatosPersona("Corresponde a Empleado Eventual\n\n");
		}else if(medicosMap.containsKey(key)) {
			medicosMap.get(key).imprimirDatosPersona("Corresponde a un Medico\n\n");
		}else {
			JOptionPane.showMessageDialog(null, "El documento es inexistente");
			proceso.presentarMenuOpciones();
		}
	}
	
}
