import java.util.Scanner;

public class Second {
    public static void main(String[] arge){
        Scanner in = new Scanner(System.in);
        System.out.printf("HumanYears: ");
        int humanYears = in.nextInt();
        int catYears = 0;
        int dogYears = 0;
        if(humanYears>=1){
            catYears += 15;
            dogYears += 15;
            if(humanYears>=2){
                catYears += 9;
                dogYears += 9;
                if(humanYears==humanYears){
                    catYears += (humanYears-2)*4;
                    dogYears += (humanYears-2)*6;
                    System.out.printf("CatYears: " + catYears + "\nDogYears: " + dogYears);
                }
            }
            else{
                System.out.printf("CatYears: " + catYears + "\nDogYears: " + dogYears);
            }
        }
    }
}
