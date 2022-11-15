/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testlinkedlistqueue;

import java.util.LinkedList;

/**
 *
 * @author Vito
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        System.out.println("Linked list: " + queue);
        System.out.println("Queue Size: "+queue.size());

        while(!queue.isEmpty()){
            System.out.println(queue.removeFirst());
        }
        System.out.println("Linked list: "+queue);
    }

}