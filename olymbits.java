import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {
    // todo: assign each movement to a variable, add 1 to each move where its the best, pick the highest value
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int playerIdx = in.nextInt();
        int nbGames = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }

        int iteration = 0;
        String gpu = "";
        // game loop
        while (true) {
            for (int i = 0; i < 3; i++) {
                String scoreInfo = in.nextLine();
            }
            for (int i = 0; i < nbGames; i++) {
                gpu = in.next();
                int reg0 = in.nextInt();
                int reg1 = in.nextInt();
                int reg2 = in.nextInt();
                int reg3 = in.nextInt();
                int reg4 = in.nextInt();
                int reg5 = in.nextInt();
                int reg6 = in.nextInt();

            }
            in.nextLine();

            if (gpu.equals("GAME_OVER")) {
              iteration = 0; 
            } 

            if ((iteration + 4) > gpu.length()) {
                System.out.println("RIGHT");
            } else {
                String substr = gpu.substring(iteration, iteration + 4); 
                if (substr.contains("#")) {
                    int idx = substr.indexOf('#');
                    int totalMove = idx - 1;
                    switch (totalMove) {
                        case 0:
                            System.out.println("UP");
                            iteration+=2;
                            break;
                        case 1:
                            System.out.println("LEFT");
                            iteration++;
                            break;
                        case 2:
                            System.out.println("DOWN");
                            iteration+=2;
                            break;
                    }
                } else {
                    System.out.println("RIGHT");
                    iteration+=3;
                    if (gpu.equals("GAME_OVER")) {
                        iteration -= 3;
                    }
                }
                System.err.println("bottom");
            }
        }
    }
    
}
