package javaapplication1;

import java.io.IOException;
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
                Elements divsjust = document.select("strong");
                Element firstjust = just.first();
                Element lastjust = just.last();
                Element firstDivsjust = divsjust.first();
                Element lastDivsjust = divsjust.last();
                Element firstParagraph = paragraphs.first();
                Element lastParagraph = paragraphs.last();

                Element p = firstParagraph;
                Element q = firstDivsjust;
                Element j = firstjust;
                
                int i=1;
                int x=0;
                int z=0;
                
                System.out.println("*  " +p.text()+"\n");
                    while (p!=lastParagraph && q!=lastDivsjust && j!=lastjust){
                    p=paragraphs.get(i);
                    q=divsjust.get(x);
                    j=just.get(z);
                    if(q.text().equals("Pré-Req.: Não há")) {
                    i++;
                    x = x + 2;
                    z++;
                    } else {
                    System.out.println("*  " +p.text());
                    System.out.println("*  " +q.text());
                    System.out.println("*  " +j.text()+"\n");
                    i++;
                    x = x + 2;
                    z++;
                    }
                 
            } 
                    System.out.println("--------------------------------------------------------------");
            }
            catch (IOException e) {
             // TODO Auto-generated catch block

            } 
        
         
         } 
         
         
    }