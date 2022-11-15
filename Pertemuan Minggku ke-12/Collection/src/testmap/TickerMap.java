/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testmap;

import java.util.HashMap;

/**
 *
 * @author Vito
 */
public class TickerMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,String> nasdaqIndex = new HashMap<>();

        //add
        addElements(nasdaqIndex);

        //display with getkey and getvalue methods
        displayElements(nasdaqIndex);

        //find value based on index
        findElement(nasdaqIndex, "BBCA");
    }
    
    static void addElements(HashMap<String,String> nasdaqIndex){
        nasdaqIndex.put("AAPL", "Apple Inc");
        nasdaqIndex.put("TSLA", "Tesla Inc");
        nasdaqIndex.put("NKE", "Nike Inc");
        nasdaqIndex.put("AMZN", "Amazon Inc");
    }
    
    static void displayElements(HashMap<String,String> nasdaqIndex){
        for(HashMap.Entry<String,String> ticker: nasdaqIndex.entrySet()){
            System.out.println("Ticker: "+ticker.getKey()+
                                " - Name:  "+ticker.getValue());
        }
    }
    
    static void findElement(HashMap<String,String> nasdaqIndex, String ticker){
        if(nasdaqIndex.containsKey(ticker)){
            System.out.println("The "+ticker+" is "+nasdaqIndex.get(ticker));
        }
        else{
            System.out.println("There is no "+ticker+" in nasdaq index");
        }
    }
}
