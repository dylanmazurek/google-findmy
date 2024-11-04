package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ktb implements kpx {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int f;

    ktb(int i) {
        this.f = i;
    }

    @Override // defpackage.kpx
    public final int a() {
        return this.f;
    }
}
