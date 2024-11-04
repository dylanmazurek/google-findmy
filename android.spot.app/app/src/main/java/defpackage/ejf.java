package defpackage;

import android.os.SystemClock;
import com.google.android.apps.adm.R;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejf implements jyj {
    final /* synthetic */ Object a;
    final /* synthetic */ ljn b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public ejf(egh eghVar, lqd lqdVar, String str, int i) {
        this.d = i;
        this.b = lqdVar;
        this.a = str;
        this.c = eghVar;
    }

    @Override // defpackage.jyj
    public final void a(Throwable th) {
        kyx kyxVar;
        kyx kyxVar2;
        if (this.d != 0) {
            ((jni) ((jni) ((jni) egh.a.g()).i(th)).j("com/google/android/apps/adm/integrations/android/LocateActionHandler$1", "onFailure", (char) 190, "LocateActionHandler.java")).r("Failed to get sync state of Android-SPOT device");
            ((egh) this.c).g((lqd) this.b, 7);
            return;
        }
        ljh k = lpy.c.k();
        kyx kyxVar3 = kyx.b;
        if (!k.b.y()) {
            k.t();
        }
        Object obj = this.a;
        Object obj2 = this.c;
        lpy lpyVar = (lpy) k.b;
        kyxVar3.getClass();
        lpyVar.b = kyxVar3;
        lpyVar.a = 3;
        lpy lpyVar2 = (lpy) k.q();
        ljn ljnVar = this.b;
        ci ciVar = new ci(obj2, obj, lpyVar2, 9, (char[]) null);
        ejg ejgVar = (ejg) obj2;
        ejgVar.h(ciVar);
        ljh k2 = lmv.f.k();
        lpy lpyVar3 = (lpy) ljnVar;
        if (lpyVar3.a == 3) {
            kyxVar = (kyx) lpyVar3.b;
        } else {
            kyxVar = kyx.b;
        }
        if (kyxVar.a.size() > 0) {
            if (lpyVar3.a == 3) {
                kyxVar2 = (kyx) lpyVar3.b;
            } else {
                kyxVar2 = kyx.b;
            }
            ljv ljvVar = kyxVar2.a;
            if (hzc.ab(ljvVar, new eja(1))) {
                if (!k2.b.y()) {
                    k2.t();
                }
                lmv.c((lmv) k2.b);
            } else if (hzc.ab(ljvVar, new eja(0))) {
                if (!k2.b.y()) {
                    k2.t();
                }
                lmv lmvVar = (lmv) k2.b;
                lmvVar.a |= 8;
                lmvVar.c = true;
            }
        }
        dxf dxfVar = ejgVar.m;
        lnb lnbVar = lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_FAILURE;
        ljh k3 = lmu.i.k();
        if (!k3.b.y()) {
            k3.t();
        }
        lmu lmuVar = (lmu) k3.b;
        lmv lmvVar2 = (lmv) k2.q();
        lmvVar2.getClass();
        lmuVar.d = lmvVar2;
        lmuVar.a |= 4;
        dxfVar.c(lnbVar, jer.i((lmu) k3.q()), (lqd) obj);
    }

    /* JADX WARN: Type inference failed for: r12v18, types: [jzb, java.lang.Object] */
    @Override // defpackage.jyj
    public final /* synthetic */ void b(Object obj) {
        kyx kyxVar;
        int i = 2;
        if (this.d != 0) {
            loy loyVar = (loy) obj;
            ((egh) this.c).b.i((lqd) this.b, new egc(loyVar, 2), 2);
            ljh k = lpo.c.k();
            if (!k.b.y()) {
                k.t();
            }
            lpo lpoVar = (lpo) k.b;
            loyVar.getClass();
            lpoVar.b = loyVar;
            lpoVar.a = 4;
            lpo lpoVar2 = (lpo) k.q();
            Object obj2 = this.c;
            ljn ljnVar = this.b;
            ((egh) obj2).c.d((lqd) ljnVar, lpoVar2, (String) this.a, ltl.a.a().c());
            ((egh) this.c).f.d(lnb.LOCATE_REMOTE_INSTRUCTION_ISSUED, jdl.a, (lqd) this.b, (String) this.a);
            return;
        }
        final List list = (List) obj;
        final boolean ab = hzc.ab(list, new eja(i));
        els elsVar = new els() { // from class: ejd
            @Override // defpackage.els
            public final void a(eiu eiuVar) {
                for (mcn mcnVar : list) {
                    if (mcnVar.b) {
                        Object obj3 = mcnVar.c;
                        kyh b = kyh.b(((kzb) obj3).h);
                        if (b == null) {
                            b = kyh.UNRECOGNIZED;
                        }
                        eiuVar.c(b, new ebd(obj3, 3));
                        eiuVar.b = jer.i(Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                }
                boolean z = ab;
                eiuVar.d(false);
                eiuVar.c = jdl.a;
                eiuVar.d = Boolean.valueOf(z);
            }
        };
        Object obj3 = this.c;
        ejg ejgVar = (ejg) obj3;
        ilv ilvVar = ejgVar.n;
        Object obj4 = this.a;
        lqd lqdVar = (lqd) obj4;
        ilvVar.q(lqdVar, elsVar, 3);
        ljh k2 = lpy.c.k();
        ljh k3 = kyx.b.k();
        jht c = jht.b(list).c(new eil(4));
        if (!k3.b.y()) {
            k3.t();
        }
        kyx kyxVar2 = (kyx) k3.b;
        ljv ljvVar = kyxVar2.a;
        if (!ljvVar.c()) {
            kyxVar2.a = ljn.p(ljvVar);
        }
        lhv.g(c, kyxVar2.a);
        if (!k2.b.y()) {
            k2.t();
        }
        lpy lpyVar = (lpy) k2.b;
        kyx kyxVar3 = (kyx) k3.q();
        kyxVar3.getClass();
        lpyVar.b = kyxVar3;
        lpyVar.a = 3;
        lpy lpyVar2 = (lpy) k2.q();
        if (ejgVar.n.o(lqdVar)) {
            if (lpyVar2.a == 3) {
                kyxVar = (kyx) lpyVar2.b;
            } else {
                kyxVar = kyx.b;
            }
            if (kyxVar.a.size() == 0) {
                ejgVar.p.m(R.string.location_error_general);
            }
        }
        if (ab) {
            if (ejgVar.j.g()) {
                ejgVar.j.c().cancel(false);
                ejgVar.j = jdl.a;
            }
            ejgVar.k++;
            ejgVar.j = jer.i(ejgVar.f.schedule(new cui(obj3, obj4, 9, (byte[]) null), 2L, TimeUnit.SECONDS));
        }
    }

    public ejf(ejg ejgVar, lqd lqdVar, lpy lpyVar, int i) {
        this.d = i;
        this.a = lqdVar;
        this.b = lpyVar;
        this.c = ejgVar;
    }
}
