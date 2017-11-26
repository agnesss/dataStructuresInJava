package queue;

import java.util.IllegalFormatCodePointException;

/**
 * Created by UserPC on 11/26/2017.
 */
public class BasicQueue<X> implements Queue<X>{
    private X [] data;
    private int start, end, len, capacity;



public BasicQueue(int maxSize) {
    start = -1;
    end = -1;
    capacity = maxSize;
    len = 0;

    data = (X []) new Object[maxSize];
}

public void enQueue(X elem) {

    if(end == -1) {
        end = 0;
        start = 0;
        data[end] = elem;
        len++;
    } else
        if(end + 1 < capacity) {
            data[++end] = elem;
            len++;
        }
        else throw new IndexOutOfBoundsException("Queue is full");
}

   public X deQueue() {
       if(len == 0)
           throw new IllegalArgumentException("no data in the queue");

       if(start == end){
           X res = data[start];
           start = -1;
           end = -1;
           len--;
           return res;
       }
       else {
           len--;
           return data[start++];
       }
   }

   public int size() {
       return len;
   }

   public boolean contains(X elem){
       while(len > 0 ) {
           if(deQueue().equals(elem))
               return true;
       }
       return false;
   }

   public X access(int position) {
       if( start <= position && position <= end) {
           return data[position];
       }
       throw new IllegalArgumentException("Cannot find element");
   }


}


