package MainWindow;

import Randomizer.Randomize;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import static java.lang.String.valueOf;

public class MainWindow extends JFrame implements ActionListener {

    JPanel first, second;
    JButton gNum, info, perekOn, perekOFF, noInt;
    JLabel studentName, studentId, mainText, modif, noIntInput, mainText2;
    JRadioButton chet, neChet, standart, byteF, longF, floatF, doubleF, shortF;

    public static byte[] byteNum = new byte[1];
    public static short shortNum;
    public static long longNum;
    public static float floatNum;
    public static double doubleNum;
    public static char B = 'В';
    public static char С = 'С';


   /* byte (целые числа, 1 байт)Есть(Генератор чисел)
    short (целые числа, 2 байта)Есть(Генератор чисел)
    int (целые числа, 4 байта) ЕСТЬ(Используется для рандома)
    long (целые числа, 8 байтов) Есть(Генератор чисел)
    float (вещественные числа, 4 байта)Есть,(Генератор чисел)
    double (вещественные числа, 8 байтов)  Есть (Генератор чисел)
    char (символ Unicode, 2 байта) Есть(Буквы на кнопке)
    boolean (значение истина/ложь, 1 байт   ЕСТЬ(Проверка модификатора(включен/выключен))*/


    public static boolean modifChet = false;
    public static boolean modifNeChet = false;

    public static boolean byteN = false;
    public static boolean longN = false;
    public static boolean floatN = false;
    public static boolean doubleN = false;
    public static boolean shortN = false;

    public MainWindow() {
        //Имя окна
        super("Генераторы");


        //Панель, на ней все отображается
        first = new JPanel();
        first.setLayout(null);

        second = new JPanel();
        second.setLayout(null);

        // Настройки окна
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        //Рандомные цифорки
        gNum = new JButton(B + "ыбрать " + С +  "тудента"); // Char
        gNum.setBounds(165, 250, 170, 25);
        gNum.setActionCommand("choseStudent");
        gNum.addActionListener(this);

        Font Verdana = new Font("Verdana", Font.PLAIN, 16);

        studentName = new JLabel();
        studentName.setBounds(200, 100, 200, 25);
        studentName.setFont(Verdana);

        studentId = new JLabel();
        studentId.setBounds(160, 100, 200, 25);
        studentId.setFont(Verdana);

        Font SegoeUIbig = new Font("Segoe UI", Font.PLAIN, 28);

        mainText = new JLabel("Кто пойдет к доске?");
        mainText.setBounds(120, 30, 400, 30);
        mainText.setFont(SegoeUIbig);

        Font SegoeUIsmall = new Font("Segoe UI", Font.PLAIN, 18);

        modif = new JLabel("Модификаторы поиска");
        modif.setBounds(150, 310, 400, 30);
        modif.setFont(SegoeUIsmall);

        standart = new JRadioButton("Стандартный");
        standart.setBounds(150, 340, 150, 30);
        standart.setActionCommand("standart");
        standart.addActionListener(this);
        standart.setSelected(true);

        chet = new JRadioButton("Четный поиск");
        chet.setBounds(150, 365, 150, 30);
        chet.setActionCommand("chet");
        chet.addActionListener(this);

        neChet = new JRadioButton("Нечетный поиск");
        neChet.setBounds(150, 390, 150, 30);
        neChet.setActionCommand("neChet");
        neChet.addActionListener(this);

        Font SegoeUIsuperSmall = new Font("Segoe UI", Font.PLAIN, 12);

        info = new JButton("Информация");
        info.setBounds(360, 435, 120, 20);
        info.setFont(SegoeUIsuperSmall);
        info.setActionCommand("info");
        info.addActionListener(this);


        perekOn = new JButton("Туда");
        perekOn.setBounds(10, 435, 125, 20);
        perekOn.setFont(SegoeUIsuperSmall);
        perekOn.setActionCommand("perekON");
        perekOn.addActionListener(this);


        perekOFF = new JButton("Обратно");
        perekOFF.setBounds(10, 435, 125, 20);
        perekOFF.setFont(SegoeUIsuperSmall);
        perekOFF.setActionCommand("perekOFF");
        perekOFF.addActionListener(this);


        noInt = new JButton("Сгенерировать");
        noInt.setBounds(165, 250, 170, 25);
        noInt.setFont(SegoeUIsmall);
        noInt.setActionCommand("noInt");
        noInt.addActionListener(this);


        noIntInput = new JLabel("Тута будет число");
        noIntInput.setBounds(180, 180, 250, 30);
        noIntInput.setFont(SegoeUIsmall);


        mainText2 = new JLabel("Генератор чисел");
        mainText2.setBounds(150, 30, 400, 30);
        mainText2.setFont(SegoeUIbig);

        byteF = new JRadioButton("Byte");
        byteF.setBounds(50, 100, 70, 20);
        byteF.setActionCommand("byteF");
        byteF.addActionListener(this);
        byteF.setSelected(false);

        longF = new JRadioButton("Long");
        longF.setBounds(50, 140, 70, 20);
        longF.setActionCommand("longF");
        longF.addActionListener(this);
        longF.setSelected(false);

        floatF = new JRadioButton("Float");
        floatF.setBounds(50, 160, 70, 20);
        floatF.setActionCommand("floatF");
        floatF.addActionListener(this);
        floatF.setSelected(false);

        doubleF = new JRadioButton("Double");
        doubleF.setBounds(50, 180, 70, 20);
        doubleF.setActionCommand("doubleF");
        doubleF.addActionListener(this);
        doubleF.setSelected(false);

        shortF = new JRadioButton("Short");
        shortF.setBounds(50, 120, 70, 20);
        shortF.setActionCommand("shortF");
        shortF.addActionListener(this);
        shortF.setSelected(false);



        // Добавление
        getContentPane().add(first);
        first.add(gNum);
        first.add(studentName);
        first.add(studentId);
        first.add(mainText);
        first.add(modif);
        first.add(chet);
        first.add(neChet);
        first.add(standart);
        first.add(info);
        first.add(perekOn);
        setVisible(true);


        getContentPane().add(second);
        second.add(perekOFF);
        second.add(noInt);
        second.add(noIntInput);
        second.add(mainText2);
        second.add(byteF);
        second.add(longF);
        second.add(floatF);
        second.add(doubleF);
        second.add(shortF);
        setVisible(false);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Проверка на действие
        if ("choseStudent".equals(e.getActionCommand())) {
            Randomize.main();//Вызов рандомайзера
            studentName.setText(valueOf(Randomize.arr[0][0])); // Вывод Имени
            studentId.setText(valueOf(Randomize.arr[1][0])); // Вывод ID
        }
        // Действие с модификатором Стандарт
        if ("standart".equals(e.getActionCommand())) {
            standart.setSelected(true);
            chet.setSelected(false);
            neChet.setSelected(false);
            modifChet = false;
            modifNeChet = false;
        }
        // Действие с модификатором Четный
        if ("chet".equals(e.getActionCommand())) {
            standart.setSelected(false);
            chet.setSelected(true);
            neChet.setSelected(false);
            modifChet = true;
            modifNeChet = false;
        }
        // Действие с модификатором НеЧетный
        if ("neChet".equals(e.getActionCommand())) {
            standart.setSelected(false);
            chet.setSelected(false);
            neChet.setSelected(true);
            modifChet = false;
            modifNeChet = true;
        }
        // Кнопка информации
        if ("info".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(MainWindow.this,
                    "Разработчик Buriy \n" +
                            "Спасибо что вы используете софт написанный мной\n" +
                            "Сделано примерно за 4 банки энергетика",
                    "Информация", JOptionPane.INFORMATION_MESSAGE);
        }
        if ("perekON".equals(e.getActionCommand())) {
            first.setVisible(false);
            second.setVisible(true);

        }
        if ("perekOFF".equals(e.getActionCommand())) {
            first.setVisible(true);
            second.setVisible(false);
        }


        //Да я знаю что можно было прям тут оформить рандом
        if ("noInt".equals(e.getActionCommand())) {
            if((!longN && !floatN && !doubleN && !byteN && !shortN)){
                JOptionPane.showMessageDialog(MainWindow.this,"Выберите тип числа", "Ошибка", JOptionPane.INFORMATION_MESSAGE);
            }
            if (longN) {
               Randomize.Long();
                noIntInput.setText(valueOf(longNum));
            }
            if (floatN){
                Randomize.Float();
                noIntInput.setText(valueOf(floatNum));
            }
            if (doubleN){
                Randomize.Double();
                noIntInput.setText(valueOf(doubleNum));
            }
            if (byteN){
                    Randomize.ByteF();
                    noIntInput.setText(Arrays.toString(byteNum));
            }
            if (shortN){
                Randomize.Short();
                noIntInput.setText(valueOf(shortNum));
            }
        }
        if ("byteF".equals((e.getActionCommand()))) {
            longF.setSelected(false);
            floatF.setSelected(false);
            doubleF.setSelected(false);
            byteF.setSelected(true);
            shortF.setSelected(false);

            byteN = true;
            longN = false;
            floatN = false;
            doubleN = false;
            shortN = false;
        }
        if ("shortF".equals((e.getActionCommand()))) {
            longF.setSelected(false);
            floatF.setSelected(false);
            doubleF.setSelected(false);
            byteF.setSelected(false);
            shortF.setSelected(true);

            shortN = true;
            byteN = false;
            longN = false;
            floatN = false;
            doubleN = false;
        }
        if ("longF".equals(e.getActionCommand())) {
            byteF.setSelected(false);
            floatF.setSelected(false);
            doubleF.setSelected(false);
            longF.setSelected(true);
            shortF.setSelected(false);

            byteN = false;
            longN = true;
            floatN = false;
            doubleN = false;
            shortN = false;
        }
        if ("floatF".equals(e.getActionCommand())) {
            byteF.setSelected(false);
            longF.setSelected(false);
            doubleF.setSelected(false);
            floatF.setSelected(true);
            shortF.setSelected(false);

            byteN = false;
            longN = false;
            floatN = true;
            doubleN = false;
            shortN = false;
        }
        if ("doubleF".equals(e.getActionCommand())) {
            byteF.setSelected(false);
            longF.setSelected(false);
            floatF.setSelected(false);
            doubleF.setSelected(true);
            shortF.setSelected(false);

            byteN = false;
            longN = false;
            floatN = false;
            doubleN = true;
            shortN = false;
        }
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
