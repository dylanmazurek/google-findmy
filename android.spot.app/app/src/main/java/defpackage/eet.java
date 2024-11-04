package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eet extends dza {
    public eet() {
        super(lqf.ANDROID_DEVICE);
    }

    @Override // defpackage.dza
    protected final boolean b(lqd lqdVar, hzc hzcVar) {
        lpp lppVar;
        lpp lppVar2;
        if (hzcVar instanceof loq) {
            long j = ((loq) hzcVar).c;
            if (lqdVar.a == 1) {
                lppVar2 = (lpp) lqdVar.b;
            } else {
                lppVar2 = lpp.d;
            }
            if (j == lppVar2.b) {
                return true;
            }
            return false;
        }
        if (hzcVar instanceof lov) {
            String str = ((lov) hzcVar).c;
            if (lqdVar.a == 1) {
                lppVar = (lpp) lqdVar.b;
            } else {
                lppVar = lpp.d;
            }
            lqu lquVar = lppVar.c;
            if (lquVar == null) {
                lquVar = lqu.c;
            }
            kxv kxvVar = lquVar.b;
            if (kxvVar == null) {
                kxvVar = kxv.b;
            }
            return amr.i(str, kxvVar.a);
        }
        return false;
    }
}
