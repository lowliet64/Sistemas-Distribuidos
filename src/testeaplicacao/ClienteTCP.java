/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeaplicacao;

/**
 *
 * @author 20182014040035
 */
import java.net.Socket;
import java.net .UnknownHostException;
import java.io.IOException;
import java.io.InputStream;

public class ClienteTCP {
    
    public ClienteTCP(){
        try {
              while (true){
            System.out.println("Estabelecendo uma conexãp");
            Socket s=  new Socket("10.25.4.51",1234);
            InputStream is= s.getInputStream();
            byte[] b = new byte [1000];
            is.read(b); 
            is.close();
            System.out.println("Dados:"+ new String(b).trim());
              }
        }catch(UnknownHostException uhe){
            uhe.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    
      public static void main(String[] args) {
         new ClienteTCP();
       
    }
    
}
