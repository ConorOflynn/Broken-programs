import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;


public class Vowels {
    public static void main(String[] args)
    {

        function Checkvowels(vowel) {
        return vowel == "A" || "a" || "E" || "e" || "i" || "I" || "O" || "o" || "U" || "u";
        }
        Scanner input = new Scanner(System.in);
        String Input = input.nextLine();
        int total = Input.length();


        String[] letters = Input.split("");
        Stream<String> vowels = letters.indexOf(Checkvowels);
        int count = vowels.length;
        System.out.println(count);


}}
