package main;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Solution {
    public int solution(int[] ranks) {
        Arrays.sort(ranks);
        int max=ranks[ranks.length-1];
        int[] arr=new int[max+1];
        for(int i=0;i<ranks.length;i++){
            arr[ranks[i]]++;
        }
        int result=0;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]!=0 && arr[i-1]!=0) result+=arr[i-1];
        }
       return result;
    }
    public int solution2(int N) {
        String str=Integer.toString(N);
        char[] arr=str.toCharArray();
        int idx=0;
        StringBuilder builder=new StringBuilder();
        if(N>=0){
            for(int i=0;i<arr.length;i++){
                if(arr[i]<'5' && idx==0){
                    builder.append('5');
                    idx=i;
                }
                builder.append(arr[i]);
            }
        }
        else{
            for(int i=1;i<arr.length;i++){
                if(arr[i]>'5' && idx==0){
                    builder.append('5');
                    idx=i;
                }
                builder.append(arr[i]);
            }
        }

        int result=Integer.parseInt(builder.toString());
        if(N<0) return -result;
        else return result;

    }

    public int stringToSec(String[] arr){
        return Integer.parseInt(arr[0])*3600+Integer.parseInt(arr[1])*60+Integer.parseInt(arr[2]);
    }

    public String secToString(int time){
        int s=time%60;
        time/=60;
        int m=time%60;
        time/=60;
        int h=time;

        return String.format("%02d:%02d:%02d",h,m,s);
    }

    public int solutio3(String S, String T) {
        String[] arr=S.split(":");
        String[] arr2=T.split(":");
        int start=stringToSec(arr);
        int end=stringToSec(arr2);
        int result=0;
        for(int i=start;i<=end;i++){
            String s=secToString(i);
            char[] token=s.toCharArray();
            Set<Character> set=new HashSet<Character>();
            for(Character character:token){
                set.add(character);
            }
            if(set.size()<=3) result+=1;
        }
        return result;
    }
}
