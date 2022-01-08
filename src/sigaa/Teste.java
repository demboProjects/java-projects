package sigaa;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int qtdTotalDisciplinas = 0;
		
//		EstudanteGraduacao estudante1 = new EstudanteGraduacao("José", 9.13, 6, 6);
//		EstudanteGraduacao estudante2 = new EstudanteGraduacao("Orlando", 9.32, 6, 6);
//		EstudanteGraduacao estudante3 = new EstudanteGraduacao("Mateus", 9.42, 6, 5);
		
		System.out.println("Informe a quantidade de estudantes a ser cadastrado: ");
		int qtdEstudantes = leitor.nextInt();
		
		System.out.println("Informe a Total de disciplinas do semestre: ");
		qtdTotalDisciplinas = leitor.nextInt();
		
		Estudante[] estudantes = new Estudante[qtdEstudantes]; 
		
		for(int i = 0; i < estudantes.length; i++) {
			System.out.println("Informe o nome do estudante " + (i + 1));
			String nome = leitor.next();
			
			System.out.println("Informe o valor do IDE do estudante " + nome);
			double ide = leitor.nextFloat();			
			
			System.out.printf("Informe a quantidade de disciplinas matriculadas do estudante %s\n: ", nome);
			int qtdDisciplinasMatriculadas = leitor.nextInt();
			
			Estudante novoEstudante = new EstudanteGraduacao(nome, ide, qtdTotalDisciplinas, qtdDisciplinasMatriculadas );
			
			estudantes[i] = novoEstudante;
		}
		
		leitor.close();
		
//		EstudanteGraduacao[] estudantes = {estudante1, estudante2, estudante3};
		
		Estudante alunoBolsista = EstudanteGraduacao.SelecionaBolsista(estudantes);
		
		if(alunoBolsista.getNome() == null) {
			System.out.println("Nenhum cadidato atendeu aos requisitos");
		}else {
			System.out.printf("Nome do estudante Bolsista: %s\nSeu IDE = %.2f", alunoBolsista.getNome(), alunoBolsista.getIde());
		}
		
	}

}
