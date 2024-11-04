package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class myl extends mnl {
    /* synthetic */ Object a;
    final /* synthetic */ mym b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myl(mym mymVar, mmx mmxVar) {
        super(mmxVar);
        this.b = mymVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0, this);
    }
}
