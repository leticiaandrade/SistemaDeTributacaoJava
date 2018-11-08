/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.leticia;

import static lab2.leticia.Professor.c;
import static lab2.leticia.Rodoviario.taxaDesconto;

/*
* Aluna: Letícia Andrade e Edglauson
* Matrícula: 161080243
*/


public class Taxista extends Contribuinte implements Rodoviario{
    
    static double media = 0.00; 
    private final double TAXA = 0.5; 
    private int nPassageiros;
    static int c = 0;
    
    public Taxista(String nome, double bensAcumulados) {
        super(nome, bensAcumulados);
        Main.taxistas.add(this);
        c++;
        media = (media+bensAcumulados)/c;
    }

    public void setnPassageiros(int nPassageiros) {
        this.nPassageiros = nPassageiros;
        setTributo();
        
        
    }

    
    protected void setTributo() {
        super.setTributo(nPassageiros*TAXA); 
    }
    
      @Override
    public void descontoPorKM(double nKm) {
        
        super.setDesconto(nKm*taxaDesconto);
        
        
    
    }
    
    
}
