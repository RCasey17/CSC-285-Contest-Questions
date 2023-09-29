package lvc.edu;

import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println(i);
            String line = in.nextLine();
            String[] words = line.split(" ");
            if(words.length > 2 && words[0].equals("Simon") && words[1].equals("says")){
                String response = line.substring(11);
                System.out.println(response);
            }
        }

    }
}

/*
*
*   Receive input with one line containing the number of commands, then n lines with those commands.
*   Commands could be one or more words.
*   If a command starts with "Simon says" then the rest of the words after that are a command to follow
*   and there will always be at least one word following "Simon says"
*
*
*
*
* */