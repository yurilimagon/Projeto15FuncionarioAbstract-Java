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
public class Assistente extends Funcionario{
    //CONSTRUTORES
    //VAZIO
    public Assistente() {
        
    }
    //CHEIO
    public Assistente(String nome, double sal_base) {
        super(nome, sal_base);
    }
    
    //MÉTODO HERDADO
    @Override
    public double calcularSalario(){
        return (this.sal_base);
    }
}
