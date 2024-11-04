package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class dxa extends jef {
    @Override // defpackage.jef
    protected final /* synthetic */ Object b(Object obj) {
        lmr lmrVar;
        lmq lmqVar = (lmq) obj;
        ljh k = lql.c.k();
        if (lmqVar.a == 1 && a.w(1) == 2) {
            lim limVar = (lim) lmqVar.b;
            if (!k.b.y()) {
                k.t();
            }
            lql lqlVar = (lql) k.b;
            limVar.getClass();
            lqlVar.a = 1;
            lqlVar.b = limVar;
        }
        if (lmqVar.a == 2 && a.w(2) == 3) {
            jef f = dxl.a.f();
            if (lmqVar.a == 2) {
                lmrVar = (lmr) lmqVar.b;
            } else {
                lmrVar = lmr.c;
            }
            lqu lquVar = (lqu) f.e(lmrVar);
            if (!k.b.y()) {
                k.t();
            }
            lql lqlVar2 = (lql) k.b;
            lquVar.getClass();
            lqlVar2.b = lquVar;
            lqlVar2.a = 2;
        }
        return (lql) k.q();
    }

    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        lql lqlVar = (lql) obj;
        ljh k = lmq.c.k();
        if (lqlVar.a == 1 && hzc.aj(1) == 1) {
            lim limVar = (lim) lqlVar.b;
            if (!k.b.y()) {
                k.t();
            }
            lmq lmqVar = (lmq) k.b;
            limVar.getClass();
            lmqVar.a = 1;
            lmqVar.b = limVar;
        }
        if (lqlVar.a == 2 && hzc.aj(2) == 2) {
            lmr lmrVar = (lmr) dxl.a.e((lqu) lqlVar.b);
            if (!k.b.y()) {
                k.t();
            }
            lmq lmqVar2 = (lmq) k.b;
            lmrVar.getClass();
            lmqVar2.b = lmrVar;
            lmqVar2.a = 2;
        }
        return (lmq) k.q();
    }
}
