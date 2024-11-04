package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class joc extends jof {
    final /* synthetic */ jof a;
    final /* synthetic */ jof b;

    public joc(jof jofVar, jof jofVar2) {
        this.a = jofVar;
        this.b = jofVar2;
    }

    @Override // defpackage.jof
    public final void a() {
        try {
            this.a.a();
        } finally {
            this.b.a();
        }
    }
}
