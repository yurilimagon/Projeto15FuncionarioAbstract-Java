/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class Vendedor extends Funcionario{
    //ATRIBUTOS
    private double comissao;
    
    //CONSTRUTORES
    //VAZIO
    public Vendedor(){
        
    }
    //CHEIO
    public Vendedor(double comissao, String nome, double sal_base){
        super(nome, sal_base);
        this.comissao = comissao;
    }
    //GETTER E SETTER
    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    //MÉTODO HERDADO
    @Override
    public double calcularSalario(){
        return (this.sal_base + this.comissao);
    }
}
