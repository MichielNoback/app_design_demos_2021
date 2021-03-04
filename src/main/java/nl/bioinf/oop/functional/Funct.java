package nl.bioinf.oop.functional;

import java.util.Arrays;
import java.util.function.Predicate;

public class Funct {
    public static void main(String[] args) {

        Predicate<String> wl0 = new Predicate<String>(){
            @Override
            public boolean test(String s) {
                return s.length() < 5;
            }
        };

        Predicate<String> wl = (w) -> w.length() < 4;

//        System.out.println(wl.test("Bargf"));

        String[] words =
                {"arg", "bah", "yeah", "howwie", "aw", "whoa", "yuck"};

//        Arrays.stream(words).forEach((w) -> System.out.println(w));
        Arrays.stream(words).
                filter(w -> w.length() < 4).
                map(String::toUpperCase).
                forEach(w -> System.out.println(w));

        for(String w : words) {
            if (w.length() < 4) {
                w = w.toUpperCase();
                System.out.println(w);
            }
        }

    }


}
