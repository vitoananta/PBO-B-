package testlist;

import java.util.ArrayList;
import java.util.Collections;

public class Ticker {
    //list implementation
    private ArrayList<String> tickerNames = new ArrayList<>();

    //add without idx if idx == -1
    //add with idx
    public void addTickers(String tickerName, int idx){
        if(idx==-1)
            this.tickerNames.add(tickerName);
        else
            this.tickerNames.add(idx, tickerName);
    }

    //remove
    public void removeTickers(String tickerName){
        this.tickerNames.remove(tickerName);
    }

    public void sortTickers(){
        Collections.sort(tickerNames);
    }

    public void displayTickers(){
        int i=0;
        for(String ticker: tickerNames){
            System.out.println("ID: "+(i+1)+"\tTicker Name: "+ticker);
            i++;
        }
    }

    //driver program
    public static void main(String[] args) {
        Ticker ticker = new Ticker();
        ticker.addTickers("BBCA", -1); //add without idx
        ticker.addTickers("MDKA", -1); //add without idx
        ticker.addTickers("ANTM", -1); //add without idx
        ticker.addTickers("ASII", 2); //add with idx

        ticker.sortTickers();
        ticker.displayTickers();

        System.out.println();
        ticker.addTickers("INCO", 2);
        ticker.removeTickers("MDKA"); //remove
        ticker.displayTickers();
    }
}