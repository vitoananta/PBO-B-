/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumgenericgenericmethod;

/**
 *
 * @author Vito
 */
public class PrintMethod {
    public <T> void printArray(T[] array){
        for(T item : array){
            System.out.println(item);
        }
    }
}
