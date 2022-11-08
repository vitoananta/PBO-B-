/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumgenericgenericmethod;

/**
 *
 * @author Vito
 */

public enum StockBroker {
    UBSSekuritasIndonesia("AK", "Foreign"),
    MiraeAssetSekurtiasIndonesia("BK", "Domestic"),
    MaybankSekuritasIndonesia("ZP", "Foreign");
    
    private String code;
    private String type;
    
    //constructor
    private StockBroker(String code, String type){
        this.code = code;
        this.type = type;
    }
    
    public String getCode(){
        return code;
    }
    
    public String getType(){
        return type;
    }
}
