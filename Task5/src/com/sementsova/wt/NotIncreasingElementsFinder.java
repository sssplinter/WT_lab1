package com.sementsova.wt;

import java.util.ArrayList;
import java.util.List;

public class NotIncreasingElementsFinder {

    public List<Integer> getUselessNumbers(int[] arr){
        List<Integer> listDirect = findInDirectOrder(arr);
        List<Integer> listReverse = findInReverseOrder(arr);

        return listDirect.size() <= listReverse.size() ? listDirect : listReverse;
    }

    private List<Integer> findInDirectOrder(final int[] arr){
        List<Integer> list = new ArrayList<>();

        int currentMax = 0;
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[currentMax] > arr[i]){
                list.add(arr[i]);
            } else{
                currentMax = i;
            }
        }

        return list;
    }

    private List<Integer> findInReverseOrder(final int[] arr){
        List<Integer> list = new ArrayList<>();

        int currentMax = arr.length - 1;
        for(int i = arr.length - 2; i > 0; i--){
            if(arr[currentMax] < arr[i]){
                list.add(arr[i]);
            } else{
                currentMax = i;
            }
        }

        return list;
    }
}
