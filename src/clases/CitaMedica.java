package clases;

import clases.empleado.Medico;

public class CitaMedica {
	
	private Pacientes paciente;
	private Medico medico;
	private String servicio;
	private String fechaConsulta;
	private String horaConsulta;
	private String lugar;
	
	public CitaMedica(Pacientes paciente, Medico medico, String fechaConsulta, String horaConsulta, String lugar, String servicio) {
		this.paciente=paciente;
		this.medico=medico;
		this.servicio=servicio;
		this.fechaConsulta=fechaConsulta;
		this.horaConsulta=horaConsulta;
		this.lugar=lugar;
		
	}
	
	public String informacionCitaMedica() {
		
		String datosCita="<< INFORMACION CITA MEDICA >>\n";
		datosCita+="Paciente: "+paciente.getNombre()+"\n";
		datosCita+="Medico: "+medico.getNombre()+"\n";
		datosCita+="Motivo Consulta: "+servicio+"\n";
		datosCita+="Fecha Consulta: "+fechaConsulta+" - Hora: "+horaConsulta+"\n";
		datosCita+="Lugar: "+lugar+"\n";
		
		return datosCita;
	}
	
	public Pacientes getPaciente() {
		return paciente;
	}

	public void setPaciente(Pacientes paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getFechaConsulta() {
		return fechaConsulta;
	}

	public void setFechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}

	public String getHoraConsulta() {
		return horaConsulta;
	}

	public void setHoraConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

}
