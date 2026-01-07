import java.util.*;
class Student{
    String id;
    String name;
    int age;
    Student(String id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
}
public class StudentManagementSystem{
static ArrayList<Student> students=new ArrayList<>();
static Scanner sc=new Scanner(System.in);
public static void main(String[] args){
    while (true){
        System.out.println("\n----Student Management System----");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");
        System.out.println("Choose option:");
if (!sc.hasNextInt()) {
    System.out.println("Menu option must be a number (1–5)");
    sc.next();   // discard wrong input
    continue;
}
int choice = sc.nextInt();

        switch(choice){
            case 1:addStudent();break;
            case 2:viewStudents();break;
            case 3:searchStudent();break;
            case 4:deleteStudent();break;
            case 5:System.out.println("Thank You");
                   System.exit(0);
            default:
                System.out.println("Invalid Choice");
        }
    }
}
        static void addStudent(){
            System.out.println("Enter ID:");
            String id=sc.nextLine();
            sc.nextLine();
            System.out.println("Enter Name:");
            String name=sc.nextLine();
            System.out.println("Enter Age:");
            int age=sc.nextInt();
            students.add(new Student(id,name,age));
            System.out.println("Student Added Succssfully!");
        }
        static void viewStudents(){
            if(students.isEmpty()){
                System.out.println("Sorry!No Student is Found!!");
                return;
            }
            for(Student s:students){
                System.out.println("ID:"+s.id+"Name:"+s.name+"Age:"+s.age);
                return;
            }
        }
        static void searchStudent(){
            System.out.println("Enter ID to search:");
            String id=sc.nextLine();
            for(Student s:students){
                if(s.id==id){
                    System.out.println("Found:"+s.name+",Age:"+s.age);
                    return;
                }
            }
            System.out.println("Student Not Found");
        }
        static void deleteStudent(){
            System.out.println("Enter ID to delete:");
            String id=sc.nextLine();
            iterator<Student> itr=students.iterator();
            while(itr.hasNext()){
                Student s=itr.next();
                if(s.id==id){
                    itr.remove();
                    System.out.println("Student Deleted!");
                    return;
                }
            }
            System.out.println("Student Not Found");
        }
    }