package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class xv extends mpe implements moh {
    final /* synthetic */ awr[] a;
    final /* synthetic */ List b;
    final /* synthetic */ awj c;
    final /* synthetic */ mpl d;
    final /* synthetic */ mpl e;
    final /* synthetic */ xw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(awr[] awrVarArr, List list, awj awjVar, mpl mplVar, mpl mplVar2, xw xwVar) {
        super(1);
        this.a = awrVarArr;
        this.b = list;
        this.c = awjVar;
        this.d = mplVar;
        this.e = mplVar2;
        this.f = xwVar;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        awq awqVar = (awq) obj;
        int i = 0;
        int i2 = 0;
        while (true) {
            awr[] awrVarArr = this.a;
            if (i2 < awrVarArr.length) {
                xw xwVar = this.f;
                mpl mplVar = this.e;
                mpl mplVar2 = this.d;
                awj awjVar = this.c;
                List list = this.b;
                awr awrVar = awrVarArr[i2];
                awrVar.getClass();
                xt.b(awqVar, awrVar, (awg) list.get(i), awjVar.m(), mplVar2.a, mplVar.a, xwVar.a);
                i2++;
                i++;
            } else {
                return mlh.a;
            }
        }
    }
}
