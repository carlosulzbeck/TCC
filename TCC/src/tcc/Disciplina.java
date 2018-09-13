/*
 * Atividades de SI400 - Programação Orientada a Objetos II.
 * Faculdade de Tecnologia, UNICAMP
 * Professor responsável: Ivan L. M. Ricarte
 */

package tcc;

/**
 *
 * @author ricarte at ft.unicamp.br
 */
public class Disciplina {
    private final String codigo;
    private final String nome;
    private String url;

    public Disciplina(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    @Override
    public String toString() {
        return "{" + codigo + ": " + nome + " / " + url + '}';
    }
    
    
}
