package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class wf extends mpe implements moh {
    final /* synthetic */ wi a;
    final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf(wi wiVar, float f) {
        super(1);
        this.a = wiVar;
        this.b = f;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        boolean z;
        long longValue = ((Number) obj).longValue();
        if (!this.a.s()) {
            wi wiVar = this.a;
            float f = this.b;
            if (wiVar.b() == Long.MIN_VALUE) {
                wiVar.i(longValue);
            }
            long b = longValue - wiVar.b();
            if (f == 0.0f) {
                z = false;
            } else {
                z = true;
            }
            if (f != 0.0f) {
                double d = b / f;
                if (!Double.isNaN(d)) {
                    b = Math.round(d);
                } else {
                    throw new IllegalArgumentException("Cannot round NaN value.");
                }
            }
            wiVar.k(b);
            wiVar.g(b, !z);
        }
        return mlh.a;
    }
}
