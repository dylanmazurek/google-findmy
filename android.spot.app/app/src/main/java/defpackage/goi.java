package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goi extends Exception {
    public goi() {
        super("Failed inserting account");
    }

    public goi(Throwable th) {
        super("Error inserting account", th);
    }
}
