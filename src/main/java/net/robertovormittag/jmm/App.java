package net.robertovormittag.jmm;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;

/**  
 * JVM parameters:
 * -Xms128m (heap initial memory allocation)
 * -Xmx256m (heap maximum memory allocation)
 */
public class App {
	
	private static final Logger log = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {
		
		// allObjectsAssignedToOneReferenceTest();
		oneReferenceForEachObjectTest();
	}
		
	
	/** HEAP *******************************
	 			Alpha
	 			Alpha
	 			Alpha
	 			Alpha
	 			Alpha
	 	aref =>	Alpha
	 			...
	 ***************************************/
	@SuppressWarnings("unused")
	private static void allObjectsAssignedToOneReferenceTest() {

		// one single reference for all Alpha objects
		Alpha aref;

		while (true) {
			
			aref = new Alpha();
			log.info(aref.toString());
		}
	}

	
	/** HEAP *******************************
		arr[0] =>	Alpha
		arr[1] =>	Alpha
		arr[2] =>	Alpha
		arr[3] =>	Alpha
		arr[4] =>	Alpha
		arr[5] =>	Alpha
				...
	 ***************************************/
	@SuppressWarnings("unused")
	private static void oneReferenceForEachObjectTest() {
		
		List<Alpha> alist = new ArrayList<Alpha>();

		while (true) {
			// every Alpha object has a valid reference reference
			alist.add(new Alpha());
			log.info("List size = " + alist.size());
		}
		
	}
	
		
}
