package javaapplication1;

import java.io.IOException;
import static java.util.Arrays.equals;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

    public class BuscaSigla {

         public static void main( String[] args ){
        // Script para pegar Disciplina e Pré Requisitos
         String url = "https://www.dac.unicamp.br/sistemas/catalogos/grad/catalogo2018/curriculoPleno/cp94.html";

         Document document;
            try {
                document = Jsoup.connect(url).get();
                Element firstlink = document.select("a").first();
                Element lastlink = document.select("a").last();
                Element d = firstlink;
                
                //Pega a partir do sexto ahref
                int w=6;

                    while (d!=lastlink){
                    d=document.select("a").get(w);
                    
                    //Troca o ../ pela página a ser acessada
                    String substring = d.attr("href").substring(3,d.attr("href").length());
                    System.out.println("https://www.dac.unicamp.br/sistemas/catalogos/grad/catalogo2018/" + substring);

                    w++;
                    
            } 
                    System.out.println("--------------------------------------------------------------");
            }
            catch (IOException e) {
             // TODO Auto-generated catch block

            } 
        
         
         } 
         
         
    }