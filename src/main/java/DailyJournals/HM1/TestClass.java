package DailyJournals.HM1;

public class TestClass {
    public static void main(String[] args) {

        Phone nokia = new Phone();
        nokia.receiveCall("Alex");
        nokia.getNumber(799_736_606);

        Phone samsung = new Phone();
        samsung.receiveCall("Madre");
        samsung.getNumber(777_777_777);

        Phone huawei = new Phone();
        huawei.receiveCall("Waif");
        huawei.getNumber(666_666_666);

        System.out.println(nokia.number + nokia.model + nokia.weight);
        System.out.println(samsung.number + samsung.model + samsung.weight);
        System.out.println(huawei.number + huawei.model + huawei.weight);



        Person alex = new Person("Alex", 35);
        Person leon = new Person();

        alex.move();
        alex.talk();

        leon.move();
        leon.talk();











    }




}
