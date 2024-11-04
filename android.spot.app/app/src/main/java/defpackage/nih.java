package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nih {
    public final nkr c;
    public int e;
    public int f;
    private int g;
    public int a = 4096;
    public final List b = new ArrayList();
    public nig[] d = new nig[8];

    public nih(nll nllVar) {
        this.c = new nlf(nllVar);
        this.g = r2.length - 1;
    }

    public static final boolean h(int i) {
        if (i >= 0) {
            nig[] nigVarArr = nij.a;
            int length = nij.a.length;
            if (i <= 60) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final int i() {
        return ngt.x(this.c.d());
    }

    public final int a(int i) {
        return this.g + 1 + i;
    }

    public final int b(int i, int i2) {
        int i3 = i & i2;
        if (i3 >= i2) {
            int i4 = 0;
            while (true) {
                int i5 = i();
                if ((i5 & 128) != 0) {
                    i2 += (i5 & 127) << i4;
                    i4 += 7;
                } else {
                    return i2 + (i5 << i4);
                }
            }
        } else {
            return i3;
        }
    }

    public final nks c(int i) {
        if (h(i)) {
            nig[] nigVarArr = nij.a;
            return nij.a[i].g;
        }
        nig[] nigVarArr2 = nij.a;
        int length = nij.a.length;
        int a = a(i - 61);
        if (a >= 0) {
            nig[] nigVarArr3 = this.d;
            if (a < nigVarArr3.length) {
                nig nigVar = nigVarArr3[a];
                nigVar.getClass();
                return nigVar.g;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final nks d() {
        int i;
        int i2 = i();
        int i3 = i2 & 128;
        long b = b(i2, 127);
        if (i3 == 128) {
            nkp nkpVar = new nkp();
            int[] iArr = njj.a;
            nkr nkrVar = this.c;
            oz ozVar = njj.c;
            int i4 = 0;
            long j = 0;
            int i5 = 0;
            while (j < b) {
                int x = ngt.x(nkrVar.d());
                int i6 = i4 << 8;
                i5 += 8;
                while (true) {
                    i = i6 | x;
                    if (i5 >= 8) {
                        int i7 = i5 - 8;
                        Object obj = ozVar.c;
                        obj.getClass();
                        ozVar = ((oz[]) obj)[(i >>> i7) & 255];
                        ozVar.getClass();
                        if (ozVar.c == null) {
                            nkpVar.D(ozVar.b);
                            i5 -= ozVar.a;
                            ozVar = njj.c;
                        } else {
                            i5 = i7;
                        }
                    }
                }
                j++;
                i4 = i;
            }
            while (i5 > 0) {
                Object obj2 = ozVar.c;
                obj2.getClass();
                oz ozVar2 = ((oz[]) obj2)[(i4 << (8 - i5)) & 255];
                ozVar2.getClass();
                if (ozVar2.c != null || ozVar2.a > i5) {
                    break;
                }
                nkpVar.D(ozVar2.b);
                i5 -= ozVar2.a;
                ozVar = njj.c;
            }
            return nkpVar.m();
        }
        return this.c.n(b);
    }

    public final void e() {
        mkm.e(r0, null, 0, this.d.length);
        this.g = this.d.length - 1;
        this.e = 0;
        this.f = 0;
    }

    public final void f(int i) {
        int i2;
        if (i > 0) {
            int length = this.d.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.g;
                if (length < i2 || i <= 0) {
                    break;
                }
                nig nigVar = this.d[length];
                nigVar.getClass();
                int i4 = this.f;
                int i5 = nigVar.i;
                this.f = i4 - i5;
                this.e--;
                i3++;
                i -= i5;
                length--;
            }
            nig[] nigVarArr = this.d;
            int i6 = i2 + 1;
            System.arraycopy(nigVarArr, i6, nigVarArr, i6 + i3, this.e);
            this.g += i3;
        }
    }

    public final void g(nig nigVar) {
        this.b.add(nigVar);
        int i = nigVar.i;
        int i2 = this.a;
        if (i > i2) {
            e();
            return;
        }
        f((this.f + i) - i2);
        int i3 = this.e + 1;
        nig[] nigVarArr = this.d;
        int length = nigVarArr.length;
        if (i3 > length) {
            nig[] nigVarArr2 = new nig[length + length];
            System.arraycopy(nigVarArr, 0, nigVarArr2, length, length);
            this.g = this.d.length - 1;
            this.d = nigVarArr2;
        }
        int i4 = this.g;
        this.g = i4 - 1;
        this.d[i4] = nigVar;
        this.e++;
        this.f += i;
    }
}
