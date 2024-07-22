package RecursionInJavaAdvan;

import java.util.*;

public class Palindrome_Partition {
	public static void partitionHelper(int index, String s, List<String> path, List<List<String>> res){
        if(index == s.length()){  // when it goes to end
        // whatever list I got store in res List
             res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < s.length(); ++i) {
            if(isPalindrome(s, index, i)){  //check for palindrome
                path.add(s.substring(index, i+1)); // if found add in path list
                partitionHelper(i + 1, s, path, res); // and now move to next index and find palindrome
                path.remove(path.size()- 1);    // when backtrack just remove 
            }
        }
    }

    static boolean isPalindrome(String s, int start, int end){
            while (start<= end) {
                if(s.charAt(start++) != s.charAt(end--)){
                    return false;
                }
            }
                return true;
    }
    public static List<List<String>> partition(String str) {
        // Write your code here.
        List<List<String>> res = new ArrayList<>();  // store answer
        List<String> path = new ArrayList<>();    // for every list
        partitionHelper(0, str, path, res);
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabb";
        List < List < String >> ans = partition(s);
        int n = ans.size();
        System.out.println("The Palindromic partitions are :-");
        System.out.print(" [ ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("[ ");
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.print("] ");
        }
        System.out.print("]");


	}

}
