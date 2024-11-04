package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vy extends mpe implements moh {
    final /* synthetic */ mpn a;
    final /* synthetic */ Object b;
    final /* synthetic */ va c;
    final /* synthetic */ uv d;
    final /* synthetic */ float e;
    final /* synthetic */ moh f;
    final /* synthetic */ wa g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy(mpn mpnVar, Object obj, wa waVar, va vaVar, uv uvVar, float f, moh mohVar) {
        super(1);
        this.a = mpnVar;
        this.b = obj;
        this.g = waVar;
        this.c = vaVar;
        this.d = uvVar;
        this.e = f;
        this.f = mohVar;
    }

    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        long longValue = ((Number) obj).longValue();
        wa waVar = this.g;
        atk atkVar = waVar.d;
        Object obj2 = waVar.b;
        ut utVar = new ut(this.b, this.c, longValue, longValue, new ob(this.d, 7));
        ra.j(utVar, longValue, this.e, this.g, this.d, this.f);
        this.a.a = utVar;
        return mlh.a;
    }
}
