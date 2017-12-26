package list.arraylist.implementation;

import list.arraylist.implementation.ArrayList.ListIterator;

//앞서 만든 ArrayList는 배열이 꽉 차면 index에러가 발생합니다. 
//배열이 꽉 차면 배열 크기를 늘여, 원소를 무한정 저장할 수 있게 만들어보세요.

public class MainRunner 
{
 public static void main(String[] args)
 {
     ArrayList arraylist = new ArrayList();
     for(int i=0; i<10; i++){
         arraylist.addLast(i);
     }
     System.out.println(arraylist);
     arraylist.removeLast();
     System.out.println(arraylist);
     arraylist.removeFirst();
     System.out.println(arraylist);
     arraylist.remove(1);
     System.out.println(arraylist);

     ListIterator e = arraylist.listIterator();
     int i = 0;
     while(e.hasNext())
     {
    	 i = (int)e.next();
    	 if (i == 1 || i == 2||i == 3)  
    		 e.remove();
    	 System.out.println(i);
     }
     
     System.out.println(arraylist);
     
     return ;
 }
}