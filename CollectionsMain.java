import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class CollectionsMain {
	public static void main(String[] args) throws Exception {
		CollectionsUtilities utilities =new CollectionsUtilities();
		List<String> list=new ArrayList<String>();
		list.add("hyd");
		list.add("Sec");
		list.add("kphb");
		list.add("Ameer");
		list.add("Jntu");
		List<String> linkedList=new LinkedList<String>();
		linkedList.add("hyd");
		linkedList.add("Sec");
		List<Integer> numList=new ArrayList<Integer>();
		numList.add(8);
		numList.add(10);
		numList.add(100);
		numList.add(40);
		numList.add(20);
		Map<String, String> map= new HashMap<String, String>();
		map.put("1", "Hyd");
		map.put("2", "Sec");
		map.put("3", "Kphb");
		map.put("4", "Ameer");
		map.put("5", "Jntu");
		System.out.println("ques1 to reomove element at specific index");
		list=utilities.removeElemtAtIndex(list, 2);
		for (String data : list) {
	         System.out.println("Data = " + data);
	      }
		
		System.out.println("ques2 to convert List to Array");
		list.add("kphb");
		Object[] array=utilities.listtoArray(list);
		for (Object obj : array) {
	         System.out.println(obj);
	      }
		
		System.out.println("q3 to Convert array to List");
		List<String> arrlst=utilities.arrayToList(array);
		for (String data : arrlst) {
	         System.out.println("Data = " + data);
	      }
		System.out.println("ques4 to copy arrayList to new ArrayList");
				list=utilities.copyListtoNewList(list);
				for (String data : list) {
			         System.out.println("Data = " + data);
			      }
				
		System.out.println("ques5 to find min number in arrayList");
		System.out.println(utilities.mininList(numList));
		
		System.out.println("ques6 to find max number in arrayList");
		System.out.println(utilities.maxinList(numList));
		
		System.out.println("ques7 to iterate over enumeration");
		Enumeration<String> enumeration=utilities.listToEnumeration(list);
		while (enumeration.hasMoreElements())
		System.out.println(enumeration.nextElement());
		
		System.out.println("ques8 to iterate over synchronized List");
		List<String> synchzedList=utilities.listToSynchronizedList(list);
		synchronized (synchzedList) {
            Iterator<String> iterator = synchzedList.iterator();
            while (iterator.hasNext()) {
                System.out.println("Synchronized Array List Items: " + iterator.next());
            }
        } 
		
		System.out.println("ques9 to iterate over Synchronized Map");
		Map<String,String> synchmap=utilities.mapToSynchronizedMap(map);
		System.out.println(synchmap);
		
		System.out.println("ques10 to reverseArrayList");
		list=utilities.reverseList(list);
		for (String data : list) {
	         System.out.println("Data = " + data);
	      }
		
		System.out.println("ques11 to shuffleArrayList");
		list=utilities.shuffleList(list);
		for (String data : list) {
	         System.out.println("Data = " + data);
	      }
		
		System.out.println("ques12 to sort using comparator");
		numList=utilities.descendingOrder(numList);
		for (int data : numList) {
	         System.out.println("Data = " + data);
	      }
		
		System.out.println("ques13 to iterate Hashmap");
		for (Map.Entry<String, String> set :
            map.entrySet()) {
           System.out.println(set.getKey() + " = "+ set.getValue());
       }
		
		System.out.println("ques14 to remove data in Hashmap");
		map.remove("1");
		for (Map.Entry<String, String> set :
            map.entrySet()) {
           System.out.println(set.getKey() + " = "+ set.getValue());
       }
		
		System.out.println("ques15 to add data at beginning and ending");
		
	       ((LinkedList<String>) linkedList).addFirst("first");
	       ((LinkedList<String>) linkedList).addLast("last");
	      
		System.out.println("ques16 to add data through iterator");
 
	        ListIterator<String> it = list.listIterator();
            it.add("added through iterator");

    	System.out.println("ques17 to  iterate in reverse order");
    	while ((it.hasPrevious())) {
            System.out.println(it.previous());
        }



	}

}
