package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxh implements jxd {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public jxh(jbe jbeVar, jxd jxdVar, int i) {
        this.c = i;
        this.a = jbeVar;
        this.b = jxdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jbe] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, jxj] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jxm] */
    /* JADX WARN: Type inference failed for: r2v3, types: [jxd, java.lang.Object] */
    @Override // defpackage.jxd
    public final jyz a(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return ((jxp) this.b).c.b(this.a, obj);
            }
            jbe e = jbu.e(jbu.f(), this.a);
            try {
                jyz a = this.b.a(obj);
                if (a != null) {
                    return a;
                }
                throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
            } finally {
            }
        } else {
            jxk jxkVar = new jxk();
            ?? r1 = this.a;
            jxk jxkVar2 = ((jxp) this.b).c;
            try {
                return ivc.E(r1.a(jxkVar.a, obj));
            } finally {
                jxkVar2.a(jxkVar, jxv.a);
            }
        }
    }

    public final String toString() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return this.a.toString();
            }
            return "propagating=[" + this.b + "]";
        }
        return this.a.toString();
    }

    public jxh(jxp jxpVar, Object obj, int i) {
        this.c = i;
        this.a = obj;
        this.b = jxpVar;
    }
}
