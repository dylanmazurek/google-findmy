package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayk extends azd {
    final /* synthetic */ aym f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayk(aym aymVar) {
        super(aymVar);
        this.f = aymVar;
    }

    @Override // defpackage.awg
    public final awr l(long j) {
        t(j);
        bld bldVar = new bld(j);
        aym aymVar = this.f;
        aymVar.g = bldVar;
        ayj ayjVar = aymVar.f;
        azd w = aymVar.B().w();
        w.getClass();
        super.A(ayjVar.a(this, w, j));
        return this;
    }

    @Override // defpackage.azc
    public final int u(avc avcVar) {
        int e = qi.e(this, avcVar);
        this.m.put(avcVar, Integer.valueOf(e));
        return e;
    }
}
