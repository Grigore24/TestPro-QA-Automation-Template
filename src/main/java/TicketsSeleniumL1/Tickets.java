package TicketsSeleniumL1;

public class Tickets {
    private int age;
    private int baseFare;

    public Tickets(int age, int baseFare) {
        this.age = age;
        this.baseFare = baseFare;
    }
    public double calculate(){
        if(age<3){
            return 0.0;
        }
        if(age<13){
            return baseFare*0.5;
        }
        if(age>60){
            return baseFare*0.8;
        }
        else {
            return baseFare;
        }
    }
}

