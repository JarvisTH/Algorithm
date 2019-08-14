package com.jarvis.sort.heapSort;

public class HeapSort {
    int[] array;

    /**
     * 构造函数
     * @param array
     */
    public HeapSort(int[] array){
        this.array=array;
    }

    /**
     * 堆排序
     */
    public void heapSort(){
        buildHeap();
        System.out.println("建堆：");
        printTree(array.length);

        int lastIndex=array.length-1;
        while(lastIndex>0){
            swap(0,lastIndex); //取出堆顶元素，将堆低放入顶
            if(--lastIndex==0){ //只有一个元素就不用调整
                break;
            }
            adjustHeap(0,lastIndex); //调整堆

            System.out.println("调整堆：");
            printTree(lastIndex+1);
        }
    }

    /**
     * 建堆
     */
    public void buildHeap(){
        int lastIndex=array.length-1;
        for(int i=(lastIndex-1)/2;i>=0;i--){ //即最后一个节点的根节点
            adjustHeap(i,lastIndex); //调整下标为i的元素为根的子树
        }
    }

    /**
     * 调整堆
     * @param rootIndex
     * @param lastIndex
     */
    public void adjustHeap(int rootIndex,int lastIndex){
        int biggerIndex=rootIndex;
        int leftChildIndex=2*rootIndex+1;
        int rightChildIndex=2*rootIndex+2;

        if(rightChildIndex<=lastIndex){ //存在右子节点，必存在左子节点
            if(array[rootIndex]<array[leftChildIndex]||array[rootIndex]<array[rightChildIndex]){ //子节点中存在比根大的元素
                biggerIndex=array[leftChildIndex]<array[rightChildIndex]?rightChildIndex:leftChildIndex;
            }
        }else if(leftChildIndex<=lastIndex){ //只有左子节点
            if(array[leftChildIndex]>array[rootIndex]){
                biggerIndex=leftChildIndex;
            }
        }

        if(biggerIndex!=rootIndex){ //发现了比根更大的子节点
            swap(rootIndex,biggerIndex);

            //交换位置后可能破坏子树，需要再次调整
            adjustHeap(biggerIndex,lastIndex);
        }
    }

    /**
     * 交换函数
     * @param left
     * @param right
     */
    public void swap(int left,int right){
        int temp=array[left];
        array[left]=array[right];
        array[right]=temp;
    }

    /**
     * 打印
     * @param length
     */
    public void printTree(int length){
        int layers=(int)Math.floor(Math.log((double)length)/Math.log((double)2))+1; //树的层数
        int maxWidth=(int)Math.pow(2,layers)-1; //树的最大宽度
        int endSpacing=maxWidth;
        int spacing;
        int numberOfThisLayer;
        for(int i=1;i<=layers;i++){ //从第一层开始打印
            endSpacing=endSpacing/2; //每层打印前需要打印的空格数
            spacing=2*endSpacing+1; //元素间的空格数
            numberOfThisLayer=(int)Math.pow(2,i-1); //该层要打印元素的总数

            for(int j=0;j<endSpacing;j++){
                System.out.print(" ");
            }
            int beginIndex=(int)Math.pow(2,i-1)-1; //该层第一个元素对应的下标
            for(int j=1;j<=numberOfThisLayer;j++){
                System.out.print(array[beginIndex++]+"");
                for(int k=0;k<spacing;k++){
                    System.out.print(" ");
                }
                if(beginIndex==length){ //打印到最后一个元素
                    break;
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
