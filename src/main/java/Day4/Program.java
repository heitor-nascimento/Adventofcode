package Day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) throws IOException{
        ArrayList<String> lista = readFile("src/main/java/Day4/input.txt");
        System.out.println("Part one resolution: " + solvePartOne(lista));
    }

    public static int solvePartOne(ArrayList<String> lista) throws IOException{
        int i = 0, counter = 0;
        boolean lineBreak;

        for(i = 0; i < lista.size(); i++){
            ArrayList<String> passport = new ArrayList<String>();
            lineBreak = true;

            while(lineBreak && i < lista.size()){
                String[] item = lista.get(i).split("\\s|:");
                for(int j = 0; j < item.length; j++){
                    if((j % 2) == 0 && !lista.get(i).isEmpty()){
                        passport.add(item[j]);
                    }
                }
                if((lista.get(i)).isEmpty())
                   lineBreak = false;
                else{
                i++;}
            }
            System.out.println("Passaportes = " + passport);
            if(FieldHelper.verifyFieldsExceptCid(passport)){
                counter++;
            }
/*
            for(int j = 0; j < passport.size(); j++){

            }*/
        }
        return counter;
    }

    public int solvePartTwo(ArrayList<String> lista) throws IOException{
        int counter = 0;
        boolean lineBreak;
        for(int i = 0; i < lista.size(); i++){
            ArrayList<String> passport = new ArrayList<String>();
            lineBreak = true;

            while(lineBreak && i < lista.size()){
                String[] item = lista.get(i).split("\\s|:");
                for(int j = 0; j < item.length; j++){
                    if((j % 2) == 0 && !lista.get(i).isEmpty()){
                        passport.add(item[j]);
                    }
                }
                if((lista.get(i)).isEmpty())
                   lineBreak = false;
                else{
                i++;}
            }
            System.out.println("Passaportes = " + passport);
            if(FieldHelper.verifyFieldsExceptCid(passport)){
                int counterFields = 0;
                for(int k = 0; k < passport.size() ; k++){
                    switch(passport.get(k)){
                        case "byr":
                            if(FieldHelper.validateByr(passport.get(k+1)))
                                counterFields++;
                            k++;
                            break;
                        case "iyr":
                            if(FieldHelper.validatIyr(passport.get(k+1)))
                                counterFields++;
                            k++;
                            break;
                        case "eyr":
                            if(FieldHelper.validateEyr(passport.get(k+1)))
                                counterFields++;
                            k++;
                            break;
                        case "hgt":
                            if(FieldHelper.validateHgt(passport.get(k+1)))
                                counterFields++;
                            k++;
                            break;
                        case "hcl":
                            if(FieldHelper.validateHcl(passport.get(k+1)))
                                counterFields++;
                            k++;
                            break;
                        case "ecl":
                            if(FieldHelper.validateEcl(passport.get(k+1)))
                                counterFields++;
                            k++;
                            break;
                        case "pid":
                            if(FieldHelper.validatePid(passport.get(k+1)))
                                counterFields++;
                            k++;
                            break;
                    }
                }
                if(counterFields == 8)
                    counter++;
            }
        }
        return counter;
    }

    public static ArrayList<String> readFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String linha;
        ArrayList<String> linhas = new ArrayList<String>();

        while((linha = br.readLine()) != null){
            linhas.add(linha);
        }
        br.close();
        return linhas;
    }
}
