class HourMinute {
    int hours
    int minutes
}

public class Question5a{
    public static void main(String[] args) {
        HourMinute hourMinute=new HourMinute(hours: 24, minutes: 15)
        println hourMinute.getHours().plus(hourMinute.getMinutes())
        println hourMinute.getHours().minus(hourMinute.getMinutes())
    }
}
