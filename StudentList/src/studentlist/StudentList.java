
package studentlist;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class StudentList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> students = new HashMap<>();
        String stud_num = "";
        String stud_name = "";
        
        for (int i = 1; i <=3; i++){
            System.out.print("Enter student number " +i+ ": ");
            stud_num = sc.nextLine();
            
            System.out.print("Enter first name " +i+ ": ");
            stud_name = sc.nextLine();
            
            students.put(stud_num, stud_name);
        }
        
        System.out.println("Student List: ");
        for (Map.Entry<String, String> e : students.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        
        students.remove(stud_num);
        
        System.out.print("Enter your student number: ");
        stud_num = sc.nextLine();
        
        System.out.print("Enter your first name: ");
        stud_name = sc.nextLine();
        
        students.put(stud_num, stud_name);
        
        System.out.println("Student List: ");
        for (Map.Entry<String, String> e : students.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        
    }
    
}
