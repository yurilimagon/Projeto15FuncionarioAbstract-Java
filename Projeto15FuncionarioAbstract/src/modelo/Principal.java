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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vendedor vendedor = new Vendedor(1000, "Vend1", 2000);
        Gerente gerente = new Gerente("Ger1", 4000);
        Assistente assistente = new Assistente("Assist", 2000);
        
        System.out.println("Vendedor \nNome: " + vendedor.getNome() + "\nSalário Base: " + 
                                                   vendedor.getSal_base() + "\nComissão: " + 
                                                   vendedor.getComissao() + "\nSalário: " + 
                                                   vendedor.calcularSalario());
        
        System.out.println("Gerente \nNome: " + gerente.getNome() + "\nSalário Base: " + 
                                                   gerente.getSal_base() + "\nSalário: " + 
                                                   gerente.calcularSalario());
        
        System.out.println("Assistente \nNome: " + assistente.getNome() + "\nSalário Base: " + 
                                                      assistente.getSal_base() + "\nSalário: " + 
                                                      assistente.calcularSalario());
    }
    
}
