import java.util.Scanner;

public class ChessBoard {
    public static void main(String args[]){
        for(int i=0;i<8;i++)
        {
            if(i%2 == 0) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("|WW|");
                    System.out.print("|BB|");
                }
                System.out.println('\n');
            }
            else{
                for (int j = 0; j < 4; j++) {
                    System.out.print("|BB|");
                    System.out.print("|WW|");
                }
                System.out.println('\n');
            }
        }
    }
}
