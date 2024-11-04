package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum kta implements kpx {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    private final int f;

    kta(int i) {
        this.f = i;
    }

    @Override // defpackage.kpx
    public final int a() {
        return this.f;
    }
}
