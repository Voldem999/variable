public class Main {
    public static void main(String[] args) {
    var box = 5;
    System.out.println(box);
    box = box + 2;
    System.out.println(box);
    box = box - 3;
    System.out.println(box);
    box = box * 3;
    System.out.println(box);
    box = box / 4;
    System.out.println(box);

    var liftingCapaciti = 50;
    var stuffWeight = 20;
    var capacityLeft = liftingCapaciti - stuffWeight;
    System.out.println("Еще можно положить " + capacityLeft + " кг вещей");

    var applesWeight = 2;
    var orangesWeight = 3;
    var fruitWeight = applesWeight + orangesWeight;
    System.out.println("Общий вес фруктов " + fruitWeight );

    var meatWeight = 4;
    var waterWeight = 5;
    var tomatoesWeight = 2;
    var cucumbersWeight = 2;
    var peppersWeight = 2;
    var zucchiniWeight = 2;
    var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
    var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
    System.out.println("Общий вес продуктов " + productsWeight + " кг!");

    var leftWeight = liftingCapaciti - stuffWeight - productsWeight;
    System.out.println("Места осталось " + leftWeight + " кг!");

    productsWeight = productsWeight * 2;
    System.out.println("Теперь вес продуктов " + productsWeight);

    leftWeight = liftingCapaciti - stuffWeight - productsWeight;
    System.out.println("Теперь места осталось " + leftWeight + " кг!");

    var overLoad = (stuffWeight + productsWeight) % liftingCapaciti;
    System.out.println("Перегруз на " + overLoad + " кг!");

    var productsInOneCar = productsWeight / 2;
    System.out.println("Продуктов в одной машине " + productsInOneCar + " кг");

    byte bananas = 100;
    System.out.println("Бананов " + bananas + " кг");

    float sugar = 3;
    float onePortion = sugar / 4;
    System.out.println("Одна порция сахара весит " + onePortion + " кг");

    byte a = 1;
    short b = 1;
    int c = 1;
    int d = a + b + c;
    System.out.println(d);

    float g = a + 1f;
    System.out.println(g);

    }
}