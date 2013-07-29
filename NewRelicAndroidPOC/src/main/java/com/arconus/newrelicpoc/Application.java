package com.arconus.newrelicpoc;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

public class Application {
    public static final Bus bus = new Bus(ThreadEnforcer.ANY);
}
