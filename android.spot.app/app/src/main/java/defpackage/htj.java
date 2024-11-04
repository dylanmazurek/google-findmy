package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htj extends hog implements hpg {
    public final lqz a;
    public final AtomicReference b;
    public final hot c;
    private final jzd d;

    public htj(hpe hpeVar, jzd jzdVar, lqz lqzVar, mko mkoVar, hot hotVar) {
        super((byte[]) null);
        AtomicReference atomicReference = new AtomicReference();
        this.b = atomicReference;
        this.d = jzdVar;
        this.a = lqzVar;
        this.c = hotVar;
        hpeVar.a(jzdVar, new lqz() { // from class: hti
            @Override // defpackage.lqz
            public final Object a() {
                htg c = hth.c();
                c.b(true);
                return c.a();
            }
        }, mkoVar);
        atomicReference.set(hotVar.b(1.0f));
    }

    @Override // defpackage.hpg
    public final void Y() {
        this.d.execute(new hsi(this, 7));
    }
}
