   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;
import java.awt.Color;
import java.lang.Math; 
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author luizviniciusruoso
 */

//Heranca
public class Bloco extends Animacao{
    String Cor;
    int Valor;
    JPanel Posicao;
    JLabel campoTexto;
    int Situacao;
    
    public Bloco(){
      
        
        return;
    }

    public Bloco(String Cor, int Valor, JPanel Posicao, JLabel campoTexto, int Situacao) {
        this.Cor = Cor;
        this.Valor = Valor;
        this.Posicao = Posicao;
        this.campoTexto = campoTexto;
        this.Situacao = Situacao;
    }
    
    
    public void GeraBloco(int posicao){
        
        this.Valor = GeraValor();
        this.Situacao = 1;
        
        if(this.Valor == 2) this.Cor = "#eee4da";
        else this.Cor = "#EDE0C8";
        
        
        
    }
    
    
    //Funcao GeraValor = Gera Valor Inicial de Blocos (2 ou 4)
    public int GeraValor() { 
         int min = 1;
         int max = 4;
         int ValorRand = (int) ((Math.random()*((max-min)+1))+min);
         if(ValorRand == 4) {
             return ValorRand;
         }else
            return 2;
    }
    
    //Getters
    public String getCor() {
        return Cor;
    }
    

    public int getSituacao() {
        return Situacao;
    }

    public int getValor() {
        return Valor;
    }
    
    
    //Setters
    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public void setSituacao(int Situacao) {
        this.Situacao = Situacao;
        
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
        if(Valor == 0) this.campoTexto.setText("");
        else this.campoTexto.setText(String.valueOf(Valor));
        
    }

    public JPanel getPosicao() {
        return Posicao;
    }
    
    public void setPosicao(JPanel posicao, Color cor) {
        this.Posicao = posicao;
        this.Posicao.setBackground(cor);
    }

    public JLabel getCampoTexto() {
        return campoTexto;
    }

    public void setCampoTexto(JLabel campoTexto) {
        this.campoTexto = campoTexto;
    }
   

  

    
    
    
    
    
    
    
    
    
}
