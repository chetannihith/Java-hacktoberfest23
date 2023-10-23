package DSA;

import java.util.Scanner;

/*
The tower of Hanoi is a famous puzzle where we have three rods and N disks.
The objective of the puzzle is to move the entire stack to another rod.
You are given the number of discs N. Initially, these discs are in the rod 1.
You need to print all the steps of discs movement so that all the discs reach the 3rd rod.
Note: The discs are arranged such that the top disc is numbered 1 and the bottom-most disc is numbered N.
Also, all the discs have different sizes and a bigger disc cannot be put on the top of a smaller disc.
 */
public class TowerOfHanoi {
    int steps = 0;
    void TOH(int n, String source, String auxiliary, String destination) {
        if (n == 0) {
            return;
        }
        TOH(n - 1, source, destination, auxiliary); // swap auxiliary and destination
        System.out.println("Step " + (++steps) + ": Move disc from " + source + " to " + destination);
        TOH(n - 1, auxiliary, source, destination); // swap source and auxiliary
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TowerOfHanoi toh = new TowerOfHanoi();
        System.out.print("enter no of discs : ");
        int n = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Source : ");
        String source = scan.nextLine();
        System.out.print("Enter Auxillary : ");
        String auxiliary = scan.nextLine();
        System.out.print("Enter Destination : ");
        String destination = scan.nextLine();
        toh.TOH(n, source, auxiliary, destination);
    }
}
