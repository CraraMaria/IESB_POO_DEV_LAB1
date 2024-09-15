// ᓚᘏᗢ


package br.iesb_poo2024_devlab1_maria_clara;
// (" ");
import java.util.ArrayList;
/* 
 Instituiçao: IESB
 Disciplina:  Programaçao Orientada a Objetos (POO)
 Objetivo:    Fornecer conhecimentos e práticas de programaçao orientada a objetos.
 
# prática: DevLab1 - Trabalhando com Classes, Objetos e Herança em Java
 */
public class SistemaGestaoAlocacoesTccMain {

	public static void main(String[] args) {
		
		// cadastros basicos do professor e do aluno
		Professor professor = new Professor();
		professor.setNome("Joao");
		professor.setCargoProfessor("Professor Assistente");

		// instanciando a variável na memória e atribuindo valor
		Aluno aluno = new Aluno ();
		aluno.setNome("Maria");
		aluno.setNrSemmestre(7);
		aluno.setNomeCurso("Ciencia da Computação");
		
		// cadastro da linha de pesquisa e do orientador
		LinhaPesquisaOrientacao linhaPesquisa = 
			new LinhaPesquisaOrientacao(1, "Desenvolvimento de Software", "Técnicas de desenvolvimento em O.O.");
		
		ArrayList<LinhaPesquisaOrientacao> listaLinhasPesquisa = new ArrayList<LinhaPesquisaOrientacao>();
		listaLinhasPesquisa.add(linhaPesquisa);
		
		ProfessorOrientadorTCC orientadorTCC = new ProfessorOrientadorTCC();
		orientadorTCC.setQtdVagasOrientacao(2);
		orientadorTCC.setListaLinhaPesquisa(listaLinhasPesquisa);
		
		// cadastro do TCC
		TrabalhoConclusaoCurso tcc = new TrabalhoConclusaoCurso();
		tcc.setAlunoAutorTCC(aluno);
		tcc.setOrientadorTCC(orientadorTCC);
		tcc.setTitulo("Implementação de Sistema de Informação para a empresa XYZ");
		
		// print necessarios para evidenciar o seu trabalho
		System.out.println("Professor cadastrado: "+ professor.getNome());
		System.out.println("Aluno cadastrado: " + aluno.getNome());
		System.out.println("TCC cadastrado: "+ tcc.getTitulo());

	}

}
