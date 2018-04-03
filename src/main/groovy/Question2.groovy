class Question2 extends Person {
    int empId
    String company
    int salary


    static void main(String[] args) {

        Question2 ques = new Question2(name: "Himanshi", age: 20, address: "delhi",
                gender: "female", empId: 2345, company: "to the new", salary: 234456)

// using dot operator

        println "employee id ${ques.empId} company ${ques.company} \nsalary ${ques.salary} \nname ${ques.name} \nage ${ques.age} \naddress ${ques.address} \ngender " + ${ques.gender}

        println "============================"

        //using getter
        println "Empid: " + ques.getEmpId() + "\ncompany: " + ques.getCompany() + "\nsalary: " + ques.getSalary() + "\nName: " + ques.getName() + "\nAge: " + ques.getAge() + "\nAddress: " + ques.getAddress() + "\nGender: " + ques.getGender()

        println "============================"

        //using @ operator

        println "employee id " + ques.@empId + "\ncompany " + ques.@company + "\nsalary " + ques.@salary + "\nname " + ques.@name + "\nage " + ques.@age + "\naddress " + ques.@address + "\ngender " + ques.@gender

    }
}