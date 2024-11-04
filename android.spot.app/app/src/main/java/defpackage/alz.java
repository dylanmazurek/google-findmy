package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alz extends mpe implements mnw {
    final /* synthetic */ ama a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alz(ama amaVar) {
        super(0);
        this.a = amaVar;
    }

    @Override // defpackage.mnw
    public final Object a() {
        ama amaVar = this.a;
        amh amhVar = amaVar.a;
        Object obj = amaVar.d;
        if (obj != null) {
            return ((amk) amhVar).a.a(amaVar, obj);
        }
        throw new IllegalArgumentException("Value should be initialized");
    }
}
