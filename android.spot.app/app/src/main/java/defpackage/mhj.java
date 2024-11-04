package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhj extends OutputStream {
    public final List a = new ArrayList();
    private ktf b;

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte b = (byte) i;
        ktf ktfVar = this.b;
        if (ktfVar != null && ktfVar.c() > 0) {
            ((ByteBuffer) this.b.b).put(b);
        } else {
            write(new byte[]{b}, 0, 1);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.b == null) {
            ktf I = mjo.I(i2);
            this.b = I;
            this.a.add(I);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.b.c());
            if (min == 0) {
                int b = this.b.b();
                ktf I2 = mjo.I(Math.max(i2, b + b));
                this.b = I2;
                this.a.add(I2);
            } else {
                this.b.d(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }
}
