
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(Paths.get("doc.txt"))) {
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                extractNumbers(string);
            }


        } catch (Exception obj) {
            System.out.println("Error" + obj.getMessage());
        }


    }


    public static void extractNumbers(String s) {
        List<Integer> numbers = new ArrayList<Integer>();

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);

        while (m.find()) {
            numbers.add(Integer.parseInt(m.group()));
        }
        for (int num : numbers) {
            if (num >= 10) {
                System.out.println(s);
                break;
            }
        }
    }

}

