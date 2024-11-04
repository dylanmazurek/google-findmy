package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afb extends mpe implements mnw {
    final /* synthetic */ afn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afb(afn afnVar) {
        super(0);
        this.a = afnVar;
    }

    @Override // defpackage.mnw
    public final /* bridge */ /* synthetic */ Object a() {
        msd t;
        afn afnVar = this.a;
        synchronized (afnVar.c) {
            t = afnVar.t();
            if (((afa) afnVar.o.c()).compareTo(afa.ShuttingDown) <= 0) {
                throw mkm.aI("Recomposer shutdown; frame clock awaiter will never resume", afnVar.e);
            }
        }
        if (t != null) {
            t.p(mlh.a);
        }
        return mlh.a;
    }
}
