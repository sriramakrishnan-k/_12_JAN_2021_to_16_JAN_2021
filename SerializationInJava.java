import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class A implements Serializable{

    public static int    staticVariable;
    public        String instanceVariable;

    static{
        staticVariable = 1000;
    }

    public A(String instanceVariable){
        this.instanceVariable = instanceVariable;
    } 

}

public class SerializationInJava {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) throws IOException{
        A obj = new A("This is a java program");

        System.out.println("Enter the file name ");
        
        File file = new File(sc.nextLine());
        if(!file.exists()){
            System.out.println("new file created" + file.createNewFile());
        }
        try(
            FileOutputStream  fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            )
        {
            objectOutputStream.writeObject(obj);
        }
    }
}
