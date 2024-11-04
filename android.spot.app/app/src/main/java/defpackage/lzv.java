package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzv {
    public final String a;
    public final lzu b;
    public final long c;
    public final mad d;
    public final mad e;

    public lzv(String str, lzu lzuVar, long j, mad madVar) {
        this.a = str;
        lzuVar.getClass();
        this.b = lzuVar;
        this.c = j;
        this.d = null;
        this.e = madVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lzv) {
            lzv lzvVar = (lzv) obj;
            if (amr.g(this.a, lzvVar.a) && amr.g(this.b, lzvVar.b) && this.c == lzvVar.c) {
                mad madVar = lzvVar.d;
                if (amr.g(null, null) && amr.g(this.e, lzvVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), null, this.e});
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("description", this.a);
        q.b("severity", this.b);
        q.e("timestampNanos", this.c);
        q.b("channelRef", null);
        q.b("subchannelRef", this.e);
        return q.toString();
    }
}
