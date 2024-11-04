package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfq {
    public static final nfq a;
    public static final nfq b;
    private static final nfo[] g;
    private static final nfo[] h;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final String[] f;

    static {
        nfo nfoVar = nfo.u;
        nfo nfoVar2 = nfo.v;
        nfo nfoVar3 = nfo.n;
        nfo nfoVar4 = nfo.p;
        nfo nfoVar5 = nfo.o;
        nfo nfoVar6 = nfo.q;
        nfo nfoVar7 = nfo.s;
        nfo nfoVar8 = nfo.r;
        nfo[] nfoVarArr = {nfo.t, nfoVar, nfoVar2, nfoVar3, nfoVar4, nfoVar5, nfoVar6, nfoVar7, nfoVar8};
        g = nfoVarArr;
        nfo[] nfoVarArr2 = {nfo.t, nfoVar, nfoVar2, nfoVar3, nfoVar4, nfoVar5, nfoVar6, nfoVar7, nfoVar8, nfo.l, nfo.m, nfo.f, nfo.g, nfo.d, nfo.e, nfo.c};
        h = nfoVarArr2;
        nfp nfpVar = new nfp(true);
        nfpVar.e((nfo[]) Arrays.copyOf(nfoVarArr, 9));
        nfpVar.f(ngr.a, ngr.b);
        nfpVar.c();
        nfpVar.a();
        nfp nfpVar2 = new nfp(true);
        nfpVar2.e((nfo[]) Arrays.copyOf(nfoVarArr2, 16));
        nfpVar2.f(ngr.a, ngr.b);
        nfpVar2.c();
        a = nfpVar2.a();
        nfp nfpVar3 = new nfp(true);
        nfpVar3.e((nfo[]) Arrays.copyOf(nfoVarArr2, 16));
        nfpVar3.f(ngr.a, ngr.b, ngr.c, ngr.d);
        nfpVar3.c();
        nfpVar3.a();
        b = new nfp(false).a();
    }

    public nfq(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = strArr2;
    }

    public final List a() {
        String[] strArr = this.e;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(nfo.x.F(str));
            }
            return mkm.ag(arrayList);
        }
        return null;
    }

    public final List b() {
        String[] strArr = this.f;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                ngr ngrVar = ngr.a;
                arrayList.add(mkm.be(str));
            }
            return mkm.ag(arrayList);
        }
        return null;
    }

    public final boolean c(SSLSocket sSLSocket) {
        if (!this.c) {
            return false;
        }
        String[] strArr = this.f;
        if (strArr != null && !ngt.s(strArr, sSLSocket.getEnabledProtocols(), mms.b)) {
            return false;
        }
        String[] strArr2 = this.e;
        if (strArr2 != null && !ngt.s(strArr2, sSLSocket.getEnabledCipherSuites(), nfo.a)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nfq)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.c;
        nfq nfqVar = (nfq) obj;
        if (z != nfqVar.c) {
            return false;
        }
        if (z && (!Arrays.equals(this.e, nfqVar.e) || !Arrays.equals(this.f, nfqVar.f) || this.d != nfqVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        if (this.c) {
            String[] strArr = this.e;
            int i2 = 0;
            if (strArr != null) {
                i = Arrays.hashCode(strArr);
            } else {
                i = 0;
            }
            String[] strArr2 = this.f;
            if (strArr2 != null) {
                i2 = Arrays.hashCode(strArr2);
            }
            return ((((i + 527) * 31) + i2) * 31) + (!this.d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.c) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(b(), "[all enabled]") + ", supportsTlsExtensions=" + this.d + ")";
    }
}
