package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aet extends mpe implements moh {
    final /* synthetic */ aeu a;
    final /* synthetic */ int b;
    final /* synthetic */ sr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aet(aeu aeuVar, int i, sr srVar) {
        super(1);
        this.a = aeuVar;
        this.b = i;
        this.c = srVar;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int i;
        abs absVar = (abs) obj;
        aeu aeuVar = this.a;
        if (aeuVar.e == this.b && amr.i(this.c, aeuVar.f) && (absVar instanceof abw)) {
            sr srVar = this.c;
            int i2 = this.b;
            aeu aeuVar2 = this.a;
            long[] jArr = srVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = i3 - length;
                        int i5 = 0;
                        while (true) {
                            i = 8 - ((~i4) >>> 31);
                            if (i5 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj2 = srVar.b[i6];
                                if (srVar.c[i6] != i2) {
                                    abw abwVar = (abw) absVar;
                                    aiy.c(abwVar.k, obj2, aeuVar2);
                                    if (obj2 instanceof acm) {
                                        acm acmVar = (acm) obj2;
                                        if (!abwVar.k.b(acmVar)) {
                                            aiy.b(abwVar.l, acmVar);
                                        }
                                        su suVar = aeuVar2.g;
                                        if (suVar != null) {
                                            suVar.f(obj2);
                                        }
                                    }
                                    srVar.b(i6);
                                }
                            }
                            j >>= 8;
                            i5++;
                        }
                        if (i != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return mlh.a;
    }
}
