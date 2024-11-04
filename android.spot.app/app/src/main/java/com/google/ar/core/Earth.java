package com.google.ar.core;

import com.google.ar.core.ResolveAnchorOnRooftopFuture;
import com.google.ar.core.ResolveAnchorOnTerrainFuture;
import com.google.ar.core.exceptions.FatalException;
import defpackage.a;
import java.util.Collection;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Earth extends TrackableBase {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum EarthState {
        ENABLED(0),
        ERROR_INTERNAL(-1),
        ERROR_GEOSPATIAL_MODE_DISABLED(-2),
        ERROR_NOT_AUTHORIZED(-3),
        ERROR_RESOURCE_EXHAUSTED(-4),
        ERROR_APK_VERSION_TOO_OLD(-5);

        final int nativeCode;

        EarthState(int i) {
            this.nativeCode = i;
        }

        static EarthState forNumber(int i) {
            for (EarthState earthState : values()) {
                if (earthState.nativeCode == i) {
                    return earthState;
                }
            }
            throw new FatalException(a.ae(i, "Unexpected value for native EarthState, value="));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum LocalizationPerformanceMode {
        SESSION_STATE_DEFAULT(0),
        ACTIVE_AR(1),
        ACTIVE_NO_CAMERA(2),
        INACTIVE_PASSIVE(3);

        final int nativeCode;

        LocalizationPerformanceMode(int i) {
            this.nativeCode = i;
        }

        static LocalizationPerformanceMode forNumber(int i) {
            for (LocalizationPerformanceMode localizationPerformanceMode : values()) {
                if (localizationPerformanceMode.nativeCode == i) {
                    return localizationPerformanceMode;
                }
            }
            throw new FatalException(a.ae(i, "Unexpected value for native LocalizationPerformanceMode, value="));
        }
    }

    public Earth(long j, Session session) {
        super(j, session);
    }

    private native long nativeCreateAnchor(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4);

    private native long nativeCreateAnchorOnTerrain(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4);

    private native long nativeCreateAnchorOnWgs84(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4);

    private native long nativeGetCameraGeospatialPose(long j, long j2);

    private native int nativeGetEarthState(long j, long j2);

    private native long nativeGetGeospatialPose(long j, long j2, Pose pose);

    private native Pose nativeGetPose(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4);

    private native int nativeGetTrackingState(long j, long j2);

    private native void nativeReleaseEarth(long j, long j2);

    private native long[] nativeResolveAnchorOnRooftopAsync(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4, ResolveAnchorOnRooftopFuture.CallbackWrapper callbackWrapper);

    private native long nativeResolveAnchorOnTerrain(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4);

    private native long[] nativeResolveAnchorOnTerrainAsync(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4, ResolveAnchorOnTerrainFuture.CallbackWrapper callbackWrapper);

    private native void nativeSetLocalizationPerformanceMode(long j, long j2, int i);

    private native void nativeSetNetworkClient(long j, long j2, EarthNetworkClientInterface earthNetworkClientInterface);

    public Anchor createAnchor(double d, double d2, double d3, float f, float f2, float f3, float f4) {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle, d, d2, d3, f, f2, f3, f4), this.session);
    }

    @Deprecated
    public Anchor createAnchorOnTerrain(double d, double d2, double d3, float f, float f2, float f3, float f4) {
        return new Anchor(nativeCreateAnchorOnTerrain(this.session.nativeWrapperHandle, this.nativeHandle, d, d2, d3, f, f2, f3, f4), this.session);
    }

    public Anchor createAnchorOnWgs84(double d, double d2, double d3, float f, float f2, float f3, float f4) {
        return new Anchor(nativeCreateAnchorOnWgs84(this.session.nativeWrapperHandle, this.nativeHandle, d, d2, d3, f, f2, f3, f4), this.session);
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.ar.core.TrackableBase
    protected void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseEarth(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    public GeospatialPose getCameraGeospatialPose() {
        return new GeospatialPose(nativeGetCameraGeospatialPose(this.session.nativeWrapperHandle, this.nativeHandle), this.session);
    }

    public EarthState getEarthState() {
        return EarthState.forNumber(nativeGetEarthState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public GeospatialPose getGeospatialPose(Pose pose) {
        return new GeospatialPose(nativeGetGeospatialPose(this.session.nativeWrapperHandle, this.nativeHandle, pose), this.session);
    }

    public Pose getPose(double d, double d2, double d3, float f, float f2, float f3, float f4) {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle, d, d2, d3, f, f2, f3, f4);
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public ResolveAnchorOnRooftopFuture resolveAnchorOnRooftopAsync(double d, double d2, double d3, float f, float f2, float f3, float f4, BiConsumer biConsumer) {
        ResolveAnchorOnRooftopFuture.CallbackWrapper callbackWrapper;
        if (biConsumer != null) {
            callbackWrapper = new ResolveAnchorOnRooftopFuture.CallbackWrapper(this.session, biConsumer);
        } else {
            callbackWrapper = null;
        }
        long[] nativeResolveAnchorOnRooftopAsync = nativeResolveAnchorOnRooftopAsync(this.session.nativeWrapperHandle, this.nativeHandle, d, d2, d3, f, f2, f3, f4, callbackWrapper);
        return new ResolveAnchorOnRooftopFuture(this.session, nativeResolveAnchorOnRooftopAsync[0], nativeResolveAnchorOnRooftopAsync[1]);
    }

    @Deprecated
    public Anchor resolveAnchorOnTerrain(double d, double d2, double d3, float f, float f2, float f3, float f4) {
        return new Anchor(nativeResolveAnchorOnTerrain(this.session.nativeWrapperHandle, this.nativeHandle, d, d2, d3, f, f2, f3, f4), this.session);
    }

    public ResolveAnchorOnTerrainFuture resolveAnchorOnTerrainAsync(double d, double d2, double d3, float f, float f2, float f3, float f4, BiConsumer biConsumer) {
        ResolveAnchorOnTerrainFuture.CallbackWrapper callbackWrapper;
        if (biConsumer != null) {
            callbackWrapper = new ResolveAnchorOnTerrainFuture.CallbackWrapper(this.session, biConsumer);
        } else {
            callbackWrapper = null;
        }
        long[] nativeResolveAnchorOnTerrainAsync = nativeResolveAnchorOnTerrainAsync(this.session.nativeWrapperHandle, this.nativeHandle, d, d2, d3, f, f2, f3, f4, callbackWrapper);
        return new ResolveAnchorOnTerrainFuture(this.session, nativeResolveAnchorOnTerrainAsync[0], nativeResolveAnchorOnTerrainAsync[1]);
    }

    public void setLocalizationPerformanceMode(LocalizationPerformanceMode localizationPerformanceMode) {
        nativeSetLocalizationPerformanceMode(this.session.nativeWrapperHandle, this.nativeHandle, localizationPerformanceMode.nativeCode);
    }

    public void setNetworkClient(EarthNetworkClientInterface earthNetworkClientInterface) {
        nativeSetNetworkClient(this.session.nativeWrapperHandle, this.nativeHandle, earthNetworkClientInterface);
    }

    public Anchor createAnchor(double d, double d2, double d3, float[] fArr) {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle, d, d2, d3, fArr[0], fArr[1], fArr[2], fArr[3]), this.session);
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    @Deprecated
    public Anchor createAnchor(Pose pose) {
        throw new IllegalArgumentException("Earth does not support createAnchor using a Pose. Use createAnchor with Geospatial coordinates instead.");
    }
}
