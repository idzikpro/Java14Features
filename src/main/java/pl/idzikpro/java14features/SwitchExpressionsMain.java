package pl.idzikpro.java14features;

import java.util.Random;

public class SwitchExpressionsMain {
    public static void main(String[] args) {
        Random random=new Random();
        int number = random.nextInt(3);
        System.out.println("Get "+number);
        var result = switch (number) {
            case 0 -> {
                yield 0;
            }
            case 1,2 -> 1;
            default -> {
                yield "default";
            }
        };
        System.out.println("Result "+result);
    }
}
