package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nle extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ nlf a;

    public nle(nlf nlfVar) {
        this.a = nlfVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        nlf nlfVar = this.a;
        if (!nlfVar.c) {
            return (int) Math.min(nlfVar.b.b, 2147483647L);
        }
        throw new IOException("closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        nlf nlfVar = this.a;
        if (nlfVar.c) {
            throw new IOException("closed");
        }
        nkp nkpVar = nlfVar.b;
        if (nkpVar.b == 0 && nlfVar.a.a(nkpVar, 8192L) == -1) {
            return -1;
        }
        return this.a.b.d() & 255;
    }

    public final String toString() {
        nlf nlfVar = this.a;
        Objects.toString(nlfVar);
        return nlfVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (!this.a.c) {
            mkm.aM(bArr.length, i, i2);
            nlf nlfVar = this.a;
            nkp nkpVar = nlfVar.b;
            if (nkpVar.b == 0 && nlfVar.a.a(nkpVar, 8192L) == -1) {
                return -1;
            }
            return this.a.b.e(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}
