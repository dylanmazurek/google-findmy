package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lik extends lij {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public lik(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.lim
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.lim
    public byte b(int i) {
        return this.a[i];
    }

    protected int c() {
        return 0;
    }

    @Override // defpackage.lim
    public int d() {
        return this.a.length;
    }

    @Override // defpackage.lim
    public void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.lim
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lim) || d() != ((lim) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (obj instanceof lik) {
            lik likVar = (lik) obj;
            int i = this.c;
            int i2 = likVar.c;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            return g(likVar, 0, d());
        }
        return obj.equals(this);
    }

    @Override // defpackage.lij
    public final boolean g(lim limVar, int i, int i2) {
        if (i2 <= limVar.d()) {
            int i3 = i + i2;
            if (i3 <= limVar.d()) {
                if (limVar instanceof lik) {
                    lik likVar = (lik) limVar;
                    byte[] bArr = this.a;
                    byte[] bArr2 = likVar.a;
                    int c = c() + i2;
                    int c2 = c();
                    int c3 = likVar.c() + i;
                    while (c2 < c) {
                        if (bArr[c2] != bArr2[c3]) {
                            return false;
                        }
                        c2++;
                        c3++;
                    }
                    return true;
                }
                return limVar.j(i, i3).equals(j(0, i2));
            }
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + limVar.d());
        }
        throw new IllegalArgumentException("Length too large: " + i2 + d());
    }

    @Override // defpackage.lim
    public final int i(int i, int i2, int i3) {
        return ljw.a(i, this.a, c() + i2, i3);
    }

    @Override // defpackage.lim
    public final lim j(int i, int i2) {
        int p = p(i, i2, d());
        if (p == 0) {
            return lim.b;
        }
        return new lih(this.a, c() + i, p);
    }

    @Override // defpackage.lim
    public final liq k() {
        return liq.M(this.a, c(), d());
    }

    @Override // defpackage.lim
    public final InputStream l() {
        return new ByteArrayInputStream(this.a, c(), d());
    }

    @Override // defpackage.lim
    public final ByteBuffer m() {
        return ByteBuffer.wrap(this.a, c(), d()).asReadOnlyBuffer();
    }

    @Override // defpackage.lim
    public final void n(lie lieVar) {
        lieVar.a(this.a, c(), d());
    }

    @Override // defpackage.lim
    public final void o(OutputStream outputStream) {
        outputStream.write(A());
    }
}
