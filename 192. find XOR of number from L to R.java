/*package whatever //do not write package name here */
 
import java.io.*;
 
class GFG {
    // Function to return the XOR of elements
    // from the range [l, r]
    public static int findXOR(int l, int r)
    {
        int ans = 0;
        for (int i = l; i <= r; i++) {
            ans = ans ^ i;
        }
        return ans;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int l = 4;
        int r = 8;
 
        System.out.println(findXOR(l, r));
    }
}
