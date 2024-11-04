package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abf extends IllegalStateException {
    private final String a;

    public abf(String str) {
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
