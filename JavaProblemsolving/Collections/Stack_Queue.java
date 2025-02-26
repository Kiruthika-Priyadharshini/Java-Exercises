package JavaProblemsolving.Collections;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class Employee2 {
    int id;
    String name;

    @Override
    public String toString() {
        return "Employee2 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    double salary;

    public Employee2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class Stack_Queue {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        stack.pop();
        System.out.println("Stack after pop" + stack);

        Queue<String> queue = new LinkedList<>();
        queue.add("Kiruthika");
        queue.add("Priya");
        queue.add("Dharshini");
        System.out.println(queue);
        queue.poll();
        System.out.println("queue after poll " + queue);

        PriorityQueue<Employee2> q = new PriorityQueue<>(Comparator.comparingDouble(emp -> emp.salary));
        q.add(new Employee2(101, "kiru", 50000));
        q.add(new Employee2(102, "priya", 70000));
        q.add(new Employee2(103, "dharshini", 60000));

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

    }
}
