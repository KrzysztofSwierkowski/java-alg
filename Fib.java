class Fib {

    static long fib(int x ){
        if (x<2)
        return x;
        else
        return fib(x-1)+ fib(x-2);
    }

    public static void main(String[] args) {

        for (int i=1; i< 50; i++)
        System.out.println("fib["+ i + "]=" + fib(i));
        
    }
}