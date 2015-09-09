
package complementos;


public class AlgoritimoInversao {
    private int array[];
    private int length;
    private int interations = 0;
    
    public void inverte(int[] inputArr){         
        if (inputArr == null || inputArr.length == 0 || inputArr.length == 1) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        run(0, length - 1);
    }
 
    private void run(int lowerIndex, int higherIndex) {        
        
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
