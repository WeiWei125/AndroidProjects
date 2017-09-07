package com.weiwei.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private TextView mQuestionTextView;
    private Question[] mQuestions = new Question[] {
            new Question(R.string.question_beautiful_girl, true),
            new Question(R.string.question_best_boyfriend, true),
            new Question(R.string.question_big_face_cat, true),
            new Question(R.string.question_biggest_baby, true),
            new Question(R.string.question_longest_legs, true),
            new Question(R.string.question_spicy_stripe, true),
    };

    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mQuestionTextView = (TextView) findViewById(R.id.question_text_view);
        int question = mQuestions[currentIndex].getTextResourceId();
        mQuestionTextView.setText(question);

        final TextView answerResponseView= (TextView) findViewById(R.id.answer_response_text);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerResponseView.setText(R.string.right_answer_response);
                Toast.makeText(QuizActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT).show();
            }
        });

        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerResponseView.setText(getResources().getString(R.string.wrong_answer_response));
                Toast.makeText(QuizActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
            }
        });

        mNextButton = (Button) findViewById(R.id.next_button);
    }
}
