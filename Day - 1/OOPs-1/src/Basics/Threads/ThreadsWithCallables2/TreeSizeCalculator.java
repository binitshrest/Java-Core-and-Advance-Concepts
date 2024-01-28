package Basics.Threads.ThreadsWithCallables2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.*;
class TreeSizeCalculator implements Callable<Integer>{
    Node root;
    ExecutorService executorService;

    public TreeSizeCalculator(Node root,ExecutorService executorService){
        this.root = root;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws Exception{
        if(root == null) return 0;

        TreeSizeCalculator leftTree = new TreeSizeCalculator(root.left,executorService);
        TreeSizeCalculator rightTree = new TreeSizeCalculator(root.right,executorService);

        Future<Integer> leftTreeSize = executorService.submit(leftTree);
        Future<Integer> rightTreeSize = executorService.submit(rightTree);

        return leftTreeSize.get() + rightTreeSize.get() +1;
    }
}