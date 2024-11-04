package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iem extends ieq {
    public iem() {
        super("Device could not start or stop ringing");
    }

    @Override // defpackage.ieq
    public final ign a(String str) {
        return new igm(str, this);
    }

    public iem(Throwable th) {
        super("Response timeout", th);
    }
}
