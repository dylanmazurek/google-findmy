package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lle extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ llf a;
    private lld b;
    private lij c;
    private int d;
    private int e;
    private int f;
    private int g;

    public lle(llf llfVar) {
        this.a = llfVar;
        d();
    }

    private final int a() {
        return this.a.d - (this.f + this.e);
    }

    private final int b(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            c();
            if (this.c == null) {
                break;
            }
            int min = Math.min(this.d - this.e, i3);
            if (bArr != null) {
                this.c.y(bArr, this.e, i, min);
                i += min;
            }
            this.e += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    private final void c() {
        if (this.c != null) {
            int i = this.e;
            int i2 = this.d;
            if (i == i2) {
                this.f += i2;
                int i3 = 0;
                this.e = 0;
                if (this.b.hasNext()) {
                    lij next = this.b.next();
                    this.c = next;
                    i3 = next.d();
                } else {
                    this.c = null;
                }
                this.d = i3;
            }
        }
    }

    private final void d() {
        lld lldVar = new lld(this.a);
        this.b = lldVar;
        lij next = lldVar.next();
        this.c = next;
        this.d = next.d();
        this.e = 0;
        this.f = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return a();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.g = this.f + this.e;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        c();
        lij lijVar = this.c;
        if (lijVar == null) {
            return -1;
        }
        int i = this.e;
        this.e = i + 1;
        return lijVar.a(i) & 255;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        d();
        b(null, 0, this.g);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j >= 0) {
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return b(null, 0, (int) j);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
            int b = b(bArr, i, i2);
            return b == 0 ? (i2 > 0 || a() == 0) ? -1 : 0 : b;
        }
        throw new IndexOutOfBoundsException();
    }
}
