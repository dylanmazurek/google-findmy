package com.google.hardware.techeng.sensors.finder;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SessionWithArCoreNative {
    public SessionWithArCoreNative() {
        System.loadLibrary("precisionfindingsessionwitharcorejni");
    }

    public native long createSession(byte[] bArr);

    public native void deleteSession(long j);

    public native void getEstimate(long j, Estimate estimate);

    public native void pollAndProcessOdometryUpdate(long j);

    public native Status start(long j, Context context);

    public native Status stop(long j);

    public native void updateWithUwbMeasurement(long j, double d, long j2);
}
