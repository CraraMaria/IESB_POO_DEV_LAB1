package br.iesb_poo2024_devlab1_maria_clara;

import java.util.Date;

public class Aluno extends Pessoa{
	
	private int id;
	private String nrMatricula;
	private String nomeCurso;
	private int nrSemmestre;
	private Date dtMatricula;
	
	public Aluno () {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNrMatricula() {
		return nrMatricula;
	}

	public void setNrMatricula(String nrMatricula) {
		this.nrMatricula = nrMatricula;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public int getNrSemmestre() {
		return nrSemmestre;
	}

	public void setNrSemmestre(int nrSemmestre) {
		this.nrSemmestre = nrSemmestre;
	}

	public Date getDtMatricula() {
		return dtMatricula;
	}

	public void setDtMatricula(Date dtMatricula) {
		this.dtMatricula = dtMatricula;
	}
}
