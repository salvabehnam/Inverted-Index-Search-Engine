# 🔍 Inverted Index Search Engine

This project implements a **simple text search engine** in Java that reads multiple documents, tokenizes their content, and stores occurrences in an **Inverted Index**. This allows for efficient full-text searches across a collection of documents.

## 📌 Features 

- **Document Parsing**: Reads and processes multiple text files.
- **Tokenization**: Breaks down text into individual terms.
- **Inverted Index Construction**: Maps terms to their occurrences in documents.
- **Search Functionality**: Retrieves documents containing specific terms.

## 📂 Project Structure

    Inverted-Index-Search-Engine/
    ├── Document.java          # Represents a document with its content
    ├── DocumentStore.java     # Manages storage and retrieval of documents
    ├── InvertedIndex.java     # Constructs and manages the inverted index
    ├── PostingList.java       # Represents a list of document IDs where a term appears
    ├── SimpleSearch.java      # Implements search functionality using the inverted index
    ├── searchproject.iml      # IntelliJ IDEA project file 
    └── txt
        ├── Jane.txt               # Sample document
        ├── Pride.txt              # Sample document
        ├── Scarlet.txt            # Sample document
        └── Frankenstein.txt       # Sample document

## 🚀 Installation & Usage

1. **Clone the Repository**

       git clone https://github.com/salvabehnam/Inverted-Index-Search-Engine.git
       cd Inverted-Index-Search-Engine

2. **Compile the Java Files**

       javac *.java

3. **Run the Search Engine**

       java SimpleSearch

   Follow the on-screen prompts to load documents and perform search queries.

## ✨ Technologies Used

- **Java**: Core programming language for the search engine logic.

