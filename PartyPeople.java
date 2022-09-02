
import java.util.Scanner;

public class PartyPeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int peopleInSqr = sc.nextInt();
        int partyArea = sc.nextInt();

        int estimatedPeople = peopleInSqr * partyArea;

        for(int i = 0; i < 5; i++){
            System.out.print(sc.nextInt() - estimatedPeople + " ");


        }






    }


}
