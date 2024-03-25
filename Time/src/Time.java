public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void increment(int seconds) {
        this.seconds = this.seconds + seconds;
        while (this.seconds >= 60) {
            this.minutes++;
            this.seconds = this.seconds - 60;
        }
        while (this.minutes >= 60) {
            this.hours++;
            this.minutes = this.minutes - 60;
        }
        if (this.hours >= 24) {
            this.hours = this.hours - 24;
        }
    }

    public void print(boolean military) {
        if (military) {
            System.out.print(this.hours + ":");
            if (this.minutes >= 10) {
                System.out.print(this.minutes + ":");
            } else {
                System.out.print("0" + this.minutes + ":");
            }
            if (this.seconds >= 10) {
                System.out.println(this.seconds);
            } else {
                System.out.println("0" + this.seconds);
            }
        } else {
            if (this.hours >= 12) {
                System.out.print((this.hours - 12) + ":");
                if (this.minutes >= 10) {
                    System.out.print(this.minutes + ":");
                } else {
                    System.out.print("0" + this.minutes + ":");
                }
                if (this.seconds >= 10) {
                    System.out.println(this.seconds + " PM");
                } else {
                    System.out.println("0" + this.seconds + " PM");
                }
            } else {
                System.out.print((this.hours) + ":");
                if (this.minutes >= 10) {
                    System.out.print(this.minutes + ":");
                } else {
                    System.out.print("0" + this.minutes + ":");
                }
                if (this.seconds >= 10) {
                    System.out.println(this.seconds + " AM");
                } else {
                    System.out.println("0" + this.seconds + " AM");
                }
            }
        }
    }

    static Time fromString(String input) {
        String[] timeArr = input.split(":", 3);
        return new Time(Integer.parseInt(timeArr[0]), Integer.parseInt(timeArr[1]), Integer.parseInt(timeArr[2]));
    }

}
