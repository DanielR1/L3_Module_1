package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
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

	public static ArrayList<String> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		Double x=(double) 0;
		ArrayList<String> list = new ArrayList<String>();
		String temp = null;
		for (int i = 0; i < results.size(); i++) {
			
			for (int j = 0; j < results.size(); j++) {
				if(results.get(j)>results.get(i)) {
					Double temp1 = results.get(i);
					results.set(i, results.get(j));
					results.set(j, temp1);
					
			
				}
				
			}
			
		}
		for (int i = 0; i < results.size(); i++) {
			list.add(results.get(i)+"");
			
		}
	
		return list;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		int y=10000000;
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < unsortedSequences.size(); i++) {
			String x=null;
			
			for (int j = 0; j < unsortedSequences.size(); j++) {
				if(unsortedSequences.get(j).length()<y) {
					y=unsortedSequences.get(j).length();
					x=unsortedSequences.get(j);
				}
				list.add(x);
				unsortedSequences.remove(i);
			}
		}
		for (int i = 0; i < unsortedSequences.size(); i++) {
			
		}
		System.out.println(list);
		return list;
	}
	
	//Add other methods here
}