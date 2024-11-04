package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcv implements apa {
    private final adp b = new ady(1.0f);

    @Override // defpackage.apa
    public final float a() {
        return this.b.b();
    }

    public final void b(float f) {
        this.b.f(f);
    }

    @Override // defpackage.mnb
    public final Object fold(Object obj, mol molVar) {
        return mjo.x(this, obj, molVar);
    }

    @Override // defpackage.mmz, defpackage.mnb
    public final mmz get(mna mnaVar) {
        return mjo.y(this, mnaVar);
    }

    @Override // defpackage.mmz
    public final /* synthetic */ mna getKey() {
        return apa.a;
    }

    @Override // defpackage.mnb
    public final mnb minusKey(mna mnaVar) {
        return mjo.z(this, mnaVar);
    }

    @Override // defpackage.mnb
    public final mnb plus(mnb mnbVar) {
        return mjo.A(this, mnbVar);
    }
}
