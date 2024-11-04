package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ede extends dza {
    public ede() {
        super(lqf.FASTPAIR_DEVICE);
    }

    @Override // defpackage.dza
    protected final boolean b(lqd lqdVar, hzc hzcVar) {
        lql lqlVar;
        lqu lquVar;
        lql lqlVar2;
        lqu lquVar2;
        lql lqlVar3;
        lql lqlVar4;
        lim limVar;
        if (hzcVar instanceof lot) {
            if (lqdVar.a == 5) {
                lqlVar3 = (lql) lqdVar.b;
            } else {
                lqlVar3 = lql.c;
            }
            if (lqlVar3.a == 1) {
                lim limVar2 = ((lot) hzcVar).c;
                if (lqdVar.a == 5) {
                    lqlVar4 = (lql) lqdVar.b;
                } else {
                    lqlVar4 = lql.c;
                }
                if (lqlVar4.a == 1) {
                    limVar = (lim) lqlVar4.b;
                } else {
                    limVar = lim.b;
                }
                if (amr.i(limVar2, limVar)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (hzcVar instanceof lou) {
            if (lqdVar.a == 5) {
                lqlVar = (lql) lqdVar.b;
            } else {
                lqlVar = lql.c;
            }
            if (lqlVar.a == 2) {
                lquVar = (lqu) lqlVar.b;
            } else {
                lquVar = lqu.c;
            }
            if ((lquVar.a & 1) != 0) {
                String str = ((lou) hzcVar).c;
                if (lqdVar.a == 5) {
                    lqlVar2 = (lql) lqdVar.b;
                } else {
                    lqlVar2 = lql.c;
                }
                if (lqlVar2.a == 2) {
                    lquVar2 = (lqu) lqlVar2.b;
                } else {
                    lquVar2 = lqu.c;
                }
                kxv kxvVar = lquVar2.b;
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
        return false;
    }
}
