package sorting;

/**
 * Created by UserPC on 1/7/2018.
 */
public class BubbleSort {

    static void bubbleSort(int [] elements) {

        for(int i = 0; i < elements.length-1; i++){
            System.out.println("tura nr: "+ (i+1));

            for (int j = i + 1; j < elements.length; j++) {

                if (elements[i] > elements[j]) {
                    int aux = elements[i];
                    elements[i] = elements[j];
                    elements[j] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] elems = {1, 4, 6, 8, 9, 10, 3};

        bubbleSort(elems);


        for(int i : elems){
            System.out.println(i);
        }

    }
}
