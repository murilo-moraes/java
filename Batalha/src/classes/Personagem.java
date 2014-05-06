package classes;

import java.util.Random;

public class Personagem {
    protected String nome;
    protected int vida;
    protected int forca;
    protected float agilidade;
    protected float modVida;
    protected float modForca;
    private Random numRand;
    
    public Personagem() {
        
    }
    
    //TODO: implementar nos construtores o nome do personagem.
    
    public String getNome() {
        return this.nome;
    }
    
    public int getVida() {
        return this.vida;
    }
    
    public int getForca() {
        return this.forca;
    }
    
    public int getAgilidade() {
        return this.agilidade;
    }
    
    public void calculaVida(int modificador) {
        this.vida = (int)((numRand.nextInt(10) + 1) * modificador);
    }
    
    public void calculaForca(int modificador) {
        this.forca = (int)((numRand.nextInt(10) + 1) * modificador);
    }
    
    public int ataque() {
        int atq = numRand.nextInt(6) + 1;
        
        if (atq == 1) {
            return ((int) (this.forca * 0.5));
        }
        if (atq == 6) {
            return ((int) (this.forca * 1.5));
        }
        
        return this.forca;
    }
    
    public void sofrerDano(int dano) {
        this.vida -= dano;
    }
}
