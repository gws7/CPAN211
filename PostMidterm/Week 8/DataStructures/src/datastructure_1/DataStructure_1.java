/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author user
 */
public class DataStructure_1 {
    static void mapExample1()
    {
        //Note: LinkedHashMap maintains the order of insertion.
         Map<Integer, String> map = new LinkedHashMap<>();
        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");

        List<String> names = new ArrayList<String>();
        

        System.out.println("LinkedHashMap: " + map);
    }
    static void mapExample2()
    {
        Map<String, Integer> map = new HashMap<>();

        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 22);

        System.out.println("HashMap: " + map);  
        System.out.println("Bob's age: " + map.get("Bob")); 

        map.remove("Alice");
        System.out.println("After removing Alice: " + map);

        System.out.println("Keys: " + map.keySet());  
        System.out.println("Values: " + map.values());  
        System.out.println("Entries: " + map.entrySet());  
    }
    
    
    static void stackExample(){
       Stack<Integer> stack = new Stack<>();        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);  // [10, 20, 30]
        System.out.println("Top Element: " + stack.peek()); // 30

        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Stack after pop: " + stack); // [10, 20]

        System.out.println("Is stack empty? " + stack.isEmpty()); // false
    }
    static void queueExample(){
     Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);


        System.out.println("Queue: " + queue);  // [10, 20, 30]
        System.out.println("Front: " + queue.peek()); // 10

        System.out.println("Dequeued: " + queue.poll()); // 10
        System.out.println("Queue after poll: " + queue); // [20, 30]
    }
    public static void main(String[] args) {
        // Set is a collection that does not allow duplicate elements
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");  // Duplicate, won't be added

        System.out.println(set);  // Output: [Orange, Banana, Apple] (order may vary)
    }
    
}

