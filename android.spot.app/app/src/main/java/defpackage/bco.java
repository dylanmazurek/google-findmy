package defpackage;

import android.content.ContentResolver;
import android.os.CancellationSignal;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bco extends mpe implements moh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bco(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r5v30, types: [mkt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [mvy, java.lang.Object] */
    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        bip bipVar = null;
        boolean z = true;
        boolean z2 = false;
        switch (this.b) {
            case 0:
                if (bcp.b.compareAndSet(false, true)) {
                    this.a.j(mlh.a);
                }
                return mlh.a;
            case 1:
                return new wk(this.a, 2);
            case 2:
                asn asnVar = (asn) obj;
                aqv b = asnVar.n().b();
                mol molVar = ((bcq) this.a).a;
                if (molVar != null) {
                    molVar.a(b, asnVar.n().a);
                }
                return mlh.a;
            case 3:
                this.a.a((aqv) obj, null);
                return mlh.a;
            case 4:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.a).cancel();
                }
                return mlh.a;
            case 5:
                Object obj2 = this.a;
                mqr[] mqrVarArr = bfl.a;
                bfn bfnVar = bfj.a;
                ((bfe) obj).c(bfj.a, mkm.N(obj2));
                return mlh.a;
            case 6:
                bjj bjjVar = (bjj) obj;
                biz bizVar = bjjVar.b;
                int i = bjjVar.c;
                int i2 = bjjVar.d;
                Object obj3 = bjjVar.e;
                return ((dkr) this.a).a(new bjj(bipVar, bizVar)).a();
            case 7:
                this.a.cancel(false);
                return mlh.a;
            case 8:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    Object obj4 = this.a;
                    ((ddh) ((hpd) obj4).j).s(new cbv(th));
                }
                if (((hpd) this.a).d.b()) {
                    cbs m = ((hpd) this.a).m();
                    m.b.set(true);
                    m.a.a();
                }
                return mlh.a;
            case 9:
                ((ddh) obj).getClass();
                return ((cwf) this.a).call();
            case 10:
                ckd ckdVar = (ckd) obj;
                ckdVar.getClass();
                ((lbr) this.a).d = ckdVar;
                return mlh.a;
            case 11:
                chj chjVar = (chj) obj;
                chjVar.getClass();
                return ((cih) this.a).d(chjVar);
            case 12:
                Object obj5 = ((Object[]) this.a)[((Number) obj).intValue()];
                if (obj5 != null) {
                    return (Byte) obj5;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Byte");
            case 13:
                return Boolean.valueOf(((dat) this.a).n(Integer.MAX_VALUE, ((Number) obj).longValue()));
            case 14:
                ((dfd) obj).getClass();
                return this.a;
            case 15:
                bfe bfeVar = (bfe) obj;
                bfeVar.getClass();
                adt adtVar = ((dhv) this.a).c;
                bfn bfnVar2 = dhu.b;
                mqr mqrVar = dhu.a[0];
                bfeVar.c(bfnVar2, adtVar);
                return mlh.a;
            case 16:
                ((awq) obj).getClass();
                awq.i((awr) this.a, 0, 0);
                return mlh.a;
            case 17:
                ((cmd) obj).getClass();
                ((op) this.a).f();
                return mlh.a;
            case 18:
                ((cmd) obj).getClass();
                ((View) this.a).setVisibility(0);
                return mlh.a;
            case 19:
                lqc lqcVar = (lqc) obj;
                lqcVar.getClass();
                if (eyf.s(lqcVar) && !fyo.c((ContentResolver) ((eay) this.a).f.a, "adm:support_managed_profile", true)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                lqc lqcVar2 = (lqc) obj;
                lqcVar2.getClass();
                ehw ehwVar = (ehw) ((eay) this.a).b.get(eyf.i(lqcVar2));
                if (ehwVar != null) {
                    z2 = ehwVar.e();
                }
                return Boolean.valueOf(z2);
        }
    }
}
