import java.nio.file.Files

class Question11 {
    public static void main(String[] args) {
    File file=new File("/home/himanshi/Desktop/GrailsDemo/GroovyBasic/src/main/resources/image.jpg")
    def des=new File("/home/himanshi/Desktop/GrailsDemo/GroovyBasic/src/main/resources/imageDes.jpg")

       def p=(Files.readAllBytes(file.toPath()))
        Files.write(des.toPath(), p);
    }


    }
