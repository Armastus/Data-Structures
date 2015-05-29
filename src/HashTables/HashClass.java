package HashTables;

/**
 * Created by David on 5/28/2015.
 */
public class HashClass {

    public int Hash(String key){
        int hash = 0;
        int index;
        int tableSize = 100;

        //This will give us the length of the string.
        index = key.length();

        System.out.println("This will show the characters in each index.");
        //This will show the characters in each index.
        System.out.println("Key[0] = " + key.charAt(0));
        System.out.println("Key[1] = " + key.charAt(1));
        System.out.println("Key[2] = " + key.charAt(2));
        System.out.println("Key[3] = " + key.charAt(3));

        System.out.println();
        System.out.println("(int) wraps the ASCII value around the charAt index.");
        //(int) wraps the ASCII value around the charAt index.
        System.out.println("Key[0] = " + (int)key.charAt(0));
        System.out.println("Key[1] = " + (int)key.charAt(1));
        System.out.println("Key[2] = " + (int)key.charAt(2));
        System.out.println("Key[3] = " + (int)key.charAt(3));

        System.out.println();
        System.out.println("One at a time add up the value of where the (int)key.CharAt values and show them.");
        //One at a time add up the value of where the (int)key.CharAt values and show them.
        for(int x = 0; x < key.length(); x++){
            hash = hash + (int)key.charAt(x);
            System.out.println("hash = " + hash);
        }

        System.out.println();
        System.out.println("Length of the string passed in." + index);
        return index;
    }
}
