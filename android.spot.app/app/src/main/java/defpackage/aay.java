package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aay extends mpe implements moh {
    final /* synthetic */ aaz a;
    final /* synthetic */ aax b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aay(aaz aazVar, aax aaxVar) {
        super(1);
        this.a = aazVar;
        this.b = aaxVar;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aaz aazVar = this.a;
        Object obj2 = aazVar.a;
        aax aaxVar = this.b;
        synchronized (obj2) {
            aazVar.b.remove(aaxVar);
            if (aazVar.b.isEmpty()) {
                aazVar.d.set(0);
            }
        }
        return mlh.a;
    }
}
