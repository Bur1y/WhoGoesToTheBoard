package Randomizer;

import java.security.SecureRandom;
import java.util.Random;

import ListStud.*;
import MainWindow.*;

public class Randomize {


    public static String[][] arr = {
            {""},
            {""},
    };

    public static Random rand = new Random();
    public static SecureRandom srand = new SecureRandom();

    public static void main() {

        int rand_student = rand.nextInt(22);

        if (MainWindow.modifChet) {
            if (rand_student % 2 == 0) {
                rand_student++;
            }
        }

        if (MainWindow.modifNeChet) {
            if (rand_student % 2 != 0) {
                rand_student++;
            }
            if (rand_student == 24) {
                rand_student = rand_student - (rand.nextInt(22) % 2);
            }
        }

        arr[0][0] = ListStud.twoIsip[rand_student][1];
        arr[1][0] = ListStud.twoIsip[rand_student][0];
    }


    public static void ByteF() {
        srand.nextBytes(MainWindow.byteNum);
    }
    public static void Long() {
        MainWindow.longNum = rand.nextLong();
    }
    public static void Double() {
        MainWindow.doubleNum = rand.nextDouble();
    }
    public static void Short(){
        MainWindow.shortNum = (short) rand.nextInt(); //Приравниваем int к short
    }
    public static void Float() {
        MainWindow.floatNum = rand.nextFloat();
    }

}
