import java.io.*;

import javax.lang.model.util.ElementScanner6;

class szukajTab {
static void szukaj (int tab[],int left,int right, int x){
    if (left>right)
    System.out.println(x + " nie znaleziony");
    else
    if (tab[left] == x)
    System.out.println("znaleziono element x: " + x);
    else 
    szukaj(tab, left+1, right, x);
} 
    public static void main(String[] args) 
    { 
        int tabl[] = {1,2,3,2,-7,44,5,1,0,-3};
        for(int i=0; i<tabl.length;i++)
        System.out.println("t["+i+"] = " + tabl[i] +"");
        szukaj(tabl, 0, tabl.length-1, 7);
        szukaj(tabl, 0, tabl.length-1, 5);
    } 
} 