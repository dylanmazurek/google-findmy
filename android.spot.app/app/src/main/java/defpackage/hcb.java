package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmanagement.AddAccountActivity;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcb {
    public Context a;
    public hcd b;
    public heb c;
    public his d;
    public hiw e;
    public hdz f;
    public gee g;
    public hjp h;
    public frx i;
    private ScheduledExecutorService j;
    private hby k;
    private jer l;
    private gzf m;
    private ExecutorService n;
    private jer o;
    private hri p;

    public hcb() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r5v1, types: [his, java.lang.Object] */
    public final hcc a() {
        jer i;
        hcd hcdVar;
        frx frxVar;
        hby hbyVar;
        hiw hiwVar;
        hdz hdzVar;
        gzf gzfVar;
        ExecutorService executorService;
        gee geeVar;
        hjp hjpVar;
        ThreadFactory Q = hog.Q();
        if (!f().g()) {
            ExecutorService executorService2 = this.j;
            if (executorService2 == null) {
                executorService2 = Executors.newCachedThreadPool(Q);
            }
            g(executorService2);
        }
        if (this.j == null) {
            this.j = Executors.newSingleThreadScheduledExecutor(Q);
        }
        if (e().g()) {
            this.m = new gzm(b(), f().c(), i(), e().c());
            hby hbyVar2 = this.k;
            if (hbyVar2 == null) {
                i = jdl.a;
            } else {
                i = jer.i(hbyVar2);
            }
            final int i2 = 1;
            if (!i.g()) {
                i();
                d();
                int i3 = hbz.a;
                final int i4 = 0;
                final int i5 = 2;
                this.k = new hby(new hbx() { // from class: hca
                    @Override // defpackage.hbx, defpackage.gyy
                    public final void a(View view, Object obj) {
                        int i6 = i5;
                        if (i6 != 0) {
                            if (i6 != 1) {
                                if (obj == null) {
                                    return;
                                }
                                String ak = frx.ak(obj);
                                ljh k = kxk.d.k();
                                if (!k.b.y()) {
                                    k.t();
                                }
                                kxk kxkVar = (kxk) k.b;
                                kxkVar.a |= 1;
                                kxkVar.b = 1;
                                hav.a(view, ak, (kxk) k.q());
                                return;
                            }
                            Intent intent = new Intent("android.settings.SYNC_SETTINGS");
                            intent.addFlags(32768);
                            intent.addFlags(ImageMetadata.LENS_APERTURE);
                            view.getContext().startActivity(intent);
                            return;
                        }
                        AddAccountActivity.a(view);
                    }
                }, new hbx() { // from class: hca
                    @Override // defpackage.hbx, defpackage.gyy
                    public final void a(View view, Object obj) {
                        int i6 = i4;
                        if (i6 != 0) {
                            if (i6 != 1) {
                                if (obj == null) {
                                    return;
                                }
                                String ak = frx.ak(obj);
                                ljh k = kxk.d.k();
                                if (!k.b.y()) {
                                    k.t();
                                }
                                kxk kxkVar = (kxk) k.b;
                                kxkVar.a |= 1;
                                kxkVar.b = 1;
                                hav.a(view, ak, (kxk) k.q());
                                return;
                            }
                            Intent intent = new Intent("android.settings.SYNC_SETTINGS");
                            intent.addFlags(32768);
                            intent.addFlags(ImageMetadata.LENS_APERTURE);
                            view.getContext().startActivity(intent);
                            return;
                        }
                        AddAccountActivity.a(view);
                    }
                }, new hbx() { // from class: hca
                    @Override // defpackage.hbx, defpackage.gyy
                    public final void a(View view, Object obj) {
                        int i6 = i2;
                        if (i6 != 0) {
                            if (i6 != 1) {
                                if (obj == null) {
                                    return;
                                }
                                String ak = frx.ak(obj);
                                ljh k = kxk.d.k();
                                if (!k.b.y()) {
                                    k.t();
                                }
                                kxk kxkVar = (kxk) k.b;
                                kxkVar.a |= 1;
                                kxkVar.b = 1;
                                hav.a(view, ak, (kxk) k.q());
                                return;
                            }
                            Intent intent = new Intent("android.settings.SYNC_SETTINGS");
                            intent.addFlags(32768);
                            intent.addFlags(ImageMetadata.LENS_APERTURE);
                            view.getContext().startActivity(intent);
                            return;
                        }
                        AddAccountActivity.a(view);
                    }
                });
            }
            c();
            d();
            d();
            gee geeVar2 = this.g;
            if (geeVar2 != null) {
                if (!(geeVar2 instanceof ged)) {
                    i();
                    this.h = new hjr(c(), geeVar2);
                }
                if (this.p == null) {
                    this.p = new hri(b(), this.j);
                }
                hea heaVar = new hea(d());
                if (!d().g.g()) {
                    h();
                    Context b = b();
                    frx i6 = i();
                    d();
                    heaVar.c = jer.i(new han(b, i6));
                }
                if (!d().h.g()) {
                    h();
                    if (lwk.a.a().c(b())) {
                        heaVar.d = jer.i(new hec(i(), b(), this.p));
                    }
                }
                if (!d().d.g()) {
                    if (lwk.a.a().d(b())) {
                        heaVar.a = jer.i(new frx());
                    }
                }
                if (lwk.a.a().b(b())) {
                    heaVar.c(true);
                }
                heb a = heaVar.a();
                this.c = a;
                Context context = this.a;
                if (context != null && (hcdVar = this.b) != null && (frxVar = this.i) != null && (hbyVar = this.k) != null && a != null && (hiwVar = this.e) != null && (hdzVar = this.f) != null && (gzfVar = this.m) != null && (executorService = this.n) != null && (geeVar = this.g) != null && (hjpVar = this.h) != null) {
                    return new hcc(context, hcdVar, frxVar, hbyVar, a, this.d, hiwVar, hdzVar, this.l, gzfVar, executorService, geeVar, hjpVar, this.p, this.o);
                }
                StringBuilder sb = new StringBuilder();
                if (this.a == null) {
                    sb.append(" applicationContext");
                }
                if (this.b == null) {
                    sb.append(" accountsModel");
                }
                if (this.i == null) {
                    sb.append(" accountConverter");
                }
                if (this.k == null) {
                    sb.append(" clickListeners");
                }
                if (this.c == null) {
                    sb.append(" features");
                }
                if (this.e == null) {
                    sb.append(" oneGoogleEventLogger");
                }
                if (this.f == null) {
                    sb.append(" configuration");
                }
                if (this.m == null) {
                    sb.append(" avatarImageLoader");
                }
                if (this.n == null) {
                    sb.append(" backgroundExecutor");
                }
                if (this.g == null) {
                    sb.append(" vePrimitives");
                }
                if (this.h == null) {
                    sb.append(" visualElements");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            throw new IllegalStateException("Property \"vePrimitives\" has not been set");
        }
        throw new IllegalStateException("Exactly one of setAvatarRetriever and setCustomAvatarImageLoader have to be called.");
    }

    public final Context b() {
        Context context = this.a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Property \"applicationContext\" has not been set");
    }

    public final hcd c() {
        hcd hcdVar = this.b;
        if (hcdVar != null) {
            return hcdVar;
        }
        throw new IllegalStateException("Property \"accountsModel\" has not been set");
    }

    public final heb d() {
        heb hebVar = this.c;
        if (hebVar != null) {
            return hebVar;
        }
        throw new IllegalStateException("Property \"features\" has not been set");
    }

    public final jer e() {
        his hisVar = this.d;
        if (hisVar == null) {
            return jdl.a;
        }
        return jer.i(hisVar);
    }

    public final jer f() {
        ExecutorService executorService = this.n;
        if (executorService == null) {
            return jdl.a;
        }
        return jer.i(executorService);
    }

    public final void g(ExecutorService executorService) {
        if (executorService != null) {
            this.n = executorService;
            return;
        }
        throw new NullPointerException("Null backgroundExecutor");
    }

    public final void h() {
        if (this.f != null) {
        } else {
            throw new IllegalStateException("Property \"configuration\" has not been set");
        }
    }

    public final frx i() {
        frx frxVar = this.i;
        if (frxVar != null) {
            return frxVar;
        }
        throw new IllegalStateException("Property \"accountConverter\" has not been set");
    }

    public hcb(hcc hccVar) {
        jdl jdlVar = jdl.a;
        this.l = jdlVar;
        this.o = jdlVar;
        this.a = hccVar.a;
        this.b = hccVar.b;
        this.i = hccVar.o;
        this.k = hccVar.c;
        this.c = hccVar.d;
        this.d = hccVar.e;
        this.e = hccVar.f;
        this.f = hccVar.g;
        this.l = hccVar.h;
        this.m = hccVar.i;
        this.n = hccVar.j;
        this.g = hccVar.k;
        this.h = hccVar.l;
        this.p = hccVar.n;
        this.o = hccVar.m;
    }

    public hcb(byte[] bArr) {
        jdl jdlVar = jdl.a;
        this.l = jdlVar;
        this.o = jdlVar;
    }
}
