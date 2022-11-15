/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testset;

import java.util.HashSet;

/**
 *
 * @author Vito
 */
public class TestSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //set implementation with HashSet
        HashSet<Asset> portofolio = new HashSet<Asset>();

        Asset bonds = new Asset(1);
        Asset equity = new Asset(7);
        Asset cash = new Asset(2);

        //add
        portofolio.add(bonds);
        portofolio.add(equity);
        portofolio.add(cash);

        //contains
        System.out.println(portofolio.contains(bonds));
        System.out.println();

        findCoin(portofolio, equity);
        findCoin(portofolio, cash);
        System.out.println();

        //display with isEmpty methods
        displayBagContents(portofolio);
        displayBagDetails(portofolio);
        portofolio.clear();
        displayBagDetails(portofolio);
    }
    
    static void findCoin(HashSet<Asset> portofolio, Asset asset){
        if(portofolio.contains(asset))
            System.out.println("There is an asset with "+asset.getPortion()+" portion in the portofolio");
        else
            System.out.println("There is no asset "+asset.getPortion()+" in the portofolio");
    }
    
    static void displayBagContents(HashSet<Asset> portofolio){
        for(Asset asset: portofolio)
            System.out.println(asset.getPortion());
    }
    
    static void displayBagDetails(HashSet<Asset> portofolio){
        if(portofolio.isEmpty())
            System.out.println("There are no assets in the portofolio");
        else
            System.out.println("There are "+portofolio.size()+" assets in the portofolio");
    }
}
