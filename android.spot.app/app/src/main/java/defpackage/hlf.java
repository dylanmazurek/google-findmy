package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlf implements jyj {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ iia c;
    private final String d;

    public hlf(iia iiaVar, boolean z, long j) {
        this.a = z;
        this.b = j;
        this.c = iiaVar;
        this.d = hog.C(iiaVar.a);
    }

    @Override // defpackage.jyj
    public final void a(Throwable th) {
        String str = this.d;
        String S = hog.S(th);
        iia iiaVar = this.c;
        ((hri) iiaVar.c).i(str, S, -1, (String) iiaVar.b, this.a);
        long epochMilli = fma.i().toEpochMilli() - this.b;
        iia iiaVar2 = this.c;
        ((hri) iiaVar2.c).l(epochMilli, this.d, S, -1, (String) iiaVar2.b, this.a);
    }

    @Override // defpackage.jyj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int min = Math.min(((jis) obj).size(), 10);
        iia iiaVar = this.c;
        ((hri) iiaVar.c).i(this.d, "OK", min, (String) iiaVar.b, this.a);
        long epochMilli = fma.i().toEpochMilli() - this.b;
        iia iiaVar2 = this.c;
        ((hri) iiaVar2.c).l(epochMilli, this.d, "OK", min, (String) iiaVar2.b, this.a);
    }
}
