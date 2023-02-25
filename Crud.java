import java.util.Scanner;

class ArrayOperations{
    int arr[] ;
    int totalElements;
    ArrayOperations(int capacity){
        arr = new int[capacity];
        totalElements = 0;
    }
    void append(int value){
        if(totalElements<arr.length){
        arr[totalElements] = value;
        totalElements++;
        }
        else{
            throw new RuntimeException("Array is Full....");
        }
    }
    void insert(int index, int value){
        if(index>totalElements){
            throw new RuntimeException("Invalid Index to Add");
        }
        if(totalElements == arr.length-1){
            throw new RuntimeException("Array is Full....");
        }
        for(int i = totalElements-1; i>=index;i-- ){
            arr[i+1] = arr[i];
        }
        arr[index]  = value;
        totalElements++;


    }
    void remove(int index){
        if(index>totalElements){
            throw new RuntimeException("Invalid Index to Add");
        }
        if(arr.length==0){
            throw new RuntimeException("Array is Empty....");
        }
        for(int i = totalElements-1;i>=index; i-- ){
            arr[i-1] = arr[i];
        }
        arr[totalElements]= 0;
        totalElements--;

    }
    void print(){
        for(int i = 0 ; i<totalElements; i++){
            System.out.println(arr[i]);
        }
    }
}
public class Crud {
    public static void main(String[] args) {
            ArrayOperations opr = new ArrayOperations(10);
            Scanner scanner = new Scanner(System.in);
            while(true){
            System.out.println("1. insert");
            System.out.println("2. print");
            System.out.println("Enter the Choice...");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                opr.insert(0,10);
                opr.insert(1, 100);
                opr.insert(0, 1000);
                break;
                case 2:
                opr.print();
                break;
                default:
                System.out.println("invalid choice...");
            }
            scanner.close();
            }

        }    
}
