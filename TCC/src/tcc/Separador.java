package tcc;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.List;

public class Separador {

    String url;
    List<Disciplina> lista;

    public Separador(String url) {
        this.url = url;
        lista = new ArrayList<>();
    }

    public void separar() {
        String linha;
        String nome;
        String codigo;
        Document document;
        Elements paragraphs;

        try {
            document = Jsoup.connect(url).get();
            paragraphs = document.select("div.div50b");

            for (Element p : paragraphs) {
                Element link = p.getElementsByTag("a").first();
                codigo = link.text();
                nome = p.text().substring(p.text().indexOf(' ') + 1);
                Disciplina d = new Disciplina(codigo, nome);
                d.setUrl(link.attr("abs:href"));
                lista.add(d);
            }
//            lista.remove(lista.size() - 1);   
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listaTudo(PrintStream out) {
        for (Disciplina d : lista) {
            out.println(d.toString());
        }
    }
}
