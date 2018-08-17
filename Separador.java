package tcc;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.List;

public class Separador {
    String url = "https://www.dac.unicamp.br/sistemas/catalogos/grad/catalogo2018/curriculoPleno/cp94.html";
    
    Document document;
    
    public void separar(){
        try{
            document = Jsoup.connect(url).get();
            
            Elements paragraphs = document.select("div.div50b");
            
            Element p;
            
            List<String> listaCodigo = new ArrayList<String>();
            List<String> listaNome = new ArrayList<String>();
            
            
            int i = 0;
            
            p = paragraphs.first();
            
            while(p != paragraphs.last()){
                p = paragraphs.get(i);
                listaCodigo.add(p.text());
                listaNome.add(p.text());
                
                i++;
            }
            
            listaCodigo.remove(listaCodigo.size() - 1);
            listaNome.remove(listaNome.size() - 1);
            
            System.out.println("Códigos das disciplinas:");
            for(String codigo : listaCodigo){
                System.out.println(codigo.substring(0, 5));
            }
            
            System.out.println("Nome das disciplinas:");
            for(String nome : listaNome){
                System.out.println(nome.substring(6));
            }
           
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
