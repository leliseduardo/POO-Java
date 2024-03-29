import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Paciente {
	
	// Atributos
	private String nome;
	private String email;
	private LocalDate dataNascimento;
	private DateTimeFormatter formatter;
	
	//M�todos
	//Construtor
	public Paciente(String nome, String email, String dataNascimento){
		
		this.nome = nome;
		this.email = email;
		this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.dataNascimento = LocalDate.parse(dataNascimento, this.formatter);
	} // end construtor

	
	public String getNome() {
		return nome;
		
	}

	public String getEmail() {
		
		return email;
	}

	public String getDataNascimento() {
		
		return this.dataNascimento.format(this.formatter);
	}


	public String toString() {
		
		String apresentacao = "Sr(a) " + this.nome + "\n(" + this.email + ")";
		
		return apresentacao;
	} // end toString


} // end class
