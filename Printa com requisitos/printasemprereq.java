package javaapplication1;

import java.io.IOException;
import static java.util.Arrays.equals;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

    public class ExtraiPreReq {

         public static void main( String[] args ){
        // Script para pegar Disciplina e Pré Requisitos
         String url = "https://www.dac.unicamp.br/sistemas/catalogos/grad/catalogo2018/coordenadorias/0065/0065.html";

         Document document;
            try {
                document = Jsoup.connect(url).get();
                
                
                Elements paragraphs = document.select("div.ancora");
                Elements just = document.select("div.justificado");
                Elements disciplinas = document.select("p");

                Element firstParagraph = paragraphs.first();
                Element lastParagraph = paragraphs.last();
                Element p = firstParagraph;
                
                Element firstjust = just.first();
                Element lastjust = just.last();
                Element j = firstjust;

                Element firstdisc = disciplinas.first();
                Element lastdisc = disciplinas.last();
                Element d = firstdisc;
                
                int w=0;
                int i=1;
                int z=0;
                
                
                System.out.println("*  " +p.text()+"\n");
                    while (p!=lastParagraph && j!=lastjust && d!=lastdisc){
                        
                    p=paragraphs.get(i);
                    j=just.get(z);
                    d=disciplinas.get(w);
                    String substring = d.text().substring(74,d.text().length());
                    if(substring.equals("Pré-Req.: Não há")) {
                    System.out.println("*  " +p.text());
                    System.out.println("*  " +d.text().substring(74,d.text().length()));
                    System.out.println("*  " +j.text()+"\n");
                    i++;
                    z++;
                    w = w + 3;
                    } else {
                    //Printa disciplina, pré requisitos e ementa
                    
                    i++;
                    z++;
                    w = w + 3;
                    }
            } 
                    System.out.println("--------------------------------------------------------------");
            }
            catch (IOException e) {
             // TODO Auto-generated catch block

            } 
        
         
         } 
         
         
    }