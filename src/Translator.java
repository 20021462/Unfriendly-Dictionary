import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Translator {

    public static void main(String[] args) throws IOException {
        String text = "Mèo ?";
        //Translated text: Hallo Welt!
        System.out.println("Translated text: " + translate("vi", "vi", text));
    }

    /**
     * This method translates text.
     * Source: https://tinyurl.com/APItranslator
     *
     * @param langFrom the language from which text are translated
     * @param langTo   the language to which text are translated
     * @param text     text
     * @return
     */
    public static String translate(String langFrom, String langTo, String text) {
        try {
            String urlStr = "https://script.google.com/macros/s/AKfycbxzMc82-y0Yrx1XQZ6N4CfV4W5PDXHYle0mWwIUVpbWZCA8BqZA/exec" +
                    "?q=" + URLEncoder.encode(text, "UTF-8") +
                    "&target=" + langTo +
                    "&source=" + langFrom;
            URL url = new URL(urlStr);
            StringBuilder response = new StringBuilder();
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }
}