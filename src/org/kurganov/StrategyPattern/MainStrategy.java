package org.kurganov.StrategyPattern;

public class MainStrategy {
    // Тестовое приложение

    public static void main(String[] args) {

        StrategyPattern.Context context = new StrategyPattern.Context();

        context.setStrategy(new StrategyPattern.ConcreteStrategyAdd());
        int resultA = context.executeStrategy(3, 4);

        context.setStrategy(new StrategyPattern.ConcreteStrategySubtract());
        int resultB = context.executeStrategy(3, 4);

        context.setStrategy(new StrategyPattern.ConcreteStrategyMultiply());
        int resultC = context.executeStrategy(3, 4);

        System.out.println("Result A : " + resultA);
        System.out.println("Result B : " + resultB);
        System.out.println("Result C : " + resultC);
    }
}
