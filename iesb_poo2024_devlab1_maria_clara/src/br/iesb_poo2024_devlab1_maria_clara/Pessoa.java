package br.iesb_poo2024_devlab1_maria_clara;
import java.util.Date;

public class Pessoa {
	
	private int id;
	protected String nome;
	protected String sobreNome;
	protected Date dtNascimento;
	
	// construtor padrão
	public Pessoa () { }
	
	// construtor para os atributos 
	public Pessoa (int id, String nome, String sobreNome, Date dtNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dtNascimento = dtNascimento;
		
	}
	
	public int getId() { return id;}
	public void setId(int id) { this.id = id;}
	
	public String getNome() { return nome;}
	public void setNome (String nome) {this.nome = nome;}
	
	public String getsobreNome() {return sobreNome;}
	public void setsobreNome (String sobreNome) {this.sobreNome = sobreNome;}
	
	public Date getdtNascimento() {return dtNascimento;}
	public void setdtNascimento(Date dtNascimento) {this.dtNascimento = dtNascimento;}
}
