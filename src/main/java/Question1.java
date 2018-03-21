 class Person{
    String name;
    int age;
    String gender;
    String address;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public String getGender() {
         return gender;
     }

     public void setGender(String gender) {
         this.gender = gender;
     }

     public String getAddress() {
         return address;
     }

     public void setAddress(String address) {
         this.address = address;
     }

     @Override
     public String toString() {
         return "Person{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 ", gender='" + gender + '\'' +
                 ", address='" + address + '\'' +
                 '}';
     }
 }


 public class Question1 {
     public static void main(String[] args) {

         Person p=new Person();
         p.setName("Himanshi");
         p.setAge(20);
         p.setGender("female");
         p.setAddress("Delhi");


         System.out.println("Name: "+p.getName()+"\nAge: "+p.getAge()+"\nGender: "+p.getGender()+"\nAddress: "+p.getAddress());


     }
 }
