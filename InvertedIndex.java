package com.company;

import java.util.*;

public class InvertedIndex {
    private Map<String , PostingList>table=new HashMap<>();
    public void add(Document document){
        String[] tokens=document.getBody().split("\\s+");
        Set<String> distinctToken=new HashSet<>();
        for (String token : tokens) {
            distinctToken.add(token);
        }
        for (String token : distinctToken) {
            table.putIfAbsent(token,new PostingList());
            table.get(token).add(document.getId());
        }
        for (PostingList list : table.values()) {
            list.sort();
        }
    }
        public PostingList get(String token){
        return table.get(token);
        }


}
