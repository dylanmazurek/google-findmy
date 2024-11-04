package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class chl extends cio {
    public chl(cih cihVar) {
        super(cihVar);
    }

    public final void b(Object obj) {
        cks d = d();
        try {
            c(d, obj);
            d.a.executeInsert();
        } finally {
            f(d);
        }
    }

    protected abstract void c(cks cksVar, Object obj);
}
