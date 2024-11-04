package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djc extends OutputStream {
    private final OutputStream a;
    private byte[] b;
    private int c;
    private final dlu d;

    public djc(OutputStream outputStream, dlu dluVar) {
        this.a = outputStream;
        this.d = dluVar;
        this.b = (byte[]) dluVar.a(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, byte[].class);
    }

    private final void a() {
        int i = this.c;
        if (i > 0) {
            this.a.write(this.b, 0, i);
            this.c = 0;
        }
    }

    private final void b() {
        if (this.c == this.b.length) {
            a();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
            this.a.close();
            byte[] bArr = this.b;
            if (bArr != null) {
                this.d.c(bArr);
                this.b = null;
            }
        } catch (Throwable th) {
            this.a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        a();
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr[i2] = (byte) i;
        b();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.c;
            if (i6 == 0) {
                if (i4 >= this.b.length) {
                    this.a.write(bArr, i5, i4);
                    return;
                }
                i6 = 0;
            }
            int min = Math.min(i4, this.b.length - i6);
            System.arraycopy(bArr, i5, this.b, this.c, min);
            this.c += min;
            i3 += min;
            b();
        } while (i3 < i2);
    }
}
