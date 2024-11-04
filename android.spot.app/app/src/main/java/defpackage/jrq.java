package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jrq implements jsb {
    public final jsa a(byte[] bArr) {
        return c(bArr, bArr.length);
    }

    public jsc b(int i) {
        hwx.M(true, "expectedInputSize must be >= 0 but was %s", i);
        return d();
    }

    public jsa c(byte[] bArr, int i) {
        hwx.T(0, i, bArr.length);
        jsc b = b(i);
        b.b(bArr, 0, i);
        return b.k();
    }
}
