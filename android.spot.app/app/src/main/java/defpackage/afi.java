package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afi extends mpe implements mol {
    final /* synthetic */ afn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afi(afn afnVar) {
        super(2);
        this.a = afnVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        msd msdVar;
        int i;
        Set set = (Set) obj;
        afn afnVar = this.a;
        synchronized (afnVar.c) {
            if (((afa) afnVar.o.c()).compareTo(afa.Idle) >= 0) {
                sy syVar = afnVar.p;
                if (set instanceof aix) {
                    sy syVar2 = ((aix) set).a;
                    Object[] objArr = syVar2.b;
                    long[] jArr = syVar2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = i2 - length;
                                int i4 = 0;
                                while (true) {
                                    i = 8 - ((~i3) >>> 31);
                                    if (i4 >= i) {
                                        break;
                                    }
                                    if ((j & 255) < 128) {
                                        Object obj3 = objArr[(i2 << 3) + i4];
                                        if (!(obj3 instanceof aod) || ((aod) obj3).l(1)) {
                                            syVar.i(obj3);
                                        }
                                    }
                                    j >>= 8;
                                    i4++;
                                }
                                if (i != 8) {
                                    break;
                                }
                            }
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    for (Object obj4 : set) {
                        if (!(obj4 instanceof aod) || ((aod) obj4).l(1)) {
                            syVar.i(obj4);
                        }
                    }
                }
                msdVar = afnVar.t();
            } else {
                msdVar = null;
            }
        }
        if (msdVar != null) {
            msdVar.p(mlh.a);
        }
        return mlh.a;
    }
}
