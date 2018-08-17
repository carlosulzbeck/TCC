/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

    public class JSoupHTMLSourceEx {

         public static void main( String[] args ){
        // Script para pegar Disciplina e Ementa da mesma
         String url = "https://www.dac.unicamp.br/sistemas/catalogos/grad/catalogo2018/coordenadorias/0065/0065.html";

         Document document;
            try {
                document = Jsoup.connect(url).get();
                
                
                Elements paragraphs = document.select("div.ancora");
                Elements divsjust = document.select("div.justificado");
                Element firstDivsjust = divsjust.first();
                Element lastDivsjust = divsjust.last();
                Element firstParagraph = paragraphs.first();
                Element lastParagraph = paragraphs.last();
                Element p;
                Element q;
                int i=1;
                int x=0;
                p=firstParagraph;
                q=firstDivsjust;
                
                System.out.println("*  " +p.text()+"\n");
                while (p!=lastParagraph && q!=lastDivsjust){
                    p=paragraphs.get(i);
                    q=divsjust.get(x);
                    System.out.println("*  " +p.text());
                    System.out.println("*  " +q.text()+"\n");
                    i++;
                    x++;
                } 
            } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            } 
        
         
         } 
         
         
    }
    
