package com.study.lyds.aidlserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2018/4/25.
 */

public class LyAidlService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return stub;
    }

    IMyAidlInterface.Stub stub = new IMyAidlInterface.Stub(){

        @Override
        public int add(int a, int b) throws RemoteException {
            return a + b;
        }

        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }

    };
}
