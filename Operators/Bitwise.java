public class Bitwise {
    public static void main(String[] args){
      int valuea = 5; // 0101 in binary
      int valueb = 3; // 0011 in binary
      int resultand= valuea & valueb; // Bitwise AND
      int resultaor = valuea | valueb; // Bitwise OR
      System.out.println(resultaor); // Output: 7 (0111 in binary)
      System.out.println(resultand); // Output: 1 (0001 in binary)
      int resultxor = valuea ^ valueb; // Bitwise XOR
      System.out.println(resultxor); // Output: 6 (0110 in binary)
      int result = ~valueb; // Bitwise NOT
      System.out.println(result); // Output: -4 (inverts all bits of 0011)
      System.out.println(valueb<<2);
        // Output: 12 (0011 becomes 1100, which is 12 in decimal)
      System.out.println(valueb>>2);
        // Output: 0 (0011 becomes 0000, which is 0 in decimal)
      System.out.println(valueb>>>2);
        // Output: 0 (unsigned right shift, same as >> for positive numbers)
      System.out.println(valueb<<1);
        // Output: 6 (0011 becomes 0110, which is 6 in decimal)
    }

}
