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

    public static boolean validateByr(String byr){
        Integer birth = Integer.parseInt(byr);
        if(birth < 9999 && birth >= 1920 && birth <= 2002)
            return true;
        else
            return false;
    }

    public static boolean validateIyr(String s){
        Integer Issue = Integer.parseInt(s);
        if(Issue < 9999 && Issue >= 2010 && Issue <= 2020)
            return true;
        else
            return false;
    }

    public static boolean validateEyr(String s){
        Integer Expiration = Integer.parseInt(s);
        if(Expiration < 9999 && Expiration >= 2020 && Expiration <= 2030)
            return true;
        else
            return false;
    }

    public static boolean validatePid(String s){
        Integer Passport = Integer.parseInt(s);
        return (Passport < 999999999);
    }

    public static boolean validateEcl(String s){
        if(s.equals(Ecl.amb.toString())
        || s.equals(Ecl.blu.toString())
        || s.equals(Ecl.brn.toString())
        || s.equals(Ecl.grn.toString())
        || s.equals(Ecl.gry.toString())
        || s.equals(Ecl.hzl.toString())
        || s.equals(Ecl.oth.toString()))
            return true;
        else
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
