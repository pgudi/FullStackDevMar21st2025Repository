package com.gentech.utildemo;
class ReadElements
{
     static<E> void showElements(E elements[])
     {
         for(E element :elements)
         {
             System.out.println(element);
         }
     }
}
public class GenericsWithElementsLevelDemo {
    public static void main(String[] args) {
        Double d[]={1.2,2.5,3.6,4.5};
        ReadElements.showElements(d);
        Integer arr[]={2,4,6,8};
        ReadElements.showElements(arr);
        Character ch[]={'Q','W','E','R','T','Y'};
        ReadElements.showElements(ch);
    }
}
