package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyo extends jwl implements Runnable {
    private jyz a;

    public jyo(jyz jyzVar) {
        this.a = jyzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jwq
    public final String a() {
        jyz jyzVar = this.a;
        if (jyzVar != null) {
            return der.c(jyzVar, "delegate=[", "]");
        }
        return null;
    }

    @Override // defpackage.jwq
    protected final void b() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jyz jyzVar = this.a;
        if (jyzVar != null) {
            o(jyzVar);
        }
    }
}
