package com.example.maha.mahaincomingcall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/**
 * Created by Maha on 10/10/2017.
 */

public class IncomingCall extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

       TelephonyManager tmgr= (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);

        MyPhoneStateListener PhoneListener = new MyPhoneStateListener();



        tmgr.listen(PhoneListener,PhoneStateListener.LISTEN_CALL_STATE);
    }
}
