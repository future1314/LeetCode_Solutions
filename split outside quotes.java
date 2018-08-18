### Java: splitting a comma-separated string but ignoring commas in quotes

```java
import java.util.*;
import java.util.regex.*;  //only one level

public class Main {
    public static void main(String[] args){
    	String input = "123,test,444,\"don't split, this\",more test,1";
    	String regexPattern = "\"[^\"]*\"|[^,]+"; //* zero or more, + one or more
    	Pattern pattern = Pattern.compile(regexPattern);
    	List<String> list = new ArrayList<String>();
    	Matcher m = pattern.matcher(input);
    	while (m.find()) {
    	    list.add(m.group());
    	    System.out.println(m.group()); //Returns the input subsequence matched by the previous match.
    	}
    }
}
```
