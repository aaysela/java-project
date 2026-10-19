import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        String text = "Привет, мир!, Hello, Pomakho!";
        OutputStreamWriter writer = new OutputStreamWriter(System.out, StandardCharsets.UTF_8);
        writer.write(text + System.lineSeparator());
        writer.flush(); // System.out не закрываем: он нужен другим классам
    }
}
