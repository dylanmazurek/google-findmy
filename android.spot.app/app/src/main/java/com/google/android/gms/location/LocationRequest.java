package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.amr;
import defpackage.fma;
import defpackage.fra;
import defpackage.frf;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new fra();
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public float g;
    public boolean h;
    public long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final WorkSource m;
    public final ClientIdentity n;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    private static String c(long j) {
        String sb;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        synchronized (frf.a) {
            frf.a.setLength(0);
            StringBuilder sb2 = frf.a;
            frf.a(j, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    public final boolean a() {
        long j = this.d;
        if (j > 0 && (j >> 1) >= this.b) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.a == 105) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            boolean a = a();
            if (this.a == locationRequest.a && ((b() || this.b == locationRequest.b) && this.c == locationRequest.c && a == locationRequest.a() && ((!a || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && this.h == locationRequest.h && this.j == locationRequest.j && this.k == locationRequest.k && this.l == locationRequest.l && this.m.equals(locationRequest.m) && amr.g(this.n, locationRequest.n)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.m});
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0156, code lost:            if (((java.lang.Integer) r1).intValue() != 0) goto L75;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0158, code lost:            r0.append(", ");        r0.append(r8.m);     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013c, code lost:            if (((java.lang.Boolean) r2).booleanValue() == false) goto L75;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.L(parcel, 1, this.a);
        fma.M(parcel, 2, this.b);
        fma.M(parcel, 3, this.c);
        fma.L(parcel, 6, this.f);
        fma.K(parcel, 7, this.g);
        fma.M(parcel, 8, this.d);
        fma.G(parcel, 9, this.h);
        fma.M(parcel, 10, this.e);
        fma.M(parcel, 11, this.i);
        fma.L(parcel, 12, this.j);
        fma.L(parcel, 13, this.k);
        fma.G(parcel, 15, this.l);
        fma.W(parcel, 16, this.m, i);
        fma.W(parcel, 17, this.n, i);
        fma.F(parcel, D);
    }

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, ClientIdentity clientIdentity) {
        long j7;
        this.a = i;
        if (i == 105) {
            this.b = Long.MAX_VALUE;
            j7 = j;
        } else {
            j7 = j;
            this.b = j7;
        }
        this.c = j2;
        this.d = j3;
        this.e = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.f = i2;
        this.g = f;
        this.h = z;
        this.i = j6 != -1 ? j6 : j7;
        this.j = i3;
        this.k = i4;
        this.l = z2;
        this.m = workSource;
        this.n = clientIdentity;
    }
}
