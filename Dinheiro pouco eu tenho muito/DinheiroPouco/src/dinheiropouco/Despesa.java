/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinheiropouco;

import javax.swing.JOptionPane;

/**
 *
 * @author e6661387
 */
public class Despesa extends Lancamento{
          

           
  public int removerValorSaldo(){
        
     setSaldo(0);
     
     return super.saldo;
    }
    
    public boolean efetuarTransacao(boolean efetuarTransacao){
     

        if(efetuarTransacao == true){
            
             return true;
        } else {
         return false;   
        }
        
    }
}
