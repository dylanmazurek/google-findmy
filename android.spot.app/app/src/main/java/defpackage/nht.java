package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nht {
    public final nhg a;
    public final nhc b;
    public final ngk c;
    private final List d;
    private final int e;
    private int f;

    public nht(nhg nhgVar, List list, int i, nhc nhcVar, ngk ngkVar) {
        this.a = nhgVar;
        this.d = list;
        this.e = i;
        this.b = nhcVar;
        this.c = ngkVar;
    }

    public static /* synthetic */ nht b(nht nhtVar, int i, nhc nhcVar, ngk ngkVar, int i2) {
        if ((i2 & 1) != 0) {
            i = nhtVar.e;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            nhcVar = nhtVar.b;
        }
        nhc nhcVar2 = nhcVar;
        if ((i2 & 4) != 0) {
            ngkVar = nhtVar.c;
        }
        ngk ngkVar2 = ngkVar;
        ngkVar2.getClass();
        return new nht(nhtVar.a, nhtVar.d, i3, nhcVar2, ngkVar2);
    }

    public final ngn a(ngk ngkVar) {
        ngkVar.getClass();
        if (this.e < this.d.size()) {
            this.f++;
            nhc nhcVar = this.b;
            if (nhcVar != null) {
                if (((nhd) nhcVar.c).b(ngkVar.a)) {
                    if (this.f != 1) {
                        throw new IllegalStateException("network interceptor " + this.d.get(this.e - 1) + " must call proceed() exactly once");
                    }
                } else {
                    throw new IllegalStateException("network interceptor " + this.d.get(this.e - 1) + " must retain the same host and port");
                }
            }
            nht b = b(this, this.e + 1, null, ngkVar, 58);
            nge ngeVar = (nge) this.d.get(this.e);
            ngn a = ngeVar.a(b);
            if (this.b != null && this.e + 1 < this.d.size() && b.f != 1) {
                throw new IllegalStateException(a.af(ngeVar, "network interceptor ", " must call proceed() exactly once"));
            }
            if (a.g != null) {
                return a;
            }
            throw new IllegalStateException(a.af(ngeVar, "interceptor ", " returned a response with no body"));
        }
        throw new IllegalStateException("Check failed.");
    }
}
