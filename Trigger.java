public class Trigger {
  public static void main(String[] args)  {
    URL url = new URL("http://example.com");
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");
  }
}
