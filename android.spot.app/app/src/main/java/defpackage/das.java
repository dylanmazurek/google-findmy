package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class das extends mnp implements moh {
    final /* synthetic */ dat a;
    final /* synthetic */ cyb b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public das(dat datVar, cyb cybVar, float f, boolean z, mmx mmxVar) {
        super(1, mmxVar);
        this.a = datVar;
        this.b = cybVar;
        this.c = f;
        this.d = z;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new das(this.a, this.b, this.c, this.d, (mmx) obj).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mjo.o(obj);
        this.a.i(this.b);
        this.a.l(this.c);
        this.a.j(1);
        this.a.k(false);
        if (this.d) {
            this.a.r(Long.MIN_VALUE);
        }
        return mlh.a;
    }
}
