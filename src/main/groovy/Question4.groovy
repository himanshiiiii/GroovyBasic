 class Question4 extends Question2{


     static void main(String[] args) {
         def question4 =new Question4(empId: 21,company: "to the new",salary: 20000,name:"sachin",age: 24,gender: "male",address: "delhi" )
         println question4

    }

     @Override
     public String toString() {
         return "${name} is a man aged ${age} who lives at ${address} He works for ${company} with employee Id ${empId} and draws ${salary} money!!!. "
     }
 }
