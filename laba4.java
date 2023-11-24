public class laba4 {
    enum Pet{
        cat,
        dog,
        fish
    }

    public static void main(String[] args){
        int choice = 1;
        char choice2 = 'A';
        Pet choice3 = Pet.cat;
        String choice4 = "one";

        switch (choice) {
            case 1:
                System.out.println(" =  1");
                break;
            case 2:
                System.out.println(" =  2");
                break;
            case 3:
                 System.out.println(" =  3");
                break;
        
            default:
                System.out.println("error");

                break;
        }
        System.out.println(" ");

        switch (choice2) {
            case 'B':
                System.out.println("B-1");
                break;
            case 'A':
                System.out.println(" A-2");
                break;
            case 'C':
                System.out.println(" C-3");
                break;
            default:
                System.out.println(" error");
                break;
        }
        System.out.println("  ");
        
        switch (choice3) {
            case fish:
                System.out.println("fish-1");
                break;
            case dog:
                System.out.println(" dog-2");
                break;
            case cat:
                System.out.println(" Cat-3");
                break;
            default:
                System.out.println(" error");
                break;
        }
        System.out.println("  ");

        switch (choice4) {
            case "one":
                System.out.println("one-1");
                break;
            case "two":
                System.out.println(" two-2");
                break;
            case "three":
                System.out.println(" three-3");
                break;
            default:
                System.out.println(" error");
                break;
        }
        System.out.println("  ");
    }
}
