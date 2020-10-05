/*
    Problema 5-2: Determinando a próxima cor de um sinal de trânsito
 */
package jfosecao5;

import java.util.Scanner;

/**
 *
 * @author Edilson do Nascimento
 */
public class StopLight {

    private Scanner input;

    public StopLight() {
        input = new Scanner(System.in);
    }

    public void structureIf() {
        System.out.println("Enter a color code: ");
        int colorCode = input.nextInt();
        if (colorCode == 1) {
            System.out.println("Next Traffic Light is green");
        }
        if (colorCode == 2) {
            System.out.println("Next Traffic Light is yellow");
        }
        if (colorCode == 3) {
            System.out.println("Next Traffic Light is red");
        }
    }

    public void testIf(int numberRepetitions) {
        boolean more = true;
        int i = 1;
        while (more) {
            this.structureIf();
            if (i >= numberRepetitions) {
                more = false;
            }
            i++;
        }
    }

    public void structureSwitch() {
        System.out.println("Enter a color code: ");
        int colorCode = input.nextInt();
        switch (colorCode) {
            case 1:
                System.out.println("Next Traffic Light is green");
                break;
            case 2:
                System.out.println("Next Traffic Light is yellow");
                break;
            case 3:
                System.out.println("Next Traffic Light is red");
                break;
            default:
                System.out.println("Invalid code color");
        }        
    }

    public void testSwitch(int numberRepetitions) {
        boolean more = true;
        int i = 1;
        while (more) {
            this.structureSwitch();
            if (i >= numberRepetitions) {
                more = false;
            }
            i++;
        }
    }

}
