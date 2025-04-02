```java
import java.util.Arrays;

public class ArrayUebung {
	public static void main(String[] args) {
		int[] zahlen = new int[5];
		int i = 0;
		while (i < zahlen.length) {
			zahlen[i] = i;
			i++;
		}
		
		System.out.println(Arrays.toString(zahlen));
	}
}
```

### Output: 

```
[0, 1, 2, 3, 4]
```