/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package excercise53;

/**
 *
 * @author Dominik
 */
public class Propagate {
    
    public static void main (String [] args) {
        Propagate p = new Propagate();
        String s;
        try{
            s= p.reverse("");
            System.out.println(s);
        }
        catch(MyException e){
            System.out.println("Zlapany");
        }
        finally{
            System.out.println("Sprzątamy teraz");
        }
    }
    
    String reverse(String str) throws MyException{
        if (str.length()==0) throw new MyException();
        String reverseStr = "";
        for(int i=str.length()-1;i>=0;i--){
            reverseStr+=str.charAt(i);
        }
        return reverseStr;
    }
}
