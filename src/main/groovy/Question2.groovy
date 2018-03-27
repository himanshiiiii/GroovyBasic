class Question2 extends Person {
    int empId
    String company
    int salary


    static void main(String[] args) {

        Question2 ques = new Question2()
        ques.name="himanshi"
        ques.age=20
        ques.address="delhi"
        ques.gender="female"
        ques.empId=23456
        ques.company="TO THE NEW"
        ques.salary=6732458

// using dot operator

        println "employee id " + ques.empId
        println "company " + ques.company
        println "salary " + ques.salary
        println "name " + ques.name
        println "age " + ques.age
        println "address " + ques.address
        println "gender " + ques.gender

        println "============================"

        //using getter
         println "Empid: "+ques.getEmpId()+"\ncompany: "+ques.getCompany()+"\nsalary: "+ques.getSalary()+"\nName: "+ques.getName()+"\nAge: "+ques.getAge()+"\nAddress: "+ques.getAddress()+"\nGender: "+ques.getGender()

        println "============================"

        //using @ operator

        println "employee id "+ques.@empId
        println "company "+ques.@company
        println "salary "+ques.@salary
         println "name "+ques.@name
         println "age "+ques.@age
         println "address "+ques.@address
         println "gender "+ques.@gender
    }
}