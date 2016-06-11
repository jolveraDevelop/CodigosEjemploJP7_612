
package modulo8.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Roberto Olvera
 *  ■ Character Classes
    asd#ab$ch0f9gab_ki "."
    asdabchfgabcki "abc"
    asda#chfga-cki "[a-c]"
    asda#chfga-cki "[^a-c]"
    aida#chfga-cki "[a-c]|[f-i]"
    "It was the best of times" "w.s"
    "It was the best of times" "w[abc]s"
    "It was the best of times" "t[^aeo]mes"

    ■ Predefined Character Classes
    \d (digit)[0-9]
    \D [^0-9]
    \w (word char)[a-zA-Z0-9_]
    \W [^a-zA-Z0-9_] 
    \s (white space) [ \r\t\n\f\0XB] 
    \S [^ \r\t\n\f\0XB]
    "Jo told me 20 ways to San Jose in 15 minutes." "\d\d"
    "Jo told me 20 ways to San Jose in 15 minutes." "\sin\s"
    "Jo told me 20 ways to San Jose in 15 minutes." "\Sin\S"

    ■ Quantifiers 
    * Zero or more times. 
    + One or more times. 
    ? Once or not at all (0 or 1). 
    {n} Appears exactly n times. 
    {m,n} Appears from m to n times. 
    {m,} Appears m or more times. 
    (xx){n} This group of characters repeats n times. 
    "Longlonglong ago, in a galaxy far far away" "ago.*"
    "Longlonglong ago, in a galaxy far far away" "gal.{3}"
    "Longlonglong ago, in a galaxy far far away" "(long){2}"
    "Longlonglong ago, in a galaxy far far away" "[long]{2}"

    ■ Greediness (Gula)
    "Longlonglong ago, in a galaxy far far away" "ago.*far"
    "Longlonglong ago, in a galaxy far far away" "ago.*?far"

    ■ Boundary Matchers 
    ^ Matches the beginning of a line 
    $ Matches the end of a line 
    \b Matches the start or the end of a word 
    \B Does not match the start or end of a word
    "it was the best of times or it was the worst of times" "it.*?times" 
    "it was the best of times or it was the worst of times" "^it.*?times"    
    "it was the best of times or it was the worst of times" "\sit.*?times$"
    "it was the best of times or it was the worst of times" "it.*?times"
    "it was the best of times or it was the worst of times" "it.*?times$"
    "it was the best of times or it was the worst oftimes" "\bti.es"
    "it wasthe best of times or it was theworst of times" "the\b"

    ■ Matching and Groups  
    "##9h_banuelos@7i.com.mx.bz#9hbanuelos7i.com#9hbanuelos@7i.com#" "[a-zA-Z]\w*@\w+(\.\w+){1,2}"

    ■ Using the replaceAll Method 
       "<h1>This is an h1</h1>" "h1"
 */
public class TestPatternMatcher {
    public static void main(String[] args) {
        
        String rex = "h1";
        String fuente = "<h1>This is an h1</h1>";
        
        Pattern pat = Pattern.compile(rex);
        Matcher match = pat.matcher(fuente);
        
        System.out.println("Source: " + fuente);
        System.out.println("Expression: " + match.pattern());
        System.out.print("Match Positions: ");
        
        while (match.find()) {
            System.out.print(match.start() + " ");
        }
        System.out.println("\nFound:");
        int i = 1;
        match.reset();
        String header = "";
        //while (match.find()) {
            match.find();
            header = match.replaceAll("p");
            //System.out.println((i++) + ": " + match.group());
            System.out.println(header);
        //}
    }
}
