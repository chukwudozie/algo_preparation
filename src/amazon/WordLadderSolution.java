package amazon;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Given two words (beginWord and endWord), and a dictionary’s word list,
 * find the length of the shortest transformation sequence from beginWord to endWord, such that:
 * Only one letter can be changed at a time.
 * Each transformed word must exist in the word list.
 * Note that beginWord is not a transformed word.
 * Return 0 if there is no such transformation sequence.
 * All words have the same length.
 */
public class WordLadderSolution {

    public static void main(String[] args) {

        Set<String> D = new HashSet<String>();
        D.add("poon");
        D.add("plee");
        D.add("same");
        D.add("poie");
        D.add("plie");
        D.add("poin");
        D.add("plea");
        String start = "toon";
        String target = "plea";

//        System.out.println(shortestChainLength(start, target, D));
    }

//    public static int shortestChainLength(String beginWord, String endWord, Set<String> dictionary){
//            if (beginWord.equals(endWord) || ! dictionary.contains(endWord)){
//                return 0;
//            }
//
//            int level = 0;
//            int wordLength = beginWord.length();
//            int wordCount = dictionary.size();
//
//        Queue<String> Q = new LinkedList<>();
//        Q.add(beginWord);
//
//        while (!Q.isEmpty()){
//            ++level;
//            int queueSize = Q.size();
//
//            for (int i = 0; i < queueSize;i++){
//                char[] word = Q.peek().toCharArray();
//                Q.remove();
//
//                for (int p = 0; p < wordLength; p++){
//                    char originalChar = word[p];
//
//                    for (char c = 'a'; c <= 'z'; c++){
//                        word[p] = c;
//
//                        if (String.valueOf(word).equals(endWord))
//                            return level + 1;
//
//                        if (dictionary.contains(String.valueOf(word)))
//                            continue;
//                        dictionary.remove(String.valueOf(word));
//
//                        Q.add(String.valueOf(word));
//
//                        word[p] = originalChar;
//                    }
//                }
//            }
//
//        }
//        return 0;
//    }
}
