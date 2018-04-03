class HourMinute {
    int hours
    int minutes

    HourMinute (int hours,int minutes){
        this.hours=hours
        this.minutes=minutes
    }

    HourMinute plus(HourMinute hourMinute){
        return new HourMinute(this.hours + hourMinute.hours,this.minutes+hourMinute.minutes)
    }

    HourMinute minus(HourMinute hourMinute){
        return new HourMinute(this.hours - hourMinute.hours,this.minutes-hourMinute.minutes)
    }
}

class Question5a{
    static void main(args){
        String name=null
        if(name)
            println("test evaluated to true inside if")


        List list=[]
        if(list)
            println("true")

        HourMinute hm=new HourMinute(2,20)
        HourMinute hm1=new HourMinute(2, 50)
        HourMinute hmResult=hm1+hm
        HourMinute hmResultMinus=hm1-hm

        println("Hours:$hmResult.hours,Minutes:$hmResult.minutes")
        println("Hours:$hmResultMinus.hours,Minutes:$hmResultMinus.minutes")


    }
}
