package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class hku implements jei {
    @Override // defpackage.jei
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        fkd fkdVar = (fkd) obj;
        hjv a = hjw.a();
        if (fkdVar.c() != null) {
            a.b(fkdVar.c());
        }
        if (fkdVar.e() != null) {
            a.a = fkdVar.e();
        }
        if (fkdVar.g() != null) {
            c(fkdVar, a);
        }
        if (fkdVar.f() != null) {
            b(fkdVar, a);
        }
        if (fkdVar.b() != null) {
            a.d = fkdVar.b();
        }
        d(fkdVar, a);
        if (fkdVar.d() != null) {
            a.e = fkdVar.d();
        }
        return a.a();
    }

    public void b(fkd fkdVar, hjv hjvVar) {
        throw null;
    }

    public void c(fkd fkdVar, hjv hjvVar) {
        throw null;
    }

    public abstract void d(fkd fkdVar, hjv hjvVar);
}
