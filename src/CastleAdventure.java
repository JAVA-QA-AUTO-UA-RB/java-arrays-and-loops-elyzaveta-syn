import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Частина 1: Увійди в Замок
        int[] secretCode = {7, 14, 28, 56, 112};
        System.out.println("Введи 5 чисел, щоб відкрити двері замку:");
        boolean correctCode = true;

        for (int i = 0; i < secretCode.length; i++) {
            int userInput = scanner.nextInt();
            if (userInput != secretCode[i]) {
                correctCode = false;
            }
        }

        if (correctCode) {
            System.out.println("Замок відкрито! Заходь всередину.");
        } else {
            System.out.println("Невірний код. Спробуй ще.");
        }

        // Частина 2: Розв'яжи магічну загадку
        System.out.println("Блукаючи подвір'ям замку ти натрапляєш на дошку зі значеннями: 1, 12, 3, 14, 7, 10, 21, 100.");
        System.out.println("Здійсни математичні дії та відкрий двері до внутрішньої частини замку!");
        int[] mysteryPuzzle = {1, 12, 3, 14, 7, 10, 21, 100};
        int sum = 0;
        boolean correctAnswer = true;

        for (int i = 0; i < mysteryPuzzle.length; i++) {
            sum += mysteryPuzzle[i];
        }

        int userInput = scanner.nextInt();
        if (userInput != sum) {
            correctAnswer = false;
        }

        if (correctAnswer) {
            System.out.println("Двері відчиняються! Скоріш біжи у наступну кімнату!");
        } else {
            System.out.println("Неправильно. Перерахуй.");
        }

        // Частина 3: Перемогти Залізного Дракона
        System.out.println("Уся кімната була заповнена інструментами, механізмами та дивними інструкціями. Випадково, ти натискаєш на кнопку...");
        System.out.println("Двері сусідньої кімнати відчиняються і перед тобою постає механічний монстр!");
        System.out.println("Скоріше введи код деактивації!");
        int[] codeOfDeactivation = {4, 6, 10, 14, 20};
        boolean deactivation = true;

        for (int i = 0; i < codeOfDeactivation.length; i++) {
           userInput = scanner.nextInt();
            if (userInput != codeOfDeactivation[i]) {
                deactivation = false;
            }
        }

        if (deactivation) {
            System.out.println("Атаки парні! Механізм деактивовано!");
        }
        else {
            System.out.println("О ні! Монстр атакував вас!");
        }

    }


}