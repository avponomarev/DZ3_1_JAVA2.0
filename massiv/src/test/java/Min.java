package Min;

import java.util.Random;

public class Min {
    private int[] Mas = new int[20];
    private int i;


    public void massivGeneration() {

        Random random = new Random();
        for (i = 0; i < Mas.length; i++) {
        Mas[i] = random.nextInt(20) - 10;
        System.out.println(i + " элемент массива = "+Mas[i]);
        }
        }

public void setI(int i) {this.i = i;}

public int getIndex(){ return Mas[i];}

public int[] getMas() { return Mas;}
        }