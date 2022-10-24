package data.structures;

import java.util.ArrayList;
import java.util.List;

public class ManipularColecao {

    public static void main(String[] args) {
        List<Integer> listaNumerica = new ArrayList<>();

        int x1 = 10;
        int x2 = 5;
        int x3 = 115;

        listaNumerica.add(x1);
        listaNumerica.add(x2);
        listaNumerica.add(x3);

        System.out.println(listaNumerica.size());
        System.out.println(listaNumerica.get(1));

        for(int x: listaNumerica) {
            System.out.println(x);
        }
    }
}
