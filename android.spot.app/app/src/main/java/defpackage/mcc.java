package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcc extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    public final mca a;

    public mcc(mca mcaVar) {
        this(mcaVar, null);
    }

    public mcc(mca mcaVar, byte[] bArr) {
        super(mca.e(mcaVar), mcaVar.n, true, true);
        this.a = mcaVar;
    }
}
