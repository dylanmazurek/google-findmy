package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjy {
    private final gnv a;
    private final gsk b;
    private final gjn c;
    private final gur d;
    private final guq e;
    private final ghf f;
    private final Context g;
    private final gvg h;
    private final ddg i;

    static {
        joo.m("GnpSdk");
    }

    public gjy(gnv gnvVar, gsk gskVar, gjn gjnVar, gur gurVar, guq guqVar, ghf ghfVar, Context context, gvg gvgVar, ddg ddgVar) {
        this.a = gnvVar;
        this.b = gskVar;
        this.c = gjnVar;
        this.d = gurVar;
        this.e = guqVar;
        this.f = ghfVar;
        this.g = context;
        this.h = gvgVar;
        this.i = ddgVar;
    }

    public final let a(goa goaVar, lgp lgpVar, lgq lgqVar) {
        ljh k = lez.c.k();
        try {
            ljh k2 = ley.d.k();
            long parseLong = Long.parseLong(this.a.b);
            if (!k2.b.y()) {
                k2.t();
            }
            ley leyVar = (ley) k2.b;
            leyVar.a |= 1;
            leyVar.b = parseLong;
            String c = this.b.c();
            if (!k2.b.y()) {
                k2.t();
            }
            ley leyVar2 = (ley) k2.b;
            leyVar2.a |= 2;
            leyVar2.c = c;
            ley leyVar3 = (ley) k2.q();
            if (!k.b.y()) {
                k.t();
            }
            lez lezVar = (lez) k.b;
            leyVar3.getClass();
            lezVar.b = leyVar3;
            lezVar.a |= 1;
            ljh k3 = let.j.k();
            gnv gnvVar = this.a;
            if (!k3.b.y()) {
                k3.t();
            }
            String str = gnvVar.a;
            let letVar = (let) k3.b;
            str.getClass();
            letVar.a |= 2;
            letVar.c = str;
            lfj b = this.d.b(goaVar);
            if (!k3.b.y()) {
                k3.t();
            }
            String str2 = goaVar.b;
            let letVar2 = (let) k3.b;
            b.getClass();
            letVar2.d = b;
            letVar2.a |= 4;
            lfh b2 = this.c.b(str2);
            if (!k3.b.y()) {
                k3.t();
            }
            ljn ljnVar = k3.b;
            let letVar3 = (let) ljnVar;
            b2.getClass();
            letVar3.f = b2;
            letVar3.a |= 8;
            if (!ljnVar.y()) {
                k3.t();
            }
            let letVar4 = (let) k3.b;
            letVar4.b = lgpVar.o;
            letVar4.a |= 1;
            lez lezVar2 = (lez) k.q();
            if (!k3.b.y()) {
                k3.t();
            }
            ljn ljnVar2 = k3.b;
            let letVar5 = (let) ljnVar2;
            lezVar2.getClass();
            letVar5.g = lezVar2;
            letVar5.a |= 16;
            if (!ljnVar2.y()) {
                k3.t();
            }
            let letVar6 = (let) k3.b;
            lgqVar.getClass();
            letVar6.h = lgqVar;
            letVar6.a |= 32;
            ((imq) this.h.e.a()).b(this.g.getPackageName(), false, false);
            if (!TextUtils.isEmpty(this.i.k())) {
                String k4 = this.i.k();
                if (!k3.b.y()) {
                    k3.t();
                }
                let letVar7 = (let) k3.b;
                letVar7.a |= 64;
                letVar7.i = k4;
            } else {
                String str3 = goaVar.n;
                if (str3 != null) {
                    if (!k3.b.y()) {
                        k3.t();
                    }
                    let letVar8 = (let) k3.b;
                    letVar8.a |= 64;
                    letVar8.i = str3;
                }
            }
            List a = this.e.a(goaVar.b());
            if (a != null) {
                if (!k3.b.y()) {
                    k3.t();
                }
                let letVar9 = (let) k3.b;
                ljv ljvVar = letVar9.e;
                if (!ljvVar.c()) {
                    letVar9.e = ljn.p(ljvVar);
                }
                lhv.g(a, letVar9.e);
            }
            return (let) k3.q();
        } catch (gsl e) {
            ghg a2 = this.f.a(lcr.FAILED_TO_GET_IID);
            a2.e(goaVar);
            a2.a();
            throw e;
        }
    }
}
