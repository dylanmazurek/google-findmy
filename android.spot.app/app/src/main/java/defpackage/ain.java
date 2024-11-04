package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ain implements aik {
    public int a;
    public int b;
    public int c;
    final /* synthetic */ aip d;

    public ain(aip aipVar) {
        this.d = aipVar;
    }

    @Override // defpackage.aik
    public final int a(int i) {
        return this.d.c[this.b + i];
    }

    @Override // defpackage.aik
    public final Object b(int i) {
        return this.d.e[this.c + i];
    }

    public final aij c() {
        aij aijVar = this.d.a[this.a];
        aijVar.getClass();
        return aijVar;
    }
}
