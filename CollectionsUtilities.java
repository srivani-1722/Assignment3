import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

public class CollectionsUtilities {
	//Q1
	List<String> removeElemtAtIndex(List<String> arrayList,int index) {
		arrayList.remove(index);
		return arrayList;
	}
	//Q2
	Object[] listtoArray(List<String> arrayList) {
	      Object[] arr = arrayList.toArray();
	      return arr;
	}
	//Q3
	public  List<String> arrayToList(Object[] array)   
	{   
		List<String> list = new ArrayList<>();   
		for (Object data : array)   
		{   
			list.add((String) data);   
		}   
		return list;   
	} 
	//Q4
	List<String> copyListtoNewList(List<String> arrayList) {
	      List<String> list = new ArrayList<String>(arrayList);
	      return list;
	}
	//Q5
	int mininList(List<Integer> numList) {
		return Collections.min(numList);
	}
	//Q6
	int maxinList(List<Integer> numList) {
		return Collections.max(numList);
	}
	//Q7
	Enumeration<String> listToEnumeration(List<String> list){
		return Collections.enumeration(list);
	}
	//Q8
	List<String> listToSynchronizedList(List<String> list){
		return Collections.synchronizedList(list);
	}
	//Q9
	Map<String,String> mapToSynchronizedMap(Map<String,String> map){
		return Collections.synchronizedMap(map);
	}
	//Q10
	List<String> reverseList(List<String> list){
		 Collections.reverse(list);
		 return list;
	}
	//Q11
	List<String> shuffleList(List<String> list){
		 Collections.shuffle(list);
		 return list;
	}
	//Q12
	List<Integer> descendingOrder(List<Integer> list){
		Collections.sort(list,new Comparator<Integer>() {
		   
			@Override
			public int compare(Integer num1, Integer num2) {
				if (num1== num2)
		            return 0;
		        else if (num1 > num2)
		            return 1;
		        else
		            return -1;
			}
		});
		return list;
	}
	
	
	
	
}
