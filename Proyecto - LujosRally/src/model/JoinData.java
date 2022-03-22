package model;

import java.util.ArrayList;

public class JoinData {
	
	public String[] JoinFeatureStock(ArrayList<String[]> data) {
		String[] newData = new String[data.size()];
		for(int i=0; i<data.size(); i++) {
			newData[i] = data.get(i)[1]+" - "+data.get(i)[2]+" - "+data.get(i)[3]+" - "+data.get(i)[4]+" - "+data.get(i)[5];
		}
		return newData;
	}
	
}
