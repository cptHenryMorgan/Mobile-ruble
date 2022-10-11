public class Main {
    public static void main(String[] args) {
        int replenishment = 4000;

        int clientCash = 3200;

        int cashing = replenishment + clientCash;

        int bonus = 100;

        int clientBonus = cashing / bonus;

        int plusBonus = replenishment / 100;

        int finish = clientBonus + plusBonus;

        if (replenishment < 1000) {
            System.out.println("Текущий счет: " + cashing);
            System.out.println("Начисленный бонус: 0");
            System.out.println("Итоговый бонус: " + clientBonus);

        } else {
            System.out.println("Текущий счет: " + cashing);
            System.out.println("Начисленный бонус: " + plusBonus);
            System.out.println("Итоговый бонус: " + finish);
        }
    }
}
