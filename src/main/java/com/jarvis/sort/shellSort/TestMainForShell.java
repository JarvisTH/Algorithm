package com.jarvis.sort.shellSort;

import java.util.regex.Matcher;

public class TestMainForShell {
    public static void main(String[] args){
        int[] array=new int[1000];

        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*1000);
        }

        ShellSort shellSort=new ShellSort(array);
        System.out.println("排序前");
        shellSort.display();
        System.out.println("排序后");
        shellSort.shellSort();
    }
}
