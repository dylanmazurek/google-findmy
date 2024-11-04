package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vq implements vf {
    private final ixa a;

    public vq(ixa ixaVar) {
        this.a = ixaVar;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [moh, java.lang.Object] */
    @Override // defpackage.uu
    public final /* bridge */ /* synthetic */ wq a(atk atkVar) {
        long[] jArr;
        int[] iArr;
        int i;
        long[] jArr2;
        int[] iArr2;
        sc scVar = new sc(((se) this.a.c).e + 2);
        se seVar = new se(((se) this.a.c).e);
        se seVar2 = (se) this.a.c;
        int[] iArr3 = seVar2.b;
        Object[] objArr = seVar2.c;
        long[] jArr3 = seVar2.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            int i6 = iArr3[i5];
                            vp vpVar = (vp) objArr[i5];
                            scVar.d(i6);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            va vaVar = (va) atkVar.b.a(vpVar.a);
                            vg vgVar = vpVar.b;
                            int i7 = vpVar.c;
                            seVar.d(i6, new ww(vaVar, vgVar));
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                        }
                        j >>= 8;
                        i4++;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    if (i != 8) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        }
        if (!se.b((se) this.a.c, 0)) {
            int i8 = scVar.b;
            if (i8 >= 0) {
                scVar.c(i8 + 1);
                int[] iArr4 = scVar.a;
                int i9 = scVar.b;
                if (i9 != 0) {
                    mkm.p(iArr4, iArr4, 1, 0, i9);
                }
                iArr4[0] = 0;
                scVar.b++;
            } else {
                throw new IndexOutOfBoundsException("Index 0 must be in 0.." + scVar.b);
            }
        }
        ixa ixaVar = this.a;
        if (!se.b((se) ixaVar.c, ixaVar.b)) {
            scVar.d(this.a.b);
        }
        int[] iArr5 = scVar.a;
        int i10 = scVar.b;
        iArr5.getClass();
        Arrays.sort(iArr5, 0, i10);
        ixa ixaVar2 = this.a;
        return new wx(scVar, seVar, ixaVar2.b, ixaVar2.a, vi.b);
    }
}
