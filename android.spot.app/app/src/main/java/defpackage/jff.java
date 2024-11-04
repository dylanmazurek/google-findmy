package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jff implements Serializable, jfe {
    private static final long serialVersionUID = 0;
    final jfe a;
    volatile transient boolean b;
    transient Object c;
    private final mou d = new mou();

    public jff(jfe jfeVar) {
        this.a = jfeVar;
    }

    @Override // defpackage.jfe
    public final Object a() {
        if (!this.b) {
            synchronized (this.d) {
                if (!this.b) {
                    Object a = this.a.a();
                    this.c = a;
                    this.b = true;
                    return a;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            obj = "<supplier that returned " + String.valueOf(this.c) + ">";
        } else {
            obj = this.a;
        }
        return der.c(obj, "Suppliers.memoize(", ")");
    }
}
