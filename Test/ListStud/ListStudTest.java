package ListStud;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class ListStudTest {

    @Test // Проверка списка на null
    public void testListNotNull() throws Exception {
        assertNotNull("Список пустой",ListStud.getTwoIsip());
    }

    @Test // Проверяем не изменился список со студентами
    public void testList() throws Exception {
        assertEquals("Начало списка студентов не совпадает","Дмитрий Антаков", ListStud.twoIsip[0][1]); // Сравниваем с первым
        assertEquals("Конец списка студентов не совпадает","Сергей Юсовских", ListStud.twoIsip[22][1]); // Сравниваем с последним
    }


}