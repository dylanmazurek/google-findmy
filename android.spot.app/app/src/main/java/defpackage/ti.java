package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ti extends mpe implements moh {
    final /* synthetic */ awr[] a;
    final /* synthetic */ tj b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(awr[] awrVarArr, tj tjVar, int i, int i2) {
        super(1);
        this.a = awrVarArr;
        this.b = tjVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int i = 0;
        while (true) {
            awr[] awrVarArr = this.a;
            if (i < awrVarArr.length) {
                awr awrVar = awrVarArr[i];
                if (awrVar != null) {
                    int i2 = this.d;
                    long a = this.b.a.b.a(bef.m(awrVar.a, awrVar.b), bef.m(this.c, i2), bln.Ltr);
                    awq.f(awrVar, blk.a(a), blk.b(a), 0.0f);
                }
                i++;
            } else {
                return mlh.a;
            }
        }
    }
}
