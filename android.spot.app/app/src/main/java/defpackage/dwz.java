package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class dwz extends jef {
    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        lmq lmqVar;
        lmr lmrVar;
        lmn lmnVar;
        lmp lmpVar = (lmp) obj;
        ljh k = lqd.d.k();
        if (lmpVar.b == 1 && hzc.at(1) == 2) {
            jef f = dxk.b.f();
            if (lmpVar.b == 1) {
                lmnVar = (lmn) lmpVar.c;
            } else {
                lmnVar = lmn.d;
            }
            lpp lppVar = (lpp) f.e(lmnVar);
            if (!k.b.y()) {
                k.t();
            }
            lqd lqdVar = (lqd) k.b;
            lppVar.getClass();
            lqdVar.b = lppVar;
            lqdVar.a = 1;
        }
        if (lmpVar.b == 3 && hzc.at(3) == 4) {
            jef f2 = dxk.c.f();
            if (lmpVar.b == 3) {
                lmrVar = (lmr) lmpVar.c;
            } else {
                lmrVar = lmr.c;
            }
            lqu lquVar = (lqu) f2.e(lmrVar);
            if (!k.b.y()) {
                k.t();
            }
            lqd lqdVar2 = (lqd) k.b;
            lquVar.getClass();
            lqdVar2.b = lquVar;
            lqdVar2.a = 3;
        }
        if (lmpVar.b == 5 && hzc.at(5) == 6) {
            jef f3 = dxk.d.f();
            if (lmpVar.b == 5) {
                lmqVar = (lmq) lmpVar.c;
            } else {
                lmqVar = lmq.c;
            }
            lql lqlVar = (lql) f3.e(lmqVar);
            if (!k.b.y()) {
                k.t();
            }
            lqd lqdVar3 = (lqd) k.b;
            lqlVar.getClass();
            lqdVar3.b = lqlVar;
            lqdVar3.a = 5;
        }
        if ((lmpVar.a & 1) != 0) {
            lqf b = lqf.b(lmpVar.d);
            if (b == null) {
                b = lqf.UNKNOWN_DEVICE_TYPE;
            }
            if (!k.b.y()) {
                k.t();
            }
            ((lqd) k.b).c = b.a();
        }
        return (lqd) k.q();
    }

    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        lqd lqdVar = (lqd) obj;
        ljh k = lmp.e.k();
        if (lqdVar.a == 1 && hzc.am(1) == 2) {
            lmn lmnVar = (lmn) dxk.b.e((lpp) lqdVar.b);
            if (!k.b.y()) {
                k.t();
            }
            lmp lmpVar = (lmp) k.b;
            lmnVar.getClass();
            lmpVar.c = lmnVar;
            lmpVar.b = 1;
        }
        if (lqdVar.a == 3 && hzc.am(3) == 4) {
            lmr lmrVar = (lmr) dxk.c.e((lqu) lqdVar.b);
            if (!k.b.y()) {
                k.t();
            }
            lmp lmpVar2 = (lmp) k.b;
            lmrVar.getClass();
            lmpVar2.c = lmrVar;
            lmpVar2.b = 3;
        }
        if (lqdVar.a == 5 && hzc.am(5) == 6) {
            lmq lmqVar = (lmq) dxk.d.e((lql) lqdVar.b);
            if (!k.b.y()) {
                k.t();
            }
            lmp lmpVar3 = (lmp) k.b;
            lmqVar.getClass();
            lmpVar3.c = lmqVar;
            lmpVar3.b = 5;
        }
        lqf b = lqf.b(lqdVar.c);
        if (b == null) {
            b = lqf.UNRECOGNIZED;
        }
        if (!k.b.y()) {
            k.t();
        }
        lmp lmpVar4 = (lmp) k.b;
        lmpVar4.d = b.a();
        lmpVar4.a |= 1;
        return (lmp) k.q();
    }
}
