package application;

import java.io.IOException;

public class clean {
    public void clear() throws IOException, InterruptedException {

        if (System.getProperty("os.name").contains("Windows")){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        }
            
        else{
            Runtime.getRuntime().exec("clear");
        }
    }
}
