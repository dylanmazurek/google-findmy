package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class big extends mnl {
    Object a;
    Object b;
    int c;
    int d;
    /* synthetic */ Object e;
    final /* synthetic */ bij f;
    int g;
    bij h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public big(bij bijVar, mmx mmxVar) {
        super(mmxVar);
        this.f = bijVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(this);
    }
}
