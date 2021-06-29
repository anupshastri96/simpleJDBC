import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Practice {
	

		public static void main(String[] args) {
			
			String[] array = new String[] {"Hello","Hello","World","World"};
			List<String> a= Arrays.asList(array);
			array.toString();
			
			
			//char[] char = a.
			
			HashMap<String,Integer> wordCount = new HashMap<String,Integer>();
			
			for(String a1 : array) {
				if(wordCount.containsKey(a1)) {
					wordCount.replace(a1, wordCount.get(a1)+1);
				} else
				{
					wordCount.put(a1, 1);
				}
			}
			System.out.println(wordCount);
			//System.out.println(null);

		

}
		
		interface myGenericInterface<T>{
			public T work(T t);
		}
}
