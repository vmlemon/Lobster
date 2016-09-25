package uk.co.house404.lobsterapdutool;

import android.app.Service;
import android.content.Intent;
import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;


public class Crustacean extends HostApduService {
    public Crustacean() {
    }

    @Override
    public byte[] processCommandApdu(byte[] apdu, Bundle extras) {

        byte[] response = {};

        Log.v("LobsterApduTool", "Crustacean APDU :\r\n " + apdu
            + "Bundle : \r\n" + extras + "\r\n");
        return response;
    }

    @Override
    public void onDeactivated(int reason) {
        Log.v("LobsterApduTool", "Deactivated for " + reason + "\r\n");
    }
}
