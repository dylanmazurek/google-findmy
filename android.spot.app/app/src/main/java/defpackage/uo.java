package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uo extends mnp implements moh {
    final /* synthetic */ Object a;
    final /* synthetic */ gga b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(gga ggaVar, Object obj, mmx mmxVar) {
        super(1, mmxVar);
        this.b = ggaVar;
        this.a = obj;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new uo(this.b, this.a, (mmx) obj).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mjo.o(obj);
        this.b.e();
        gga ggaVar = this.b;
        Object b = ggaVar.b(this.a);
        ((uv) ggaVar.g).b(b);
        this.b.g(b);
        return mlh.a;
    }
}
