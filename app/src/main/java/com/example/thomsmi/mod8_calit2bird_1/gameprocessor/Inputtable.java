package com.example.thomsmi.mod8_calit2bird_1.gameprocessor;

/**
 * Name:        Inputtable
 * Description: Creates a guideline of methods needed for the Calit2 Bird
 *              Game to take inputs.
 */
public interface Inputtable {
    void setInputState(boolean state);
    boolean getInputState();
    void setRunningState(boolean running);
    boolean getRunningState();
}