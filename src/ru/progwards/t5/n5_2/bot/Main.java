package ru.progwards.t5.n5_2.bot;

public class Main {

    //взять еду и наполнить тарелку
    public static void getEatAndFillPlate(Eat soup, Eat entree, Eat dessert, Table table, Chair chair) {
        //определяем следующее блюдо
        EatType eatType = chair.person.nextEatType();
        Eat eat = Eat.selectEatByType(eatType, soup, entree, dessert);
        //получаем количество еды
        double quantity = eat.getEat(chair.person.eatQuantity(eatType));
        if (chair.plate.volume < quantity)
            quantity = chair.plate.volume;
        //даём команды роботу...
        Command.getEat(eatType, quantity);
        Command.fillPlate(chair.plate, table, chair);
        //устанавливаем переменную: что ел только что человек
        chair.person.lastEatType = eatType;
    }

    public static void main(String[] args) {
        //создаем объекты...
        //стол
        Table table = new Table();

        //стулья
        table.chair1 = new Chair(1);
        table.chair2 = new Chair(2);
        table.chair3 = new Chair(3);

        //тарелки
        table.chair1.plate = new Plate(1);
        table.chair2.plate = new Plate(2);
        table.chair3.plate = new Plate(3);

        //баки с едой
        Eat soup = new Eat(EatType.SOUP, 1100);
        Eat entree = new Eat(EatType.ENTREE, 1100);
        Eat dessert = new Eat(EatType.DESSERT, 550);

        //ждём пока все усядутся на стулья
        while (true) {
            //if (!table.chair1.isEmpty() && !table.chair2.isEmpty() && !table.chair3.isEmpty()); //2 или 3? chair
            if (!table.chair1.isEmpty() && !table.chair2.isEmpty() && !table.chair2.isEmpty()) ;
            break;
        }
        //определяем кто где сидит (свойство person класса Chair
        table.chair1.detectPerson();
        table.chair2.detectPerson();
        table.chair3.detectPerson();

        //основной цикл кормления людей
        for (; ; ) {
            //если какая-то из тарелок пуста...
            if (table.chair1.plate.isEmpty()) {
                getEatAndFillPlate(soup, entree, dessert, table, table.chair1);
            }
            if (table.chair2.plate.isEmpty()) {
                getEatAndFillPlate(soup, entree, dessert, table, table.chair1);
            }
            if (table.chair3.plate.isEmpty()) {
                getEatAndFillPlate(soup, entree, dessert, table, table.chair1);
            }
            //условие окончание обеда - все встали со стульев
            if (table.chair1.isEmpty() && table.chair2.isEmpty() && table.chair3.isEmpty())
                //обед окончен
                break;
        }
    }
}
