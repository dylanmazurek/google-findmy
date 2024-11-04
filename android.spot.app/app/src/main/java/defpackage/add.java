package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class add extends mpe implements moh {
    final /* synthetic */ ade a;
    final /* synthetic */ msd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public add(ade adeVar, msd msdVar) {
        super(1);
        this.a = adeVar;
        this.b = msdVar;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ade adeVar = this.a;
        Object obj2 = adeVar.a;
        msd msdVar = this.b;
        synchronized (obj2) {
            adeVar.b.remove(msdVar);
        }
        return mlh.a;
    }
}
