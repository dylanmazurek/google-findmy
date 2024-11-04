package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jrs extends jrr {
    final jrt a;
    final /* synthetic */ jru b;

    public jrs(jru jruVar, int i) {
        this.b = jruVar;
        this.a = new jrt(i);
    }

    @Override // defpackage.jrr, defpackage.jsc
    public final void b(byte[] bArr, int i, int i2) {
        this.a.write(bArr, 0, i2);
    }

    @Override // defpackage.jsc
    public final jsa k() {
        jrt jrtVar = this.a;
        return this.b.c(jrtVar.b(), jrtVar.a());
    }
}
