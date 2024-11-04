package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfb implements kaa {
    private final kaa a;
    private final byte[] b;

    public kfb(kaa kaaVar, byte[] bArr) {
        this.a = kaaVar;
        this.b = bArr;
    }

    @Override // defpackage.kaa
    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = this.b;
        if (bArr2.length == 0) {
            return this.a.a(bArr);
        }
        return jql.I(bArr2, this.a.a(bArr));
    }
}
