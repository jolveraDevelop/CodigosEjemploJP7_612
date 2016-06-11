
package modulo8.printf;

import java.io.PrintWriter;

/**
 *
 * @author Roberto Olvera
 * 
 *  ■ Construction:
        %[arg_index$][flags][width][.precision]conversion char

    ■ arg_index.- An integer followed directly by a $, this indicates which 
        argument should be printed in this position.

    ■ flags While many flags are available, for the exam, you'll need to know:
        ■ - Left-justify this argument
        ■ + Include a sign (+ or -) with this argument
        ■ 0 Pad this argument with zeroes
        ■ , Use locale-specific grouping separators (i.e., the comma in 123,456.1393)
        ■ ( Enclose negative numbers in parentheses

    ■ width This value indicates the minimum number of characters to print. 

    ■ precision For the exam, you'll only need this when formatting a floating-
        point number, and in the case of floating-point numbers, precision indicates 
        the number of digits to print after the decimal point.

    ■ conversion The type of argument you'll be formatting. You'll need to know:
        ■ b boolean
        ■ c char
        ■ d integer
        ■ f floating point
        ■ s string
 */
public class TestPrintf {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);
        double price = 123456789.123456789;
        int quantity = -2;
        String color = "1";
        // We have  quantity Polo color shits that cost price
        System.out.printf("We have %d %s Polo shirts that cost is $%f \n",quantity,color,price);
        //System.out.printf("We have %d %s Polo shirts that cost is %f \n",color,price,quantity);
        System.out.printf("We have %3$d %1$s Polo shirts that cost is %2$f \n",color,price,quantity);
        System.out.printf("We have %010d %s Polo shirts that cost is %,3.4f \n",quantity,color,price);
        System.out.printf("We have %(4d %s Polo shirts that cost is %,3.4f \n",quantity,color,price);
        System.out.printf("We have %+4d %s Polo shirts that cost is %,3.4f \n",quantity,color,price);
        System.out.printf("We have %-10d %s Polo shirts that cost is %,3.4f \n",quantity,color,price);
        
        System.out.printf("We have %3$-10d %1$s Polo shirts that cost is %2$,3.4f \n",color,price,quantity);
        
        System.out.printf("We have %3$d %1$s Polo shirts that cost is %2$f \n",color,price,quantity);
        
        System.out.println("");
    }
}
