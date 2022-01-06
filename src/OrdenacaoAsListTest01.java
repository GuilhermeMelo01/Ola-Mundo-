import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenacaoAsListTest01 {

    public static void main(String[] args) {
        List<String> animes = Arrays.asList("One Piece", "Boku No Hero", "Attack On Titan", "Berserk", "Naruto");

        for (String string: animes){
            System.out.println(string);
        }

        Collections.sort(animes);
        System.out.println("------------");

        for (String string: animes){
            System.out.println(string);
        }

    }
}
