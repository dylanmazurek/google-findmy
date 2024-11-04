package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dar extends mpe implements moh {
    final /* synthetic */ dat a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dar(dat datVar, int i) {
        super(1);
        this.a = datVar;
        this.b = i;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return Boolean.valueOf(this.a.n(this.b, ((Number) obj).longValue()));
    }
}
