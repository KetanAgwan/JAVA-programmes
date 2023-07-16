//Write a java program to accept details of ‘n’ cricket players(pid, pname, totalRuns,
//        InningsPlayed, NotOuttimes). Calculate the average of all the players. Display the details
//        of player having maximum average

import java.util.*;

class Players{
    int pid,total,inn,noOut;
    String pname;
    float avg;

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter pid");
        pid = sc.nextInt();
        System.out.println("enter pname");
        pname = sc.next();
        System.out.println("enter no of innins ");
        inn = sc.nextInt();
        System.out.println("enter no of not outs");
        noOut = sc.nextInt();
        System.out.println("entr total runs");
        total = sc.nextInt();
    }
    static Players[] calcAvg(Players arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i].avg = (float) arr[i].total/arr[i].inn;
        }
        return arr;
    }

    static void dispMax(Players arr[]){
        Players temp = new Players();
        for (int i = 0; i < arr.length; i++) {
            if (temp.avg < arr[i].avg){
                temp = arr[i];
            }
        }
        System.out.println("player with max avg :---");
        System.out.println("pid "+temp.pid);
        System.out.println("pname "+temp.pname);
        System.out.println("no of inn"+temp.inn);
        System.out.println("total runs"+temp.total);
        System.out.println("not outs "+temp.noOut);
        System.out.println("Average runs "+temp.avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of players");
        int n = sc.nextInt();
        Players arr[] = new Players[n];
        System.out.println("enter details ");
        for (int i = 0; i < n; i++) {
            arr[i] = new Players();
            arr[i].accept();
        }
        arr = calcAvg(arr);
        dispMax(arr);
    }
}