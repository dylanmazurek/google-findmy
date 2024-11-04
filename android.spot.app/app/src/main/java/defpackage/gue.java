package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gue extends Exception {
    public gue() {
        super("Failed to access GNP API");
    }

    public gue(Throwable th) {
        super("Failed to parse the response returned from GNP API", th);
    }
}
