package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqe {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public nqe() {
        throw null;
    }

    public final String a(nog nogVar) {
        StringBuilder sb = new StringBuilder(d().b());
        try {
            Map map = nnt.a;
            long a = nogVar.a();
            nno b = nogVar.b();
            if (b == null) {
                b = npg.O();
            }
            nrc d = d();
            try {
                nno b2 = b(b);
                nnw z = b2.z();
                int a2 = z.a(a);
                long j = a2;
                long j2 = a + j;
                if ((a ^ j2) < 0 && (j ^ a) >= 0) {
                    z = nnw.a;
                    a2 = 0;
                    j2 = a;
                }
                d.e(sb, j2, b2.a(), a2, z, null);
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
        }
        return sb.toString();
    }

    public final nno b(nno nnoVar) {
        Object obj = this.c;
        nno c = nnt.c(nnoVar);
        if (obj == null) {
            obj = c;
        }
        Object obj2 = this.d;
        if (obj2 != null) {
            return ((nno) obj).b((nnw) obj2);
        }
        return (nno) obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nrc] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, nra] */
    public final nqe c() {
        Object obj = this.d;
        nnw nnwVar = nnw.a;
        if (obj == nnwVar) {
            return this;
        }
        return new nqe((nrc) this.a, (nra) this.b, (nno) this.c, nnwVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nrc] */
    public final nrc d() {
        ?? r0 = this.a;
        if (r0 != 0) {
            return r0;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nra] */
    public final nrb e() {
        return nrb.b(this.b);
    }

    public final int f() {
        return ((ljm) this.d).a;
    }

    public final llx g() {
        return ((ljm) this.d).b;
    }

    public final void h(Object obj) {
        if (((ljm) this.d).a() != lly.ENUM) {
            return;
        }
        ((Integer) obj).intValue();
        throw null;
    }

    public nqe(llx llxVar, Object obj, llx llxVar2, Object obj2) {
        this.c = llxVar;
        this.b = obj;
        this.d = llxVar2;
        this.a = obj2;
    }

    public nqe(mbg mbgVar, lys lysVar, mbc mbcVar, String str) {
        this.d = lysVar;
        this.b = mbgVar;
        this.c = mbcVar;
        this.a = str;
    }

    public nqe(nrc nrcVar, nra nraVar) {
        this.a = nrcVar;
        this.b = nraVar;
        this.c = null;
        this.d = null;
    }

    public nqe(nrc nrcVar, nra nraVar, nno nnoVar, nnw nnwVar) {
        this.a = nrcVar;
        this.b = nraVar;
        this.c = nnoVar;
        this.d = nnwVar;
    }

    public nqe(lkq lkqVar, Object obj, lkq lkqVar2, ljm ljmVar) {
        if (lkqVar != null) {
            if (ljmVar.b == llx.MESSAGE && lkqVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.c = lkqVar;
            this.a = obj;
            this.b = lkqVar2;
            this.d = ljmVar;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }
}
