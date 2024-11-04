package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class max extends maz {
    private final may c;

    public max(String str, may mayVar) {
        super(str, false);
        hwx.S(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        mayVar.getClass();
        this.c = mayVar;
    }

    @Override // defpackage.maz
    public final Object a(byte[] bArr) {
        return this.c.a(new String(bArr, jec.a));
    }

    @Override // defpackage.maz
    public final byte[] b(Object obj) {
        return this.c.b(obj).getBytes(jec.a);
    }
}
