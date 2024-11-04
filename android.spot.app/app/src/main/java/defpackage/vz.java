package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vz extends mpe implements moh {
    final /* synthetic */ mpn a;
    final /* synthetic */ float b;
    final /* synthetic */ uv c;
    final /* synthetic */ moh d;
    final /* synthetic */ wa e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz(mpn mpnVar, float f, wa waVar, uv uvVar, moh mohVar) {
        super(1);
        this.a = mpnVar;
        this.b = f;
        this.e = waVar;
        this.c = uvVar;
        this.d = mohVar;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.a.a;
        obj2.getClass();
        ra.j((ut) obj2, longValue, this.b, this.e, this.c, this.d);
        return mlh.a;
    }
}
