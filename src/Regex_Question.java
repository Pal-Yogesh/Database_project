import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Name starting with Y|h

public class Regex_Question {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[Y|h][a-z A-Z]*");
        Matcher m = p.matcher("Yogesh_Pal");
        int x=0;
        while (m.find()){
            System.out.println(m.start()+"---"+m.end()+"---"+m.group());
            x++;
        }
    }
}

// Name Ending with j|J

class RegexQ2{
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("[a-z A-Z]+[j|J]");
        Matcher m1 = p1.matcher("abJcd");
        int x=0;
        while (m1.find()){
            System.out.println(m1.start()+"---"+m1.end()+"---"+m1.group());
            x++;
        }
    }
}

// Name Starting with n|N and j|J

class RegexQ3{
    public static void main(String[] args) {
        Pattern p2 = Pattern.compile("[n|N][a-z A-Z]*[j|J]");
        Matcher m2 = p2.matcher("Nikunj");
        int c=0;
        while (m2.find()){
            System.out.println(m2.start()+"---"+m2.end()+"---"+m2.group());
            c++;
        }
    }
}

// check whether entered email is valid or invalid

class RegexQ4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern p3 = Pattern.compile("\\w[a-z A-Z 0-9]+@gmail.com|@yahoo.com|@rediffmail.com");
        Matcher m3 = p3.matcher(sc.nextLine());
        int ctr=0;
        while (m3.find()){
            System.out.println(m3.start()+"---"+m3.end()+"---"+m3.group());
            ctr++;
        }
    }
}

// Entered phone no. is valid or not

class RegexQ5{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            Pattern p4 = Pattern.compile("[6|7|8|9][0-9]{9}");
            Matcher m4 = p4.matcher(s);
            if(s.length()==10){
                int c=0;
                while (m4.find()){
                    System.out.println(m4.start()+"---"+m4.end()+"---"+m4.group());
                    c++;
                    System.out.println("valid Phone no.");
                }
                if(s.length()<10){
                    throw new Exception();
                }
            }
            else {
                throw new Exception();
            }
        } catch (Exception obj){
            System.out.println("invalid Phone no.");
        }
    }
}
// to check special characters
class RegexQ6{
    public static void main(String[] args) {
        Pattern p5 = Pattern.compile("\\W");
        Matcher m5 = p5.matcher("%#@*Y@*hgegfgdsjfgjs jhbdfgfj &^%^%");
        while (m5.find()){
            System.out.println(m5.start()+"---"+m5.end()+"---"+m5.group());
        }
    }
}