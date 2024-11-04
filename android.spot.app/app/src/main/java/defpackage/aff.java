package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aff extends mpe implements mnw {
    final /* synthetic */ ach a;
    final /* synthetic */ sy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aff(sy syVar, ach achVar) {
        super(0);
        this.b = syVar;
        this.a = achVar;
    }

    @Override // defpackage.mnw
    public final /* bridge */ /* synthetic */ Object a() {
        int i;
        sy syVar = this.b;
        Object[] objArr = syVar.b;
        long[] jArr = syVar.a;
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
                        if ((255 & j) < 128) {
                            this.a.o(objArr[(i2 << 3) + i4]);
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
        return mlh.a;
    }
}
