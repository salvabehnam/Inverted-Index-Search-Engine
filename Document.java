package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class Document {
    private static final AtomicInteger lastid=new AtomicInteger(0);
    private final int docid;
    private final String name;
    private final String body;

    public Document(String name, String body) {
        this.docid = lastid.incrementAndGet();
        this.name = name;
        this.body = body;
    }

    public int getId() {
        return docid;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Document{" +
                "docid=" + docid +
                ", name='" + name + '\'' +
                '}';
    }
}
