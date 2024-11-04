package com.google.android.gms.people.contactssync;

import android.content.Context;
import defpackage.fhu;
import defpackage.fxs;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface DeviceContactsSyncClient extends fhu {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface SyncSettingUpdatedListener {
        void onDeviceContactsSyncSettingUpdated();
    }

    fxs getDeviceContactsSyncSetting();

    fxs launchDeviceContactsSyncSettingActivity(Context context);

    fxs registerSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);

    fxs unregisterSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);
}
