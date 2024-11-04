package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxx implements fxo, fxn, fxl {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // defpackage.fxl
    public final void a() {
        this.a.countDown();
    }

    @Override // defpackage.fxn
    public final void c(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.fxo
    public final void d(Object obj) {
        this.a.countDown();
    }
}
