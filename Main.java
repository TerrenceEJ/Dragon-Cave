import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("You are in a land full of dragons. In front of you, \nyou see two caves. In one cave, the dragon is friendly \nand will share his treasure with you." +
                "The other dragon \nis greedy and hungry and will eat you on sight. \nWhich cave will you go into? (1 or 2)");
        boolean x = false;
        do{
            Scanner getInput = new Scanner(System.in);
            //Integer input = getInput.nextInt();
            if(x == false && getInput.hasNextInt()) {
                try {
                    //Integer input = getInput.nextInt();
                    System.out.println("You approach the cave... \nIt is dark and spooky... \nA large dragon jumps out in front of you! He opens his jaws and... \nGobbles you down in one bite!");
                    x = true;
                } catch (Exception e) {
                    System.out.println("You broke the story.");
                }
            } else {
                System.out.println("Wrong input, try again.");
            }
        }
        while(!x);
    }
}
