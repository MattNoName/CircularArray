
package circulararray;

/**
 * An array that allows you to have a current index, move forward an index, move backward an index, and go from beginning to end or end to beginning
 * @author matt roberts
 */
public class CircularArray <T>{
    
    private T [] valuesArray;
    private int currentIndex=0;
    
    /**
     * Pass in an array.  Array's size cannot change.
     * @param valuesArray the array
     * @throws NullOrEmptyException if an empty or null array is passed in
     */
    public CircularArray(T [] valuesArray) throws NullOrEmptyException{
        if (valuesArray==null ||valuesArray.length==0){
            throw new NullOrEmptyException("The array passed into the CircularArray was null or empty");
        }
        this.valuesArray=valuesArray;
    }
    
    /**
     * Gets the size.
     * @return the sized of the array
     */
    public int size(){
        return valuesArray.length;
    }
    
    /**
     * Gets the object at the index
     * @param index the index to get from
     * @return the object found or null if no object is there
     */
    public T get(int index){
        return valuesArray[index];
    }
    
    /**
     * Sets the object at the given index.
     * @param index the index to assign the object to.
     * @param object the object to assign to the index in the array.
     * @return the object that was there or null if there wasn't an object there.
     */
    public T set(int index, T object){
        T oldObj=valuesArray[index];
        valuesArray[index]=object;
        return oldObj;
    }
    
    /**
     * Moves the current index forward or goes back to index 0.
     */
    public void moveForward(){
        if (currentIndex==valuesArray.length-1){
            currentIndex=0;
        }
        else{
            currentIndex++;
        }
    }
    
    /**
     * Moves the current index backward or goes back to the last index.
     */
    public void moveBackward(){
        if (currentIndex==0){
            currentIndex=valuesArray.length-1;
        }
        else{
            currentIndex++;
        }
    }
    
    /**
     * Gets the object at the index that is the current index.
     * @return the object at the index or null if there wasn't one there.
     */
    public T getCurrent(){
        return valuesArray[currentIndex];
    }
}
