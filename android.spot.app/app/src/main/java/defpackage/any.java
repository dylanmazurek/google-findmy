package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class any extends mpe implements mnw {
    final /* synthetic */ anz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public any(anz anzVar) {
        super(0);
        this.a = anzVar;
    }

    @Override // defpackage.mnw
    public final /* bridge */ /* synthetic */ Object a() {
        Object[] objArr;
        int i;
        int i2;
        do {
            anz anzVar = this.a;
            synchronized (anzVar.f) {
                if (!anzVar.c) {
                    anzVar.c = true;
                    try {
                        aiu aiuVar = anzVar.e;
                        int i3 = aiuVar.b;
                        if (i3 > 0) {
                            Object[] objArr2 = aiuVar.a;
                            int i4 = 0;
                            while (true) {
                                anv anvVar = (anv) objArr2[i4];
                                sy syVar = anvVar.k;
                                moh mohVar = anvVar.a;
                                Object[] objArr3 = syVar.b;
                                long[] jArr = syVar.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i5 = 0;
                                    while (true) {
                                        long j = jArr[i5];
                                        i = i3;
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = i5 - length;
                                            int i7 = 0;
                                            while (true) {
                                                objArr = objArr2;
                                                i2 = 8 - ((~i6) >>> 31);
                                                if (i7 >= i2) {
                                                    break;
                                                }
                                                if ((j & 255) < 128) {
                                                    mohVar.a(objArr3[(i5 << 3) + i7]);
                                                }
                                                j >>= 8;
                                                i7++;
                                                objArr2 = objArr;
                                            }
                                            if (i2 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr2;
                                        }
                                        if (i5 == length) {
                                            break;
                                        }
                                        i5++;
                                        i3 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    objArr = objArr2;
                                    i = i3;
                                }
                                syVar.d();
                                i4++;
                                int i8 = i;
                                if (i4 >= i8) {
                                    break;
                                }
                                i3 = i8;
                                objArr2 = objArr;
                            }
                        }
                        anzVar.c = false;
                    } finally {
                    }
                }
            }
        } while (this.a.b());
        return mlh.a;
    }
}
