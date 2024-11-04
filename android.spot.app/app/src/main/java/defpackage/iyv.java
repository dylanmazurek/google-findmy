package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iyv implements Runnable {
    public final bym d;

    public iyv() {
        this.d = null;
    }

    protected abstract void a();

    public final void b(Exception exc) {
        bym bymVar = this.d;
        if (bymVar != null) {
            bymVar.t(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            b(e);
        }
    }

    public iyv(bym bymVar) {
        this.d = bymVar;
    }
}
