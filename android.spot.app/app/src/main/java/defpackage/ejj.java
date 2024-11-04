package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejj {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/LocationUploader");
    public final kzu b;
    public final iah c;
    public final Context d;
    private final Executor e;
    private final kuv f;

    public ejj(kzu kzuVar, kuv kuvVar, iah iahVar, Context context, Executor executor) {
        this.b = kzuVar;
        this.f = kuvVar;
        this.c = iahVar;
        this.d = context;
        this.e = executor;
    }

    public final void a(kyf kyfVar, kyh kyhVar, final iie iieVar) {
        if (kyhVar != kyh.DEVICE_COMPONENT_UNSPECIFIED) {
            jyz jyzVar = jyv.a;
            return;
        }
        ljh k = kzd.c.k();
        ljh k2 = kzs.c.k();
        kxv kxvVar = kyfVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        lim e = iji.e(kxvVar);
        if (!k2.b.y()) {
            k2.t();
        }
        kzs kzsVar = (kzs) k2.b;
        e.getClass();
        kzsVar.a = 7;
        kzsVar.b = e;
        if (!k.b.y()) {
            k.t();
        }
        kzd kzdVar = (kzd) k.b;
        kzs kzsVar2 = (kzs) k2.q();
        kzsVar2.getClass();
        kzdVar.b = kzsVar2;
        kzdVar.a |= 1;
        final kzd kzdVar2 = (kzd) k.q();
        kuv kuvVar = this.f;
        kyq kyqVar = kyfVar.f;
        if (kyqVar == null) {
            kyqVar = kyq.g;
        }
        jbx.d(kuvVar.s(kyqVar)).f(new jxd() { // from class: ejh
            @Override // defpackage.jxd
            public final jyz a(Object obj) {
                boolean z;
                iie iieVar2 = iieVar;
                kyu kyuVar = iieVar2.a;
                iiy iiyVar = (iiy) obj;
                int i = 5;
                ljh ljhVar = (ljh) kyuVar.z(5);
                ljhVar.w(kyuVar);
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                ((kyu) ljhVar.b).c = 0.0f;
                lim e2 = ((kyu) ljhVar.q()).e();
                lim limVar = iiyVar.a;
                jnk jnkVar = iic.a;
                ljh k3 = kyp.d.k();
                if (limVar.d() == 32) {
                    z = true;
                } else {
                    z = false;
                }
                hwx.K(z, "Invalid identity key");
                lim f = ijm.f(ijm.i(limVar), e2);
                if (!k3.b.y()) {
                    k3.t();
                }
                ljn ljnVar = k3.b;
                f.getClass();
                ((kyp) ljnVar).b = f;
                if (!ljnVar.y()) {
                    k3.t();
                }
                ((kyp) k3.b).c = 1;
                kyp kypVar = (kyp) k3.q();
                ljh k4 = kym.f.k();
                ljh k5 = kyo.e.k();
                if (!k5.b.y()) {
                    k5.t();
                }
                ljn ljnVar2 = k5.b;
                kyo kyoVar = (kyo) ljnVar2;
                kypVar.getClass();
                kyoVar.b = kypVar;
                kyoVar.a |= 1;
                float f2 = iieVar2.a.c;
                if (!ljnVar2.y()) {
                    k5.t();
                }
                ((kyo) k5.b).d = f2;
                if (!k4.b.y()) {
                    k4.t();
                }
                ejj ejjVar = ejj.this;
                kym kymVar = (kym) k4.b;
                kyo kyoVar2 = (kyo) k5.q();
                kyoVar2.getClass();
                kymVar.c = kyoVar2;
                kymVar.b = 10;
                kym kymVar2 = (kym) k4.q();
                ljh k6 = kzm.d.k();
                ljh k7 = kzo.c.k();
                ljh k8 = kzn.b.k();
                String n = ivc.n(fma.bH(ejjVar.d));
                if (!k8.b.y()) {
                    k8.t();
                }
                ((kzn) k8.b).a = n;
                if (!k7.b.y()) {
                    k7.t();
                }
                kzo kzoVar = (kzo) k7.b;
                kzn kznVar = (kzn) k8.q();
                kznVar.getClass();
                kzoVar.b = kznVar;
                kzoVar.a = 3;
                kzo kzoVar2 = (kzo) k7.q();
                if (!k6.b.y()) {
                    k6.t();
                }
                kzm kzmVar = (kzm) k6.b;
                kzoVar2.getClass();
                kzmVar.c = kzoVar2;
                kzmVar.a |= 1;
                ljh k9 = kze.e.k();
                if (!k9.b.y()) {
                    k9.t();
                }
                kzd kzdVar3 = kzdVar2;
                kze kzeVar = (kze) k9.b;
                kzdVar3.getClass();
                ljv ljvVar = kzeVar.b;
                if (!ljvVar.c()) {
                    kzeVar.b = ljn.p(ljvVar);
                }
                kzeVar.b.add(kzdVar3);
                if (!k9.b.y()) {
                    k9.t();
                }
                ljn ljnVar3 = k9.b;
                kze kzeVar2 = (kze) ljnVar3;
                kymVar2.getClass();
                kzeVar2.d = kymVar2;
                kzeVar2.a |= 2;
                lln llnVar = iieVar2.b;
                if (!ljnVar3.y()) {
                    k9.t();
                }
                kze kzeVar3 = (kze) k9.b;
                kzeVar3.c = llnVar;
                kzeVar3.a |= 1;
                if (!k6.b.y()) {
                    k6.t();
                }
                kzm kzmVar2 = (kzm) k6.b;
                kze kzeVar4 = (kze) k9.q();
                kzeVar4.getClass();
                ljv ljvVar2 = kzmVar2.b;
                if (!ljvVar2.c()) {
                    kzmVar2.b = ljn.p(ljvVar2);
                }
                kzmVar2.b.add(kzeVar4);
                kzm kzmVar3 = (kzm) k6.q();
                iai iaiVar = (iai) ejjVar.c;
                return jbx.d(iuu.o(iaiVar.b.a(), new ene(4), jxv.a)).f(new hxj(kzmVar3.e(), i), iaiVar.a);
            }
        }, this.e).f(new eji(this, 0), this.e).a(Exception.class, new eil(6), this.e).e(new eil(7), this.e);
    }
}
