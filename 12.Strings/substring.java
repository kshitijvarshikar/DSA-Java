class substring {
    public static void main(String[] args) {
        // indexing start from 0
        String sentence = "My name is kshitij";

        // substring(begin index, end index);
        // String name = sentence.substring(11, sentence.length()); //--> kshitij
        String name = sentence.substring(0, 2); // --> My
        System.out.println(name);

    }
}

