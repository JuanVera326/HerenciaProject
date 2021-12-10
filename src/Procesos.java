import javax.swing.JOptionPane;

import clases.CitaMedica;
import clases.ModeloDatos;
import clases.Pacientes;
import clases.empleado.EmpleadoEventual;
import clases.empleado.EmpleadoPlanilla;
import clases.empleado.Medico;

public class Procesos {
	ModeloDatos miModeloDatos;
	public Procesos() {
		presentarMenuOpciones();
	}

	private void presentarMenuOpciones() {
		String menu="MENU HOSPITAL\n\n";
		menu+="1. Registrar Paciente\n";
		menu+="2. Registrar Empleado\n";
		menu+="3. Registrar Cita Medica\n";
		menu+="4. Imprimir Informacion\n";
		menu+="5. Salir\n";
		menu+="Ingrese una opcion\n";
		
		int opcion=0;
		
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1: registrarPaciente();	break;
			case 2: resgistrarEmpleado();	break;
			case 3: registrarCitaMedica();	break;	
			case 4: imprimirInformacion();	break;
			case 5: JOptionPane.showMessageDialog(null, "El Sistema ha terminado!!");	break;
			default:
			JOptionPane.showMessageDialog(null, "El codigo no existe, verifique nuevamente");
			break;}
		} while (opcion!=5);
	}

	private void imprimirInformacion() {
		
		String menuImprimir="MENU IMPRESIONES\n";
		menuImprimir="1. Lista de Pacientes\n";
		menuImprimir="2. Lista de Empleados Eventuales\n";
		menuImprimir="3. Lista de Empleados por Planilla\n";
		menuImprimir="4. Lista de Medicos\n";
		menuImprimir="5. Lista de Citas Programadas \n";
		menuImprimir="Ingrese una opcion\n";

		int opcion=Integer.parseInt(JOptionPane.showInputDialog(menuImprimir));
		
		switch (opcion) {
		case 1:miModeloDatos.imprimirPacientes();
			break;
		case 2:miModeloDatos.imprimirEmpleadosEvetuales();
			break;
		case 3:miModeloDatos.imprimirEmpleadosPorPlanilla();
			break;
		case 4:miModeloDatos.imprimirMedicos();
			break;
		case 5:miModeloDatos.imprimirCitasMedicasProgramadas();
			break;
		default:JOptionPane.showMessageDialog(null, "No existe esa opcion!!");
			break;
		}
	}

	private void registrarCitaMedica() {
		String documentoPaciente=JOptionPane.showInputDialog("Ingrese el documentp el paciente");
		Pacientes pacienteEncontrado=miModeloDatos.consultarPacientePorDocumento(documentoPaciente);
		
		if (pacienteEncontrado!=null) {
			String nombreMedico=JOptionPane.showInputDialog("Ingrese el nombre del medico");
			Medico medicoEncontrado=miModeloDatos.consultarMedicoPorNombre(nombreMedico);
			
			if (medicoEncontrado!=null) {
				String servicio=JOptionPane.showInputDialog("Ingrese el servicio o motivo de la consulta");
				String fechaConsulta=JOptionPane.showInputDialog("Ingrese la fecha de consulta");
				String horaConsulta=JOptionPane.showInputDialog("Ingrese la hora de consulta");
				
				String lugar="La cita sera en el consultorio "+medicoEncontrado.getNumeroDeConsultorios();
				CitaMedica miCita=new CitaMedica(pacienteEncontrado, medicoEncontrado, fechaConsulta, horaConsulta, lugar, servicio);
				miModeloDatos.registrarCitaMedica(miCita);
			}else {
				JOptionPane.showInputDialog("EL medico no se encuentra registrado en el sistema");
			}
		}else {
			JOptionPane.showInputDialog("El paciente no se encuentra registrado en el sistema");
		}
				
	}

	private void resgistrarEmpleado() {
		String menuTipoEmpleado="Resgistro de Empleado\n";
		menuTipoEmpleado+="1. Empleado Eventual\n";
		menuTipoEmpleado+="2. Emplado por Planilla\n";
		menuTipoEmpleado+="Seleccione el tipo de empleado a registrar\n";
		
		int tipoEmpleado=Integer.parseInt(JOptionPane.showInputDialog(menuTipoEmpleado));
		
		switch (tipoEmpleado) {
		case 1://Empleado eventual
			EmpleadoEventual miEmpleadoEventual=new EmpleadoEventual();
			miEmpleadoEventual.registrarDatos();
			miModeloDatos.registrarPersona(miEmpleadoEventual);
			break;
		case 2:
			String resp=JOptionPane.showInputDialog("Ingrese si, si es un medico, de lo contrario es otro tipo de empleado");
			if (resp.equalsIgnoreCase("si")) {
				//Medico
				Medico miMedico=new Medico();
				miMedico.registrarDatos();
				miModeloDatos.registrarPersona(miMedico);
			}else {
				//Empleado de planilla
				EmpleadoPlanilla miEmpleadoPlanilla=new EmpleadoPlanilla();
				miEmpleadoPlanilla.registrarDatos();
				miModeloDatos.registrarPersona(miEmpleadoPlanilla);
			}
			break;

		default: JOptionPane.showMessageDialog(null, "Tipo de empleado no valido, intentelo nuevamente");
			break;
		}

	}

	private void registrarPaciente() {
		Pacientes miPacientes=new Pacientes();
		miPacientes.registrarDatos();
		
		miModeloDatos.registrarPersona(miPacientes);
	}
	
}
