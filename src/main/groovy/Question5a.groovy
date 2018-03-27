class HourMinute {
    int hours
    int minutes
}

class Question5a{
     static void main(String[] args) {
        HourMinute hourMinute=new HourMinute(hours: 24, minutes: 15)
        println hourMinute.getHours().plus(hourMinute.getMinutes())
        println hourMinute.getHours().minus(hourMinute.getMinutes())
    }
}
