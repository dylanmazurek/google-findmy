package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jfg implements jfe {
    private static final jfe a = new eft(16);
    private volatile jfe b;
    private Object c;
    private final mou d = new mou();

    public jfg(jfe jfeVar) {
        this.b = jfeVar;
    }

    @Override // defpackage.jfe
    public final Object a() {
        jfe jfeVar = this.b;
        jfe jfeVar2 = a;
        if (jfeVar != jfeVar2) {
            synchronized (this.d) {
                if (this.b != jfeVar2) {
                    Object a2 = this.b.a();
                    this.c = a2;
                    this.b = jfeVar2;
                    return a2;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == a) {
            obj = "<supplier that returned " + String.valueOf(this.c) + ">";
        }
        return der.b(obj, "Suppliers.memoize(", ")");
    }
}
