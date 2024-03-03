/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author dzaka
 */
public class EmployeeTest {
    public static void main (String[] args){ 
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2_000_000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2_500_000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3_000_000, 1, 11, 1993);
        Sortable.shell_sort(staff); // [TASK 3.1] Abstract class named Sortable.

        int i;
        for (i = 0; i < 3; i++) {
            staff[i].raiseSalary(5);
        }
        
        for (i = 0; i < 3; i++) {
            staff[i].print();
        }
    }
}
