package chapter2;

import java.util.Random;

class Janken {
    public static void main(String[] args) {
        Random rand = new Random();
        int j = rand.nextInt(3);

        switch (j) {
        case 0:
            System.out.println("グー");
            break;
        case 1:
            System.out.println("チョキ");
            break;
        case 2:
            System.out.println("パー");
            break;
        }
    }
}