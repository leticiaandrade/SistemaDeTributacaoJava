/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.leticia;

/*
* Aluna: Letícia Andrade e Edglauson
* Matrícula: 161080243
*/

public class Professor extends Contribuinte{
    
    static int c = 0;
    static double media = 0.00;
    public Professor(String nome, double bensAcumulados) {
        super(nome, bensAcumulados);
        Main.professores.add(this);
        this.c++;
        media = (media+bensAcumulados)/c;
        
    }
    
    private double salario;
    final private double SALARIO_MINIMO = 954.00;

    public void setSalario(double salario) {
        this.salario = salario;
        setTributo();
    }

 
    protected void setTributo() {
        
        int nSalarios = (int) ( salario/SALARIO_MINIMO);
        if(nSalarios <= 1){
            super.setTributo((salario*5)/100);
        } else if(nSalarios <=5){
            
            super.setTributo((salario*10)/100);
        } else {
            
            super.setTributo((salario*20)/100);
            
        }
         
    }

    @Override
    protected void setDesconto(double gastos) {
        super.setDesconto((gastos*50)/100); 
    }
    
    
}
