package com.google.hardware.techeng.sensors.finder;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Estimate {
    public Status status = Status.UNKNOWN_ERROR;
    public double rangeM = 0.0d;
    public double rangeErrorStdDevM = 0.0d;
    public double bearingRad = 0.0d;
    public double bearingErrorStdDevRad = 0.0d;
    public double estimatedBeaconPositionErrorStdDevM = 0.0d;
    private long timestampNanos = 0;
}
