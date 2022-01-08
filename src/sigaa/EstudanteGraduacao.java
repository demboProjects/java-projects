package sigaa;

public class EstudanteGraduacao extends Estudante {
	
	public EstudanteGraduacao(String nome, double ide, int qtdDisciplinas, int qtdDisciplinasMatriculadas) {
		super(nome, ide, qtdDisciplinas,qtdDisciplinasMatriculadas );
	}

	public static Estudante SelecionaBolsista(Estudante[] estudantes) {
		
		double maiorIde = estudantes[estudantes.length -1].getIde();
		Estudante estudanteSelecionado = new Estudante();
		
		for(int i = 0; i < estudantes.length; i++) {
			if(estudantes[i].getIde() >= maiorIde && estudantes[i].getQtdDisciplinas() == estudantes[i].getQtdDisciplinasMatriculadas() ) {
					estudanteSelecionado = estudantes[i];
					break;
			}
		}
		
		return estudanteSelecionado;
	}
}
