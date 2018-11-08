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

public abstract class Contribuinte {
    
    static private int contador = 1;
    private String nome;
    private int numero;
    private double bensAcumulados = 0.00;
    private double tributo = 0.00;
    private double imposto = 0.00;
    private double desconto = 0.00;

    public Contribuinte(String nome, double bensAcumulados) {
        this.nome = nome;
        this.bensAcumulados = bensAcumulados;
        
        this.numero = contador;
        contador++;
    }

    /**
     * @return  nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome  nome para setar
     */
    private void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return  numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero  numero para setar
     */
    protected void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return  bensAcumulados
     */
    public double getBensAcumulados() {
        return bensAcumulados;
    }

    /**
     * @param bensAcumulados  bensAcumulados para setar
     */
    protected void setBensAcumulados(double bensAcumulados) {
        this.bensAcumulados = bensAcumulados;
    }

    /**
     * @return  imposto
     */
    public double getImposto() {
        return imposto;
    }

    /**
     * @param imposto  imposto para setar
     */
    protected void setImposto() {
        if(desconto < tributo){
        this.imposto = tributo - desconto; 
        }else{ 
            this.imposto = 0.00;
        }
    }

    /**
     * @return  desconto
     */
    public double getDesconto() {
        return desconto;
    }

    /**
     * @param desconto  desconto para setar
     */
    protected void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTributo() {
        return tributo;
    }

    protected void setTributo(double tributo) {
        this.tributo = tributo;
    }
    
    
    

}
