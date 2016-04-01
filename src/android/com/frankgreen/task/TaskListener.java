package com.frankgreen.task;

import com.acs.smartcard.ReaderException;
import com.frankgreen.apdu.Result;

/**
 * Created by kevin on 16/3/18.
 */
public interface TaskListener {
    void onSuccess();

    void onFailure();

    void onException();

}
