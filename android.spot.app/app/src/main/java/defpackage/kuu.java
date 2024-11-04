package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuu implements kvm {
    public final /* synthetic */ ktf a;
    private jza b;

    public kuu(ktf ktfVar) {
        this.a = ktfVar;
    }

    @Override // defpackage.kvm
    public final /* synthetic */ kvy a() {
        return kvy.a;
    }

    @Override // defpackage.kvm
    public final /* synthetic */ kvy b() {
        return kvy.a;
    }

    @Override // defpackage.kvm
    public final kvy f(nqe nqeVar) {
        try {
            jer jerVar = (jer) ivc.M(this.b);
            if (jerVar.g()) {
                return new kvy(1, null, null, ((lys) nqeVar.d).d(ktq.a, (String) jerVar.c()));
            }
            return kvy.a;
        } catch (ExecutionException e) {
            return kvy.b(mca.b(e.getCause()), new mbc());
        }
    }

    @Override // defpackage.kvm
    public final kvy g(nqe nqeVar) {
        boolean z;
        ktp b = ((kto) ((lys) nqeVar.d).e(kto.a)).b();
        if (this.b == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "Interceptor was reused. Interceptors should not be scoped");
        this.b = new jza(new eyh(this, b, 13, null));
        ((ktl) ((lys) nqeVar.d).e(ktm.a)).c.execute(this.b);
        return kvy.c(this.b);
    }

    @Override // defpackage.kvm
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.kvm
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.kvm
    public final /* synthetic */ void e(ktf ktfVar) {
    }
}
