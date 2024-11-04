package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lit extends liv {
    private final byte[] a;
    private final int b;
    private int c;

    public lit(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            int i3 = i + i2;
            int length = bArr.length;
            if ((i | i2 | (length - i3)) >= 0) {
                this.a = bArr;
                this.c = i;
                this.b = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        throw new NullPointerException("buffer");
    }

    @Override // defpackage.liv
    public final void A(int i, int i2) {
        C(llz.c(i, i2));
    }

    @Override // defpackage.liv
    public final void B(int i, int i2) {
        A(i, 0);
        C(i2);
    }

    @Override // defpackage.liv
    public final void C(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.a;
                int i2 = this.c;
                this.c = i2 + 1;
                bArr[i2] = (byte) ((i | 128) & 255);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new liu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
            }
        }
        byte[] bArr2 = this.a;
        int i3 = this.c;
        this.c = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // defpackage.liv
    public final void D(int i, long j) {
        A(i, 0);
        E(j);
    }

    @Override // defpackage.liv
    public final void E(long j) {
        if (!liv.e || b() < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.a;
                    int i = this.c;
                    this.c = i + 1;
                    bArr[i] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new liu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
                }
            }
            byte[] bArr2 = this.a;
            int i2 = this.c;
            this.c = i2 + 1;
            bArr2[i2] = (byte) j;
            return;
        }
        while (true) {
            int i3 = (int) j;
            if ((j & (-128)) == 0) {
                byte[] bArr3 = this.a;
                int i4 = this.c;
                this.c = i4 + 1;
                llu.n(bArr3, i4, (byte) i3);
                return;
            }
            byte[] bArr4 = this.a;
            int i5 = this.c;
            this.c = i5 + 1;
            llu.n(bArr4, i5, (byte) ((i3 | 128) & 255));
            j >>>= 7;
        }
    }

    @Override // defpackage.liv
    public final void F(byte[] bArr, int i) {
        C(i);
        c(bArr, 0, i);
    }

    @Override // defpackage.liv, defpackage.lie
    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    @Override // defpackage.liv
    public final int b() {
        return this.b - this.c;
    }

    public final void c(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.a, this.c, i2);
            this.c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new liu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), Integer.valueOf(i2)), e);
        }
    }

    @Override // defpackage.liv
    public final void j(byte b) {
        try {
            byte[] bArr = this.a;
            int i = this.c;
            this.c = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new liu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.liv
    public final void l(int i, boolean z) {
        A(i, 0);
        j(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.liv
    public final void m(int i, lim limVar) {
        A(i, 2);
        n(limVar);
    }

    @Override // defpackage.liv
    public final void n(lim limVar) {
        C(limVar.d());
        limVar.n(this);
    }

    @Override // defpackage.liv
    public final void o(int i, int i2) {
        A(i, 5);
        p(i2);
    }

    @Override // defpackage.liv
    public final void p(int i) {
        try {
            byte[] bArr = this.a;
            int i2 = this.c;
            int i3 = i2 + 1;
            this.c = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.c = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.c = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.c = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new liu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.liv
    public final void q(int i, long j) {
        A(i, 1);
        r(j);
    }

    @Override // defpackage.liv
    public final void r(long j) {
        try {
            byte[] bArr = this.a;
            int i = this.c;
            int i2 = i + 1;
            this.c = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.c = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.c = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.c = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.c = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.c = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.c = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.c = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new liu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.liv
    public final void s(int i, int i2) {
        A(i, 0);
        t(i2);
    }

    @Override // defpackage.liv
    public final void t(int i) {
        if (i >= 0) {
            C(i);
        } else {
            E(i);
        }
    }

    @Override // defpackage.liv
    public final void u(int i, lkq lkqVar, llg llgVar) {
        A(i, 2);
        C(((lhw) lkqVar).d(llgVar));
        llgVar.m(lkqVar, this.f);
    }

    @Override // defpackage.liv
    public final void v(lkq lkqVar) {
        C(lkqVar.j());
        lkqVar.cA(this);
    }

    @Override // defpackage.liv
    public final void w(int i, lkq lkqVar) {
        A(1, 3);
        B(2, i);
        A(3, 2);
        v(lkqVar);
        A(1, 4);
    }

    @Override // defpackage.liv
    public final void x(int i, lim limVar) {
        A(1, 3);
        B(2, i);
        m(3, limVar);
        A(1, 4);
    }

    @Override // defpackage.liv
    public final void y(int i, String str) {
        A(i, 2);
        z(str);
    }

    @Override // defpackage.liv
    public final void z(String str) {
        int i = this.c;
        try {
            int aa = aa(str.length() * 3);
            int aa2 = aa(str.length());
            if (aa2 == aa) {
                int i2 = i + aa2;
                this.c = i2;
                int a = llw.a(str, this.a, i2, b());
                this.c = i;
                C((a - i) - aa2);
                this.c = a;
                return;
            }
            C(llw.b(str));
            this.c = llw.a(str, this.a, this.c, b());
        } catch (IndexOutOfBoundsException e) {
            throw new liu(e);
        } catch (llv e2) {
            this.c = i;
            ah(str, e2);
        }
    }
}
