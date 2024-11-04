package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mfj implements maa {
    private final /* synthetic */ int a;

    public mfj(int i) {
        this.a = i;
    }

    @Override // defpackage.mbb
    public final /* synthetic */ Object a(byte[] bArr) {
        if (this.a != 0) {
            return bArr;
        }
        if (bArr.length >= 3) {
            return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
        }
        throw new NumberFormatException("Malformed status code ".concat(new String(bArr, mab.a)));
    }

    @Override // defpackage.mbb
    public final /* synthetic */ byte[] b(Object obj) {
        if (this.a != 0) {
            return (byte[]) obj;
        }
        throw new UnsupportedOperationException();
    }
}
