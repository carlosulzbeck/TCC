package tcc;

public class TCC {

    
    public static void main(String[] args) {
        String curso = "94";
        String anoCatalogo = "2018";
        if (args.length > 0) {
            curso = args[0];
            if (args.length > 1) 
                anoCatalogo = args[1];
        }
        String urlBase = "https://www.dac.unicamp.br/sistemas/catalogos/grad/catalogo" +
                anoCatalogo + "/curriculoPleno/cp" +
                curso + ".html";
        Separador separador = new Separador(urlBase);
        
        separador.separar();
        separador.listaTudo(System.out);
    }
    
}