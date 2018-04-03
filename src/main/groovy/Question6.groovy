class Question6 {
    public static void main(String[] args) {

        println("Multiple Of 3 with 3 different methods")
        println("Method 1 : ")
        (1..10).each {

            println(it*3)
        }

        println("Method 2:  ")
        1.upto(10) {
            println (3*it)
        }

        println("Method 3:")
        for (number in 1..10 ) {
            println (number*3)
        }
    }
}
