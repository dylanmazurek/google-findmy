package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import defpackage.a;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GeospatialPose {
    long nativeHandle;
    final long nativeSymbolTableHandle;
    private final Session session;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum GeospatialPoseConfidence {
        LEVEL_0(0),
        LEVEL_1(1),
        LEVEL_2(2),
        LEVEL_3(3),
        LEVEL_4(4);

        final int nativeCode;

        GeospatialPoseConfidence(int i) {
            this.nativeCode = i;
        }

        static GeospatialPoseConfidence forNumber(int i) {
            for (GeospatialPoseConfidence geospatialPoseConfidence : values()) {
                if (geospatialPoseConfidence.nativeCode == i) {
                    return geospatialPoseConfidence;
                }
            }
            throw new FatalException(a.ae(i, "Unexpected value for native GeospatialPoseConfidence, value="));
        }

        public boolean isAtLeast(GeospatialPoseConfidence geospatialPoseConfidence) {
            if (this.nativeCode >= geospatialPoseConfidence.nativeCode) {
                return true;
            }
            return false;
        }
    }

    public GeospatialPose(long j, Session session) {
        this.session = session;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    private static native void nativeDestroy(long j, long j2);

    private native float[] nativeEastUpSouthQuaternion(long j, long j2);

    private native double nativeGetAltitude(long j, long j2);

    private native int nativeGetConfidence(long j, long j2);

    private native float[] nativeGetDisplayOrientedQuaternion(long j, long j2);

    private native double nativeGetHeading(long j, long j2);

    private native double nativeGetHeadingAccuracy(long j, long j2);

    private native double nativeGetHorizontalAccuracy(long j, long j2);

    private native double nativeGetLatitude(long j, long j2);

    private native double nativeGetLongitude(long j, long j2);

    private native double nativeGetOrientationYawAccuracy(long j, long j2);

    private native double nativeGetVerticalAccuracy(long j, long j2);

    protected void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroy(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public double getAltitude() {
        return nativeGetAltitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getAltitudeMeters() {
        return nativeGetAltitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public GeospatialPoseConfidence getConfidence() {
        return GeospatialPoseConfidence.forNumber(nativeGetConfidence(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public float[] getDisplayOrientedQuaternion() {
        return nativeGetDisplayOrientedQuaternion(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float[] getEastUpSouthQuaternion() {
        return nativeEastUpSouthQuaternion(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @Deprecated
    public double getHeading() {
        return nativeGetHeading(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @Deprecated
    public double getHeadingAccuracy() {
        return nativeGetHeadingAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getHeadingAccuracyDegrees() {
        return nativeGetHeadingAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getHeadingDegrees() {
        return nativeGetHeading(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getHorizontalAccuracy() {
        return nativeGetHorizontalAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getLatitude() {
        return nativeGetLatitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getLatitudeDegrees() {
        return nativeGetLatitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getLocationAccuracyMeters() {
        return nativeGetHorizontalAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getLongitude() {
        return nativeGetLongitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getLongitudeDegrees() {
        return nativeGetLongitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getOrientationYawAccuracy() {
        return nativeGetOrientationYawAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getVerticalAccuracy() {
        return nativeGetVerticalAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }
}
