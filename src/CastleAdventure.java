import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Частина 1: Увійди в Замок
        int[] secretCode = {7, 14, 28, 56, 112};
        boolean correctCode = false;

        while (!correctCode) {
            System.out.println("Введи 5 чисел, щоб відкрити двері замку:");

            correctCode = true;

            for (int i = 0; i < secretCode.length; i++) {
                int userInput = scanner.nextInt();
                if (userInput != secretCode[i]) {
                    correctCode = false;
                }
            }

            if (!correctCode) {
                System.out.println("Невірний код. Спробуй ще.");
            } else {
                System.out.println("Замок відкрито! Заходь всередину.");
            }
        }


        // Частина 2: Розв'яжи магічну загадку
        System.out.println("Блукаючи подвір'ям замку ти натрапляєш на дошку зі значеннями: 1, 12, 3, 14, 7, 10, 21, 100.");
        int[] mysteryPuzzle = {1, 12, 3, 14, 7, 10, 21, 100};
        boolean correctAnswer = false;

        while (!correctAnswer) {
            System.out.println("Здійсни математичні дії та відкрий двері до внутрішньої частини замку!");

            int sum = 0;

            for (int i = 0; i < mysteryPuzzle.length; i++) {
                sum += mysteryPuzzle[i];
            }

            int userInput = scanner.nextInt();
            if (userInput != sum) {
                System.out.println("Неправильно. Перерахуй.");
            } else {
                correctAnswer = true;
                System.out.println("Двері відчиняються! Скоріш біжи у наступну кімнату!");
            }
        }


        // Частина 3: Перемогти Залізного Дракона
        System.out.println("Уся кімната була заповнена інструментами, механізмами та дивними інструкціями. Випадково, ти натискаєш на кнопку...");
        System.out.println("Двері сусідньої кімнати відчиняються і перед тобою постає механічний монстр!");
        System.out.println("Скоріше введи код деактивації!");

        int[] codeOfDeactivation = {4, 6, 8, 10, 12, 14};
        boolean deactivation = true;

        for (int i = 0; i < codeOfDeactivation.length; i++) {
           int userInput = scanner.nextInt();
            if (userInput % 2 != 0) {
                deactivation = false;
                break;
            }
        }

        if (deactivation) {
            System.out.println("Атаки парні! Механізм деактивовано!");
        } else {
            System.out.println("О ні! Монстр атакував вас!");
            return;
        }


        // Частина 4: Пожертвувати трохи магії
        System.out.println("Блукаючи кімнатами замку, ти знаходиш багато магічних артефактів, які збільшують рівень твоєї магічної сили.");
        System.out.println("Але аби увійти до старої частини замку -- треба пожертувати свою магічну силу.");

        int[] levelOfMagic = {100, 200, 300, 400, 500};
        boolean enoughLevel = false;
        int userInput = 0;

        while (!enoughLevel) {
            System.out.println("Скільки балів своєї магії ти готовий віддати?");

            userInput = scanner.nextInt();

            for (int i = 0; i < levelOfMagic.length; i++) {
                if (userInput == levelOfMagic[i]) {
                    enoughLevel = true;
                    break;
                }
            }

            if (!enoughLevel) {
                System.out.println("Недостатньо магії! Спробуй ще раз.");
            } else {
                System.out.println("Чудово! Двері відкриті, можеш досліджувати старі гали ;)");
            }
        }

        // Частина 5:  Знайди магічний ключ
        System.out.println("Серед старих гал, ти знаходиш різну скриню, прикрашену дорогоцінним камінням...");

        boolean num = false;
        userInput = 0;

        while (!num) {
            System.out.println("Введи магічне число, аби відкрити її та отримати ключ до скарбів!");

            userInput = scanner.nextInt();
            num = false;

            for (int i = 0; i < secretCode.length; i++) {
                if (userInput == secretCode[i]) {
                    num = true;
                    break;
                }
            }

            for (int i = 0; i < mysteryPuzzle.length; i++) {
                if (userInput == mysteryPuzzle[i]) {
                    num = true;
                    break;
                }
            }

            for (int i = 0; i < codeOfDeactivation.length; i++) {
                if (userInput == codeOfDeactivation[i]) {
                    num = true;
                    break;
                }
            }

            for (int i = 0; i < levelOfMagic.length; i++) {
                if (userInput == levelOfMagic[i]) {
                    num = true;
                    break;
                }
            }

            if (!num) {
                System.out.println("На жаль, це не магічне число!");
            } else {
                System.out.println("Чудово! Твій ключ знайдено!");
                return;
            }
        }

    }
}