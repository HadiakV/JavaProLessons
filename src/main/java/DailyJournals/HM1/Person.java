package DailyJournals.HM1;

public class Person {
    String fullname;

    int age;

    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public Person() {

    }

    public  void move(){
        System.out.println(fullname +  " move" + "Hi my age : " + age);
    }
    public void talk(){
        System.out.println(fullname +  " talk" + "Hi my age  : " + age);
    }

}
