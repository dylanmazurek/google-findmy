package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpl {
    public static final cpl a = new cpl();
    public final cxa b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;
    public final int j;

    public cpl() {
        mlz mlzVar = mlz.a;
        this.b = new cxa((byte[]) null);
        this.j = 1;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = mlzVar;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT >= 24 && this.i.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !amr.i(getClass(), obj.getClass())) {
            return false;
        }
        cpl cplVar = (cpl) obj;
        if (this.c != cplVar.c || this.d != cplVar.d || this.e != cplVar.e || this.f != cplVar.f || this.g != cplVar.g || this.h != cplVar.h || !amr.i(a(), cplVar.a()) || this.j != cplVar.j) {
            return false;
        }
        return amr.i(this.i, cplVar.i);
    }

    public final int hashCode() {
        int i;
        int i2 = this.j;
        a.N(i2);
        long j = this.h;
        Set set = this.i;
        long j2 = this.g;
        int hashCode = (((((((((((((i2 * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + set.hashCode();
        NetworkRequest a2 = a();
        if (a2 != null) {
            i = a2.hashCode();
        } else {
            i = 0;
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + ((Object) boz.c(this.j)) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public cpl(cpl cplVar) {
        cplVar.getClass();
        this.c = cplVar.c;
        this.d = cplVar.d;
        this.b = cplVar.b;
        this.j = cplVar.j;
        this.e = cplVar.e;
        this.f = cplVar.f;
        this.i = cplVar.i;
        this.g = cplVar.g;
        this.h = cplVar.h;
    }

    public cpl(cxa cxaVar, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        cxaVar.getClass();
        if (i == 0) {
            throw null;
        }
        this.b = cxaVar;
        this.j = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j;
        this.h = j2;
        this.i = set;
    }
}
