package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dak extends dfe {
    final /* synthetic */ dfd a;
    final /* synthetic */ dfe b;
    final /* synthetic */ dbj c;

    public dak(dfd dfdVar, dfe dfeVar, dbj dbjVar) {
        this.a = dfdVar;
        this.b = dfeVar;
        this.c = dbjVar;
    }

    @Override // defpackage.dfe
    public final /* bridge */ /* synthetic */ Object a(dfd dfdVar) {
        Object obj;
        this.a.a(dfdVar.a, dfdVar.b, ((dbj) dfdVar.c).a, ((dbj) dfdVar.d).a, dfdVar.e, dfdVar.f, dfdVar.g);
        String str = (String) this.b.a(this.a);
        if (dfdVar.f == 1.0f) {
            obj = dfdVar.d;
        } else {
            obj = dfdVar.c;
        }
        dbj dbjVar = (dbj) obj;
        this.c.a(str, dbjVar.b, dbjVar.c, dbjVar.m, dbjVar.d, dbjVar.e, dbjVar.f, dbjVar.g, dbjVar.h, dbjVar.i, dbjVar.j, dbjVar.k, dbjVar.l);
        return this.c;
    }
}
