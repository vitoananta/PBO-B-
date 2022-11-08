/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumgenericgenericmethod;

/**
 *
 * @author Vito
 */
public class MarketCap<T> {
    private T data;
    
    public void setValue(T marketvalue){
        data = marketvalue;
    }
    
    public T getValue(){
        return data;
    }
}
