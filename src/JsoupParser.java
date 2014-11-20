import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupParser {
    public static void main(String[] args){
        String htmlToParse = "<html><a title=\"bbb\" href=\"http://www.google.com\">Google</a><br/><a href=\"http://www.yahoo.com\">Yahoo!!</a></html>";
        Document doc = Jsoup.parse(htmlToParse);

        Elements elements = doc.select("a");
        for (Element element : elements){
            System.out.println(element.text() + ": " + element.attr("href"));
        }
    }
}
