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
public abstract class Funcionario {
    //ATRIBUTOS
    protected String nome;
    protected double sal_base;
    
    //CONSTRUTORES
    //VAZIO
    public Funcionario() {
    }
    //CHEIO
    public Funcionario(String nome, double sal_base) {
        this.nome = nome;
        this.sal_base = sal_base;
    }
    
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSal_base() {
        return sal_base;
    }

    public void setSal_base(double sal_base) {
        this.sal_base = sal_base;
    }
    
    //MÉTODO
    public abstract double calcularSalario();
}
