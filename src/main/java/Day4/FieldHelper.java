package Day4;

import java.util.ArrayList;

public class FieldHelper {

    public static boolean verifyByr(ArrayList<String> lista){
        for(String itens: lista){
            if(itens.equals("byr"))
                return true;
        }
        return false;
    }
    public static boolean verifyIyr(ArrayList<String> lista){
        for(String itens: lista){
            if(itens.equals("iyr"))
                return true;
        }
        return false;
    }
    public static boolean verifyEyr(ArrayList<String> lista){
        for(String itens: lista){
            if(itens.equals("eyr"))
                return true;
        }
        return false;
    }
    public static boolean verifyHgt(ArrayList<String> lista){
        for(String itens: lista){
            if(itens.equals("hgt"))
                return true;
        }
        return false;
    }
    public static boolean verifyHcl(ArrayList<String> lista){
        for(String itens: lista){
            if(itens.equals("hcl"))
                return true;
        }
        return false;
    }
    public static boolean verifyEcl(ArrayList<String> lista){
        for(String itens: lista){
            if(itens.equals("ecl"))
                return true;
        }
        return false;
    }
    public static boolean verifyPid(ArrayList<String> lista){
        for(String itens: lista){
            if(itens.equals("pid"))
                return true;
        }
        return false;
    }
    public static boolean verifyCid(ArrayList<String> lista){
        for(String itens: lista){
            if(itens.equals("cid"))
                return true;
        }
        return false;
    }

    public static boolean validateByr(ArrayList<String> lista){
        return false;
    }

    public static boolean verifyFields(ArrayList<String> itens){
        return verifyByr(itens)
                && verifyPid(itens)
                && verifyEcl(itens)
                && verifyHcl(itens)
                && verifyHgt(itens)
                && verifyIyr(itens)
                && verifyEyr(itens)
                && verifyCid(itens);
    }

    public static boolean verifyFieldsExceptCid (ArrayList<String> itens){
        return verifyByr(itens)
                && verifyPid(itens)
                && verifyEcl(itens)
                && verifyHcl(itens)
                && verifyHgt(itens)
                && verifyIyr(itens)
                && verifyEyr(itens);
    }
}
