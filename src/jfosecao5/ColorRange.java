/*
   Exercício 5-1: Determinando a cor no espectro visível
 */
package jfosecao5;

import java.util.Scanner;

public class ColorRange {
    
    public void quadro(){
        Scanner input = new Scanner(System.in);
        String cor = "";

        System.out.println("Entre com  a cor do código: ");
        double comprimento = input.nextDouble();
        if ((comprimento >= 380) && (comprimento <= 450)) cor = "Violeta";
        if ((comprimento >= 451) && (comprimento <= 495)) cor = "Azul";
        if ((comprimento >= 496) && (comprimento <= 570)) cor = "Verde";
        if ((comprimento >= 571) && (comprimento <= 590)) cor = "Amarelo";
        if ((comprimento >= 591) && (comprimento <= 620)) cor = "Laranja";     
        if ((comprimento >= 621) && (comprimento <= 750)) cor = "Vermelho";      
        if (cor.equals("")){
            System.out.println("A entrada não faz parte quador de cores.");          
        }else {
            System.out.println("Cor é : " + cor);
        }
    }
    
    public void testar(int quantidadeLeitura){
        boolean continua = true;
        int i = 1;
        while(continua){
          this.quadro();
          if(i >= quantidadeLeitura){
              continua = false;
          }
          i++;
        }
    }
}
