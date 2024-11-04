package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class dxb extends jef {
    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        lmr lmrVar = (lmr) obj;
        ljh k = lqu.c.k();
        if ((lmrVar.a & 1) != 0) {
            jef f = dxm.a.f();
            lmo lmoVar = lmrVar.b;
            if (lmoVar == null) {
                lmoVar = lmo.c;
            }
            kxv kxvVar = (kxv) f.e(lmoVar);
            if (!k.b.y()) {
                k.t();
            }
            lqu lquVar = (lqu) k.b;
            kxvVar.getClass();
            lquVar.b = kxvVar;
            lquVar.a |= 1;
        }
        return (lqu) k.q();
    }

    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        lqu lquVar = (lqu) obj;
        ljh k = lmr.c.k();
        if ((lquVar.a & 1) != 0) {
            jef jefVar = dxm.a;
            kxv kxvVar = lquVar.b;
            if (kxvVar == null) {
                kxvVar = kxv.b;
            }
            lmo lmoVar = (lmo) jefVar.e(kxvVar);
            if (!k.b.y()) {
                k.t();
            }
            lmr lmrVar = (lmr) k.b;
            lmoVar.getClass();
            lmrVar.b = lmoVar;
            lmrVar.a |= 1;
        }
        return (lmr) k.q();
    }
}
