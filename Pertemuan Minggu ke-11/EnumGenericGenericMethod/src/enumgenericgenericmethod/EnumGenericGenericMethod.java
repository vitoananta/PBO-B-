/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumgenericgenericmethod;

/**
 *
 * @author Vito
 */
public class EnumGenericGenericMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //enum
        StockBroker Broker1 = StockBroker.UBSSekuritasIndonesia;
        System.out.println("Broker Name: "+ Broker1+
                           "\nBroker Code: "+Broker1.getCode()+
                           "\nBroker Type: "+Broker1.getType()+"\n");
        
        StockBroker Broker2 = StockBroker.MiraeAssetSekurtiasIndonesia;
        System.out.println("Broker Name: "+ Broker2+
                           "\nBroker Code: "+Broker2.getCode()+
                           "\nBroker Type: "+Broker2.getType()+"\n");
        
        StockBroker Broker3 = StockBroker.MaybankSekuritasIndonesia;
        System.out.println("Broker Name: "+ Broker3+
                           "\nBroker Code: "+Broker3.getCode()+
                           "\nBroker Type: "+Broker3.getType()+"\n");
        
        //Generic Class
        MarketCap<Integer> mc1 = new MarketCap<>();
        MarketCap<Double> mc2 = new MarketCap<>();
        MarketCap<String> mc3 = new MarketCap<>();
        mc1.setValue(5);
        mc2.setValue(1078.66);
        mc3.setValue("Big Cap");
        int marketCap = mc1.getValue();
        double marketCapDetail = mc2.getValue();
        String marketCapRange = mc3.getValue();
        
        System.out.println("Market Cap: "+marketCap+"T");
        System.out.println("Market Cap: "+marketCapDetail+"T");
        System.out.println("Market Cap: "+marketCapRange);
        System.out.println("");
        
        //Generic Method
        PrintMethod print1 = new PrintMethod();
        
        Integer[] totalCap = {21, 93, 03};
        String[] capList = {"Small", "Medium", "Big"};
        
        System.out.println("Total Cap:");
        print1.printArray(totalCap);
        System.out.println("");
        System.out.println("Cap List:");
        print1.printArray(capList);
    }
    
}
