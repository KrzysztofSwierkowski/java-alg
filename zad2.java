public class zad2 {
    
static int binarySearch (int tab[], int x, int left, int right){
if (left > right)
return -1;

else {
    int mid = (left + right)/2;
if (tab[mid] == x)
return mid;
else
    if(x < tab[mid])
    return binarySearch(tab, x, left, mid-1);
        else 
        return binarySearch(tab, x, mid+1, right);
}
}

public static void main(String[] args) {
    int tabl[]={1, 2, 3, 6, 18, 20, 23, 29, 32,34, 39 ,40, 41};  
     for(int i=0; i<tabl.length; i++) 
        System.out.print(i+":"+tabl[i] + "  ");  
        System.out.println(); 
        System.out.println("Szukam 23, wynik: " + binarySearch(tabl, 23, 0, tabl.length-1));  
        System.out.println("Szukam 3, wynik: " + binarySearch(tabl, 3, 0, tabl.length-1)); 
}


}



