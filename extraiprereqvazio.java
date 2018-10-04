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
                Elements strong = document.select("strong");
                Element firstjust = just.first();
                Element lastjust = just.last();
                Element firstDivsjust = divsjust.first();
                Element lastDivsjust = divsjust.last();
                Element firstParagraph = paragraphs.first();
                Element lastParagraph = paragraphs.last();
                Element firststrong = strong.first();
                Element laststrong = strong.last();
                Element p = firstParagraph;
                Element q = firstDivsjust;
                Element s = firststrong;
                Element j = firstjust;
                
                int i=1;
                int x=0;
                int y=2;
                int z=0;
                
                System.out.println("*  " +p.text()+"\n");
               // while (p!=lastParagraph && q!=lastDivsjust && s!=laststrong){
                    while (p!=lastParagraph && q!=lastDivsjust && j!=lastjust){
                    p=paragraphs.get(i);
                    q=divsjust.get(x);
                    j=just.get(z);
                    //s=strong.get(y);
                    //if(s.text().equals("Pré-Req.: Não há") || q.text().equals("Pré-Req.: Não há")) {
                    if(q.text().equals("Pré-Req.: Não há")) {
                    System.out.println("*  " +p.text());
                    System.out.println("*  " +q.text());
                    System.out.println("*  " +j.text()+"\n");
                    //System.out.println("*  " +s.text()+"\n");
                    i++;
                    x = x + 2;
                    z++;
                    //y++;
                    } else {
                    i++;
                    x = x + 2;
                    z++;
                    //y++;
                    }
                 
            } 
                    System.out.println("--------------------------------------------------------------");
            }
            catch (IOException e) {
             // TODO Auto-generated catch block

            } 
        
         
         } 
         
         
    }