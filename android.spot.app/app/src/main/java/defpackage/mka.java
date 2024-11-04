package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mka extends InputStream implements InputStreamRetargetInterface, mae {
    public lkq a;
    public final lkx b;
    public ByteArrayInputStream c;

    public mka(lkq lkqVar, lkx lkxVar) {
        this.a = lkqVar;
        this.b = lkxVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        lkq lkqVar = this.a;
        if (lkqVar != null) {
            return lkqVar.j();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        lkq lkqVar = this.a;
        if (lkqVar != null) {
            this.c = new ByteArrayInputStream(lkqVar.g());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        lkq lkqVar = this.a;
        if (lkqVar != null) {
            int j = lkqVar.j();
            if (j == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (i2 >= j) {
                lit litVar = new lit(bArr, i, j);
                this.a.cA(litVar);
                litVar.ag();
                this.a = null;
                this.c = null;
                return j;
            }
            this.c = new ByteArrayInputStream(this.a.g());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
