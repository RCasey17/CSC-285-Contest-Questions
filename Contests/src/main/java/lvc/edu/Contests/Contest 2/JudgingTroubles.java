package lvc.edu;

import java.util.ArrayList;
import java.util.Scanner;
public class JudgingTroubles {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<String> domJudge = new ArrayList<>();
        ArrayList<String> kattis = new ArrayList<>();

        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < (2*n); ++i){
            if(i < n){
                domJudge.add(in.nextLine());
            } else{
                kattis.add(in.nextLine());
            }
        }
        int matched = 0;

        while(!kattis.isEmpty()){

            String kResult = kattis.get(0);

            for(int i = 0; i < domJudge.size(); ++i){

                if(kResult.equals(domJudge.get(i))){
                    matched++;
                    domJudge.remove(i);
                    break;
                }
            }
            kattis.remove(0);
        }

        System.out.println(matched);
    }
}

/*
*
*
*
* Input: 1st line is int n, the number of results
* followed first by n lines with the non-kattis results
* and second by another n lines with the kattis results
* (so 2n+1 lines total)
* make two lists of strings with length n
* read each team into one
* compare the results, searching for duplicates
*
*
*
*/