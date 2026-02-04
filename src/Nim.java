import java.util.Scanner;
public class Nim {
 public static void main(String[] args) {
    Scanner initial = new Scanner(System.in);
    System.out.println("Initial number of sticks:");
    int start = initial.nextInt();
    int sticks = start;

    while (sticks > 0) {
    if(sticks > 0) {
        System.out.println("How many sticks would you like to remove? (2 or 1)");
        Scanner nim = new Scanner(System.in);
        int removed = nim.nextInt();
        if (removed == 1 || removed == 2) {
            sticks = sticks - removed; 
            System.out.println(start + " at start human takes " + removed + ", so " + sticks + " remain"); }
        else {
            System.out.println("Invalid input"); }
        if(sticks > 0) {
            int sticksOne = sticks;
            double chance = Math.random();
            int compRemoved;
            if (chance > 0.5) {
                compRemoved = 1;
                sticks = sticks - compRemoved; }
            else {
                compRemoved = 2;
                sticks = sticks - compRemoved; } 
        System.out.println(sticksOne + " at start computer takes " + compRemoved + ", so " + sticks + " remain"); }
        else if (sticks == 0) {
            System.out.println("You win!"); }
    else if (sticks == 0) {
        System.out.println("The computer wins / you lose"); } 
    }
    }
    if (sticks == 0) {
        System.out.println("Game Over"); } 
    }
}



