package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnf extends mnn {
    final /* synthetic */ mol a;
    final /* synthetic */ Object b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnf(mmx mmxVar, mol molVar, Object obj) {
        super(mmxVar);
        this.a = molVar;
        this.b = obj;
    }

    @Override // defpackage.mnj
    protected final Object b(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                this.c = 2;
                mjo.o(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.c = 1;
        mjo.o(obj);
        mol molVar = this.a;
        mpp.g(molVar, 2);
        return molVar.a(this.b, this);
    }
}
