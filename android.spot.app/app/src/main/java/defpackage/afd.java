package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afd extends mpe implements moh {
    final /* synthetic */ afn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afd(afn afnVar) {
        super(1);
        this.a = afnVar;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Throwable th = (Throwable) obj;
        CancellationException aI = mkm.aI("Recomposer effect job completed", th);
        afn afnVar = this.a;
        synchronized (afnVar.c) {
            muf mufVar = afnVar.d;
            if (mufVar != null) {
                afnVar.o.e(afa.ShuttingDown);
                mufVar.s(aI);
                afnVar.k = null;
                mufVar.w(new afc(afnVar, th));
            } else {
                afnVar.e = aI;
                afnVar.o.e(afa.ShutDown);
            }
        }
        return mlh.a;
    }
}
