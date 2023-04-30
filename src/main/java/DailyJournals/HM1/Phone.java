package DailyJournals.HM1;
import DailyJournals.HM1.Person;
public class Phone {
    protected int number;

    protected int model;

    protected int weight;



    public static void receiveCall(String callName){
        System.out.println("Incoming call from " + callName);

    }

    public int getNumber(int callNumber) {
        System.out.println(callNumber);
        return number;
    }

}
