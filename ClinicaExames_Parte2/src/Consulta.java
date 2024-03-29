
public class Consulta {
	
	// Atributos
	private Medico medico;
	private Paciente paciente;
	private Procedimento[] procedimentos;
	
	//M�todos
	public Consulta(Medico medico, Paciente paciente, Procedimento[] procedimentos){
		
		this.medico = medico;
		this.paciente = paciente;
		this.procedimentos = procedimentos;
	} //end construtor
	
	
	public Medico getMedico() {
		return medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Procedimento[] getProcedimentos() {
		return procedimentos;
	}
	

	public double valorConsulta() {
		
		double valor = 0.0;
		
		for(Procedimento item : this.procedimentos) 
				valor += item.getValor();
		
		return valor;
	} // end valorConsulta
	
	
	
} // end class
