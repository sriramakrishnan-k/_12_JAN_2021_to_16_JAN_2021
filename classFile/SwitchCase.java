//package _12_JAN_2021_to_16_JAN_2021.classFile;

@FunctionalInterface
interface Lambda<argumentType,returnType>{
    abstract returnType function(argumentType arg);
}

public class SwitchCase {
    
    private static Lambda<String,Void> Case = (str)->{
                                                        System.out.println(str);
                                                     };
    
    public static void main(String[] args){
        
    }

    static Lambda<String,Void> caseSelection = (choice)->{
        switch(choice){

            case "first case":
                Case.function("This is the first case ");
                break;

            case "second case":
            Lambda<Integer,Void> Case_2 = (num)->{
                System.out.printf("This is a function for %d case\n",num);
             };
                Case_2(2);
        }
    }
}
