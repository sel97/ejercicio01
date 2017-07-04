package cic.es.taller.ejercicio01;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int x1=4;
    	int x2= x1--;
    	int x3 = ++x2;
    	if(x2>x3) {
    		x1+=4;
    	}else {
    		x1++;
    	}
    	int resultado = x1+x2+x3;
        System.out.println( "Hello World!" + resultado);
    }
}
