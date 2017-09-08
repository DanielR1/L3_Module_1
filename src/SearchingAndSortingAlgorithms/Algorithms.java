package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
	
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i)=="cracked"){
				return i;
				
			}

		}
		return 0; 
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int a=0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)==true) {
				a+=1;
			}
		}
		return a;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		Double t=(double) 0;
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i)>t) {
				t=peeps.get(i);
			}
		}
		return t;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		int x = 0;
		String w=null;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length()>x) {
				x=words.get(i).length();
				w=words.get(i);
			}
		}
		return w;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < message1.size(); i++) {
			
		
		if(message1.get(i).contains("... --- ...")) {
			return true;
		}
		}
		return false;
	}

	public static List<String> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		Double x=(double) 0;
		ArrayList<String> list = new ArrayList<String>();
		String temp = null;
		for (int i = 0; i < results.size(); i++) {
			if(results.get(i)>=x) {
				x=results.get(i);
				list.add(""+results.get(i));
				
				
			}
			else {
				ArrayList<String>temp1=list;
				list.removeAll(list);
				list.add(""+results.get(i)+temp1);
			}
		}
		return list;
	}
	
	//Add other methods here
}