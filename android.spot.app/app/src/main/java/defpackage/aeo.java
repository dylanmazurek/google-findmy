package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aeo implements aen, adt {
    private final mnb a;
    private final /* synthetic */ adt b;

    public aeo(adt adtVar, mnb mnbVar) {
        this.a = mnbVar;
        this.b = adtVar;
    }

    @Override // defpackage.adt, defpackage.agt
    public final Object a() {
        return this.b.a();
    }

    @Override // defpackage.msw
    public final mnb b() {
        return this.a;
    }

    @Override // defpackage.adt
    public final void h(Object obj) {
        this.b.h(obj);
    }
}
