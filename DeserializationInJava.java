
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Scanner;

class A implements Serializable{

    public static int    staticVariable;
    public        String instanceVariable;

    static{
        staticVariable = 0;
    }

    public A(String instanceVariable){
        this.instanceVariable = instanceVariable;
    } 

}

public class DeserializationInJava {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) throws IOException,ClassNotFoundException{

        System.out.println("Enter the file name ");
        
        File file = new File(sc.nextLine());
        if(!file.exists()){
            System.out.println("new file created" + file.createNewFile());
        }
        try(
            FileInputStream  fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            )
        {
            A obj = (A)objectInputStream.readObject();
            System.out.println(obj.instanceVariable);
        }
    }
}
