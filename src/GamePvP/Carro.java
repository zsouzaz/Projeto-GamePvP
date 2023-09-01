/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GamePvP;

/**
 *
 * @author Aluno
 */
public class Carro {

    /**
     *
     */
    protected int modeloCarro;

    /**
     *
     */
    protected String nome;

    /**
     *
     */
    protected int vida = 100;

    /**
     *
     */
    protected int escudo = 0;

    /**
     *
     */
    protected int municao = 3; 

    /**
     *
     */
    protected boolean vivo = true;

    /**
     *
     * @return
     */
    public boolean isVivo() {
        return vivo;
    }
    
    /**
     *
     * @param nome
     */
    public Carro(String nome){
        this.nome = nome;
    }
    
    /**
     *
     */
    public void atirar(){
        this.municao--;
    }
    
    /**
     *
     * @param carro
     */
    public void atirar(Carro carro){
        this.municao--;        
        if (this.modeloCarro == 1) { 
            if(carro.modeloCarro == 1) {
                System.out.println("Carro tanque sofreu 30 de dano.");
                
            } else System.out.println("Carro atirador sofreu 30 de dano.");            
                if (carro.escudo<30){
                    carro.vida -= (30-carro.escudo);
                    carro.escudo = 0;
                }else{
                    if (carro.escudo>=30){
                        carro.escudo -= 30;
                    }
                }
            if (carro.vida <= 0) {
                carro.vida = 0;
                carro.vivo = false;
                System.out.println("Veículo detonado!");
            }
        }
        if (this.modeloCarro == 2) {
            if(carro.modeloCarro == 1) {
                System.out.println("Carro tanque sofreu 50 de dano.");
            } else System.out.println("Carro atirador sofreu 50 de dano");
            
                if (carro.escudo<50){
                    carro.vida -= (50-carro.escudo);
                    carro.escudo = 0;
                }else{
                    if (carro.escudo>=50){
                        carro.escudo -= 50;
                    }
                }
            if (carro.vida <= 0) {
                carro.vida = 0;
                carro.vivo = false;
                System.out.println("Veiculo detonado!");
            }
        }        
    }

    /**
     *
     */
    public void mostraStatus(){
        System.out.printf("\n\nVeicuo: %S", this.nome);
        System.out.printf("\nVida: %d", this.vida);
        System.out.printf("\nEscudo: %d", this.escudo);
        System.out.printf("\nMunicao: %d", this.municao);
        if(vivo == true) {
            System.out.print("\nVeiculo inteiro.");
        }
        if(vivo == false) {
            System.out.print("\nVeiculo destruido.");
        }
    }
    
    /**
     *
     * @return
     */
    public int mostraMunicao(){
        return this.municao;
    }
}
