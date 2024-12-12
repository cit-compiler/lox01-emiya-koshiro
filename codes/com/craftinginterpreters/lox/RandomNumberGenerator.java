import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Randomクラスのインスタンスを作成
        Random random = new Random();

        // 0から100までの整数の乱数を生成
        int randomInt = random.nextInt(101); // 101未満の値（0?100）

        // 0.0から1.0までの浮動小数点数の乱数を生成
        double randomDouble = random.nextDouble();

        // -50から50までの整数の乱数を生成
        int randomRangeInt = -50 + random.nextInt(101); // (-50?50)

        // 結果を表示
        System.out.println("0から100までの整数の乱数: " + randomInt);
        System.out.println("0.0から1.0までの浮動小数点数の乱数: " + randomDouble);
        System.out.println("-50から50までの整数の乱数: " + randomRangeInt);
    }
}
