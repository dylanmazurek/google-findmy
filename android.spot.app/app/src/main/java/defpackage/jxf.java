package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxf implements Callable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public jxf(jbe jbeVar, Callable callable, int i) {
        this.c = i;
        this.b = jbeVar;
        this.a = callable;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, jbe] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jxl] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, jbe] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        jbe e;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                ((kuv) this.a).b.getClass();
                jxk jxkVar = new jxk();
                Object obj = ((kuv) this.a).a;
                Object obj2 = this.b;
                try {
                    jck jckVar = jxkVar.a;
                    ?? r2 = ((njz) obj2).a;
                    int i2 = jbn.a;
                    jckVar.getClass();
                    e = jbu.e(jbu.f(), r2);
                    ((jxk) obj).a(jxkVar, jxv.a);
                    return null;
                } catch (Throwable th) {
                    ((jxk) obj).a(jxkVar, jxv.a);
                    throw th;
                }
            }
            e = jbu.e(jbu.f(), this.b);
            try {
                return this.a.call();
            } finally {
            }
        } else {
            return this.a.a(((jxk) this.b).a);
        }
    }

    public final String toString() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return ((njz) this.b).toString();
            }
            return "propagating=[" + this.a + "]";
        }
        return this.a.toString();
    }

    public jxf(jxl jxlVar, jxk jxkVar, int i) {
        this.c = i;
        this.a = jxlVar;
        this.b = jxkVar;
    }

    public jxf(kuv kuvVar, njz njzVar, int i) {
        this.c = i;
        this.b = njzVar;
        this.a = kuvVar;
    }
}
