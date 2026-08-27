public class TrieExample {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;
    }

    static class Trie {

        TrieNode root = new TrieNode();

        // Insert a word
        void insert(String word) {

            TrieNode current = root;

            for (char ch : word.toCharArray()) {

                int index = ch - 'a';

                if (current.children[index] == null) {
                    current.children[index] = new TrieNode();
                }

                current = current.children[index];
            }

            current.isEndOfWord = true;
        }

        // Search for a complete word
        boolean search(String word) {

            TrieNode current = root;

            for (char ch : word.toCharArray()) {

                int index = ch - 'a';

                if (current.children[index] == null) {
                    return false;
                }

                current = current.children[index];
            }

            return current.isEndOfWord;
        }

        // Check whether a prefix exists
        boolean startsWith(String prefix) {

            TrieNode current = root;

            for (char ch : prefix.toCharArray()) {

                int index = ch - 'a';

                if (current.children[index] == null) {
                    return false;
                }

                current = current.children[index];
            }

            return true;
        }
    }

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("app");
        trie.insert("apply");
        trie.insert("banana");

        System.out.println("Search apple: "
                + trie.search("apple"));

        System.out.println("Search app: "
                + trie.search("app"));

        System.out.println("Search appl: "
                + trie.search("appl"));

        System.out.println("Prefix app: "
                + trie.startsWith("app"));

        System.out.println("Prefix cat: "
                + trie.startsWith("cat"));
    }
}