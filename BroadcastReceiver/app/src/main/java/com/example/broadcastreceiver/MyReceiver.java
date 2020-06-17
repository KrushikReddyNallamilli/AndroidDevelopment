package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    ImageView img1;
    public MyReceiver(ImageView img){
        this.img1=img;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        switch (intent.getAction()){
            case Intent.ACTION_POWER_CONNECTED:
                img1.setImageResource(R.drawable.full);
                Toast.makeText(context, "power connected", Toast.LENGTH_SHORT).show();
                break;
            case  Intent.ACTION_POWER_DISCONNECTED:
                img1.setImageResource(R.drawable.empty);
                Toast.makeText(context, "power disconnected", Toast.LENGTH_SHORT).show();
                break;
        }
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
