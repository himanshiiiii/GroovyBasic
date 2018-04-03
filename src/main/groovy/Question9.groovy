class Question9 {
    public static void main(String[] args) {
        File file=new File("/home/himanshi/GroovyBasic/src/main/resources/oddNumbered.txt")
        def des=new File("/home/himanshi/GroovyBasic/src/main/resources/oddNumberedDes.txt")
        int index=1;
        file.eachLine {
            if(index%2) {
                des << ("${index} ${it} \n")
            }
            index++
        }
    }
}
