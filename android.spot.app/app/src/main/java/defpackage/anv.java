package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anv {
    public final moh a;
    public Object b;
    public int f;
    public sr h;
    public int c = -1;
    public final su i = new su((byte[]) null);
    public final su j = new su((byte[]) null);
    public final sy k = new sy((byte[]) null);
    public final aiu d = new aiu(new acm[16]);
    public final acn e = new anu(this);
    public final su l = new su((byte[]) null);
    public final HashMap g = new HashMap();

    public anv(moh mohVar) {
        this.a = mohVar;
    }

    public final void a(Object obj, Object obj2) {
        aiy.c(this.i, obj2, obj);
        if ((obj2 instanceof acm) && !this.i.b(obj2)) {
            aiy.b(this.l, obj2);
            this.g.remove(obj2);
        }
    }

    public final void b(Object obj, int i, Object obj2, sr srVar) {
        int i2;
        if (this.f <= 0) {
            int d = srVar.d(obj, i);
            if ((obj instanceof acm) && d != i) {
                aci aciVar = (aci) ((acm) obj).c();
                this.g.put(obj, aciVar.d);
                sr srVar2 = aciVar.c;
                su suVar = this.l;
                aiy.b(suVar, obj);
                Object[] objArr = srVar2.b;
                long[] jArr = srVar2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = ~(i3 - length);
                            int i5 = 0;
                            while (true) {
                                i2 = 8 - (i4 >>> 31);
                                if (i5 >= i2) {
                                    break;
                                }
                                if ((j & 255) < 128) {
                                    aoc aocVar = (aoc) objArr[(i3 << 3) + i5];
                                    if (aocVar instanceof aod) {
                                        ((aod) aocVar).k(2);
                                    }
                                    aiy.a(suVar, aocVar, obj);
                                }
                                j >>= 8;
                                i5++;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
            if (d == -1) {
                if (obj instanceof aod) {
                    ((aod) obj).k(2);
                }
                aiy.a(this.i, obj, obj2);
            }
        }
    }
}
