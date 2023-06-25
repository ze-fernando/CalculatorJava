package entities;
import java.io.IOException;



public class Calculator {

    public double x1;    
    public double x2;
    public double res;
    final double PI = 3.14;
    public double f;

    public void clear() throws IOException, InterruptedException {

    if (System.getProperty("os.name").contains("Windows")){
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        
    else{
        Runtime.getRuntime().exec("clear");
        }
    }

    public double raizQuadrada(double num){
        return Math.sqrt(num);
    }

    public double raizCubica(double num){
        return Math.cbrt(num);
    }

    public void baskara(double a, double b, double c){
        double delta = Math.pow(b, 2) - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
    }

    public double porcentagem(double num, double percent){
        return percent / 100 * num;
    }

    public void teoremaPitagoras(double a, double b){
        double ax = Math.pow(a, 2);
        double bx = Math.pow(b, 2);
        double x = ax + bx;
        res = Math.sqrt(x);
    }

    public double convert(double c){
        return c * 1.8 + 32;
    }
    
   public double fatorialInterativo(double numero){
        double fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        return fatorial;
        }

}
