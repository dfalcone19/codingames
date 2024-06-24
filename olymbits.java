import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {
    String UP = "UP";
    String DOWN = "DOWN";
    String LEFT = "LEFT";
    String RIGHT = "RIGHT";
    static int iteration = 0;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int playerIdx = in.nextInt();
        int nbGames = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }

        String[] gpus = new String[nbGames];
        HashMap<String, Integer> moves = new HashMap<>();
        // game loop
        while (true) {
            for (int i = 0; i < 3; i++) {
                String scoreInfo = in.nextLine();
            }
            for (int i = 0; i < nbGames; i++) {
                gpus[i] = in.next();
                int reg0 = in.nextInt();
                int reg1 = in.nextInt();
                int reg2 = in.nextInt();
                int reg3 = in.nextInt();
                int reg4 = in.nextInt();
                int reg5 = in.nextInt();
                int reg6 = in.nextInt();

            }
            in.nextLine();

            moves.put("UP", 0);
            moves.put("DOWN", 0);
            moves.put("LEFT", 0);
            moves.put("RIGHT", 0);
            
            for (int i = 0; i < nbGames; i++) {
                moves.merge(findBestMove(gpus[i]), 1, Integer::sum);

            }
            String move = "";
            for (Map.Entry<String, Integer> entry : moves.entrySet()) {
                if (entry.getValue() == Collections.max(moves.values())) {
                    System.out.println(entry.getKey());
                   move = entry.getKey(); 
                    System.err.println(entry.getKey());
                    break;
                }

            }  
           /*think that it works alright, need to look into optimizing (i.e. considering
           stunned players, ties) */ 
            switch (move) {
                case "UP":
                    iteration+=2;
                    break;
                case "LEFT":
                    iteration++;
                    break;
                case "DOWN":
                    iteration+=2;
                    break;
                default:
                    iteration += 3;
                    break;
            } 
            System.err.println(moves.toString());
        }
    }

    public static String findBestMove(String gpu) {
        if (gpu.equals("GAME_OVER")) {
            iteration = 0; 
        } 
        System.err.println(gpu + " " + gpu.length());
        if ((iteration + 4) > gpu.length()) {
            return "RIGHT";
        } else {
            String substr = gpu.substring(iteration, iteration + 4); 
            System.err.println(substr);
            if (substr.contains("#")) {
                int idx = substr.indexOf('#');
                int totalMove = idx - 1;
                switch (totalMove) {
                    case 0:
                        return "UP";
                    case 1:
                        return "LEFT";
                    case 2:
                        return "DOWN";
                }
            } else {
                return "RIGHT";
            }
        }
        // why are we getting here?
        return "UP";
    }
}
