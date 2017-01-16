/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakeX;

/**
 *
 * @author praktikan
 */
public class Makanan extends Ruang{
    int makananBiasa;
    int makananBonus;
    int xMakanan;
    int yMakanan;
    public Makanan(){
        
    }
    public Makanan(int xMakanan, int yMakanan){  
        this.xMakanan = xMakanan;
        this.yMakanan = yMakanan;
    } 
    public Makanan(int makananBiasa, int makananBonus,int xMakanan, int yMakanan){
        this.makananBiasa = makananBiasa;
        this.makananBonus = makananBonus;
        this.xMakanan = xMakanan;
        this.yMakanan = yMakanan;
    }
    
    void setXMakanan(int xMakanan){
        this.makananBiasa = xMakanan;
    }
    void setYMakanan(int yMakanan){
        this.yMakanan = yMakanan;
    }
    int getMakananBiasa(){
        return makananBiasa;
    }
    int getMakananBonus(){
        return makananBonus;
    }
    int getYMakanan(){
        return xMakanan;
    }
    int getXMakanan(){
        return yMakanan;
    }
}
