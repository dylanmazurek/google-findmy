package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayv extends mpe implements mnw {
    final /* synthetic */ ayz a;
    final /* synthetic */ long b;
    final /* synthetic */ baw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayv(ayz ayzVar, baw bawVar, long j) {
        super(0);
        this.a = ayzVar;
        this.c = bawVar;
        this.b = j;
    }

    @Override // defpackage.mnw
    public final /* synthetic */ Object a() {
        azd w;
        awq awqVar = null;
        if (ql.c(this.a.a)) {
            azq azqVar = this.a.a().u;
            if (azqVar != null) {
                awqVar = azqVar.k;
            }
        } else {
            azq azqVar2 = this.a.a().u;
            if (azqVar2 != null && (w = azqVar2.w()) != null) {
                awqVar = w.k;
            }
        }
        if (awqVar == null) {
            moh mohVar = aws.a;
        }
        ayz ayzVar = this.a;
        long j = this.b;
        azd w2 = ayzVar.a().w();
        w2.getClass();
        awq.g(w2, j, 0.0f);
        return mlh.a;
    }
}
