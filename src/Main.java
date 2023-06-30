import java.util.Arrays;

/**
 * У папці з прикладами ex_004_comparable. Дописати логіку,
 * щоб метод compareTo() здійснив пошук за швидкістю
 * (якщо ж швидкість у 2-х об'єктів дорівнює, то шукаємо за ціною) -> ціною -> моделі -> кольору машини.
 */

public class Main {

    public static void main(String[] args) {

        Car[] carArray = new Car[]{
                new Car(10, 10000, "Kia", "Green"),
                new Car(150, 10000, "BMW", "Green"),
                new Car(80, 5000, "Kia", "Red"),
                new Car(80, 5000, "Kia", "Black"),
                new Car(160, 8000, "Volvo", "Black"),

        };

        System.out.println(Arrays.toString(carArray));
        Arrays.sort(carArray);
        System.out.println(Arrays.toString(carArray));

    }

}
