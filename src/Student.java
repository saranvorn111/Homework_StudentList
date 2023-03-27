import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id,age;
    String name;
    String gender;
    String className;
    float score;

    Student() {
    }

    Student(int id, String name, String gender, String className,float score,int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age=age;
        this.className=className;
        this.score=score;
    }
    void outputInformation() {
//        System.out.println("ID : " + id);
//        System.out.println("Name : " + name);
//        System.out.println("Gender :" + gender);
//        System.out.println("Age : "+age);
//        System.out.println("ClassName: "+className);
//        System.out.println("Score : "+score);
        System.out.println("ID: "+id+","+" Name: "+name+","+" Gender: "+gender+","+" Age: "+age+","+" ClassName: "+className+","+" Score: "+score);

    }

    void inputInformation(Scanner input) {
        boolean isIDValid = false;
        boolean isAgeValid = false;
        boolean isScoreValid = false;
        do {
            String strId;
            System.out.println("Enter ID : ");
            try {
                strId = input.next();
                id = Integer.parseInt(strId);
                isIDValid = true;
            } catch (Exception ex) {
                System.out.println("Invalid ID format!! (Integer only! )");
            }
        } while (!isIDValid);
        System.out.println("Enter Name : ");
        input.nextLine();
        name = input.nextLine();
        System.out.println("Enter Gender : ");
        gender = input.nextLine();
        do{

            String strAge;
            System.out.println("Enter Age: ");
            try{
                strAge = input.next();
                age=Integer.parseInt(strAge);
                isAgeValid=true;
            }catch(Exception ex){
                System.out.println("Invalid Age format!! (Integer only!)");
            }

        }while(!isAgeValid);
//        age=input.nextInt();
        System.out.println("Enter className: ");
        className=input.next();
        do{
            String scScore;
            System.out.println("Enter Score: ");
            try{
                scScore=input.next();
                score=Integer.parseInt(scScore);
                isScoreValid=true;
            }catch(Exception ex){
                System.out.println("Invalid score!! you cannot input String!!");
            }
        }while(!isScoreValid);
    }
    //New inputUpdate
    void InputNewInfor(Scanner input){
        boolean isAgeValid = false;
        boolean isScoreValid = false;
        System.out.println("Enter New Name : ");
        name = input.nextLine();
        input.nextLine();
        System.out.println("Enter New Gender : ");
        gender = input.nextLine();
        do{

            String strAge;
            System.out.println("Enter New Age: ");
            try{
                strAge = input.next();
                age=Integer.parseInt(strAge);
                isAgeValid=true;
            }catch(Exception ex){
                System.out.println("Invalid Age format!! (Integer only!)");
            }

        }while(!isAgeValid);
//        age=input.nextInt();
        input.nextLine();
        System.out.println("Enter New className: ");
        className=input.next();
        do{
            String scScore;
            System.out.println("Enter New Score: ");
            try{
                scScore=input.next();
                score=Integer.parseInt(scScore);
                isScoreValid=true;
            }catch(Exception ex){
                System.out.println("Invalid score!! you cannot input String!!");
            }
        }while(!isScoreValid);

    }
}