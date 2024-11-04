package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iax implements lsh {
    private final /* synthetic */ int a;

    public iax(int i) {
        this.a = i;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return new lrg();
                    }
                    jjr jjrVar = kuh.a;
                    jjrVar.getClass();
                    return jjrVar;
                }
                jax c = jbu.c("provideExtensionRegistry");
                try {
                    lja a = lja.a();
                    c.close();
                    a.getClass();
                    return a;
                } catch (Throwable th) {
                    try {
                        c.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            return true;
        }
        return new iav();
    }
}
