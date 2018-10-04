import java.util.List;

public class Disciplina {
    
	private String nome;
	private String sigla;
	private String ementa;
	private int creditos;
	private int catalogo;
	private int curso;
	private int vagas;
	private boolean chkEletiva;
	private boolean chkConcluida;
	private List<Disciplina> dependencias;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public String getSigla() {
		return this.sigla;
	}
	
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	
	public String getEmenta() {
		return this.ementa;
	}
	
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public int getCreditos() {
		return this.creditos;
	}
	
	public void setCatalago(int catalogo) {
		this.catalogo = catalogo;
	}
	
	public int getCatalogo() {
		return this.catalogo;
	}
	
	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	public int getCurso() {
		return this.curso;
	}
	
	public void concluirDisciplina() {
		chkConcluida = true;
	}
}
