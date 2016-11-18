package speedcompare;

import java.util.ArrayList;
import java.util.LinkedList;

public class SpeedCompare {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList(); 
        LinkedList<String> linkedList = new LinkedList(); 
        
        for(int i = 0; i < 100; i++){
            arrayList.add(Integer.toString(i));
            linkedList.add(Integer.toString(i));
        }
        
        long start = 0, end = 0, arraySpeed = 0, linkedSpeed = 0; 
        
        start = System.nanoTime();
        arrayList.set(0, ":D");
        end = System.nanoTime();
        arraySpeed = end - start;
        
        start = System.nanoTime();
        linkedList.set(0, ":P");
        end = System.nanoTime();
        linkedSpeed = end - start;
        
        System.out.println("Test wstawiania na początek");
        compare(arraySpeed, linkedSpeed);
        
        
        
        start = System.nanoTime();
        arrayList.set(50, ":D");
        end = System.nanoTime();
        arraySpeed = end - start;
        
        start = System.nanoTime();
        linkedList.set(50, ":P");
        end = System.nanoTime();
        linkedSpeed = end - start;
        
        System.out.println("\nTest wstawiania do środka");
        compare(arraySpeed, linkedSpeed);
        
        
        
        start = System.nanoTime();
        arrayList.set(99, ":D");
        end = System.nanoTime();
        arraySpeed = end - start;
        
        start = System.nanoTime();
        linkedList.set(99, ":P");
        end = System.nanoTime();
        linkedSpeed = end - start;
        
        System.out.println("\nTest wstawiania na koniec");
        compare(arraySpeed, linkedSpeed);
        
        
        
        start = System.nanoTime();
        arrayList.remove(0);
        end = System.nanoTime();
        arraySpeed = end - start;
        
        start = System.nanoTime();
        linkedList.remove(0);
        end = System.nanoTime();
        linkedSpeed = end - start;
        
        System.out.println("\nTest usuwania z początku");
        compare(arraySpeed, linkedSpeed);
        
        
        
        start = System.nanoTime();
        arrayList.remove(50);
        end = System.nanoTime();
        arraySpeed = end - start;
        
        start = System.nanoTime();
        linkedList.remove(50);
        end = System.nanoTime();
        linkedSpeed = end - start;
        
        System.out.println("\nTest usuwania ze środka");
        compare(arraySpeed, linkedSpeed);
        
        
        
        start = System.nanoTime();
        arrayList.remove(97);
        end = System.nanoTime();
        arraySpeed = end - start;
        
        start = System.nanoTime();
        linkedList.remove(97);
        end = System.nanoTime();
        linkedSpeed = end - start;
        
        System.out.println("\nTest usuwania z końca");
        compare(arraySpeed, linkedSpeed);
        
        
        
        start = System.nanoTime();
        arrayList.get(0);
        end = System.nanoTime();
        arraySpeed = end - start;
        
        start = System.nanoTime();
        linkedList.get(0);
        end = System.nanoTime();
        linkedSpeed = end - start;
        
        System.out.println("\nTest zwracania pierwszego elementu");
        compare(arraySpeed, linkedSpeed);
        
        
        
        start = System.nanoTime();
        arrayList.get(50);
        end = System.nanoTime();
        arraySpeed = end - start;
        
        start = System.nanoTime();
        linkedList.get(50);
        end = System.nanoTime();
        linkedSpeed = end - start;
        
        System.out.println("\nTest zwracania środkowego elementu");
        compare(arraySpeed, linkedSpeed);
        
        
        
        start = System.nanoTime();
        arrayList.get(96);
        end = System.nanoTime();
        arraySpeed = end - start;
        
        start = System.nanoTime();
        linkedList.get(96);
        end = System.nanoTime();
        linkedSpeed = end - start;
        
        System.out.println("\nTest zwracania ostatniego elementu");
        compare(arraySpeed, linkedSpeed);
        
    }
    
    static void compare(long arraySpeed, long linkedSpeed){
        if(arraySpeed > linkedSpeed){
            System.out.println("Linked list jest szybsza o: " + (arraySpeed - linkedSpeed) + " nanosekund");
        } else if(linkedSpeed > arraySpeed){
            System.out.println("Array list jest szybsza o: " + (linkedSpeed - arraySpeed) + " nanosekund");
        } else if(arraySpeed == linkedSpeed){
            System.out.println("Listy uzyskały tą samą prędkość jest to: " + linkedSpeed + " nanosekund");
        }
    }
    
}
