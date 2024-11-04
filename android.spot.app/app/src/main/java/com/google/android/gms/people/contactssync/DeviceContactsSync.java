package com.google.android.gms.people.contactssync;

import android.app.Activity;
import android.content.Context;
import defpackage.fvp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DeviceContactsSync {
    private DeviceContactsSync() {
    }

    public static DeviceContactsSyncClient getClient(Activity activity) {
        return new fvp(activity);
    }

    public static DeviceContactsSyncClient getClient(Context context) {
        return new fvp(context);
    }
}
