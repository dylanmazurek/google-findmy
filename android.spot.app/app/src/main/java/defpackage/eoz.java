package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoz extends cgk {
    public final eou a;
    public lqd b;
    public boolean c;
    private final ewg d;
    private cfn e;

    public eoz(eou eouVar, ewc ewcVar) {
        this.a = eouVar;
        this.d = ewcVar;
    }

    public static eoz b(cgq cgqVar, lqd lqdVar) {
        eoz eozVar = (eoz) new ddh(cgqVar).q(eoz.class);
        lqd lqdVar2 = eozVar.b;
        if (lqdVar2 == null) {
            hwx.V(true, "ViewModel is already initialized");
            eozVar.b = lqdVar;
            eozVar.e = new cfn(eozVar.h());
            eozVar.a.b(eozVar.b, new dzw(eozVar, 14));
        } else {
            hwx.S(lqdVar2.equals(lqdVar), "The provided DeviceIdentifier %s is different than the one the ViewModel was first initialized with, %s", lqdVar, eozVar.b);
        }
        return eozVar;
    }

    private final eoy h() {
        return new eoy(this.a.f(this.b), this.a.a(this.b), this.c);
    }

    public final cfk a() {
        e();
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cgk
    public final void c() {
        this.a.d(this.b, new dzw(this, 14));
    }

    public final lqc d() {
        e();
        jer b = eyf.b(((ewc) this.d).c, this.b);
        hwx.U(b.g());
        return (lqc) b.c();
    }

    public final void e() {
        boolean z;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "EraseDeviceViewModel must be initialized by calling createEraseDeviceViewModel().");
    }

    public final void f() {
        this.e.i(h());
    }

    public final void g() {
        this.a.e(this.b);
        f();
    }
}
