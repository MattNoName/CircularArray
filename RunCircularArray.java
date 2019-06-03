
package circulararray;

/**
 *
 * @author matt roberts
 */
public class RunCircularArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Character [] abcd=new Character[4];
        abcd[0]='a';
        abcd[1]='b';
        abcd[2]='c';
        abcd[3]='d';
        CircularArray circular_abcd;
        try{
            circular_abcd=new CircularArray(abcd);
        }
        catch (NullOrEmptyException e){
            System.out.println(e);
            System.out.println();
            return;
        }
        System.out.print(circular_abcd.getCurrent());
        circular_abcd.moveBackward();
        System.out.print(circular_abcd.getCurrent());
        circular_abcd.moveForward();
        System.out.print(circular_abcd.getCurrent());
        circular_abcd.moveForward();
        System.out.print(circular_abcd.getCurrent());
    }
    
}
