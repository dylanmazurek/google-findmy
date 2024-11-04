package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jtd extends InputStream implements InputStreamRetargetInterface {
    int a = 0;
    int b = 0;
    int c = 0;
    boolean d = false;
    final /* synthetic */ Reader e;
    final /* synthetic */ jte f;

    public jtd(jte jteVar, Reader reader) {
        this.e = reader;
        this.f = jteVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        while (true) {
            int read = this.e.read();
            if (read == -1) {
                if (!this.d) {
                    if (!this.f.b.c(this.c)) {
                        throw new jta("Invalid input length " + this.c);
                    }
                }
                return -1;
            }
            this.c++;
            char c = (char) read;
            Character ch = this.f.c;
            if (ch != null) {
                ch.charValue();
                if (c == '=') {
                    if (!this.d) {
                        int i = this.c;
                        if (i == 1) {
                            break;
                        }
                        if (!this.f.b.c(i - 1)) {
                            break;
                        }
                    }
                    this.d = true;
                }
            }
            if (!this.d) {
                int i2 = this.a;
                jsx jsxVar = this.f.b;
                int i3 = i2 << jsxVar.c;
                this.a = i3;
                int b = jsxVar.b(c) | i3;
                this.a = b;
                int i4 = this.b + this.f.b.c;
                this.b = i4;
                if (i4 >= 8) {
                    int i5 = i4 - 8;
                    this.b = i5;
                    return (b >> i5) & 255;
                }
            } else {
                throw new jta("Expected padding character but found '" + c + "' at index " + this.c);
            }
        }
        throw new jta("Padding cannot start at index " + this.c);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        hwx.T(i, i3, bArr.length);
        int i4 = i;
        while (i4 < i3) {
            int read = read();
            if (read == -1) {
                int i5 = i4 - i;
                if (i5 == 0) {
                    return -1;
                }
                return i5;
            }
            bArr[i4] = (byte) read;
            i4++;
        }
        return i4 - i;
    }
}
