package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzp implements mnb {
    public final Throwable a;
    private final /* synthetic */ mnb b;

    public mzp(Throwable th, mnb mnbVar) {
        this.a = th;
        this.b = mnbVar;
    }

    @Override // defpackage.mnb
    public final Object fold(Object obj, mol molVar) {
        return this.b.fold(obj, molVar);
    }

    @Override // defpackage.mnb
    public final mmz get(mna mnaVar) {
        return this.b.get(mnaVar);
    }

    @Override // defpackage.mnb
    public final mnb minusKey(mna mnaVar) {
        return this.b.minusKey(mnaVar);
    }

    @Override // defpackage.mnb
    public final mnb plus(mnb mnbVar) {
        return this.b.plus(mnbVar);
    }
}
