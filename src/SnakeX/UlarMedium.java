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
public class UlarMedium extends Ular {
    public UlarMedium(){
    }
    public UlarMedium(int xMakanan, int yMakanan, int panjang, int xKepala, int yKepala,int xEkor, int yEkor,int poin,  String status){
        super(xMakanan, yMakanan, panjang, xKepala, yKepala, xEkor, yEkor, poin, status);
    }
    int makanBiasa(){
        if((xKepala == xMakanan)&&(yKepala == yMakanan)){
            return poin + 2;
        }else{
            return poin;
        }  
    }
    int makanBonus(){
        if((xKepala == xMakanan)&&(yKepala == yMakanan)){
            return poin +3;
        }else{
            return poin;
        }  
    }
    int geserKanan(){
        return xKepala+2;
    }
    int geserKiri(){
        return xKepala - 2;
    }
    int naik(){
        return yKepala + 2;
    }
    int turun(){
        return yKepala - 2;
    }
    int getPoin(){
        return poin;            
    }
    String getStatus(){
        int i=0;
        int[]x = new int[1000];
        int[]y = new int[1000];
        for(i = xKepala; i<=xEkor; i++){
            x[i] = i;
        }
        for(i = yKepala ; i <= yEkor ; i++){
            y[i] = i;
        }
        for(i=xKepala; i<=1000;i++){
            
            if((xKepala == x[i]) || (yKepala == y[i])){
                    status = "Mati";
            }else{
                    status = "Masih Hidup";
            }
        
        }
        return status;
    }
}
