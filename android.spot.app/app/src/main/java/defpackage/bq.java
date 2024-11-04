package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bq implements ces, cjz, cgq {
    public cex a = null;
    public drz b = null;
    private final ag c;
    private final Runnable d;
    private cgn e;
    private final ddh f;

    public bq(ag agVar, ddh ddhVar, Runnable runnable) {
        this.c = agVar;
        this.f = ddhVar;
        this.d = runnable;
    }

    @Override // defpackage.cfc
    public final cex N() {
        b();
        return this.a;
    }

    @Override // defpackage.ces
    public final cgn P() {
        Application application;
        ag agVar = this.c;
        cgn P = agVar.P();
        if (!P.equals(agVar.aa)) {
            this.e = P;
            return P;
        }
        if (this.e == null) {
            Context applicationContext = this.c.y().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            ag agVar2 = this.c;
            this.e = new cgh(application, agVar2, agVar2.m);
        }
        return this.e;
    }

    @Override // defpackage.ces
    public final cgu Q() {
        Application application;
        Context applicationContext = this.c.y().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        cgv cgvVar = new cgv();
        if (application != null) {
            cgvVar.b(cgm.b, application);
        }
        cgvVar.b(cge.a, this.c);
        cgvVar.b(cge.b, this);
        Bundle bundle = this.c.m;
        if (bundle != null) {
            cgvVar.b(cge.c, bundle);
        }
        return cgvVar;
    }

    @Override // defpackage.cjz
    public final cjy R() {
        b();
        return (cjy) this.b.b;
    }

    public final void a(cev cevVar) {
        this.a.b(cevVar);
    }

    @Override // defpackage.cgq
    public final ddh aE() {
        b();
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.a == null) {
            this.a = new cex(this);
            drz drzVar = new drz(this);
            this.b = drzVar;
            drzVar.d();
            this.d.run();
        }
    }
}
