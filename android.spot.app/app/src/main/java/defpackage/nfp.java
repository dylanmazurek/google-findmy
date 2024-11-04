package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfp {
    private final boolean a;
    private String[] b;
    private String[] c;
    private boolean d;

    public nfp(boolean z) {
        this.a = z;
    }

    public final nfq a() {
        return new nfq(this.a, this.d, this.b, this.c);
    }

    public final void b(String... strArr) {
        strArr.getClass();
        if (this.a) {
            if (strArr.length != 0) {
                this.b = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections");
    }

    @mkp
    public final void c() {
        if (this.a) {
            this.d = true;
            return;
        }
        throw new IllegalArgumentException("no TLS extensions for cleartext connections");
    }

    public final void d(String... strArr) {
        strArr.getClass();
        if (this.a) {
            if (strArr.length != 0) {
                this.c = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections");
    }

    public final void e(nfo... nfoVarArr) {
        nfoVarArr.getClass();
        if (this.a) {
            ArrayList arrayList = new ArrayList(nfoVarArr.length);
            for (nfo nfoVar : nfoVarArr) {
                arrayList.add(nfoVar.w);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            b((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections");
    }

    public final void f(ngr... ngrVarArr) {
        if (this.a) {
            ArrayList arrayList = new ArrayList(ngrVarArr.length);
            for (ngr ngrVar : ngrVarArr) {
                arrayList.add(ngrVar.f);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            d((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections");
    }

    public nfp(nfq nfqVar) {
        nfqVar.getClass();
        this.a = nfqVar.c;
        this.b = nfqVar.e;
        this.c = nfqVar.f;
        this.d = nfqVar.d;
    }
}
