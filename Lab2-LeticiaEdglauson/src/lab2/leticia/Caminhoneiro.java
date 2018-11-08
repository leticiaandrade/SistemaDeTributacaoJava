/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.leticia;

import static lab2.leticia.Professor.c;

/*
* Aluna: Letícia Andrade e Edglauson
* Matrícula: 161080243
*/

public class Caminhoneiro extends Contribuinte implements Rodoviario{
    
    static int c = 0;
    static double media = 0.00; 
    private double nToneladas;

    public Caminhoneiro(String nome, double bensAcumulados) {
        super(nome, bensAcumulados);
        Main.caminhoneiros.add(this);
       c++;
        media = (media+bensAcumulados)/c;
    }

    
    protected void setTributo() {
       
        if(nToneladas <= 10.00){
            super.setTributo(500.00);
        } else {
            super.setTributo(500+(nToneladas-10)*100);
        }
    }

    
    
    
    public double getnToneladas() {
        return nToneladas;
    }

    public void setnToneladas(double nToneladas) {
        this.nToneladas = nToneladas;
        setTributo();
    }

    @Override
    public void descontoPorKM(double nKm) {
        
        super.setDesconto(nKm*taxaDesconto);
        
        
    
    }

  
    
    
    
}
