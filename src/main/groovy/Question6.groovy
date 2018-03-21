class Question6 {
    public static void main(String[] args) {

        def n=1
        10.times{
            println(n*3)
            n++
        }


        List list=new ArrayList()
        list = 1..10
        println list.collect{it*3}



        def c = {
            println it*3
        }
        1.upto(10, c)


    }
}
