import javax.lang.model.util.ElementScanner6;
import javax.sound.sampled.SourceDataLine;

public class zad3 {

static void binary(int x)
{
if (x!=0) {
binary(x/2);
System.out.println(x%2);
}
else
System.out.println(0);
}


public static void main(String[] args) {
    for (int i=0; i<=100; i++)
    {
        System.out.println("Postać dwojkowa " + i +" :");
        binary(i);
        System.out.println();
    }
}

    
}