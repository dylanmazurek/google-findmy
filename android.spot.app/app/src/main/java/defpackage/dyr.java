package defpackage;

import com.google.android.gms.maps.model.LatLng;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyr extends dxu {
    public final ewf b;
    public eur c;
    public final eey d;
    private final ewc g;
    private jjr f = jmo.a;
    private final ewk e = new dym(this, 3);

    public dyr(ewc ewcVar, ewf ewfVar, lqz lqzVar) {
        this.g = ewcVar;
        this.b = ewfVar;
        this.d = new eey(this, lqzVar);
    }

    @Override // defpackage.dxu, defpackage.dxv
    public final void b() {
        super.b();
        this.b.b(this.e);
        if (i()) {
            e();
        }
    }

    @Override // defpackage.dxu, defpackage.dxv
    public final void c() {
        this.b.f(this.e);
        super.c();
    }

    public final void d() {
        this.f = jmo.a;
        if (i()) {
            eur eurVar = this.c;
            eurVar.getClass();
            eurVar.d();
        }
    }

    public final void e() {
        a();
        eur eurVar = this.c;
        eurVar.getClass();
        if (!this.f.isEmpty()) {
            eurVar.aF(this.f);
        } else {
            eurVar.d();
            h();
        }
    }

    public final /* synthetic */ void f(dya dyaVar) {
        g(new jms(dyaVar));
    }

    public final void g(jjr jjrVar) {
        if (!this.f.equals(jjrVar)) {
            this.f = jjrVar;
            if (i()) {
                eur eurVar = this.c;
                eurVar.getClass();
                eurVar.aF(jjrVar);
                this.g.e = false;
            }
        }
    }

    public final void h() {
        eur eurVar;
        a();
        if (!this.g.e && (eurVar = this.c) != null) {
            frk frkVar = eurVar.e;
            if (frkVar == null) {
                ((jni) ((jni) eur.a.g()).j("com/google/android/apps/adm/map/DeviceMapFragment", "zoomOut", 157, "DeviceMapFragment.java")).r("zoomOut: map is null");
            } else {
                LatLng latLng = frkVar.a().a;
                eurVar.e(latLng.a, latLng.b, Math.max(0.0f, r0.b - 2.0f), false);
            }
            this.g.e = true;
        }
    }

    public final boolean i() {
        eur eurVar = this.c;
        if (eurVar != null && eurVar.aG()) {
            return true;
        }
        return false;
    }
}
