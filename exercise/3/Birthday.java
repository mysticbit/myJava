/* Exercise for Chapter 3 : 
 * Create a program that turns a birthday in MM/DD/YYYY firnat 
 * (such as 12/04/2007) into three individual strings.
 */

import java.util.StringTokenizer;

class Birthday {
    public static void main(String args[]) {
        String birthday = "12/04/2007";
        String format;
        String one, two, three;

        format = birthday.replace('/', ' ');
        
        StringTokenizer st = new StringTokenizer(format);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
}
}
}
