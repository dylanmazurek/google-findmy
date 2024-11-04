package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class caw extends mnp implements mom {
    final /* synthetic */ muf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caw(muf mufVar, mmx mmxVar) {
        super(3, mmxVar);
        this.a = mufVar;
    }

    @Override // defpackage.mom
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new caw(this.a, (mmx) obj3).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mjo.o(obj);
        this.a.s(null);
        return mlh.a;
    }
}
