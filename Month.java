import java.util.Scanner;

public class Month {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Podaj numer miesiaca od 1 do 12: ");
        int monthNum = input.nextInt();
        String season = "";


        switch (monthNum){
            case 3:
            case 4:
            case 5:
                season = "wiosna";
                break;
            case 6:
            case 7:
            case 8:
                season = "lato";
                break;
            case 9:
            case 10:
            case 11:
                season = "jesien";
                break;
            case 12:
            case 1:
            case 2:
                season = "zima";
                break;
            default:
                System.out.println("brak informacji");
        }
        System.out.println("Numer miesiaca to " + monthNum + " to pora roku: " + season);
    }
}
