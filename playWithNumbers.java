import java.util.*;

class NumbersGame {
    void game() {
        System.out.println("Playing");
    }
}

class PlayWithNumbers {
    public static void main(String args[]) {
        System.out.println("Welcome to the game of numbers \n");

        //rules here
        System.out.println("The rules are simple");

        Scanner scn = new Scanner(System.in);
        String ready = new String();

        ready = scn.nextLine();

        if (ready == "Y") {
            NumbersGame obj = new NumbersGame();
            obj.game();
        } else {
            System.out.println("See ya later!");
        }
    }

}