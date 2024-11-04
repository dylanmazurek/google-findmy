package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nac extends mrt {
    public final nab b;

    public nac(mnb mnbVar) {
        super(mnbVar, true);
        this.b = new nab(this);
    }

    @Override // defpackage.mrt
    protected final void dl(Object obj) {
        this.b.a.d(obj);
    }

    @Override // defpackage.mrt
    protected final void g(Throwable th, boolean z) {
        nab nabVar = this.b;
        if (th instanceof CancellationException) {
            nabVar.a.d(new naa((CancellationException) th));
        } else if (nabVar.a.n(th)) {
            nabVar.b = true;
        }
    }
}
