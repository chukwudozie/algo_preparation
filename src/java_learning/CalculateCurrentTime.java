package java_learning;

public class CalculateCurrentTime {

    public static void main(String[] args) {

        long totalMilliSeconds = System.currentTimeMillis() + 3600000;
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;
        System.out.println("Current Time is:\n"+currentHour+":"+currentMinutes+":"+currentSeconds
        +" WAT(GMT+1)");

        int n = 0;
        System.out.print(++n);
        System.out.print(n++);
        System.out.print(n++);
    }
}
