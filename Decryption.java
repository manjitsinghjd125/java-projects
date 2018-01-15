import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
class code {
    
    public String decode(String data){
        String decode1="",code1="",result="";
        int datelength = data.length();
        for(int i = 0 ;i<datelength;i++){
            char a = data.charAt(i);
            if(a == '/'){
                // System.out.println(code);
                switch(code1){
                    case "@gent":
                        decode1=decode1.concat("Agent");
                        code1 = "";
                        break;
                    case "2":
                        decode1=decode1.concat("A");
                        code1="";
                        
                        break;
                    case "3":
                        decode1=decode1.concat("B");
                        code1="";
                        
                        break;
                    case "5":
                        decode1=decode1.concat("C");
                        code1="";
                        
                        break;
                    case "7":
                        decode1=decode1.concat("D");
                        
                        code1="";
                        break;
                    case "11":
                        decode1=decode1.concat("E");
                        
                        code1="";
                        break;
                    case "13":
                        decode1=decode1.concat("F");
                        
                        code1="";
                        break;
                    case "17":
                        decode1=decode1.concat("G");
                        code1="";
                        
                        break;
                    case "19":
                        decode1=decode1.concat("H");
                        code1="";
                        
                        break;
                    case "23":
                        decode1=decode1.concat("I");
                        code1="";
                        
                        break;
                    case "29":
                        decode1=decode1.concat("J");
                        
                        code1="";
                        break;
                    case "31":
                        decode1=decode1.concat("K");
                        
                        code1="";
                        break;
                    case "37":
                        decode1=decode1.concat("L");
                        
                        code1="";
                        break;
                    case "41":
                        decode1=decode1.concat("M");
                        
                        code1="";
                        break;
                    case "43":
                        decode1=decode1.concat("N");
                        code1="";
                        
                        break;
                    case "47":
                        decode1=decode1.concat("O");
                        
                        code1="";
                        break;
                    case "53":
                        decode1=decode1.concat("P");
                        
                        code1="";
                        break;
                    case "59":
                        decode1=decode1.concat("Q");
                        code1="";
                        
                        break;
                    case "61":
                        decode1=decode1.concat("R");
                        code1="";
                        
                        break;
                    case "67":
                        decode1=decode1.concat("S");
                        code1="";
                        
                        break;
                    case "71":
                        decode1=decode1.concat("T");
                        
                        code1="";
                        break;
                    case "73":
                        decode1=decode1.concat("U");
                        code1="";
                        
                        break;
                    case "79":
                        decode1=decode1.concat("V");
                        code1="";
                        
                        break;
                    case "83":
                        decode1=decode1.concat("W");
                        code1="";
                        
                        break;
                    case "89":
                        decode1=decode1.concat("X");
                        code1="";
                        
                        break;
                    case "97":
                        decode1=decode1.concat("Y");
                        code1="";
                        
                        break;
                    case "101":
                        decode1=decode1.concat("Z");
                        code1="";
                        
                        break;
                    case "@":
                        
                        decode1=decode1.concat(":");
                        code1="";
                        
                        break;
                    case "#":
                        
                        decode1=decode1.concat(" ");
                        code1="";
                        
                        break;
                    case "$":
                        
                        decode1=decode1.concat(".");
                        code1="";
                        
                        break;
                    default:
                        System.out.print("Do not have key for this");
                }
            }
            else{
                switch(a){
                    case 'A':
                        decode1=decode1.concat("1");
                        code1="";
                        break;
                    case 'C':
                        decode1=decode1.concat("2");
                        code1="";
                        break;
                        
                    case 'E':
                        decode1=decode1.concat("3");
                        code1="";
                        break;
                        
                    case 'G':
                        decode1=decode1.concat("4");
                        code1="";
                        break;
                        
                    case 'I':
                        decode1=decode1.concat("5");
                        code1="";
                        break;
                        
                    case 'K':
                        decode1=decode1.concat("6");
                        code1="";
                        break;
                        
                    case 'M':
                        decode1=decode1.concat("7");
                        code1="";
                        break;
                        
                    case 'O':
                        decode1=decode1.concat("8");
                        code1="";
                        break;
                        
                    case 'Q':
                        decode1=decode1.concat("9");
                        code1="";
                        break;
                        
                    case 'S':
                        decode1=decode1.concat("0");
                        code1="";
                        break;
                        
                        
                    default:
                        code1 += a;
                }
                
            }
        }
        result=decode1.toLowerCase();
        return result;
        
    }
}

public class Decryption {

public static void main(String args [])
{
    code obj=new code();
    Scanner in = new Scanner(System.in);
    System.out.print("Enter data that you wanna decrypt ?\n ");
   String code1= in.nextLine();
   
    String decod=obj.decode(code1);
    
    System.out.println(decod);
    try{
        FileWriter writer= new FileWriter("decrypted.txt",true);
       
        writer.write(decod);
        writer.close();
        System.out.println("Encryption has done File is generated ");
    }
    catch(IOException e){
        e.printStackTrace();
    }
}
}
