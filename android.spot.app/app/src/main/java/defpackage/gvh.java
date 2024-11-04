package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvh extends Exception {
    public gvh() {
        super("Failed to get ContentProviderClient for accounts from GmsCore");
    }

    public gvh(Throwable th) {
        super("Error getting accounts via GmsCore", th);
    }
}
