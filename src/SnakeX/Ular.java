/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakeX;

/**
 *
 * @author USER
 */
abstract public class Ular extends Makanan {
    int panjang;
    int xKepala;
    int yKepala;
    int xEkor;
    int yEkor;
    int poin;
    String status;
    
    public Ular(){
        
    }
    public Ular(int xMakanan,int yMakanan, int panjang, int xKepala, int yKepala,int xEkor, int yEkor, int poin, String status){
        super(xMakanan, yMakanan);
        this.panjang=panjang;
        this.xKepala = xKepala;
        this.yKepala = yKepala;
        this.xEkor = xEkor;
        this.yEkor = yEkor;
        this.poin = poin;
        this.status = status;       
        
    }
    void setPanjang(int panjang){
      this.panjang=panjang;
    }
    void setXKepala(int xKepala){
        this.xKepala=xKepala;
    }
    void setYKepala(int yKepala){
        this.yKepala=yKepala;
    }
    void setXEkor(int xEkor){
        this.xEkor=xEkor;
    }
    void setYEkor(int yEkor){
        this.yEkor=yEkor;
    }
    int getPanjang(){
       return panjang;
    }
    int getXKepala(){
        if(xKepala == xAkhir ){
            xKepala = xAwal;
        }else if(xKepala == xAwal){
            xKepala = xAkhir;
        }else{
            xKepala = xKepala;
        }
        return xKepala;
    }
    int getYKepala(){
        if(yKepala == yAwal){
            yKepala = yAwal;
        }else if(yKepala == yAwal){
            yKepala = yAkhir;
        }else{            
            yKepala = yKepala;
        }        
        return yKepala;
    }
    int getXEkor(){
        return xEkor;
    }
    int getYEkor(){
        return yEkor;
    }
    abstract int makanBiasa();
    abstract int makanBonus();
    abstract int geserKanan();
    abstract int geserKiri();
    abstract int naik();
    abstract int turun();
    abstract String getStatus();
    abstract  int getPoin();
}