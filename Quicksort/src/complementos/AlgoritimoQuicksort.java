
package complementos;


public class AlgoritimoQuicksort {
    private int array[];
    private int length;
    private int interations = 0;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);        
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
        
         
        int i = lowerIndex;
        int j = higherIndex;        
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];        
        while (i <= j) {            
            while (array[i] < pivot) {
                i++;
                
            }
            while (array[j] > pivot) {
                j--;                
            }
            if (i <= j) {
                organizeNumbers(i, j);                
                this.setInterations(this.getInterations()+1);
                i++;
                j--;
            }
        }        
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void organizeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int getInterations() {
        return interations;
    }

    public void setInterations(int interations) {
        this.interations = interations;
    }
    
    
}
