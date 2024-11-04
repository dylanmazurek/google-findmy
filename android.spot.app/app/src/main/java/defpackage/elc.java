package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.BidiFormatter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elc extends dxu implements dxv {
    public static final jnk b = jnk.l("com/google/android/apps/adm/integrations/spot/SpotHelperControllerImpl");
    public final lqd c;
    public final BidiFormatter d;
    public final ele e;
    public final ebf f;
    public eey g;
    private final ekz h;
    private final ejo i;
    private ewk j;
    private final ewf k;
    private final ilv l;
    private njz m;

    public elc(lqd lqdVar, ekz ekzVar, ebf ebfVar, BidiFormatter bidiFormatter, ejo ejoVar, ewf ewfVar, ele eleVar, ilv ilvVar) {
        this.c = lqdVar;
        this.h = ekzVar;
        this.k = ewfVar;
        this.f = ebfVar;
        this.d = bidiFormatter;
        this.i = ejoVar;
        this.e = eleVar;
        this.l = ilvVar;
    }

    @Override // defpackage.dxu, defpackage.dxv
    public final void b() {
        super.b();
        ejo ejoVar = this.i;
        Object obj = ejoVar.d;
        pk pkVar = this.f.a.h;
        synchronized (obj) {
            ejoVar.b = jer.i(pkVar.a("KEYCHAIN_RETRIEVE_FLOW", new pr(), new dyd(ejoVar, 3)));
        }
        if (this.m == null) {
            this.m = new njz(this);
        }
        ejo ejoVar2 = this.i;
        ejoVar2.g.add(this.m);
        if (this.j == null) {
            this.j = new ela(this, 0);
        }
        this.l.g(this.j);
    }

    @Override // defpackage.dxu, defpackage.dxv
    public final void c() {
        ejo ejoVar = this.i;
        synchronized (ejoVar.d) {
            if (ejoVar.b.g()) {
                ((pf) ejoVar.b.c()).a();
                ejoVar.b = jdl.a;
            }
        }
        this.l.l(this.j);
        ejo ejoVar2 = this.i;
        ejoVar2.g.remove(this.m);
        super.c();
    }

    public final lqc d() {
        lqc a = this.k.a();
        a.getClass();
        return a;
    }

    public final void e() {
        this.h.g();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eez] */
    public final void f() {
        a();
        eey eeyVar = this.g;
        if (eeyVar != null) {
            Object obj = eeyVar.b;
            eeyVar.a.a(((ehp) obj).i(), ((efa) obj).d(), 3);
        }
        e();
    }

    public final /* synthetic */ void g() {
        try {
            this.f.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(lua.a.a().D())));
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) ((jni) b.f()).i(e)).j("com/google/android/apps/adm/integrations/spot/SpotHelperControllerImpl", "lambda$showImportOwnerKeyFailedDialog$1", (char) 174, "SpotHelperControllerImpl.java")).r("Could not find appropriate activity for handling learn more link");
        }
    }
}
