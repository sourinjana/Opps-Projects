public class CoffeeMachine {
    private int water;
    private int milk;
    private int beans;
    private int money;
    private int espressoPrice = 4;
    private int lattePrice = 7;
    private int cappuccinoPrice = 6;
    private int espressoWater = 250;
    private int espressoMilk = 0;
    private int espressoBeans = 16;
    private int latteWater = 350;
    private int latteMilk = 75;
    private int latteBeans = 20;
    private int cappuccinoWater = 200;
    private int cappuccinoMilk = 100;
    private int cappuccinoBeans = 12;
    private int espressoCount = 0;
    private int latteCount = 0;
    private int cappuccinoCount = 0;
    private int totalEarnings = 0;
    private int totalWaterConsumed = 0;
    private int totalMilkConsumed = 0;
    private int totalBeansConsumed = 0;


    public void showDetails(){
        System.out.println("Hii ! Wellcome my Coffee Machine !! ");
        System.out.println("Process: --> | Buy --> Fill ingredients --> Take money --> Show ingredients --> Analytics");
        System.out.println("Check the menu !!");
        System.out.println("Coffename: Espresso , Price and ingredients :- $4/cup, water needed 250 ml/cup, milk needed  0 ml/cup, beans needed - 16/cup");
        System.out.println("Coffename: Latte , Price and ingredients :- price - $7/cup, water needed  350 ml/cup, milk needed 75 ml/cup, beans needed - 20/cup");
        System.out.println("Coffename: Cappuccino , Price and ingredients :- price - $6/cup, water needed 200 ml/cup milk needed  100 ml/cup beans needed - 12/cup.");

    }

    public void buyCoffee(String type) {
        switch (type) {
            case "espresso":
                if (water >= espressoWater && beans >= espressoBeans) {
                    water -= espressoWater;
                    beans -= espressoBeans;
                    money += espressoPrice;
                    espressoCount++;
                    totalEarnings += espressoPrice;
                    totalWaterConsumed += espressoWater;
                    totalBeansConsumed += espressoBeans;
                    System.out.println("Dispensing espresso. Enjoy your coffee!");
                } else {
                    System.out.println("Not enough ingredients to make espresso.");
                }
                break;
            case "latte":
                if (water >= latteWater && milk >= latteMilk && beans >= latteBeans) {
                    water -= latteWater;
                    milk -= latteMilk;
                    beans -= latteBeans;
                    money += lattePrice;
                    latteCount++;
                    totalEarnings += lattePrice;
                    totalWaterConsumed += latteWater;
                    totalMilkConsumed += latteMilk;
                    totalBeansConsumed += latteBeans;
                    System.out.println("Dispensing latte. Enjoy your coffee!");
                } else {
                    System.out.println("Not enough ingredients to make latte.");
                }
                break;
            case "cappuccino":
                if (water >= cappuccinoWater && milk >= cappuccinoMilk && beans >= cappuccinoBeans) {
                    water -= cappuccinoWater;
                    milk -= cappuccinoMilk;
                    beans -= cappuccinoBeans;
                    money += cappuccinoPrice;
                    cappuccinoCount++;
                    totalEarnings += cappuccinoPrice;
                    totalWaterConsumed += cappuccinoWater;
                    totalMilkConsumed += cappuccinoMilk;
                    totalBeansConsumed += cappuccinoBeans;
                    System.out.println("Dispensing cappuccino. Enjoy your coffee!");
                } else {
                    System.out.println("Not enough ingredients to make cappuccino.");
                }
                break;
            default:
                System.out.println("Invalid coffee type.");
        }
    }

    public void fillIngredients(int waterToAdd, int milkToAdd, int beansToAdd) {
        water += waterToAdd;
        milk += milkToAdd;
        beans += beansToAdd;
        System.out.println("Ingredients added.");
    }

    public void takeMoney() {
        System.out.println("Money collected: $" + money);
        money = 0;
    }

    public void showIngredients() {
        System.out.println("Water: " + water + " ml");
        System.out.println("Milk: " + milk + " ml");
        System.out.println("Coffee beans: " + beans + " grams");
    }

    public void showAnalytics() {
        System.out.println("Coffee sold:");
        System.out.println("Espresso: " + espressoCount);
        System.out.println("Latte: " + latteCount);
        System.out.println("Cappuccino: " + cappuccinoCount);
        System.out.println("Total earnings: $" + totalEarnings);
        System.out.println("Total water consumed: " + totalWaterConsumed + " ml");
        System.out.println("Total milk consumed: " + totalMilkConsumed + " ml");
        System.out.println("Total beans consumed: " + totalBeansConsumed + " grams");
    }

}
