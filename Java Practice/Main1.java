import java.util.*;

public class Main1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();  // String is a class, and s is an object
      String str[] = s.split(" ");
      for (int i = str.length-1; i >= 0; i--){
        System.out.println(str[i] + " ");
      }
      // StringBuilder sb = new StringBuilder(s);  // Reversing, updating, deleting and etc.. is easy using stringbuilder
      // sb.reverse();
      // sb.insert(0, "maturu ");
      // System.out.println(sb);
      // sb.delete(4, 8);
      // System.out.println(sb);
      // if (s.equals(sb)) { //s.equals(sb) here the strings are compared, s==sb checks addresses of the objects
      //   System.out.println("yes");
      // }      
      // else {
      //   System.out.println("no");
      // }
      // System.out.println(s.charAt(3));
      // System.out.println(s.substring(3,6));
      // System.out.println(s.substring(5));
      // String dummy = sc.nextLine();
      // dummy += s.substring(7, 11);
      // System.out.println(dummy);
      sc.close();
  }
}