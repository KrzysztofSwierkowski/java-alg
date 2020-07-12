
public class silnia{

public static void main(String[] args) {

    System.out.println(silnia2(8, 1));


    
    
}

static long silnia2(int x, long tmp) 
{
    if (x==0)
    return tmp;
    else 
    return silnia2(x-1, x*tmp);

}

}

