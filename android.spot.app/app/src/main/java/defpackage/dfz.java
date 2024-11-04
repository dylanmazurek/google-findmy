package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfz {
    public static final /* synthetic */ int a = 0;
    private boolean b;

    static {
        String str = dga.a;
    }

    public final synchronized void a() {
        this.b = true;
        throw null;
    }

    protected final void finalize() {
        if (!this.b) {
            a();
            dga.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
