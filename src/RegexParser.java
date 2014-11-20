import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexParser {
    public static void main(String[] args){
        String htmlToParse = "<html><a title=\"bbb\" href=\"http://www.google.com\">Google</a><br/><a href=\"http://www.yahoo.com\">Yahoo!!</a></html>";
        Pattern hrefPattern = Pattern.compile("<a.*?href=\"(.*?)\">(.*?)<\\/a>");
        Matcher results = hrefPattern.matcher(htmlToParse);
        while (results.find()){
            System.out.println(results.group(2) + ": " + results.group(1));
        }
    }
}
