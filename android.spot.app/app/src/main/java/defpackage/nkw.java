package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkw implements nll {
    private byte a;
    private final nlf b;
    private final Inflater c;
    private final nkx d;
    private final CRC32 e;

    public nkw(nll nllVar) {
        nlf nlfVar = new nlf(nllVar);
        this.b = nlfVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new nkx(nlfVar, inflater);
        this.e = new CRC32();
    }

    private final void c(nkp nkpVar, long j, long j2) {
        nlg nlgVar = nkpVar.a;
        nlgVar.getClass();
        while (true) {
            long j3 = nlgVar.c - nlgVar.b;
            if (j < j3) {
                break;
            }
            nlgVar = nlgVar.f;
            nlgVar.getClass();
            j -= j3;
        }
        while (j2 > 0) {
            int i = (int) (nlgVar.b + j);
            int min = (int) Math.min(nlgVar.c - i, j2);
            this.e.update(nlgVar.a, i, min);
            nlgVar = nlgVar.f;
            nlgVar.getClass();
            j2 -= min;
            j = 0;
        }
    }

    private static final void d(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + moz.A(mkm.aL(i2), 8) + " != expected 0x" + moz.A(mkm.aL(i), 8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0129, code lost:            if (r0 == 2) goto L50;     */
    @Override // defpackage.nll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(defpackage.nkp r18, long r19) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nkw.a(nkp, long):long");
    }

    @Override // defpackage.nll, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.nll
    public final nln dv() {
        return this.b.dv();
    }
}
