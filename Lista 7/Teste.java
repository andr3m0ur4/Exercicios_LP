import java.nio.charset.Charset;

public class Teste {
    public static void main(String[] args) {
        
        String s = "ç";

        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());
        System.out.println((char) 195);
    }
}
