package Day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) throws IOException{
        ArrayList<String> lista;
        String path = "src/main/java/Day3/input.txt";
        lista = readFile(path);
        System.out.println("==========EXERCÍCIO 3 ==========");
        System.out.println("Part one solution: " + findTrees(lista, 3, 1));
        int x = 0;
        x += findTrees(lista,1,1);
        x *= findTrees(lista, 3, 1);
        x *= findTrees(lista, 5,1);
        x *= findTrees(lista, 7, 1);
        x *= findTrees(lista, 1, 2);
        System.out.println("Part two solution: " + x);
    }

    public static int findTrees(ArrayList<String> lista, int right, int down){
        int trees = 0, rightSlide = 0, downSlide = 0;
        int width = lista.get(1).length();
        boolean Array = true;
        String test;
        char a, b = '#';

        while(Array){
            rightSlide += right;
            downSlide += down;
            if (rightSlide >= width){
                rightSlide -= width;
            }
            if(downSlide >= lista.size()){
                Array = false;}
            else{
                test = lista.get(downSlide);
                a = test.charAt(rightSlide);
                if(a == b) {
                    trees++;
                }
            }
        }
        return trees;
    }


    public static ArrayList<String> readFile(String path) throws IOException {
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
