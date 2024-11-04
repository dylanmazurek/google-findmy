package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cio {
    private final cih a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final mkt c = new mla(new azp(this, 19));

    public cio(cih cihVar) {
        this.a = cihVar;
    }

    private final cks b() {
        return (cks) this.c.a();
    }

    protected abstract String a();

    public final cks d() {
        this.a.k();
        if (this.b.compareAndSet(false, true)) {
            return b();
        }
        return e();
    }

    public final cks e() {
        cih cihVar = this.a;
        cihVar.k();
        cihVar.l();
        return cihVar.e().a().k(a());
    }

    public final void f(cks cksVar) {
        cksVar.getClass();
        if (cksVar == b()) {
            this.b.set(false);
        }
    }
}
