package com.twschool.practice;

public class GuessNumber {
    public String getGuessResult(String answerStr, String inputStr) {
        if(answerStr.equals(inputStr)){
            return "4A0B";
        }

        String[] answerList= answerStr.split(",");
        String[] inputList= inputStr.split(",");
        int countsOfNumsRight = 0;
        int countsOfNumsPositionsRight = 0;
        for(int i = 0; i < inputList.length; i++) {
            int j = answerStr.indexOf(inputList[i]);
            if(j!=-1){
             if(j==i) {
                 countsOfNumsPositionsRight++;
             } else {
                 countsOfNumsRight++;
             }
            }
        }

        return countsOfNumsPositionsRight + "A" + countsOfNumsRight + "B";
    }
}
