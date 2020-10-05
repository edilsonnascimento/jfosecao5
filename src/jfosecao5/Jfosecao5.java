package jfosecao5;

/**
 *
 * @author Edilson do Nascimento
 */
public class Jfosecao5 {

    public static void main(String[] args) {
        ColorRange colorRange = new ColorRange();
        colorRange.testar(4);
        StopLight stopLight = new StopLight();      
        stopLight.testSwitch(4);
        stopLight.testIf(4);
    }
}
