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


public class Medico extends Contribuinte{
    
    static double media = 0.00;
    private int nPacientes;
    final private double TAXA = 10.00;
    private double despesas = 0.00;
static int c= 0;    

    public Medico(String nome, double bensAcumulados) {
        super(nome, bensAcumulados);
        Main.medicos.add(this);
        this.c++;
        media = (media+bensAcumulados)/c;
       
    }

    public void setDespesas(double despesas){
        setDesconto(despesas);
        
    }
    
    protected void setTributo() {
        
        super.setTributo(nPacientes*10); 
    
    }

    public void setnPacientes(int nPacientes) {
        this.nPacientes = nPacientes;
        setTributo();
    }
    

    

    
}
