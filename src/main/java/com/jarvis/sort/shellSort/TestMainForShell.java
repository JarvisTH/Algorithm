package com.jarvis.sort.shellSort;

public class TestMainForShell {
    public static void main(String[] args){
        int[] array=new int[100];

        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }

        ShellSort shellSort=new ShellSort(array);
        System.out.println("排序前");
        shellSort.display();
        System.out.println("排序后");
        shellSort.shellSort();
    }
}
