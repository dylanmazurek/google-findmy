package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrz extends mrt {
    public final mto b;
    private final Thread e;

    public mrz(mnb mnbVar, Thread thread, mto mtoVar) {
        super(mnbVar, true);
        this.e = thread;
        this.b = mtoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mun
    public final void a(Object obj) {
        if (!amr.i(Thread.currentThread(), this.e)) {
            LockSupport.unpark(this.e);
        }
    }

    @Override // defpackage.mun
    protected final boolean l() {
        return true;
    }
}
