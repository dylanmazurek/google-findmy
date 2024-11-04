package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afc extends mpe implements moh {
    final /* synthetic */ afn a;
    final /* synthetic */ Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afc(afn afnVar, Throwable th) {
        super(1);
        this.a = afnVar;
        this.b = th;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Throwable th = this.b;
        Throwable th2 = (Throwable) obj;
        afn afnVar = this.a;
        synchronized (afnVar.c) {
            if (th != null) {
                if (th2 != null) {
                    if (true == (th2 instanceof CancellationException)) {
                        th2 = null;
                    }
                    if (th2 != null) {
                        mjo.l(th, th2);
                    }
                }
            } else {
                th = null;
            }
            afnVar.e = th;
            afnVar.o.e(afa.ShutDown);
        }
        return mlh.a;
    }
}
