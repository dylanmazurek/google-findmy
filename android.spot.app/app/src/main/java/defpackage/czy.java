package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czy extends dfe {
    final /* synthetic */ dfe a;

    public czy(dfe dfeVar) {
        this.a = dfeVar;
    }

    @Override // defpackage.dfe
    public final /* bridge */ /* synthetic */ Object a(dfd dfdVar) {
        Float f = (Float) this.a.a(dfdVar);
        if (f == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * 2.55f);
    }
}
