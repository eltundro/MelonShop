
public class Shop {
    private static int watermelonCount = 50;
    private static int melonCount = 45;
    private static double watermelonPrice = 15;
    private static double melonPrice = 20;


    public static boolean sellWatermelons(int count) {
        if (count <= watermelonCount) {
            watermelonCount -= count;
            System.out.println("Продано " + count + " арбуз(а/ов).");
            return true;
        } else {
            System.out.println("В наличии недостаточно арбузов.");
            return false;
        }
    }


    public static boolean sellMelons(int count) {
        if (count <= melonCount) {
            melonCount -= count;
            System.out.println("Продано " + count + " дынь/и.");
            return true;
        } else {
            System.out.println("В наличии недостаточно дынь.");
            return false;
        }
    }

   public static boolean sellFruits(int watermelonCount, int melonCount) {
        return sellWatermelons(watermelonCount) && sellMelons(melonCount);
    }


    public static void setWatermelonPrice(double newPrice) {
        watermelonPrice = newPrice;
        System.out.println("Цена арбуза изменена на " + newPrice + " руб.");
    }


    public static void setMelonPrice(double newPrice) {
        melonPrice = newPrice;
        System.out.println("Цена дыни изменена на " + newPrice + " руб.");
    }


    public static int getTotalFruitCount() {
        int total = watermelonCount + melonCount;
        System.out.println("Всего арбузов и дынь в наличии: " + total);
        return total;
    }


    public static double getTotalFruitCost(int watermelonCount, int melonCount) {
        double totalCost = watermelonCount * watermelonPrice + melonCount * melonPrice;
        System.out.println("Cтоимость заказа (" + watermelonCount + " арбуз(а/ов) и " + melonCount + " дынь/и): " + totalCost + " руб.");
        return totalCost;
    }

    public static void main(String[] args) {
        System.out.println("В наличии: " + watermelonCount + " арбуз(а/ов) по цене " + watermelonPrice + " руб. и " + melonCount + " дынь/и по цене " + melonPrice + " руб.");

        //Числа для проверки

        sellWatermelons(20);
        sellMelons(10);
        sellFruits(20, 10);

        setWatermelonPrice(60.0);
        setMelonPrice(90.0);
        getTotalFruitCost(40,40);
    }
}

