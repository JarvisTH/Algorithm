package com.jarvis.sort.radixSort;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {
    private int[] array;

    /**
     * 构造函数
     * @param array
     */
    public RadixSort(int[] array){
        this.array=array;
    }

    /**
     * 基数排序
     */
    public void radixSort(){
        int max=array[0];
        for(int i=0;i<array.length;i++){ //找到数组中最大数
            max=array[i]>max?array[i]:max;
        }

        int keysNum=0; //关键字个数，使用个位、十位、百位
        while(max>0){
            max/=10;
            keysNum++;
        }

        List<ArrayList<Integer>> buckets=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<10;i++){ //每位可能的数字是0-9，所以设置10个桶
            buckets.add(new ArrayList<Integer>()); //桶由ArrayList<Integer>构成
        }

        for(int i=0;i<keysNum;i++){ //由最次关键字排序
            for(int j=0;j<array.length;j++){ //扫描所有数组元素，将元素分配到对应桶中
                //取出元素对应第i位的数字
                int key=array[j]%(int)Math.pow(10,i+1)/(int)Math.pow(10,i);
                buckets.get(key).add(array[j]);
            }

            //分配完后，将桶中元素依次复制回数组
            int counter=0;
            for(int j=0;j<10;j++){
                ArrayList<Integer> bucket=buckets.get(j);
                while(bucket.size()>0){
                    array[counter++]=bucket.remove(0); //将桶中第一个元素复制到数组
                }
            }
            System.out.print("第"+(i+1)+"轮排序：");
            display();
        }
    }

    /**
     * 打印
     */
    public void display(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
}
