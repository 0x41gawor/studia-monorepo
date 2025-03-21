package com.mine.util;


// Auxillary class to measure time between to events
public class Clock {
    long last;          // previous CPU timer time
    long now;           // current CPU timer time
    double dt;          // deltaTime between last and now

    public Clock() {
        last = System.nanoTime();
        now = last;
        dt = 0.f;
    }
    // Returns the time between this call and the last one
    public double restart() {
        now = System.nanoTime();        // get Current CPU timer time
        dt =  (now-last)/1000000000.f;  // compute time between now and last and convert it to seconds
        last = now;                     // swap last value with current CPU time time
        return dt;                      // return time deltaTime
    }
}
