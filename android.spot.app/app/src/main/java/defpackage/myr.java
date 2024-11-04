package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myr implements myk {
    public final long b;
    public final long c;

    public myr(long j, long j2) {
        this.b = j;
        this.c = j2;
        if (j >= 0) {
            if (j2 >= 0) {
                return;
            }
            throw new IllegalArgumentException("replayExpiration(" + j2 + " ms) cannot be negative");
        }
        throw new IllegalArgumentException("stopTimeout(" + j + " ms) cannot be negative");
    }

    @Override // defpackage.myk
    public final mwv a(mys mysVar) {
        return mxc.a(new ewm(new mzj(new myp(this, null), mysVar), new myq(null), 5));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof myr) {
            myr myrVar = (myr) obj;
            if (this.b == myrVar.b && this.c == myrVar.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (a.l(this.b) * 31) + a.l(this.c);
    }

    public final String toString() {
        mmg mmgVar = new mmg(2);
        long j = this.b;
        if (j > 0) {
            mmgVar.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.c;
        if (j2 < Long.MAX_VALUE) {
            mmgVar.add("replayExpiration=" + j2 + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + mkm.ar(mkm.M(mmgVar), null, null, null, null, 63) + ")";
    }
}
