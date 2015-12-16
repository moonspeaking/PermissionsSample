package com.rusdelphi.permissionssample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.widget.Toast;

public class WifiReceiver extends BroadcastReceiver {
    public WifiReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        NetworkInfo info = intent.getParcelableExtra(WifiManager.EXTRA_NETWORK_INFO);
        if (info != null && info.isConnected()) {
            // Do your work.
            Toast.makeText(context, "Подключен", Toast.LENGTH_LONG).show();
            Intent myIntent=new Intent(context,ReadContactsService.class);
            context.startService(myIntent);
        }
    }
}
