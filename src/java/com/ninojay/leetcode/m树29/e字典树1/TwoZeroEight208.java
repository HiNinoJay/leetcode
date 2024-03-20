package com.ninojay.leetcode.m树29.e字典树1;

import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/25
 */
public class TwoZeroEight208 {
    public static void main(String[] args) {

        Trie trie = new Trie();
        trie.insert("apple");
        NinoPrintUtil.printAllType(trie.search("apple")); // true
        NinoPrintUtil.printAllType(trie.search("app")); // false
        NinoPrintUtil.printAllType(trie.startsWith("app")); // true
        trie.insert("app");
        NinoPrintUtil.printAllType(trie.search("app")); // true

    }

    static class TrieNode {
        // 二十六个英文字母
        TrieNode[] childNode = new TrieNode[26];
        boolean isVal;
        TrieNode() {
            isVal = false;
        }
    }

    static class Trie {

        TrieNode root = null;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode temp = root;
            for(int i = 0; i < word.length(); i++) {
                // 如果没有，新增，否则不新增
                if(temp.childNode[word.charAt(i) - 'a'] == null) {
                    // 代表 这个字母 有了位置
                    temp.childNode[word.charAt(i) - 'a'] = new TrieNode();
                }
                // 这个字母 下面 又 可能通向26个字母
                temp = temp.childNode[word.charAt(i) - 'a'];
            }
            // 单词的最后端点为true
            temp.isVal = true;
        }

        public boolean search(String word) {
            TrieNode temp = root;
            for(int i = 0; i <word.length(); i++) {
                if(temp == null) {
                    break;
                }
                temp = temp.childNode[word.charAt(i) - 'a'];
            }
            return temp != null ? temp.isVal : false;
        }

        public boolean startsWith(String prefix) {
            TrieNode temp = root;
            for(int i = 0; i <prefix.length(); i++) {
                if(temp == null) {
                    break;
                }
                temp = temp.childNode[prefix.charAt(i) - 'a'];
            }
            return temp != null;
        }
    }
}
