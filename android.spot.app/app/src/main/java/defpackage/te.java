package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class te implements acp {
    final /* synthetic */ anr a;
    final /* synthetic */ Object b;
    final /* synthetic */ to c;

    public te(anr anrVar, Object obj, to toVar) {
        this.a = anrVar;
        this.b = obj;
        this.c = toVar;
    }

    @Override // defpackage.acp
    public final void a() {
        this.a.remove(this.b);
        this.c.d.f(this.b);
    }
}
