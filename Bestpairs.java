import java.util.*;
public class Bestpairs{
public static void main(String[] args){
int count=0;
int[] arr={2,1,3,2,4,3,1,2,5,3,4,2,3,1,6};
HashMap <Integer,Integer> hm=new HashMap<> ();
for (int i=0;i<arr.length;i++){
if(hm.containsKey(arr[i])){
  hm.put(arr[i],hm.getOrDefault(arr[i],0)+1));
}else{
hm.put(arr[i],1);
}
}
for(int r:hm.keySet()){
int val=hm.get(r);
count =count+(val*(val-1))/2;
}
System.out.println(count);
}
}



