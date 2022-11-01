/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceabstract;

/**
 *
 * @author Vito
 */
public class InterfaceAbstractVitoFebrian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account acc1 = new Account("Ahmad Fauzan", "12345", 1000);
//        System.out.println(acc1.getBankName());
        acc1.deposit(3000);
        acc1.deposit(5000);
        acc1.print();
        
        CreditAccount acc2 = new CreditAccount("Apta Rasendriya", "98765", 1000);
//        System.out.println(acc1.getBankName());
        acc2.print();
        
        //polymorphism with instanceof
        System.out.println("\n\n");
        AbstractBankAccount[] listAll = new AbstractBankAccount[5];
        listAll[0] = acc1;
        listAll[1] = acc2;
        listAll[2] = acc1;
        listAll[3] = acc2;
        listAll[4] = acc1;
        
        for(AbstractBankAccount acc : listAll)
            if(acc instanceof Account)
                System.out.println("akun tabungan");
            else
                System.out.println("akun kredit");
    }
    
}