package com.company;

public class Time {
    private int hours, minutes, seconds;

    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    public void changeHours(int change) {
        hours = (hours + change) % 24;
    }

    public void changeMinutes(int change) {
        changeHours((minutes + change) / 60);
        minutes = (minutes + change) % 60;
    }

    public void changeSeconds(int change) {
        changeHours((seconds + change) / 3600);
        changeMinutes(((seconds + change) % 3600) / 60);
        seconds = (seconds + change) % 60;
        if (seconds < 0) {
            if (minutes > 0) {
                minutes--;
            } else {
                if (hours > 0) {
                    hours--;
                } else {
                    hours = 23;
                }
                minutes = 59;
            }
            seconds = 60 - Math.abs(seconds);
        }
    }

    public void display() {
        System.out.printf("Now is: %02d:%02d:%02d\n", hours, minutes, seconds);
    }
}
