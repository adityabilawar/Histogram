package Histogram;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram()
	{
		histogram = new TreeMap<String, Integer>();
	}

	public Histogram(String sent)
	{
		histogram = new TreeMap<String, Integer>();
		String[] list = sent.split(" ");
		for(int i = 0; i < list.length; i++) {
			if(histogram.containsKey(list[i]))
				histogram.put(list[i], histogram.get(list[i])+ 1);
			else
				histogram.put(list[i], 1);
		}
	}
	
	public void setSentence(String sent)
	{
		histogram = new TreeMap<String, Integer>();
		String[] list = sent.split(" ");
		for(int i = 0; i < list.length; i++) {
			if(histogram.containsKey(list[i]))
				histogram.put(list[i], histogram.get(list[i])+ 1);
			else
				histogram.put(list[i], 1);
		}
	}

	public String toString()
	{
		String output="";
		String allStars="";
		output+="char \t1---5----01---5\n";
		for(String a : histogram.keySet()) {
			output+=a + "\t";
			for(int j = 0; j < histogram.get(a); j++) {
				output+= "*";
			}
			output+="\n";
		}
		return output+"\n\n";
	}
}