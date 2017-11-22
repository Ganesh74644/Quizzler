package com.example.ganesh.quizzler;



public class TrueFalse {

    private  int mQuestionID;
    private boolean mAnswer;
    public TrueFalse(int questionResourceID,boolean trueOrFalse){
        mQuestionID = questionResourceID;
        mAnswer = trueOrFalse;

    }
//getter
    public int getQuestionID() {
        return mQuestionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }
//setter
    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
