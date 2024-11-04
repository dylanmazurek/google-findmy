package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iav implements iat {
    private static final ias b;
    final LruCache a = new LruCache(20);

    static {
        iar iarVar = new iar();
        iarVar.c = 1;
        iarVar.b(false);
        b = iarVar.a();
    }

    @Override // defpackage.iat
    public final ias a(byte[] bArr, lim limVar, Long l, lim limVar2, long j, int i, int i2) {
        iia iiaVar;
        byte b2;
        int i3 = 2;
        int d = limVar.d() + 2;
        int length = bArr.length;
        if (length != d) {
            return b;
        }
        synchronized (this.a) {
            iau iauVar = (iau) this.a.get(limVar2);
            if (iauVar != null && iauVar.a.equals(limVar)) {
                b2 = iauVar.b;
            } else {
                long longValue = l.longValue() - j;
                if (i == 2) {
                    iiaVar = iic.b;
                } else {
                    iiaVar = iic.c;
                }
                byte a = ijm.i(iiaVar.c(lim.t(iic.b(iiaVar, limVar2, i2, (int) longValue).toByteArray()))).a(r8.d() - 1);
                LruCache lruCache = this.a;
                if (limVar != null) {
                    lruCache.put(limVar2, new iau(limVar, a));
                    b2 = a;
                } else {
                    throw new NullPointerException("Null eid");
                }
            }
        }
        int i4 = bArr[length - 1] ^ b2;
        iar iarVar = new iar();
        byte b3 = (byte) i4;
        int i5 = (b3 >>> 1) & 3;
        boolean z = true;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    i3 = 1;
                } else {
                    i3 = 4;
                }
            } else {
                i3 = 3;
            }
        }
        iarVar.c = i3;
        if (1 != (b3 & 1)) {
            z = false;
        }
        iarVar.b(z);
        return iarVar.a();
    }
}
