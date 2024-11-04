package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efa extends ehp implements ekz {
    public static final jnk b = jnk.l("com/google/android/apps/adm/integrations/android/AndroidDeviceController");
    public final jer c;
    public jer d;
    public jer e;
    public jer f;
    public jer g;
    public jer h;
    public jer i;
    public final ebf j;
    public final ees k;
    public final dxf l;
    public final eey m;
    public final eey n;
    public final ksf o;
    public final njz p;
    private final efy u;
    private final exp v;
    private ewk w;
    private final njz x;

    public efa(lqd lqdVar, ebf ebfVar, evy evyVar, ewc ewcVar, ewf ewfVar, eld eldVar, ees eesVar, lqz lqzVar, dxf dxfVar, efy efyVar) {
        super(lqdVar, evyVar, ewcVar, ewfVar);
        jer jerVar;
        jdl jdlVar = jdl.a;
        this.d = jdlVar;
        this.e = jdlVar;
        this.f = jdlVar;
        this.g = jdlVar;
        this.h = jdlVar;
        this.i = jdlVar;
        this.x = new njz(this, null);
        this.j = ebfVar;
        this.k = eesVar;
        this.l = dxfVar;
        if (bsf.g(i())) {
            jerVar = jer.i(eldVar.a(lqdVar, this, ebfVar));
        } else {
            jerVar = jdl.a;
        }
        this.c = jerVar;
        this.u = efyVar;
        this.n = new eey(this, evyVar);
        this.v = new eex(this, lqzVar);
        this.m = new eey(this, lqzVar);
        this.o = new ksf(this, lqzVar, eesVar);
        this.p = new njz(lqzVar, null);
    }

    @Override // defpackage.dxu, defpackage.dxv
    public final void b() {
        super.b();
        e(new eew(2));
        this.k.d(lpk.ANDROID_LOCK_SCREEN, this.x);
        this.k.d(lpk.ANDROID_SET_SCREEN_LOCK_PASSWORD, this.x);
        if (this.w == null) {
            this.w = new dym(this, 9, null);
        }
        this.u.d(this.w);
    }

    @Override // defpackage.dxu, defpackage.dxv
    public final void c() {
        e(new eew(1));
        this.k.e(lpk.ANDROID_LOCK_SCREEN, this.x);
        this.k.e(lpk.ANDROID_SET_SCREEN_LOCK_PASSWORD, this.x);
        this.u.g(this.w);
        super.c();
    }

    public final efp d() {
        Parcelable a = this.s.a(this.q);
        a.getClass();
        return (efp) a;
    }

    public final void e(buc bucVar) {
        if (this.c.g()) {
            bucVar.a(this.c.c());
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, eez] */
    @Override // defpackage.ehq
    public final void f() {
        a();
        if (this.d.g()) {
            this.d.c().a(i(), d(), 3);
        }
        e(new eew(0));
    }

    @Override // defpackage.ehq
    public final void h(ech echVar) {
        hwx.V(!this.e.g(), "Rename device UI already attached");
        jer i = jer.i(echVar);
        this.e = i;
        ((ech) i.c()).af = this.v;
    }

    @Override // defpackage.ekz
    public final void g() {
    }
}
