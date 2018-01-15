import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
class code {
    public String encrypt(String data){
        String edate="";
        int datelength = data.length();
        for(int y=0;y<datelength;y++){
            char a = data.charAt(y);
            switch(a){
                case '1':
                    
                    edate=edate.concat("A");
                    break;
                case '2':
                    
                    edate=edate.concat("C");
                    break;
                case '3':
                    
                    edate=edate.concat("E");
                    break;
                case '4':
                    
                    edate=edate.concat("G");
                    break;
                case '5':
                    
                    edate=edate.concat("I");
                    break;
                case '6':
                    
                    edate=edate.concat("K");
                    break;
                case '7':
                    
                    edate=edate.concat("M");
                    break;
                case '8':
                    
                    edate=edate.concat("O");
                    break;
                case '9':
                    
                    edate=edate.concat("Q");
                    break;
                case '0':
                    
                    edate=edate.concat("S");
                    break;
                default:
                    switch(a){
                        case 'a':
                        case 'A':
                            edate=edate.concat("2");
                            break;
                        case 'b':
                        case 'B':
                            edate=edate.concat("3");
                            break;
                        case 'c':
                        case 'C':
                            edate=edate.concat("5");
                            break;
                        case 'd':
                        case 'D':
                            edate=edate.concat("7");
                            break;
                        case 'e':
                        case 'E':
                            edate=edate.concat("11");
                            break;
                        case 'f':
                        case 'F':
                            edate=edate.concat("13");
                            break;
                        case 'g':
                        case 'G':
                            edate=edate.concat("17");
                            break;
                        case 'h':
                        case 'H':
                            edate=edate.concat("19");
                            break;
                        case 'i':
                        case 'I':
                            edate=edate.concat("23");
                            break;
                        case 'j':
                        case 'J':
                            edate=edate.concat("29");
                            break;
                        case 'k':
                        case 'K':
                            edate=edate.concat("31");
                            break;
                        case 'l':
                        case 'L':
                            edate=edate.concat("37");
                            break;
                        case 'm':
                        case 'M':
                            edate=edate.concat("41");
                            break;
                        case 'n':
                        case 'N':
                            edate=edate.concat("43");
                            break;
                        case 'o':
                        case 'O':
                            edate=edate.concat("47");
                            break;
                        case 'p':
                        case 'P':
                            edate=edate.concat("53");
                            break;
                        case 'q':
                        case 'Q':
                            edate=edate.concat("59");
                            break;
                        case 'r':
                        case 'R':
                            edate=edate.concat("61");
                            break;
                        case 's':
                        case 'S':
                            edate=edate.concat("67");
                            break;
                        case 't':
                        case 'T':
                            edate=edate.concat("71");
                            break;
                        case 'u':
                        case 'U':
                            edate=edate.concat("73");
                            break;
                        case 'v':
                        case 'V':
                            edate=edate.concat("79");
                            break;
                        case 'w':
                        case 'W':
                            edate=edate.concat("83");
                            break;
                        case 'x':
                        case 'X':
                            edate=edate.concat("89");
                            break;
                        case 'y':
                        case 'Y':
                            edate=edate.concat("97");
                            break;
                        case 'z':
                        case 'Z':
                            edate=edate.concat("101");
                            break;
                        case ':':
                            edate=edate.concat("@");
                            break;
                        case ' ':
                            
                            edate=edate.concat("#");
                            break;
                        case '.':
                            
                            edate=edate.concat("$");
                            break;
                            
                        default:
                            System.out.print("Do not have key for this");
                    }
                    if(y>=0&&y<datelength){
                        edate=edate.concat("/");
                    }
            }}
        return edate;
    }
   
}

public class Encryption {

public static void main(String args [])
{
    code obj=new code();
    Scanner in = new Scanner(System.in);
    System.out.print("Enter data that you wanna encrypt ?\n ");
   String code1= in.nextLine();
    String code=obj.encrypt(code1);
   
    System.out.println(code);
    
    try{
        FileWriter writer= new FileWriter("encrypted.txt",true);
       
        writer.write(code);
        writer.close();
        System.out.println("Encryption has done File is generated ");
    }
    catch(IOException e){
        e.printStackTrace();
    }
}
}
