
public class Distance {
	public static void main(String[] args) {
		String sentence = "Woods are lovely dark and deep but I have promises to keep and miles to go before I sleep and miles to go before I sleep";
		String word1 = "lovely";
		String word2 = "go";
		System.out.println(minDistance(sentence, word1, word2));
	}

private static int minDistance(String sentence, String word1, String word2) {
	if(sentence==null || sentence.length()<=0){
		return -1;
	}
	if(word1==null || word2==null || word1.length()<=0 || word2.length()<=0){
		return -1;
	}
	
	int aIndex = -1;
	int bIndex = -1;
	String [] words = sentence.split(" ");
	int min = Integer.MAX_VALUE;
	for(int i=0; i<words.length; i++){
		if(word1.equals(words[i])){
			aIndex = i;
		}
		if(word2.equals(words[i])){
			bIndex = i;
		}
		if(aIndex!=-1 && bIndex!=-1){
			min = Math.min(min, Math.abs(aIndex-bIndex));
		}
	}
	if(aIndex!=-1 && bIndex!=-1){
		return min;
	}
	return -1;
}
}
