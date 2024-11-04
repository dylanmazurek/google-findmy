package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mby implements mbb {
    @Override // defpackage.mbb
    public final /* synthetic */ Object a(byte[] bArr) {
        int i;
        int i2;
        byte b;
        List list = mca.a;
        int length = bArr.length;
        char c = 0;
        if (length == 1) {
            if (bArr[0] == 48) {
                return mca.b;
            }
            length = 1;
        }
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b - 48) * 10;
                c = 1;
            }
            return mca.d.d("Unknown code ".concat(new String(bArr, jec.a)));
        }
        i = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57 && (i2 = i + (b2 - 48)) < mca.a.size()) {
            return (mca) mca.a.get(i2);
        }
        return mca.d.d("Unknown code ".concat(new String(bArr, jec.a)));
    }

    @Override // defpackage.mbb
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        return ((mca) obj).l.s;
    }
}
