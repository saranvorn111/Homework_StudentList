import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void pressEnterKey(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("========================Press Enter to continue========================");
        scanner.nextLine();
    }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("--------------- Student System ------------------");
            System.out.println("1. Add new Student ");
            System.out.println("2. Edit Student information ");
            System.out.println("3. Search Student Information");
            System.out.println("4. Delete Student Information");
            System.out.println("5. Show Student information ");
            System.out.println("6. Exit");

            String strOption;
            System.out.print(">>> Choose option from 1 - 6 : ");
            strOption = input.nextLine();
            try {
                option = Integer.parseInt(strOption);
            } catch (Exception ex) {
                option = 0;
                System.out.println("Invalid Input !!!");
            }
            switch (option) {
                case 1:
                    System.out.println("------------- Add New Worker------------- ");
                    Student newStudents = new Student();
                    newStudents.inputInformation(input);
                    students.add(newStudents);
                    System.out.println("Successfully added.....!");
                    input.nextLine();
                    break;
                case 2 :
                    int searchId=0 ;
                    boolean isIDValid = false;
                    boolean idHave = false;
                    System.out.println("+++++++++++++++++|Update Information|++++++++++++++++");
                    do {
                        String strId;
                        System.out.println("Enter ID to Edit : ");
                        try {
                            strId = input.next();
                            searchId = Integer.parseInt(strId);
                            isIDValid=true;
                        } catch (Exception ex) {
                            System.out.println("Invalid ID format!! (Integer only! )");
                        }
                    } while(!isIDValid);
                    for(int i=0;i<students.size();i++){
                        if(searchId==students.get(i).id){
                            idHave=true;
                            students.get(i).InputNewInfor(input);
                            System.out.println("Edit Successfully..!");
                        }
                    }
                    if(!idHave){
                        System.out.println("Your id "+searchId+" doesn't exit..! Please input Again");
                    }
                    input.nextLine();
                    pressEnterKey();
                    break;
                case 3 :
                    int searchOption;
                    do {
                        System.out.println("************ Search Student ***********");
                        System.out.println("1. Search By ID ");
                        System.out.println("2. Search By Name ");
                        System.out.println("3. Search By ClassName ");
                        System.out.println("4. Search By Gender  ");
                        System.out.println("5. Exit....");

                        System.out.print("Choose option 1 - 5 : ");
                        searchOption = input.nextInt();
                        switch (searchOption) {
                            case 1 :
                                int searchID = 0;
                                boolean isIDExist = false;
                                boolean isWorkerExist = false;
                                System.out.println("================== Search by ID ==================");

                                do{
                                    String strId;
                                    System.out.print("Enter Student ID to search : ");
                                    try{
                                        strId = input.next();
                                        searchID = Integer.parseInt(strId);
                                        isIDExist = true;
                                    }catch (Exception ex){
                                        System.out.println("ERROR !! ID can only be Integer...! ");
                                    }
                                }while(!isIDExist);

                                for(int i = 0; i < students.size(); i++){
                                    if(searchID == students.get(i).id){
                                        isWorkerExist = true;
                                        System.out.println("--------------- Result of search by ID ------------------");
                                        students.get(i).outputInformation();
                                    }
                                }
                                if(!isWorkerExist){
                                    System.out.println("Student with ID of " +searchID+ " doesn't exist !!!");
                                }
                                pressEnterKey();
                                break;
                            case 2:
                                String S_name;
                                boolean SearchName = false;
                                System.out.println("*********** Search By Name *********** ");
                                System.out.println("Enter name to search : ");
                                input.nextLine();
                                S_name=input.nextLine();
                                for (int i = 0; i < students.size(); i++) {
                                    if (S_name.equals(students.get(i).name)) {
                                        SearchName = true;
                                        students.get(i).outputInformation();
                                    }
                                }
                                if(!SearchName){
                                    System.out.println("The name of students  "+S_name+" doesn't exit..!!");
                                }
                                break;
                            case 3:
                                boolean s_class= false;
                                String className;
                                System.out.println("************** Search By ClassName ***************");
                                System.out.println("Enter Name of Class: ");
                                input.nextLine();
                                className= input.nextLine();
                                for(int i=0;i<students.size();i++){
                                    if(className.equals((students.get(i).className))){
                                        s_class=true;
                                        students.get(i).outputInformation();
                                    }
                                }
                                if(!s_class){
                                    System.out.println(" Your class is "+ className + "Doesn't exit!!");
                                }

                                break;
                            case 4:
                                String genderSearch;
                                boolean searchGen = false;
                                System.out.println("************************ Search By Gender **************** ");
                                System.out.println("Enter Gender student of Class: ");
                                input.nextLine();
                                genderSearch= input.next();
                                for(int i=0;i<students.size();i++){
                                    if(genderSearch.equals(students.get(i).gender)){
                                        searchGen=true;
                                        students.get(i).outputInformation();
                                    }
                                }
                                if(!searchGen){
                                    System.out.println("Age is  "+genderSearch+" didn't have ");
                                }
                                break;
                        }
                    }while(searchOption!=5);
                    input.nextLine();
                    break;
                case 4:
                    int searchDelete;
                    boolean searchHave =false;
                    System.out.println("+++++++++++++++++++|Delete Information of Student|++++++++++++++++++");
                    do{
                        String idSearch;
                        System.out.println("Enter ID for Search to delete :  ");
                        try{
                            idSearch=input.next();
                            searchDelete = Integer.parseInt(idSearch);
                            break;
                        }catch(Exception ex){
                            System.out.println("Invalid ID !! Input Integer only!!!");
                        }
                    }while(true);
                    for(int i=0;i<students.size();i++){
                        if(searchDelete==students.get(i).id){
                            searchHave=true;
                            students.remove(i);
                            System.out.println("Delete is successfully!!! ");
                        }
                    }
                    if(!searchHave){
                        System.out.println("The Id you search "+searchDelete+" didn't have..!" );
                    }
                    input.nextLine();
                    break;
                case 5:
                    System.out.println("------------- Show worker information ------------- ");
                    for (int i = 0; i < students.size(); i++) {
                        students.get(i).outputInformation();
                    }
                    break;
                case 6:
                    System.out.println("Exit the program...!!");
                    break;
                default:
                    System.out.println("Wrong option !! ");
                    break;
            }
        } while (option != 6);

    }
}