import java.util.*;

public class HashMapCode {
    static class HashMap<K, V> { // generics --> means genral type
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n - nodes
        private int N; // N - buckets
        private LinkedList<Node> buckets[]; // N = Buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) { // 0 TO N-1
            int bi = key.hashCode(); // 2345, -2345 posi or negi koi bhi value de skta hai
            return Math.abs(bi) % N; // posi value remains posi but negi become posi (% N means value in the range -
                                     // 0 TO N-1)
        }

        private int searchInLL(K key, int bi) { // bucket ke andar LL hai usme search hogi
            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i; // di
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets; // purane data ko oldbucket main store karva diya
            buckets = new LinkedList[N * 2]; // bucket ke andar nayi our khali bucket bana di hai N*2 size ki

            for (int i = 0; i < N * 2; i++) { // hr bucket ke liye ek khali LL bana diye
                buckets[i] = new LinkedList<>();
            }

            // purani bucket pr loop chalana hai har bucket idx pr ek LL hogi us LL pr loop
            // chala lo
            for (int i = 0; i < oldBucket.length; i++) { // purani bucket pr loop chalana hai
                LinkedList<Node> ll = oldBucket[i]; // har bucket idx pr ek LL hogi
                for (int j = 0; j < ll.size(); j++) { // us LL pr loop chala lo
                    Node node = ll.get(j); // LL ka ek ek node nikalo
                    put(node.key, node.value); // or usko put function ke liye call kr do put function hamesha nayi
                                               // bucket ke andar add krege
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // direct Index

            if (di == -1) { // key doesn't exist
                buckets[bi].add(new Node(key, value));
                n++;
            } else { // key exist
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        // put copy paste in containsKey
        public boolean containsKey(K key) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // direct Index

            if (di == -1) { // key doesn't exist
                return false;
            } else { // key exist
                return true;
            }
        }

        // get copy paste in remove
        public V remove(K key) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // direct Index

            if (di == -1) { // key doesn't exist
                return null;
            } else { // key exist
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        // put copy paste in get
        public V get(K key) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // direct Index

            if (di == -1) { // key doesn't exist
                return null;
            } else { // key exist
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>(); // arraylist bana liya keys nam se

            // keys ke andar sari ki sari keys ki value ko add kra diya
            for (int i = 0; i < buckets.length; i++) { // bi
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) { // di
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpthy() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);

        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
        map.remove("India");
        System.out.println(map.get("India"));
    }

}