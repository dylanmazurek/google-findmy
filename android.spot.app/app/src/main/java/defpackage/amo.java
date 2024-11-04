package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amo extends mpe implements moh {
    final /* synthetic */ moh a;
    final /* synthetic */ moh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amo(moh mohVar, moh mohVar2) {
        super(1);
        this.a = mohVar;
        this.b = mohVar2;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int i;
        anf anfVar = (anf) obj;
        synchronized (anm.c) {
            i = anm.e;
            anm.e = i + 1;
        }
        return new ams(i, anfVar, this.a, this.b);
    }
}
