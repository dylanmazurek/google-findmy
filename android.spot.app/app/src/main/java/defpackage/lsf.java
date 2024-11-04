package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsf implements lsh {
    private lsm a;

    public static void b(lsf lsfVar, lsm lsmVar) {
        if (lsfVar.a == null) {
            lsfVar.a = lsmVar;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.mko, defpackage.mkn
    public final Object a() {
        lsm lsmVar = this.a;
        if (lsmVar != null) {
            return lsmVar.a();
        }
        throw new IllegalStateException();
    }
}
