package com.company;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(47, 25, 53);
        time.display();
        time.changeHours(150);
        time.display();
        time.changeMinutes(842);
        time.display();
        time.changeSeconds(15002);
        time.display();
    }
}
