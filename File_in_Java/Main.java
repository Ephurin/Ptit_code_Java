package File_in_Java;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Laptop\\Documents\\Ptit_code_Java\\File_in_Java\\secret_message.txt");

        if (file.exists()){
            System.out.println("This file exists");
            System.out.println(file.getAbsolutePath());
        }
        else{
            System.out.println("This file does not exist");
        }
    }
}
