package StudentRecorder;


public class SortRoll {
	public static String[] toSort;
	
	public static void Sorter(){
		String temp;
		
		toSort = new String[ReadCsv.i];		
		for(int j=0;j<ReadCsv.i;j++){
			toSort[j] = ReadCsv.Roll.get(j);
		}
		for(int j=0;j<toSort.length;j++){
			for(int k=0;k<toSort.length-j-1;k++){
				if(Sorter_internal(toSort[k],toSort[k+1])){
					temp=toSort[k];
					toSort[k]=toSort[k+1];
					toSort[k+1]=temp;
				}
			}
		
		}
		
}

public static boolean Sorter_internal(String s1,String s2){
	if(s1.length()>s2.length())
	return true;
	else if(s1.length()==s2.length())
	{
		char str1[] = s1.toCharArray();
		char str2[] = s2.toCharArray();
		for(int r=0;r<s1.length();r++){
			if(str1[r]>str2[r])
				return true;
			else if(str1[r]<str2[r])
				return false;
			else{
				continue;
			}	
		}	
	}
	return false;
}
}


