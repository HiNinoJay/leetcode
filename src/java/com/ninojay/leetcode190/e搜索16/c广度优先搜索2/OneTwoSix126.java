package com.ninojay.leetcode190.e搜索16.c广度优先搜索2;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zengzhongjie
 * @date : 2023/09/12 22:58
 */
public class OneTwoSix126 {
    public static void main(String[] args) {

        String beginWord = "qa";
        String endWord = "sq";
        List<String> wordList = Lists.newArrayList("si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye");
        for(List<String> list : new OneTwoSix126().findLadders(beginWord, endWord, wordList)) {
            for(String temp : list) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }


    private List<List<String>> result = new ArrayList<>();

    private int minLength = Integer.MAX_VALUE;

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {



        for(int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);
            if(judgeOneChar(beginWord, word)) {
                List<String> tempResult = new ArrayList<>();
                tempResult.add(beginWord);
                List<String> tempWordList = new ArrayList<>(wordList);
                bfs(word, endWord, tempResult, tempWordList, i);
                tempResult.remove(word);
            }
        }
        return result;
    }


    private void bfs(String beginWord, String endWord, List<String> tempResult, List<String> wordList, int index) {

        tempResult.add(beginWord);
        wordList.remove(index);

        if(wordList.isEmpty() || tempResult.size() > minLength) {
            wordList.add(index, beginWord);
            tempResult.remove(tempResult.size() - 1);
            return;
        }

        if(beginWord.equals(endWord) && tempResult.size() <= minLength) {
            // 说明找到了
            if(tempResult.size() < minLength) {
                result.clear();
                result.add(new ArrayList<>(tempResult));
                minLength = tempResult.size();
            } else {
                result.add(new ArrayList<>(tempResult));
            }
            wordList.add(index, beginWord);
            tempResult.remove(tempResult.size() - 1);
            return;
        }

        for(int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);
            if(judgeOneChar(beginWord, word)) {
                bfs(word, endWord, tempResult, wordList, i);
            }
        }
        wordList.add(index, beginWord);
        tempResult.remove(tempResult.size() - 1);
    }



    private boolean judgeOneChar(String one, String two) {
        boolean result = false;
        if(one.length() != two.length()) {
            return result;
        }
        for(int i = 0; i < one.length(); i++) {
            if(one.charAt(i) != two.charAt(i)) {
                if(result) {
                    return false;
                }
                result = true;
            }
        }
        return result;
    }
}
