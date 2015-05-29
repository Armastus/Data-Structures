package HashTables;

/**
 * Created by David on 5/28/2015.
 */
public class HashTableProgram1 {

    public static void main(String[]args){

        int indexLength;

        HashClass hashObj = new HashClass();

        indexLength = hashObj.Hash("Paul");

        System.out.println(indexLength);
    }
}
