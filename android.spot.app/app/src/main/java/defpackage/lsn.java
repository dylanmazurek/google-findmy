package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsn implements lsm {
    private final lsm a;

    private lsn(lsm lsmVar) {
        this.a = lsmVar;
    }

    @Deprecated
    public static lsm b(mko mkoVar) {
        return new lsn(mjo.P(mkoVar));
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* bridge */ /* synthetic */ Object a() {
        return lsg.b(this.a);
    }
}
