package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hha {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;

    public hha(Object obj) {
        this.a = obj;
    }

    public static jer a(gzr gzrVar) {
        gzo gzoVar = gzrVar.a;
        if (gzoVar != null && gzoVar.b.g()) {
            return gzoVar.b;
        }
        return jdl.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, gzq] */
    public final void b(gzt gztVar, Object obj) {
        if (obj != null && gztVar != null) {
            gztVar.a(obj).a(this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, gzq] */
    public final void c(gzt gztVar, Object obj) {
        if (obj != null && gztVar != null) {
            gztVar.a(obj).b(this.a);
        }
    }

    public final void d(apc apcVar, int i) {
        this.b = new bth(apcVar, i, 3);
    }
}
