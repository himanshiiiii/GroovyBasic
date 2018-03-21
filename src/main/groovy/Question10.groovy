class Question10{
    public static void main(String[] args) {
        File file=new File("/home/himanshi/Desktop/GrailsDemo/GroovyBasic/src/main/resources/oddNumbered.txt")
        def des=new File("/home/himanshi/Desktop/GrailsDemo/GroovyBasic/src/main/resources/FreeSpace.txt")
        file.eachLine {
            line-> des<<line.split(" ").join("").trim()
        }
    }
}
