package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgk extends mak {
    public mcy a;
    public final /* synthetic */ mgu b;

    public mgk(mgu mguVar) {
        this.b = mguVar;
    }

    @Override // defpackage.mak
    public final lyu a() {
        return this.b.F;
    }

    @Override // defpackage.mak
    public final /* bridge */ /* synthetic */ map b(mah mahVar) {
        this.b.m.c();
        hwx.V(!this.b.B, "Channel is being terminated");
        return new mcw(this.b, mahVar);
    }

    @Override // defpackage.mak
    public final mcf c() {
        return this.b.m;
    }

    @Override // defpackage.mak
    public final void d() {
        this.b.m.c();
        this.b.m.execute(new meg(this, 19));
    }

    @Override // defpackage.mak
    public final void e(lze lzeVar, maq maqVar) {
        this.b.m.c();
        lzeVar.getClass();
        this.b.m.execute(new kvo(this, maqVar, lzeVar, 5));
    }
}
