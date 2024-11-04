package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gpm implements Runnable {
    private final /* synthetic */ int a;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i = gpp.b;
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
            case 7:
            case 8:
                return;
            default:
                throw null;
        }
    }
}
