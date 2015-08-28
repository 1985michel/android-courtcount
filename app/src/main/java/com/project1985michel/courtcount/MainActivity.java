package com.project1985michel.courtcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /**
     * The method below change the score of team A on the screen
     * @param score
     */
    public void displayForTeamA(int score){

        TextView scoreAView = (TextView) findViewById(R.id.team_a_score);
        scoreAView.setText(String.valueOf(score));
    }


    /**
     * The method below add points on scoreTeamA
     * @param addPoint
     */
    public void addTeam_a_score(int addPoint){
        scoreTeamA +=addPoint;
        displayForTeamA(scoreTeamA);
    }

    public void add3PointsTeamA(View view){
        addTeam_a_score(3);
    }

    public void add2PointsTeamA(View view){
        addTeam_a_score(2);
    }

    public void add1PointTeamA(View view){
        addTeam_a_score(1);
    }

    /**
     * The method below change the score of team B on the screen
     * @param score
     */
    public void displayForTeamB(int score){

        TextView scoreBView = (TextView) findViewById(R.id.team_b_score);
        scoreBView.setText(String.valueOf(score));
    }


    /**
     * The method below add points on scoreTeamB
     * @param addPoint
     */
    public void addTeam_b_score(int addPoint){
        scoreTeamB +=addPoint;
        displayForTeamB(scoreTeamB);
    }

    public void add3PointsTeamB(View view){
        addTeam_b_score(3);
    }

    public void add2PointsTeamB(View view){
        addTeam_b_score(2);
    }

    public void add1PointTeamB(View view){
        addTeam_b_score(1);
    }
}
