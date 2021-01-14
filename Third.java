
public class Third {

    public static void main(String[] arge) {
        //1
        for (int k = 0; k <= 20; k++) {
            if (k == 7 || k == 14) {
                System.out.printf(" ");
            }
            System.out.printf("#");
        }
        System.out.printf("\n");
        //2
        for (int k = 0; k <= 21; k++) {
            if (k>0 && k<6){
                System.out.printf(" ");
                continue;
            }
            if (k>6 && k<9){
                System.out.printf(" ");
                continue;
            }

            if (k>9 && k<21){
                System.out.printf(" ");
                continue;
            }
            System.out.printf("#");
        }
        System.out.printf("\n");
        //3
        for (int k = 0; k <= 21; k++) {
            if (k > 0 && k < 6) {
                System.out.printf(" ");
                continue;
            }
            if (k>6 && k<10){
                System.out.printf(" ");
                continue;
            }
            if (k>10 && k<20){
                System.out.printf(" ");
                continue;
            }
            if (k>20){
                System.out.printf(" ");
                continue;
            }
            System.out.printf("#");
        }
        System.out.printf("\n");
        //4
        for (int k = 0; k <= 21; k++) {
            if (k > 0 && k < 6) {
                System.out.printf(" ");
                continue;
            }
            if (k>6 && k<11){
                System.out.printf(" ");
                continue;
            }
            if (k>11 && k<19){
                System.out.printf(" ");
                continue;
            }
            if (k>19){
                System.out.printf(" ");
                continue;
            }
            System.out.printf("#");
        }
        System.out.printf("\n");
        //5
        for (int k = 0; k <= 21; k++) {
            if (k > 0 && k < 6) {
                System.out.printf(" ");
                continue;
            }
            if (k>6 && k<12){
                System.out.printf(" ");
                continue;
            }
            if (k>12 && k<18){
                System.out.printf(" ");
                continue;
            }
            if (k>18){
                System.out.printf(" ");
                continue;
            }
            System.out.printf("#");
        }
        System.out.printf("\n");
        //6
        for (int k = 0; k <= 21; k++) {
            if (k > 0 && k < 6) {
                System.out.printf(" ");
                continue;
            }
            if (k>6 && k<13){
                System.out.printf(" ");
                continue;
            }
            if (k>13 && k<17){
                System.out.printf(" ");
                continue;
            }
            if (k>17){
                System.out.printf(" ");
                continue;
            }
            System.out.printf("#");
        }
        System.out.printf("\n");
        //7
        for (int k = 0; k <= 20; k++) {
            if (k == 7 || k == 14) {
                System.out.printf(" ");
            }
            System.out.printf("#");
        }
        System.out.printf("\n");
    }
}