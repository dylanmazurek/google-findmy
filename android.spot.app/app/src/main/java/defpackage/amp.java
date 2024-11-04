package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amp extends mpe implements moh {
    final /* synthetic */ moh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amp(moh mohVar) {
        super(1);
        this.a = mohVar;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int i;
        anf anfVar = (anf) obj;
        synchronized (anm.c) {
            i = anm.e;
            anm.e = i + 1;
        }
        return new amw(i, anfVar, this.a);
    }
}
