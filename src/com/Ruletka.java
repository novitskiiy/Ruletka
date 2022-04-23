package com;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.*;

public class Ruletka {
    private static final int DEFAULT_WIDTH = 900;
    private static final int DEFAULT_HEIGHT = 600;
    public static JPanel SouthPanel;
    public static JPanel NorthPanel;
    public static JPanel WestPanel;
    public static JPanel CenterPanel;
    public static JPanel EastPanel=new JPanel(new GridLayout(3,2));
    public static ButtonGroup group;
    public static ButtonGroup group1=new ButtonGroup();
    public static int stavka=0;
    public static String text="Сумма ставки";
    public static String text1="Ваш выбор";
    public static String text2="Ваш баланс: ";
    public static String ResultString;
    public static JLabel label;
    public static JLabel label1;
    public static JLabel label2;
    public static JLabel ResultLabel;
    public static JButton jButton=new JButton("Вращать");
    public static int balance=1000;
    public static String choose;
    public static String color;
    public static String chet;
    public static String prom;
    private final static Icon[] icons = new Icon[37];
    static {
        for (int i = 0; i < 37; i++) {
            icons[i] = new ImageIcon("images/" + i + ".jpg");
        }
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Ruletka.RuletkaFrame frame = new Ruletka.RuletkaFrame();
            frame.setTitle("Ruletka");
            frame.setDefaultCloseOperation(3);
            frame.setVisible(true);
            frame.setResizable(false);
        });
    }

    static class RuletkaFrame extends JFrame {
        public RuletkaFrame() {
            this.setLayout(new BorderLayout());
            Ruletka.SouthPanel = new JPanel();
            Ruletka.group = new ButtonGroup();
            this.addAction("10",10);
            this.addAction("25",25);
            this.addAction("50",50);
            this.addAction("100",100);
            this.addAction("200",200);
            this.addAction("500",500);
            label2 = new JLabel(text2+balance);
            Ruletka.SouthPanel.add(label2);
            label = new JLabel(text+": "+stavka);
            Ruletka.SouthPanel.add(label);
            label1 = new JLabel(text1+": ");
            Ruletka.SouthPanel.add(label1);
            this.add(Ruletka.SouthPanel, "South");

            TypeStavka();
            this.add(Ruletka.EastPanel, "East");

            Ruletka.WestPanel = new JPanel();
            Ruletka.WestPanel.add(jButton);
            final JLabel dice = new JLabel(icons[(int) ((Math.random() * 36) )]);
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (balance >= stavka) {
                        int random = (int) ((Math.random() * 36) + 0);
                        dice.setIcon(icons[random]);
                        if (random == 0) {
                            color = "miss";
                            chet = "miss";
                            prom = "miss";
                        } else if (random == 1) {
                            color = "Красное";
                            chet = "Нечётное";
                            prom = "1-18";
                        } else if (random == 2) {
                            color = "Чёрное";
                            chet = "Чётное";
                            prom = "1-18";
                        } else if (random == 3) {
                            color = "Красное";
                            chet = "Нечётное";
                            prom = "1-18";
                        } else if (random == 4) {
                            color = "Чёрное";
                            chet = "Чётное";
                            prom = "1-18";
                        } else if (random == 5) {
                            color = "Красное";
                            chet = "Нечётное";
                            prom = "1-18";
                        } else if (random == 6) {
                            color = "Чёрное";
                            chet = "Чётное";
                            prom = "1-18";
                        } else if (random == 7) {
                            color = "Красное";
                            chet = "Нечётное";
                            prom = "1-18";
                        } else if (random == 8) {
                            color = "Чёрное";
                            chet = "Чётное";
                            prom = "1-18";
                        } else if (random == 9) {
                            color = "Красное";
                            chet = "Нечётное";
                            prom = "1-18";
                        } else if (random == 10) {
                            color = "Чёрное";
                            chet = "Чётное";
                            prom = "1-18";
                        } else if (random == 11) {
                            color = "Чёрное";
                            chet = "Нечётное";
                            prom = "1-18";
                        } else if (random == 12) {
                            color = "Красное";
                            chet = "Чётное";
                            prom = "1-18";
                        } else if (random == 13) {
                            color = "Чёрное";
                            chet = "Нечётное";
                            prom = "1-18";
                        } else if (random == 14) {
                            color = "Красное";
                            chet = "Чётное";
                            prom = "1-18";
                        } else if (random == 15) {
                            color = "Чёрное";
                            chet = "Нечётное";
                            prom = "1-18";
                        } else if (random == 16) {
                            color = "Красное";
                            chet = "Чётное";
                            prom = "1-18";
                        } else if (random == 17) {
                            color = "Чёрное";
                            chet = "Нечётное";
                            prom = "1-18";
                        } else if (random == 18) {
                            color = "Красное";
                            chet = "Чётное";
                            prom = "1-18";
                        } else if (random == 19) {
                            color = "Красное";
                            chet = "Нечётное";
                            prom = "19-36";
                        } else if (random == 20) {
                            color = "Чёрное";
                            chet = "Чётное";
                            prom = "19-36";
                        } else if (random == 21) {
                            color = "Красное";
                            chet = "Нечётное";
                            prom = "19-36";
                        } else if (random == 22) {
                            color = "Чёрное";
                            chet = "Чётное";
                            prom = "19-36";
                        } else if (random == 23) {
                            color = "Красное";
                            chet = "Нечётное";
                            prom = "19-36";
                        } else if (random == 24) {
                            color = "Чёрное";
                            chet = "Чётное";
                            prom = "19-36";
                        } else if (random == 25) {
                            color = "Красное";
                            chet = "Нечётное";
                            prom = "19-36";
                        } else if (random == 26) {
                            color = "Чёрное";
                            chet = "Чётное";
                            prom = "19-36";
                        } else if (random == 27) {
                            color = "Красное";
                            chet = "Нечётное";
                            prom = "19-36";
                        } else if (random == 28) {
                            color = "Чёрное";
                            chet = "Чётное";
                            prom = "19-36";
                        } else if (random == 29) {
                            color = "Чёрное";
                            chet = "Нечётное";
                            prom = "19-36";
                        } else if (random == 30) {
                            color = "Красное";
                            chet = "Чётное";
                            prom = "19-36";
                        } else if (random == 31) {
                            color = "Чёрное";
                            chet = "Нечётное";
                            prom = "19-36";
                        } else if (random == 32) {
                            color = "Красное";
                            chet = "Чётное";
                            prom = "19-36";
                        } else if (random == 33) {
                            color = "Чёрное";
                            chet = "Нечётное";
                            prom = "19-36";
                        } else if (random == 34) {
                            color = "Красное";
                            chet = "Чётное";
                            prom = "19-36";
                        } else if (random == 35) {
                            color = "Чёрное";
                            chet = "Нечётное";
                            prom = "19-36";
                        } else if (random == 36) {
                            color = "Красное";
                            chet = "Чётное";
                            prom = "19-36";
                        }
                        //Победил игрок или нет
                        if (Objects.equals(choose, "Красное") || Objects.equals(choose, "Чёрное")) {
                            if (color.equals(choose)) {
                                ResultString = "Вы победили!";
                            } else
                                ResultString = "Вы проиграли, попробуйте ещё раз";
                        } else if (Objects.equals(choose, "Чётное") || Objects.equals(choose, "Нечётное")) {
                            if (chet.equals(choose)) {
                                ResultString = "Вы победили!";
                            } else
                                ResultString = "Вы проиграли, попробуйте ещё раз";
                        } else if (Objects.equals(choose, "1-18") || Objects.equals(choose, "19-36")) {
                            if (prom.equals(choose)) {
                                ResultString = "Вы победили!";
                            } else
                                ResultString = "Вы проиграли, попробуйте ещё раз";
                        } else
                            ResultString = "Вы проиграли, попробуйте ещё раз";

                        //Увеличить или уменьшить баланс
                        if (Objects.equals(ResultString, "Вы победили!")) {
                            balance = balance + stavka;
                        } else
                            balance = balance - stavka;
                        label2.setText(text2 + balance);
                    }
                    else if(balance<stavka && balance>1){
                        ResultString="Выберите меньшую сумму для ставки";
                    }
                    else
                        ResultString = "Недостаточно средств, приходите в другой раз";
                    ResultLabel.setText(ResultString);
                }

            });
            this.add(Ruletka.WestPanel, "West");

            CenterPanel = new JPanel();
            CenterPanel.add(dice);
            add(CenterPanel, BorderLayout.CENTER);

            Ruletka.NorthPanel = new JPanel();
            ResultLabel = new JLabel(ResultString);
            Ruletka.NorthPanel.add(ResultLabel);
            this.add(Ruletka.NorthPanel, "North");

            this.pack();
        }

        public void addAction(String value, int valuee) {
            JRadioButton button = new JRadioButton(value);
            Ruletka.group.add(button);
            Ruletka.SouthPanel.add(button);
            ActionListener listener = (event) -> {
                stavka=valuee;
                label.setText(text+": "+stavka);
            };
            button.addActionListener(listener);
        }
        public void TypeStavka() {
            JRadioButton button1 = new JRadioButton("Красное");
            JRadioButton button2 = new JRadioButton("Чёрное");
            Ruletka.group1.add(button1);
            Ruletka.group1.add(button2);
            Ruletka.EastPanel.add(button1);
            Ruletka.EastPanel.add(button2);
            JRadioButton button3 = new JRadioButton("Чётное");
            JRadioButton button4 = new JRadioButton("Нечётное");
            Ruletka.group1.add(button3);
            Ruletka.group1.add(button4);
            Ruletka.EastPanel.add(button3);
            Ruletka.EastPanel.add(button4);
            JRadioButton button5 = new JRadioButton("1-18");
            JRadioButton button6 = new JRadioButton("19-36");
            Ruletka.group1.add(button5);
            Ruletka.group1.add(button6);
            Ruletka.EastPanel.add(button5);
            Ruletka.EastPanel.add(button6);
            ActionListener listener = (event) -> {
                if(button1.isSelected()){
                    choose="Красное";
                }
                else if(button2.isSelected()){
                    choose="Чёрное";
                }
                else if(button3.isSelected()){
                    choose="Чётное";
                }
                else if(button4.isSelected()){
                    choose="Нечётное";
                }
                else if(button5.isSelected()){
                    choose="1-18";
                }
                else if(button6.isSelected()){
                    choose="19-36";
                }
                label1.setText(text1+": "+choose);
            };
            button1.addActionListener(listener);
            button2.addActionListener(listener);
            button3.addActionListener(listener);
            button4.addActionListener(listener);
            button5.addActionListener(listener);
            button6.addActionListener(listener);
        }
        public Dimension getPreferredSize() {
            return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        }
    }
}