package com.example.android.sandascorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreCompetitorA = 0;
    int foulScoreCompetitorA = 0;
    int scoreCompetitorB = 0;
    int foulScoreCompetitorB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Competitor A by 1 point.
     */
    public void addOneForCompetitorA(View v) {
        scoreCompetitorA += 1;
        displayForCompetitorA(scoreCompetitorA);
    }

    /**
     * Increase the score for Competitor A by 2 points.
     */
    public void addTwoForCompetitorA(View v) {
        scoreCompetitorA += 2;
        displayForCompetitorA(scoreCompetitorA);
    }

    /**
     * Increase the score for Competitor A by 3 points.
     */
    public void addThreeForCompetitorA(View v) {
        scoreCompetitorA += 3;
        displayForCompetitorA(scoreCompetitorA);
    }

    /**
     * Increase the foul points for Competitor A by 1 point.
     */
    public void addOneFoulForCompetitorA(View v) {
        foulScoreCompetitorA += 1;
        displayFoulsForCompetitorA(foulScoreCompetitorA);
    }

    /**
     * Displays the given score for Competitor A.
     */
    public void displayForCompetitorA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.competitor_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Competitor A.
     */
    public void displayFoulsForCompetitorA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.competitor_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Competitor B by 1 point.
     */
    public void addOneForCompetitorB(View v) {
        scoreCompetitorB += 1;
        displayForCompetitorB(scoreCompetitorB);
    }

    /**
     * Increase the score for Competitor B by 2 points.
     */
    public void addTwoForCompetitorB(View v) {
        scoreCompetitorB += 2;
        displayForCompetitorB(scoreCompetitorB);
    }

    /**
     * Increase the score for Competitor B by 3 points.
     */
    public void addThreeForCompetitorB(View v) {
        scoreCompetitorB += 3;
        displayForCompetitorB(scoreCompetitorB);
    }

    /**
     * Increase the foul points for Competitor B by 1 point.
     */
    public void addOneFoulForCompetitorB(View v) {
        foulScoreCompetitorB += 1;
        displayFoulsForCompetitorB(foulScoreCompetitorB);
    }

    /**
     * Reset the scores for both Competitor A and Competitor B to 0 points.
     */
    public void resetScores(View v) {
        scoreCompetitorA = 0;
        scoreCompetitorB = 0;
        foulScoreCompetitorA = 0;
        foulScoreCompetitorB = 0;
        displayForCompetitorA(scoreCompetitorA);
        displayForCompetitorB(scoreCompetitorB);
        displayFoulsForCompetitorA(foulScoreCompetitorA);
        displayFoulsForCompetitorB(foulScoreCompetitorB);
    }

    /**
     * Displays the given score for Competitor B.
     */
    public void displayForCompetitorB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.competitor_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Competitor B.
     */
    public void displayFoulsForCompetitorB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.competitor_b_foul);
        scoreView.setText(String.valueOf(score));
    }
}
