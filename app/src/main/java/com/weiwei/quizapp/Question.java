package com.weiwei.quizapp;

/**
 * Created by Wei on 9/6/2017.
 */

public class Question {
    private int mTextResourceId;
    private boolean mAnswerTrue;

    public Question(int textResourcId, boolean answerTrue) {
        mTextResourceId = textResourcId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResourceId() {
        return mTextResourceId;
    }

    public void setTextResourceId(int textResourceId) {
        mTextResourceId = textResourceId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
