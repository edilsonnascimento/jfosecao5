package jfosecao5;

import java.util.Scanner;

/**
 *
 * @author Edilson do Nascimento
 */
public class Jfosecao5 {
    public static void main(String[] args) {
      ColorRange colorRange = new ColorRange();
      boolean continua = true;
      int i = 0;

      while(continua){
        colorRange.quadro();
        if(i >= 3){
            continua = false;
        }
        i++;
      }
    }
}

