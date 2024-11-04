package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ya extends mpe implements moh {
    final /* synthetic */ awr[] a;
    final /* synthetic */ yb b;
    final /* synthetic */ int c;
    final /* synthetic */ awj d;
    final /* synthetic */ int[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(awr[] awrVarArr, yb ybVar, int i, awj awjVar, int[] iArr) {
        super(1);
        this.a = awrVarArr;
        this.b = ybVar;
        this.c = i;
        this.d = awjVar;
        this.e = iArr;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        float f;
        int i = 0;
        int i2 = 0;
        while (true) {
            awr[] awrVarArr = this.a;
            if (i < awrVarArr.length) {
                awr awrVar = awrVarArr[i];
                int i3 = i2 + 1;
                awrVar.getClass();
                Object c = awrVar.c();
                if (c instanceof yg) {
                }
                awj awjVar = this.d;
                int i4 = this.c;
                yb ybVar = this.b;
                bln m = awjVar.m();
                int i5 = i4 - awrVar.a;
                aoo aooVar = ybVar.a;
                if (m == bln.Ltr) {
                    f = aooVar.a;
                } else {
                    f = -aooVar.a;
                }
                awq.f(awrVar, Math.round((i5 / 2.0f) * (f + 1.0f)), this.e[i2], 0.0f);
                i++;
                i2 = i3;
            } else {
                return mlh.a;
            }
        }
    }
}
