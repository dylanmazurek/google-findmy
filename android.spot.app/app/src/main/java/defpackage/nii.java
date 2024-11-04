package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nii {
    public final nkp a;
    public boolean c;
    public int f;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public nig[] e = new nig[8];

    public nii(nkp nkpVar) {
        this.a = nkpVar;
        this.f = r1.length - 1;
    }

    public final void a() {
        mkm.e(r0, null, 0, this.e.length);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    public final void b(nig nigVar) {
        int i = nigVar.i;
        int i2 = this.d;
        if (i > i2) {
            a();
            return;
        }
        e((this.h + i) - i2);
        int i3 = this.g + 1;
        nig[] nigVarArr = this.e;
        int length = nigVarArr.length;
        if (i3 > length) {
            nig[] nigVarArr2 = new nig[length + length];
            System.arraycopy(nigVarArr, 0, nigVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = nigVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = nigVar;
        this.g++;
        this.h += i;
    }

    public final void c(nks nksVar) {
        long j;
        int[] iArr = njj.a;
        int i = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < nksVar.b(); i2++) {
            j2 += njj.b[ngt.x(nksVar.a(i2))];
        }
        if (((int) ((j2 + 7) >> 3)) < nksVar.b()) {
            nkp nkpVar = new nkp();
            int b = nksVar.b();
            long j3 = 0;
            int i3 = 0;
            while (i < b) {
                int x = ngt.x(nksVar.a(i));
                int i4 = njj.a[x];
                byte b2 = njj.b[x];
                long j4 = j3 << b2;
                long j5 = i4;
                i3 += b2;
                while (true) {
                    j = j4 | j5;
                    if (i3 >= 8) {
                        i3 -= 8;
                        nkpVar.D((int) (j >> i3));
                    }
                }
                i++;
                j3 = j;
            }
            if (i3 > 0) {
                nkpVar.D((int) ((255 >>> i3) | (j3 << (8 - i3))));
            }
            nks m = nkpVar.m();
            d(m.b(), 127, 128);
            this.a.A(m);
            return;
        }
        d(nksVar.b(), 127, 0);
        this.a.A(nksVar);
    }

    public final void d(int i, int i2, int i3) {
        if (i < i2) {
            this.a.D(i | i3);
            return;
        }
        this.a.D(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            this.a.D(128 | (i4 & 127));
            i4 >>>= 7;
        }
        this.a.D(i4);
    }

    public final void e(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                nig nigVar = this.e[length];
                nigVar.getClass();
                int i4 = this.h;
                nigVar.getClass();
                int i5 = nigVar.i;
                this.h = i4 - i5;
                this.g--;
                i3++;
                i -= i5;
                length--;
            }
            nig[] nigVarArr = this.e;
            int i6 = i2 + 1;
            System.arraycopy(nigVarArr, i6, nigVarArr, i6 + i3, this.g);
            nig[] nigVarArr2 = this.e;
            int i7 = this.f + 1;
            Arrays.fill(nigVarArr2, i7, i7 + i3, (Object) null);
            this.f += i3;
        }
    }
}
