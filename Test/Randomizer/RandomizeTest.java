package Randomizer;

import MainWindow.MainWindow;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RandomizeTest {

    long longMax = 9223372036854775807L;
    long longMin = -9223372036854775808L;

    short shortMax = 32767;
    short shortMin = -32767;

    byte[] byteMax = new byte[]{127};
    byte[] byteMin = new byte[]{-128};

    float floatMax = 1;
    float floatMin = -1;

    double doubleMax = 1;
    double doubleMin = -1;


    @Test // Проверяем тип данных Long
    public void testLong() {
        Randomize.Long();

        assertTrue("Больше максимума " + MainWindow.longNum,MainWindow.longNum <= longMax);
        assertTrue("Меньше минимума " + MainWindow.longNum,MainWindow.longNum >= longMin);
    }

    @Test // Проверяем тип данных Short
    public void testShort() {
        Randomize.Short();

        assertTrue("Больше максимума " + String.valueOf(MainWindow.shortNum),MainWindow.shortNum <= shortMax);
        assertTrue("Меньше минимума " + String.valueOf(MainWindow.shortNum),MainWindow.shortNum >= shortMin);
    }
    @Test // Проверяем тип данных Byte
    public void testByte(){
        Randomize.ByteF();

        assertFalse("bytemax " + Arrays.toString(MainWindow.byteNum) + " byte num " + Arrays.toString(MainWindow.byteNum), Arrays.equals((MainWindow.byteNum), byteMax));
        assertFalse("bytemin " + Arrays.toString(MainWindow.byteNum) + " byte num " + Arrays.toString(MainWindow.byteNum), Arrays.equals(MainWindow.byteNum, byteMin));
    }

    @Test // Проверяем тип данных Float
    public void testFloat() {
        Randomize.Float();

        assertTrue("Больше максимума " + MainWindow.floatNum,MainWindow.floatNum <= floatMax);
        assertTrue("Меньше минимума " + MainWindow.floatNum,MainWindow.floatNum >= floatMin);
}
    @Test // Проверяем тип данных Double
    public void testDouble(){
        Randomize.Double();

        assertTrue("double num " + MainWindow.doubleNum + " double max " + doubleMax ,MainWindow.doubleNum <= doubleMax);
        assertTrue("Меньше минимума " + MainWindow.doubleNum,MainWindow.doubleNum >= doubleMin);
        }

}