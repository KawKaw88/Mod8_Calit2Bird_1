package com.example.thomsmi.mod8_calit2bird_1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.widget.Spinner;

import com.example.thomsmi.mod8_calit2bird_1.gameprocessor.GameProcessor;
import com.example.thomsmi.mod8_calit2bird_1.gameprocessor.Inputtable;
import com.example.thomsmi.mod8_calit2bird_1.gameprocessor.Renderable;

/**
 * Name:        Calit2BirdActivity
 * Description: The Main Activity of the game.
 *
 */
public class MainActivity extends AppCompatActivity {
    GameProcessor gameProcessor;
    private Inputtable inputter;
    private Renderable renderer;

    // $TODO@TJS 1-6-2015 Tom's original code (from project wizard)
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    // $TODO@TJS 1-6-2015 Tom's original code with button
//    public void onClickTest1(View view)
//    {
//        Log.v("MainActivity","onClickTest1() - Start 4:56pm");
//
//        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
//        String str1 = String.valueOf(spinner.getSelectedItem());
//        Log.v("MainActivity",str1);
//
//        Play1 play = new Play1();
//        play.DoSomething();
//
//        Log.v("MainActivity","onClickTest1() - End");
//    }


// $TODO@TJS 1-6-2015 form class

    /**
     * Name:        onCreate
     * Description: Instantiates the Inputtable and Renderable instances
     *              as ScreenInput and ScreenRender object, respectively
     *
     * @param       savedInstanceState Reference to bundle object. Activities
     *                                 can be restored to a former state using
     *                                 data saved in this bundle.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        renderer = new ScreenRender(this);
        inputter = new ScreenInput();
    }

    /**
     * Name:        onResume
     * Description: Issues a call to the helper method beginNewGame().
     *              We begin the game here because this method is called when
     *              the screen is live.
     */
    @Override
    protected void onResume() {
        super.onResume();
        beginNewGame();
    }

    /**
     * Name:        onPause
     * Description: Issues a call to the helper method endGame().
     *              We end the game here because this method is called when
     *              the screen is dead.
     */
    @Override
    protected void onPause() {
        super.onPause();
        endGame();
    }

    /**
     * Name:        beginNewGame
     * Description: Notifies inputter that the game is now running
     *              and instantiates the GameProcessor object to
     *              essentially start and play the game.
     */
    public void beginNewGame() {
        inputter.setRunningState(true);
        gameProcessor = new GameProcessor(inputter, renderer);
        gameProcessor.start();
    }

    /**
     * Name:        endGame
     * Description: Notifies the inputter that the game is over (or the running
     *              state is false).
     */
    public void endGame() {
        inputter.setRunningState(false);
    }

    /**
     * Name:        setInput
     * Description: Method called when the User taps on activity_main.xml.
     *              This method communicates the User's input into the game.
     *
     * @param       view The view associated with the method call
     */
    public void setInput(View view) {
        if(inputter != null)
            inputter.setInputState(true);
    }

}
