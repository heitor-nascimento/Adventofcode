package Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import static java.lang.Integer.parseInt;

public class Program {
    public static void main(String[] args) throws IOException{
        ArrayList<String> lista = new ArrayList();
        String path = "src/main/java/Day2/input.txt";
        lista = readFile(path);
        System.out.println("==========EXERCÍCIO 2 ==========");
        System.out.println("Part one solution: " + solvePartOne(lista));
        System.out.println("Part two solution: " + solvePartTwo(lista));


    }
    public static int solvePartOne (ArrayList<String> lista){
        int counter = 0;

        for(String itens: lista) {
            int qtd1 = 0;
            String[] item = itens.split("\\s|-|:\\s");
            int a = parseInt(item[0]);
            int b = parseInt(item[1]);
            char c = item[2].charAt(0);
            for (int i = 0; i < item[3].length(); i++) {
                if (c == (item[3].charAt(i))) {
                    qtd1++;
                }
            }
            if (qtd1 >= a && qtd1 <= b) {
                counter++;
            }

        }
        return counter;
    }

    public static int solvePartTwo(ArrayList<String> lista){
        int counter2 = 0;
        for(String itens: lista){
            String[] item = itens.split("\\s|-|:\\s");
            int a = parseInt(item[0]);
            int b = parseInt(item[1]);
            char c = item[2].charAt(0);
            if(c == item[3].charAt(a-1) ^ c == item[3].charAt(b-1)){
                counter2++;
            }
        }
        return counter2;
    }

    public static ArrayList readFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String linha;
        ArrayList<String> linhas = new ArrayList();

        while((linha = br.readLine()) != null){
            linhas.add(linha);
        }
        br.close();
        return linhas;
    }
}
