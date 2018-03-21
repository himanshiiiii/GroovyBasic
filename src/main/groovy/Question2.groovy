public class Question2 extends Person{
    int EmpId
    String company
    int salary


    public static void main(String[] args) {


        Person per=new Person()
        Question2 ques=new Question2()
        per.setName("James")
        per.setAge(20)
        per.setAddress("delhi")
        per.setGender("males")

        ques.setEmpId(2836)
        ques.setCompany("To The New")
        ques.setSalary(30000)

        println "Empid: "+ques.getEmpId()+"\ncompany: "+ques.getCompany()+"\nsalary: "+ques.getSalary()


    }
}
