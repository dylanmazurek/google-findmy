package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bii extends mnl {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ bij c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bii(bij bijVar, mmx mmxVar) {
        super(mmxVar);
        this.c = bijVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
