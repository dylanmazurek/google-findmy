package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import defpackage.a;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StreetscapeGeometry extends TrackableBase {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum Quality {
        NONE(0),
        BUILDING_LOD_1(1),
        BUILDING_LOD_2(2);

        final int nativeCode;

        Quality(int i) {
            this.nativeCode = i;
        }

        static Quality forNumber(int i) {
            for (Quality quality : values()) {
                if (quality.nativeCode == i) {
                    return quality;
                }
            }
            throw new FatalException(a.ae(i, "Unexpected value for native StreetscapeGeometry.Quality, value="));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum Type {
        TERRAIN(0),
        BUILDING(1);

        final int nativeCode;

        Type(int i) {
            this.nativeCode = i;
        }

        static Type forNumber(int i) {
            for (Type type : values()) {
                if (type.nativeCode == i) {
                    return type;
                }
            }
            throw new FatalException(a.ae(i, "Unexpected value for native StreetscapeGeometry.Type, value="));
        }
    }

    public StreetscapeGeometry(long j, Session session) {
        super(j, session);
    }

    private native long nativeAcquireMesh(long j, long j2);

    private native Pose nativeGetMeshPose(long j, long j2);

    private native int nativeGetQuality(long j, long j2);

    private native int nativeGetType(long j, long j2);

    private native void nativeReleaseStreetscapeGeometry(long j, long j2);

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.ar.core.TrackableBase
    protected void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseStreetscapeGeometry(this.session.nativeSymbolTableHandle, j);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    public Mesh getMesh() {
        long nativeAcquireMesh = nativeAcquireMesh(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeAcquireMesh != 0) {
            return new Mesh(nativeAcquireMesh, this.session);
        }
        return null;
    }

    public Pose getMeshPose() {
        return nativeGetMeshPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Quality getQuality() {
        return Quality.forNumber(nativeGetQuality(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    public Type getType() {
        return Type.forNumber(nativeGetType(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }
}
