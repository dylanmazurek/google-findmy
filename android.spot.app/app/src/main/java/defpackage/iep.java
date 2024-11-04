package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iep extends ieq {
    public iep(String str) {
        super("Cannot ring the device with the given ring key");
    }

    @Override // defpackage.ieq
    public final ign a(String str) {
        return new igl(str, this);
    }

    public iep(Throwable th) {
        super("Authentication failed", th);
    }
}
