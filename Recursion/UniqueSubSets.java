package Recursion;
import java.util.*;
import java.io.*;


public class UniqueSubSets {
    // [ ,b, a, ab, aa, aab]
   
    static HashSet<String> set = new HashSet<>();
    static void uniqueSubSets(String ip, String op) {
        if (ip.length() == 0) {
            set.add(op);
            return;
        }
        String op1 = op;// ""
        String op2 = op + "" + ip.charAt(0);// "a"
        ip = ip.substring(1);
        uniqueSubSets(ip, op1);
        uniqueSubSets(ip, op2);

    }

   
	public static void main (String[] args)throws IOException {
	    
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine().trim());
        while(t-->0){
        int n=Integer.parseInt(in.readLine().trim());
        String ip = in.readLine().replaceAll("\\s", ""); ;
        String op = "";
        System.out.println(n);
        uniqueSubSets(ip, op);
       
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> list;
        for (String s : set) {
            String a[] = s.split("");
            list = new ArrayList<>();
            for (String st : a) {
                if (st.length() > 0) {
                    list.add(Integer.parseInt(st));
                }

            }
          //  Collections.sort(list);
            arr.add(list);
        }
        //System.out.println(arr);
        Collections.sort(arr,new Sort());
       
        // ArrayList<String> arr=new ArrayList<>();
        Collections.sort(arr,new SizeSort());
        System.out.print("()");
        for(ArrayList<Integer> sets:arr)
        {
            String str=""+sets;
            if(!sets.isEmpty()){
            str=str.replace(
                '[', '(');
                str=str.replace(
                    ']', ')');
                    //char c='';
                    str=str.replace(
                    ",","");
            System.out.print(str);}
        }
    } in.close();
        
    }

}


class Sort implements Comparator<ArrayList<Integer>> {

   
    @Override
    public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
       
        if(!o1.isEmpty() && !o2.isEmpty())
        {
       // System.out.println(o1+"  "+o2);
        return o1.get(0)-o2.get(0);
        }
        return 0;
    }
    
}

class SizeSort implements Comparator<ArrayList<Integer>> {

   
    @Override
    public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
       
        if(!o1.isEmpty() && !o2.isEmpty())
        {
        if(o1.get(0)==o2.get(0))
        {
            return o1.size()-o2.size();
        }
        }
        return 0;
    }
    
}