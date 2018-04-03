class Question10{
     static void main(String[] args) {
         Question10 question10 = new Question10()
         question10.removeWhiteSpaces()

     }
    void removeWhiteSpaces(){
        File file=new File("/home/himanshi/GroovyBasic/src/main/resources/oddNumbered.txt")
        def des=new File("/home/himanshi/GroovyBasic/src/main/resources/FreeSpace.txt")
            file.eachLine {
                des << it.replaceAll("\\s","")
            }
    }
}
