package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyh implements gkb {
    private static final joo a = joo.m("GnpSdk");
    private final goj b;
    private final jer c;

    public gyh(goj gojVar, jer jerVar) {
        this.b = gojVar;
        this.c = jerVar;
    }

    @Override // defpackage.gkb
    public final void a(goa goaVar, lkq lkqVar, Throwable th) {
        String str;
        jol jolVar = (jol) ((jol) a.k().i(th)).j("com/google/android/libraries/notifications/registration/impl/RemoveTargetCallback", "onFailure", 70, "RemoveTargetCallback.java");
        if (goaVar != null) {
            str = frx.aN(goaVar.b);
        } else {
            str = "";
        }
        jolVar.u("Unregistration finished for account: %s (FAILURE).", str);
        if (goaVar != null) {
            gnz gnzVar = new gnz(goaVar);
            gnzVar.h(6);
            goa a2 = gnzVar.a();
            this.b.e(jis.q(a2));
            if (this.c.g()) {
                gxx gxxVar = (gxx) this.c.c();
                glj.a(a2);
                gxxVar.c();
            }
        }
    }

    @Override // defpackage.gkb
    public final void b(goa goaVar, lkq lkqVar, lkq lkqVar2) {
        String str;
        jol jolVar = (jol) a.k().j("com/google/android/libraries/notifications/registration/impl/RemoveTargetCallback", "onSuccess", 39, "RemoveTargetCallback.java");
        if (goaVar != null) {
            str = frx.aN(goaVar.b);
        } else {
            str = "";
        }
        jolVar.u("Unregistration finished for account: %s (SUCCESS).", str);
        if (goaVar != null) {
            gnz gnzVar = new gnz(goaVar);
            gnzVar.h(4);
            gnzVar.d(0L);
            gnzVar.g(0L);
            gnzVar.f(0);
            goa a2 = gnzVar.a();
            this.b.e(jis.q(a2));
            if (this.c.g()) {
                gxx gxxVar = (gxx) this.c.c();
                glj.a(a2);
                gxxVar.d();
            }
        }
    }
}
