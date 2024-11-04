package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhm {
    public final mjt e;
    public boolean f;
    public int g;
    public long i;
    public ktf j;
    private final mhl k;
    public int a = -1;
    public lzb b = lyz.a;
    public final mhk c = new mhk(this);
    public final ByteBuffer d = ByteBuffer.allocate(5);
    public int h = -1;

    public mhm(mhl mhlVar, mjt mjtVar) {
        this.k = mhlVar;
        this.e = mjtVar;
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        mka mkaVar = (mka) inputStream;
        lkq lkqVar = mkaVar.a;
        if (lkqVar != null) {
            int j = lkqVar.j();
            mkaVar.a.f(outputStream);
            mkaVar.a = null;
            return j;
        }
        ByteArrayInputStream byteArrayInputStream = mkaVar.c;
        if (byteArrayInputStream != null) {
            lja ljaVar = mkc.a;
            outputStream.getClass();
            byte[] bArr = new byte[8192];
            long j2 = 0;
            while (true) {
                int read = byteArrayInputStream.read(bArr);
                if (read == -1) {
                    int i = (int) j2;
                    mkaVar.c = null;
                    return i;
                }
                outputStream.write(bArr, 0, read);
                j2 += read;
            }
        } else {
            return 0;
        }
    }

    public final void b(boolean z, boolean z2) {
        ktf ktfVar = this.j;
        this.j = null;
        this.k.q(ktfVar, z, z2);
        this.g = 0;
    }

    public final void c(mhj mhjVar, boolean z) {
        Iterator it = mhjVar.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((ktf) it.next()).b();
        }
        int i2 = this.a;
        if (i2 >= 0 && i > i2) {
            throw new mcc(mca.f.d(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i), Integer.valueOf(this.a))));
        }
        this.d.clear();
        this.d.put(z ? (byte) 1 : (byte) 0).putInt(i);
        ByteBuffer byteBuffer = this.d;
        ktf I = mjo.I(5);
        I.d(byteBuffer.array(), 0, byteBuffer.position());
        if (i == 0) {
            this.j = I;
            return;
        }
        this.k.q(I, false, false);
        this.g = 1;
        List list = mhjVar.a;
        for (int i3 = 0; i3 < list.size() - 1; i3++) {
            this.k.q((ktf) list.get(i3), false, false);
        }
        this.j = (ktf) list.get(list.size() - 1);
        this.i = i;
    }

    public final void d(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            ktf ktfVar = this.j;
            if (ktfVar != null && ktfVar.c() == 0) {
                b(false, false);
            }
            if (this.j == null) {
                this.j = mjo.I(i2);
            }
            int min = Math.min(i2, this.j.c());
            this.j.d(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }
}
