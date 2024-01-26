package Basics.Threads.CallablesMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MergeSorter implements Callable<List<Integer>> {
    List<Integer> arrayToSort;
    public MergeSorter(List<Integer> list) {
        arrayToSort = list;
    }
    @Override
    public List<Integer> call() throws Exception{
        if(arrayToSort.size() <= 1){
            return arrayToSort;
        } else {
            int mid = arrayToSort.size()/2;

            List<Integer> leftArray = new ArrayList<>();
            List<Integer> rightArray = new ArrayList<>();
            for(int i = 0; i < mid; i++){
                leftArray.add(arrayToSort.get(i));
            }
            for(int i=mid; i < arrayToSort.size(); i++){
                rightArray.add(arrayToSort.get(i));
            }

            MergeSorter leftSorter = new MergeSorter(leftArray);
            MergeSorter rightSorter = new MergeSorter(rightArray);

            List<Integer> leftSortedArray = leftSorter.call();
            List<Integer> rightSortedArray = rightSorter.call();
            List<Integer> sortedArray = new ArrayList<>();

            int i = 0, j = 0;
            while(i < leftSortedArray.size() && j < rightSortedArray.size()){
                if(leftSortedArray.get(i) <= rightSortedArray.get(i)){
                    sortedArray.add(leftSortedArray.get(i));
                    i++;
                } else {
                    sortedArray.add(rightSortedArray.get(j));
                    j++;
                }
            }
            while(i < leftSortedArray.size()){
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }
            while(j < rightSortedArray.size()){
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
            return sortedArray;
        }
    }
}
