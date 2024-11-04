package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoz {
    public final String a;
    public final boolean b;
    public final nfe c;
    public final ndq d;
    public final String e;
    public final Long f;
    public final boolean g;
    public final hnf h;
    public final int i;

    public hoz() {
        throw null;
    }

    public static hoy a() {
        hoy hoyVar = new hoy();
        hoyVar.c(false);
        hoyVar.d(false);
        hoyVar.b(0);
        return hoyVar;
    }

    public final boolean equals(Object obj) {
        ndq ndqVar;
        String str;
        Long l;
        hnf hnfVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hoz) {
            hoz hozVar = (hoz) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(hozVar.a) : hozVar.a == null) {
                if (this.b == hozVar.b && this.c.equals(hozVar.c) && ((ndqVar = this.d) != null ? ndqVar.equals(hozVar.d) : hozVar.d == null) && ((str = this.e) != null ? str.equals(hozVar.e) : hozVar.e == null) && ((l = this.f) != null ? l.equals(hozVar.f) : hozVar.f == null) && this.g == hozVar.g && ((hnfVar = this.h) != null ? hnfVar.equals(hozVar.h) : hozVar.h == null) && this.i == hozVar.i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int i2;
        int i3;
        int hashCode2;
        int hashCode3;
        String str = this.a;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i6 = hashCode ^ 1000003;
        nfe nfeVar = this.c;
        if (nfeVar.y()) {
            i2 = nfeVar.i();
        } else {
            int i7 = nfeVar.y;
            if (i7 == 0) {
                i7 = nfeVar.i();
                nfeVar.y = i7;
            }
            i2 = i7;
        }
        int i8 = ((((i6 * 1000003) ^ i) * 1000003) ^ i2) * 1000003;
        ndq ndqVar = this.d;
        if (ndqVar == null) {
            i3 = 0;
        } else if (ndqVar.y()) {
            i3 = ndqVar.i();
        } else {
            int i9 = ndqVar.y;
            if (i9 == 0) {
                i9 = ndqVar.i();
                ndqVar.y = i9;
            }
            i3 = i9;
        }
        int i10 = (i8 ^ i3) * 1000003;
        String str2 = this.e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        Long l = this.f;
        if (l == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        if (true == this.g) {
            i5 = 1231;
        }
        int i13 = (i12 ^ i5) * 1000003;
        hnf hnfVar = this.h;
        if (hnfVar != null) {
            i4 = hnfVar.hashCode();
        }
        return ((i13 ^ i4) * 1000003) ^ this.i;
    }

    public final String toString() {
        hnf hnfVar = this.h;
        ndq ndqVar = this.d;
        return "Metric{customEventName=" + this.a + ", isEventNameConstant=" + this.b + ", metric=" + String.valueOf(this.c) + ", metricExtension=" + String.valueOf(ndqVar) + ", accountableComponentName=" + this.e + ", sampleRatePermille=" + this.f + ", isUnsampled=" + this.g + ", debugLogsTime=" + String.valueOf(hnfVar) + ", debugLogsSize=" + this.i + "}";
    }

    public hoz(String str, boolean z, nfe nfeVar, ndq ndqVar, String str2, Long l, boolean z2, hnf hnfVar, int i) {
        this.a = str;
        this.b = z;
        this.c = nfeVar;
        this.d = ndqVar;
        this.e = str2;
        this.f = l;
        this.g = z2;
        this.h = hnfVar;
        this.i = i;
    }
}
