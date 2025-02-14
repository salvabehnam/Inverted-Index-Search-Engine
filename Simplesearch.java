package com.company;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Simplesearch {
        public static void main(String[] args) throws IOException {
            List<String> texts = Arrays.asList("Frankenstein", "Jane", "Pride", "Scarlet");
            DocumentStore store = new DocumentStore();
            InvertedIndex index = new InvertedIndex();

            HashMap<String , String> books=new HashMap<>();
            for(String name:texts) {
                InputStream stream = Simplesearch.class.getResource("/txts/" +name+ ".txt").openStream();
                String body = new String(stream.readAllBytes()).toLowerCase();
                Document document=new Document(name,body);
                store.add(document);
                index.add(document);
                books.put(name , body);
            }
            while (true){
                System.out.print("Enter your query :");
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine().toLowerCase();
                if (line.equals("quit"))
                    return;

            PostingList list=index.get(line);
                for (Integer docid : list.getDocid()) {
                    System.out.println(store.get(docid));
                }

                System.out.println();
            }

        }
    }

