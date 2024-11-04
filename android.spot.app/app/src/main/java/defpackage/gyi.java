package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyi implements gkb {
    private static final joo a = joo.m("GnpSdk");
    private final goj b;
    private final grt c;
    private final jer d;
    private final gll e;
    private final ddg f;

    public gyi(goj gojVar, grt grtVar, jer jerVar, gll gllVar, ddg ddgVar) {
        this.b = gojVar;
        this.d = jerVar;
        this.c = grtVar;
        this.e = gllVar;
        this.f = ddgVar;
    }

    public static int c(let letVar) {
        ljh ljhVar = (ljh) letVar.z(5);
        ljhVar.w(letVar);
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        let letVar2 = (let) ljhVar.b;
        let letVar3 = let.j;
        letVar2.h = null;
        letVar2.a &= -33;
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        ljn ljnVar = ljhVar.b;
        let letVar4 = (let) ljnVar;
        letVar4.a &= -2;
        letVar4.b = 0;
        if (!ljnVar.y()) {
            ljhVar.t();
        }
        let letVar5 = (let) ljhVar.b;
        letVar5.a &= -65;
        letVar5.i = let.j.i;
        if ((letVar.a & 4) != 0) {
            lfj lfjVar = letVar.d;
            if (lfjVar == null) {
                lfjVar = lfj.e;
            }
            ljh ljhVar2 = (ljh) lfjVar.z(5);
            ljhVar2.w(lfjVar);
            if (!ljhVar2.b.y()) {
                ljhVar2.t();
            }
            lfj lfjVar2 = (lfj) ljhVar2.b;
            lfjVar2.a &= -5;
            lfjVar2.d = lfj.e.d;
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            let letVar6 = (let) ljhVar.b;
            lfj lfjVar3 = (lfj) ljhVar2.q();
            lfjVar3.getClass();
            letVar6.d = lfjVar3;
            letVar6.a |= 4;
        }
        let letVar7 = (let) ljhVar.q();
        if (letVar7.y()) {
            return letVar7.i();
        }
        int i = letVar7.y;
        if (i == 0) {
            i = letVar7.i();
            letVar7.y = i;
        }
        return i;
    }

    @Override // defpackage.gkb
    public final void a(goa goaVar, lkq lkqVar, Throwable th) {
        String str;
        jol jolVar = (jol) ((jol) a.k().i(th)).j("com/google/android/libraries/notifications/registration/impl/StoreTargetCallback", "onFailure", 118, "StoreTargetCallback.java");
        if (goaVar != null) {
            str = frx.aN(goaVar.b);
        } else {
            str = "";
        }
        jolVar.u("Registration finished for account: %s (FAILURE).", str);
        if (goaVar != null) {
            gnz gnzVar = new gnz(goaVar);
            gnzVar.h(3);
            this.b.e(jis.q(gnzVar.a()));
            if (this.d.g()) {
                ((gxx) this.d.c()).a();
            }
        }
    }

    @Override // defpackage.gkb
    public final void b(goa goaVar, lkq lkqVar, lkq lkqVar2) {
        long epochMilli;
        ((jol) a.k().j("com/google/android/libraries/notifications/registration/impl/StoreTargetCallback", "onSuccess", 57, "StoreTargetCallback.java")).r("Registration finished (SUCCESS)");
        let letVar = (let) lkqVar;
        leu leuVar = (leu) lkqVar2;
        if (goaVar != null) {
            gnz gnzVar = new gnz(goaVar);
            gnzVar.f(c(letVar));
            gnzVar.h(1);
            epochMilli = fma.i().toEpochMilli();
            gnzVar.g(epochMilli);
            long j = leuVar.d;
            if (j != 0 && goaVar.l == 0 && goaVar.m == 0) {
                gnzVar.d(j);
            }
            if ((leuVar.a & 4) != 0) {
                gnzVar.a = leuVar.c;
            } else if (TextUtils.isEmpty(goaVar.c)) {
                try {
                    gnzVar.a = this.c.c(goaVar.b);
                } catch (Exception e) {
                    ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/registration/impl/StoreTargetCallback", "onSuccess", 'Z', "StoreTargetCallback.java")).r("Failed to get the obfuscated account ID");
                }
            }
            lfj lfjVar = leuVar.b;
            if (lfjVar == null) {
                lfjVar = lfj.e;
            }
            gnzVar.f = lfjVar.d;
            goa a2 = gnzVar.a();
            this.b.e(jis.q(a2));
            this.f.m(leuVar.e);
            if (this.d.g()) {
                ((gxx) this.d.c()).b();
            }
            lgp b = lgp.b(letVar.b);
            if (b == null) {
                b = lgp.REGISTRATION_REASON_UNSPECIFIED;
            }
            if (b == lgp.LOCALE_CHANGED) {
                this.e.c(a2, lgd.LOCALE_CHANGED);
            }
        }
    }
}
