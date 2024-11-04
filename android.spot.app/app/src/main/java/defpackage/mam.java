package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mam {
    public static final mam a = new mam(null, mca.b, false);
    public final map b;
    public final mca c;
    public final boolean d;
    private final mjo e = null;

    public mam(map mapVar, mca mcaVar, boolean z) {
        this.b = mapVar;
        mcaVar.getClass();
        this.c = mcaVar;
        this.d = z;
    }

    public static mam a(mca mcaVar) {
        hwx.K(!mcaVar.f(), "error status shouldn't be OK");
        return new mam(null, mcaVar, false);
    }

    public static mam b(map mapVar) {
        return new mam(mapVar, mca.b, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mam)) {
            return false;
        }
        mam mamVar = (mam) obj;
        if (amr.g(this.b, mamVar.b) && amr.g(this.c, mamVar.c)) {
            mjo mjoVar = mamVar.e;
            if (amr.g(null, null) && this.d == mamVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, null, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("subchannel", this.b);
        q.b("streamTracerFactory", null);
        q.b("status", this.c);
        q.f("drop", this.d);
        return q.toString();
    }
}
