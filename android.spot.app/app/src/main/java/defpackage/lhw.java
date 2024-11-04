package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lhw implements lkq {
    public int y = 0;

    public int d(llg llgVar) {
        throw null;
    }

    @Override // defpackage.lkq
    public final lim e() {
        try {
            int j = j();
            lim limVar = lim.b;
            byte[] bArr = new byte[j];
            liv af = liv.af(bArr);
            cA(af);
            return kzv.o(af, bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    @Override // defpackage.lkq
    public final void f(OutputStream outputStream) {
        int j = j();
        boolean z = liv.e;
        if (j > 4096) {
            j = 4096;
        }
        lis lisVar = new lis(outputStream, j);
        cA(lisVar);
        if (lisVar.c > 0) {
            lisVar.i();
        }
    }

    @Override // defpackage.lkq
    public final byte[] g() {
        try {
            byte[] bArr = new byte[j()];
            liv af = liv.af(bArr);
            cA(af);
            af.ag();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
