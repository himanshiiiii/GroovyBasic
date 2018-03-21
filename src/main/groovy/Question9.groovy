class Question9 {
    public static void main(String[] args) {
       def i=1
        File file=new File("/home/himanshi/Desktop/GrailsDemo/GroovyBasic/src/main/resources/oddNumbered.txt")
        def des=new File("/home/himanshi/Desktop/GrailsDemo/GroovyBasic/src/main/resources/oddNumberedDes.txt")
        file.eachLine{
            line->
            if(i%2!=0) {
                des<<line
                des<<"\n"


            }
                i++
        }

    }
}
