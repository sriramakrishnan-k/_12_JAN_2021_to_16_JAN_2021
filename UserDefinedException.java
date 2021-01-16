import java.util.Scanner;

class UserDefinedException{
    public static void main(String[] args){
        int speed, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the speed (positive value only allowed)");
        try{
            if( ( temp = sc.nextInt() )  >  0 ){
                if( temp  <  101 ){
                    speed = temp;
                    System.out.println("speed = "+ speed);
                }
                else{
                    throw new ValueOutOfMaximum(temp);
                }
            }
            else{
                throw new NegativeValue(temp);
            }
         }

        catch(NegativeValue negativeValue){
            negativeValue.getMessage();
        }
        
        catch(ValueOutOfMaximum valueOutOfMaximum){
            valueOutOfMaximum.getMessage();
        }

        finally{
            System.out.println("WELCOME");
        }

    }
}

class NegativeValue extends Exception
{
    private int value;

    public NegativeValue(int value){
        super();
        this.value = value;
    }

    public String getMessage(){
        System.out.printf("%d is a negative value\n",this.value);
        System.out.println("The value should be positive and negative value are not allowed");
        return null;
    }
}
class ValueOutOfMaximum extends Exception
{
    private int value;

    public ValueOutOfMaximum(int value){
        super();
        this.value = value;
    }

    public String getMessage(){
        System.out.printf("%d is a out of range(greater than maximum) value\n",this.value);
        System.out.println("The value should be in range(0 - 100)");
        return null;
    }
}


