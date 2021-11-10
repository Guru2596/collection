package com.company;
import java.util.*;
//Non-generic

  /*  public class Main {
        public static void main(String[] args) {
            Map map=new HashMap();
            //Adding elements to map
            map.put(1,"Amit");
            map.put(5,"Rahul");
            map.put(2,"Jai");
            map.put(6,"Amit");
            //Traversing Map
            Set set=map.entrySet();//Converting to Set so that we can traverse
            Iterator itr=set.iterator();
            while(itr.hasNext()){
                //Converting to Map.Entry so that we can get key and value separately
                Map.Entry entry=(Map.Entry)itr.next();
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
}*/
/*class Main{
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}*/
/*class Main{
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey())
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}*/
  class Main{
      public static void main(String args[]){
          Map<Integer,String> map=new HashMap<Integer,String>();
          map.put(100,"Amit");
          map.put(101,"Vijay");
          map.put(102,"Rahul");
          //Returns a Set view of the mappings contained in this map
          map.entrySet()
                  //Returns a sequential Stream with this collection as its source
                  .stream()
                  //Sorted according to the provided Comparator
                  .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                  //Performs an action for each element of this stream
                  .forEach(System.out::println);
      }
  }