/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeaplicacao;

import java.net.ServerSocket;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;


public class Servidor  {
    
    public Servidor(){
        try {
            ServerSocket ss= new ServerSocket(1234);
            System.out.println("aguardando novas conexões");
            Socket s=ss.accept();
            OutputStream os= s.getOutputStream();
            byte[]b = "Mensagem 1".getBytes();
            os.write(b);
            os.close();
            System.out.println("Mensagem enviada para ");
        } catch (IOException ex) {
          ex.printStackTrace();
        }
    }
    
      public static void main(String[] args) {
         new Servidor();
       
    }
    
}
