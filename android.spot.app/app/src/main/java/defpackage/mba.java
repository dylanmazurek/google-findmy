package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mba extends maz {
    private final mbb c;

    public mba(String str, boolean z, mbb mbbVar) {
        super(str, z);
        hwx.S(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        mbbVar.getClass();
        this.c = mbbVar;
    }

    @Override // defpackage.maz
    public final Object a(byte[] bArr) {
        return this.c.a(bArr);
    }

    @Override // defpackage.maz
    public final byte[] b(Object obj) {
        byte[] b = this.c.b(obj);
        b.getClass();
        return b;
    }
}
