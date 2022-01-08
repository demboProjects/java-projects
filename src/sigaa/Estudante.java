package sigaa;

public class Estudante {

	private String nome;
	private String cpf;
	private int matricula;
	private String endereco;
	private double rendaFamiliar;
	private String curso;
	private double ide;
	private int cargaHorariaTotal;
	private int qtdDisciplinas;
	private int qtdDisciplinasMatriculadas;
	
	public Estudante() {
		
	}
	
	public Estudante(String nome, double ide, int qtdDisciplinas, int qtdDisciplinasMatriculadas) {
		this.nome = nome;
		this.ide = ide;
		this.qtdDisciplinas = qtdDisciplinas;
		this.qtdDisciplinasMatriculadas = qtdDisciplinasMatriculadas;
	}
	
	
	
//	metodos getters e settes
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int matrica) {
		this.matricula = matricula;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endreco) {
		this.endereco = endereco;
	}
	public double getRendaFamiliar() {
		return rendaFamiliar;
	}
	public void setRendaFamiliar(double rendaFamiliar) {
		this.rendaFamiliar = rendaFamiliar;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getIde() {
		return ide;
	}
	public void setIde(int ide) {
		this.ide = ide;
	}
	public int getCargaHorariaTotal() {
		return cargaHorariaTotal;
	}
	public void setCargaHorariaTotal(int cargaHorariaTotal) {
		this.cargaHorariaTotal = cargaHorariaTotal;
	}
	public int getQtdDisciplinas() {
		return qtdDisciplinas;
	}
	public void setQtdDisciplinas(int qtdDisciplinas) {
		this.qtdDisciplinas = qtdDisciplinas;
	}
	public int getQtdDisciplinasMatriculadas() {
		return qtdDisciplinasMatriculadas;
	}
	public void setQtdDisciplinasMatriculadas(int qtdDisciplinasMatriculadas) {
		this.qtdDisciplinasMatriculadas = qtdDisciplinasMatriculadas;
	}
	
	

	
}
