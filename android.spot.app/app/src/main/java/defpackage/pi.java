package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pi extends pf {
    final /* synthetic */ pk a;
    final /* synthetic */ String b;
    final /* synthetic */ pn c;

    public pi(pk pkVar, String str, pn pnVar) {
        this.a = pkVar;
        this.b = str;
        this.c = pnVar;
    }

    @Override // defpackage.pf
    public final void a() {
        throw null;
    }

    @Override // defpackage.pf
    public final void b(Object obj) {
        Object obj2 = this.a.b.get(this.b);
        if (obj2 != null) {
            int intValue = ((Number) obj2).intValue();
            this.a.c.add(this.b);
            try {
                this.a.f(intValue, this.c, obj);
                return;
            } catch (Exception e) {
                this.a.c.remove(this.b);
                throw e;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.c + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }
}
