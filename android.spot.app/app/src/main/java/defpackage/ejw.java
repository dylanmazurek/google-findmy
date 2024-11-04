package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejw extends dza {
    public ejw() {
        super(lqf.SPOT_DEVICE);
    }

    @Override // defpackage.dza
    protected final boolean b(lqd lqdVar, hzc hzcVar) {
        lqu lquVar;
        if (hzcVar instanceof lov) {
            String str = ((lov) hzcVar).c;
            if (lqdVar.a == 3) {
                lquVar = (lqu) lqdVar.b;
            } else {
                lquVar = lqu.c;
            }
            kxv kxvVar = lquVar.b;
            if (kxvVar == null) {
                kxvVar = kxv.b;
            }
            if (amr.i(str, kxvVar.a)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
