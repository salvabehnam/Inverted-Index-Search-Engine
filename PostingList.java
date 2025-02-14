package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PostingList {
    PostingList(){

    }
    PostingList(int...ids){
        for (int id :ids)
            docid.add(id);
    }
    private List<Integer> docid= new ArrayList<>();
    public void add(int id){
        docid.add(id);
    }
    public void sort(){
        Collections.sort(docid);
    }
    public int size() {
    return docid.size();
    }

    public List<Integer> getDocid() {
        return docid;
    }

    @Override
    public String toString() {
        return Arrays.toString(docid.toArray(new Integer[0]));
    }

    public PostingList and(PostingList other) {
    int i = 0;
    int j = 0;
    PostingList res=new PostingList();
    while (i< size() && j<other.size()) {
    int a =docid.get(i);
    int b =other.docid.get(j);
    if (a==b) {
        res.add(a);
        i++;
        j++;
    }else if (a<b) {
        i++;
    }else {
        j++;
    }
    }
    return res;
    }

    public PostingList or(PostingList other) {
        int i = 0;
        int j = 0;
        PostingList res=new PostingList();
        while (i< size() && j<other.size()) {
            int a =docid.get(i);
            int b =other.docid.get(j);
            if (a==b) {
                res.add(a);
                i++;
                j++;
            }else if (a<b) {
                res.add(a);
                i++;
            }else {
                res.add(b);
                j++;
            }
        }
        return res;
    }
    public PostingList not() {
        int i = 0;
        PostingList res=new PostingList();
        while (i< size() ) {
            int a =docid.get(i);
            if (a==0) {
                i++;
            }else {
                res.add(a);
                i++;
            }
        }
        return res;
    }

}

