package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htv implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;
    private final mko d;
    private final mko e;
    private final /* synthetic */ int f;

    public htv(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i) {
        this.f = i;
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
        this.e = mkoVar5;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        hpg hpgVar;
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                Object obj = ((lsi) this.c).b;
                final Context b = ((lry) this.e).b();
                final jer jerVar = (jer) obj;
                Object obj2 = ((lsi) this.d).b;
                final kuv a = ((hze) this.b).a();
                final jer jerVar2 = (jer) obj2;
                final mko mkoVar = this.a;
                return new hzn() { // from class: hzi
                    @Override // defpackage.hzn
                    public final void a() {
                        if (!kuv.this.A() && !((Boolean) jerVar2.e(false)).booleanValue()) {
                            return;
                        }
                        jer jerVar3 = jerVar;
                        mko mkoVar2 = mkoVar;
                        Application application = (Application) b;
                        Application.ActivityLifecycleCallbacks hzjVar = new hzj(application, mkoVar2, jerVar3);
                        if (jerVar3.g()) {
                            hzjVar = (Application.ActivityLifecycleCallbacks) ((jei) jerVar3.c()).a(hzjVar);
                        }
                        application.registerActivityLifecycleCallbacks(hzjVar);
                    }
                };
            }
            ((dvv) this.b).b();
            jer jerVar3 = (jer) ((lsi) this.d).b;
            jer a2 = ((hte) this.e).a();
            if (jerVar3.g() && a2.g()) {
                hpgVar = (hpg) this.c.a();
            } else {
                hpgVar = (hpg) this.a.a();
            }
            return new jms(hpgVar);
        }
        mko mkoVar2 = this.e;
        mko mkoVar3 = this.d;
        mko mkoVar4 = this.c;
        return new nca(this.a, this.b, mkoVar4, mkoVar3, mkoVar2, null);
    }

    public htv(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, byte[] bArr) {
        this.f = i;
        this.b = mkoVar;
        this.d = mkoVar2;
        this.e = mkoVar3;
        this.a = mkoVar4;
        this.c = mkoVar5;
    }

    public htv(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, int i, char[] cArr) {
        this.f = i;
        this.e = mkoVar;
        this.a = mkoVar2;
        this.c = mkoVar3;
        this.b = mkoVar4;
        this.d = mkoVar5;
    }
}
