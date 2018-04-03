class Question8 {
    public static void main(String[] args) {
        def des=new File("/home/himanshi/GroovyBasic/src/main/resources/des.text")
        File file=new File("/home/himanshi/GroovyBasic/src/main/resources/GroovyFiles")
        file.eachFile {f->
            des<<f.getText()
            des<<"\n"

        }
    }
}
