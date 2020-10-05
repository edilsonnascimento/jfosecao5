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
    
    public void next(){
        Scanner input = new Scanner(System.in);
        String color = "";
      
        System.out.println("Enter a color code: ");
        int colorCode = input.nextInt();
        if (colorCode == 1) color = "green";
        if (colorCode == 2) color = "yellow";
        if (colorCode == 3) color = "red";
        if(color.equals(""))
            System.out.println("Invalid code color");
        else System.out.println("Next Traffic Light is: " + color);
    }
    
    public void test(int numberRepetitions){
        boolean more = true;
        int i = 1;
        while(more){
          this.next();
          if(i >= numberRepetitions) more = false;          
          i++;
        }
    }
    
}
