package Day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Program {


    public static void main(String[] args) throws IOException{
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista = readNumber("src/main/java/Day1/input.txt");
        System.out.println("====== Day 1 =======");
        System.out.println("Part one: " + solvePartOne(lista));
        System.out.println("Part two: " + solvePartTwo(lista));
    }

    public static ArrayList<Integer> readNumber(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String linha;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while ((linha = br.readLine()) != null) {
            int number = Integer.parseInt(linha);
            numbers.add(number);
        }
        br.close();
        return numbers;
    }


    public static int solvePartOne(ArrayList<Integer> lista) throws IOException{
        int result = 0;
        int n = lista.size();
        for(int i=0;i<=n;i++){
            for(int j=i; j<n;j++){
                if((lista.get(i)+lista.get(j))==2020){
                    result = lista.get(i)*lista.get(j);
                    //System.out.printf("O número correto é a mult de %d por %d por %d que dá %d", lista.get(i), lista.get(j), lista.get(k), lista.get(i)*lista.get(j)*lista.get(k));
                }
            }
        }
        return result;
    }


    public static int solvePartTwo(ArrayList<Integer> lista) throws IOException{
        int result2 = 0;
        int n = lista.size();
        for(int i=0;i<=n;i++){
            for(int j=i; j<n;j++){
                for(int k=j; k<n;k++){
                    if((lista.get(i)+lista.get(j)+lista.get(k))==2020){
                        result2 = lista.get(i)*lista.get(j)*lista.get(k);
                        //System.out.printf("O número correto é a mult de %d por %d por %d que dá %d", lista.get(i), lista.get(j), lista.get(k), lista.get(i)*lista.get(j)*lista.get(k));
                    }
                }
            }
        }
        return result2;
    }

}
