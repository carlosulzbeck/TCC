import java.util.List;

public class Aluno {
	private String nome;
	private String ra;
	private String eMail;
	private String usuario;
	private String senha;
	private List<Disciplina> disciplinasFaltantes;
	private List<Disciplina> disciplinasConcluidas;
	private List<Disciplina> disciplinasAtuais;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public String getRa() {
		return this.ra;
	}
	
	public void mostrarDisciplinasFaltantes(){
		if (disciplinasFaltantes.isEmpty()) {
			System.out.println("Não há disciplinas faltantes."); 
		}
		else {
			for (Disciplina disciplina : disciplinasFaltantes) {
				System.out.println(disciplina.getNome() + " - " + disciplina.getSigla());
			}
		}
	}
	
	public void mostrarDisciplinasConcluidas() {
		if(disciplinasConcluidas.isEmpty()) {
			System.out.println("Não há disciplinas concluídas.");
		}
		else {
			for(Disciplina disciplina : disciplinasConcluidas) {
				System.out.println(disciplina.getNome() + " - " + disciplina.getSigla());
			}
		}
	}
	
	public void mostrarDisciplinasAtuais() {
		if(disciplinasAtuais.isEmpty()) {
			System.out.println("O aluno não se matriculou em uma matéria esse semestre.");
		}
		else {
			for(Disciplina disciplina : disciplinasAtuais) {
				System.out.println(disciplina.getNome() + " - " + disciplina.getSigla());
			}
		}
	}
}
