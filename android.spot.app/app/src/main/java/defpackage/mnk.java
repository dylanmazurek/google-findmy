package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnk implements mmx {
    public static final mnk a = new mnk();

    private mnk() {
    }

    @Override // defpackage.mmx
    public final mnb o() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.mmx
    public final void p(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
