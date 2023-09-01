/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GamePvP;

/**
 *
 * @author Aluno
 */
public class Tanque extends Carro {

    /**
     *
     * @param nome
     */
    public Tanque(String nome){
        super(nome);
        this.municao += 2;
        this.escudo += 80;
        this.modeloCarro = 1;
    }
}
