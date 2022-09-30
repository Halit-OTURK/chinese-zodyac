package blanks;

import java.util.Scanner;

public class chineseZodiac {
    public static void main(String[] args) {
        Scanner zdc=new Scanner(System.in);
        System.out.print("Plese enter your birthdate year:");
        int year = zdc.nextInt();
       String zodyac = (year%12==0)?"monkey" :(year%12==1)?"cockerel":(year%12==2)?"dog" :(year%12==3)?"pig":(year%12==4)?"mouse"
        :(year%12==5)?"ox":(year%12==6)?"tiger":(year%12==7)?"rabbit":(year%12==8)?"dragon"
        :(year%12==9)?"snake":(year%12==10)?"horse":"sheep";
        System.out.println("zodyac = " + zodyac);
    }
}
