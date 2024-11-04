package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ksz implements kpx {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    private final int e;

    ksz(int i) {
        this.e = i;
    }

    @Override // defpackage.kpx
    public final int a() {
        return this.e;
    }
}
