package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hiv extends hiw {
    public static final ffh a = ffh.a(78315553, loa.LOGGER_OVERRIDE_PROVIDER);
    private final ffc b;
    private final ffc c;
    private final String d;

    public hiv(Context context) {
        fex fexVar = new fex(context, "ONEGOOGLE_MOBILE");
        fexVar.f = new fff() { // from class: hiu
            @Override // defpackage.fff
            public final ffh a() {
                return hiv.a;
            }
        };
        ffc a2 = fexVar.a();
        ffc i = ffc.i(context, "ONEGOOGLE_MOBILE");
        this.b = a2;
        this.c = i;
        this.d = context.getApplicationContext().getPackageName();
    }

    @Override // defpackage.hiw, defpackage.hix
    public final void a(Object obj, lnh lnhVar) {
        gay gayVar;
        int i = 2;
        if (obj != null) {
            gayVar = gay.a(frx.aj(obj));
        } else {
            gayVar = new gay(2, null);
        }
        int i2 = gayVar.b;
        if (i2 == 4) {
            return;
        }
        if (i2 == 1) {
            if (obj != null) {
            } else {
                obj = null;
                b(i, obj, lnhVar);
            }
        }
        i = i2;
        b(i, obj, lnhVar);
    }

    public final void b(int i, Object obj, lnh lnhVar) {
        boolean z;
        boolean z2;
        ffb g;
        int aq = hzc.aq(lnhVar.b);
        boolean z3 = false;
        int i2 = 1;
        if (aq == 0 || aq == 1) {
            z = false;
        } else {
            z = true;
        }
        hwx.J(z);
        int ar = hzc.ar(lnhVar.c);
        if (ar == 0 || ar == 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        hwx.J(z2);
        int K = a.K(lnhVar.e);
        if (K != 0 && K != 1) {
            z3 = true;
        }
        hwx.J(z3);
        ljh k = lni.c.k();
        ljh ljhVar = (ljh) lnhVar.z(5);
        ljhVar.w(lnhVar);
        String str = this.d;
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        lnh lnhVar2 = (lnh) ljhVar.b;
        str.getClass();
        lnhVar2.a |= 64;
        lnhVar2.f = str;
        lnh lnhVar3 = (lnh) ljhVar.q();
        if (!k.b.y()) {
            k.t();
        }
        lni lniVar = (lni) k.b;
        lnhVar3.getClass();
        lniVar.b = lnhVar3;
        lniVar.a |= 1;
        lni lniVar2 = (lni) k.q();
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 != 1) {
                g = this.c.g(lniVar2);
            } else {
                g = this.b.g(lniVar2);
            }
        } else {
            g = this.b.g(lniVar2);
            g.h(String.valueOf(frx.ak(obj)));
        }
        int aq2 = hzc.aq(lnhVar.b);
        if (aq2 != 0) {
            i2 = aq2;
        }
        g.g(i2 - 1);
        g.c();
    }
}
