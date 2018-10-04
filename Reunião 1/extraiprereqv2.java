import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JavaSoup {
   /*public static void main(String[] args) throws Exception{
       Document doc = Jsoup.connect("https://www.dac.unicamp.br/sistemas/catalogos/grad/catalogo2018/coordenadorias/0065/0065.html").get();
       Elements req = doc.getElementsByTag("strong");
       Elements disc = doc.getElementsByClass("ancora");
       //if(req.text().equals("<strong>Pré-Req.: Não há </strong>")) {
       //System.out.println(disc);
       //System.out.println(req);
   //}
       System.out.println(disc);
   }*/
   
   public static void main(String[] args) throws Exception{
       String cssSelector = "div[class='ancora'] a";
       Document doc = Jsoup.connect("https://www.dac.unicamp.br/sistemas/catalogos/grad/catalogo2018/coordenadorias/0065/0065.html").get();
       Elements disc = doc.select(cssSelector);
       Elements req = doc.getElementsByTag("strong");
       String a;
       a = new String ("<strong>Pré-Req.: Não há </strong>");
       System.out.println(req);
       System.out.println(a);
       for(Element el : disc) {
           if(req.equals(a) == true) {
           System.out.println(el.attr("name"));

           //}
       }
   }
}
}
