package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class irt extends Exception {
    public irt(Throwable th) {
        super("Error thrown initializing StaticLayout ".concat(String.valueOf(th.getMessage())), th);
    }
}
