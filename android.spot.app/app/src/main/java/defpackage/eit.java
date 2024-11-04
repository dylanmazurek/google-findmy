package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eit implements Parcelable {
    public static final eit c = a().a();
    public final jer d;
    public final jer e;
    public final jer f;
    public final jer g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public eit() {
        throw null;
    }

    public static eir a() {
        eir eirVar = new eir((byte[]) null);
        eirVar.b(1);
        eirVar.c(false);
        eirVar.d(false);
        return eirVar;
    }

    public final boolean b() {
        return ((Boolean) this.g.b(new eil(2)).e(false)).booleanValue();
    }

    public final int c(eis eisVar) {
        if (eisVar != eis.IN_RANGE) {
            return 1;
        }
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eit) {
            eit eitVar = (eit) obj;
            if (this.d.equals(eitVar.d) && this.e.equals(eitVar.e) && this.f.equals(eitVar.f) && this.g.equals(eitVar.g) && this.j == eitVar.j && this.h == eitVar.h && this.i == eitVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
        int i2 = this.j;
        a.N(i2);
        int i3 = 1237;
        if (true != this.h) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i4 = ((((hashCode * 1000003) ^ i2) * 1000003) ^ i) * 1000003;
        if (true == this.i) {
            i3 = 1231;
        }
        return i4 ^ i3;
    }

    public final String toString() {
        jer jerVar = this.g;
        jer jerVar2 = this.f;
        jer jerVar3 = this.e;
        return "LocalDeviceComponentState{lastServerLocation=" + this.d.toString() + ", serverLatestLocationTimeMillis=" + jerVar3.toString() + ", lastSeenTimeMillis=" + jerVar2.toString() + ", lastDisconnectTimeMillis=" + jerVar.toString() + ", batteryLevel=" + hwx.c(this.j) + ", isInCase=" + this.h + ", isConnectable=" + this.i + "}";
    }

    public eit(jer jerVar, jer jerVar2, jer jerVar3, jer jerVar4, int i, boolean z, boolean z2) {
        if (jerVar == null) {
            throw new NullPointerException("Null lastServerLocation");
        }
        this.d = jerVar;
        if (jerVar2 != null) {
            this.e = jerVar2;
            if (jerVar3 != null) {
                this.f = jerVar3;
                if (jerVar4 != null) {
                    this.g = jerVar4;
                    if (i != 0) {
                        this.j = i;
                        this.h = z;
                        this.i = z2;
                        return;
                    }
                    throw new NullPointerException("Null batteryLevel");
                }
                throw new NullPointerException("Null lastDisconnectTimeMillis");
            }
            throw new NullPointerException("Null lastSeenTimeMillis");
        }
        throw new NullPointerException("Null serverLatestLocationTimeMillis");
    }
}
