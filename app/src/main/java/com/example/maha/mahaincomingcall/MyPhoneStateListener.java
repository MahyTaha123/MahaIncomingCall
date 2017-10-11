package com.example.maha.mahaincomingcall;

import android.telephony.PhoneStateListener;
import android.util.Log;
import android.widget.Toast;

import static java.security.AccessController.getContext;

/**
 * Created by Maha on 10/10/2017.
 */

public class MyPhoneStateListener extends PhoneStateListener {

    @Override
    public void onCallStateChanged(int state, String incomingNumber) {
        super.onCallStateChanged(state, incomingNumber);


        if(state==1){

            Log.d("Mahy", "onCallStateChanged: "+state+"  " +incomingNumber);

        }
    }
}
