package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum hss implements ljp {
    DELAY_UNSPECIFIED(0),
    DELAY_10MS(1),
    DELAY_100MS(2),
    DELAY_250MS(3),
    DELAY_500MS(4);

    public final int f;

    hss(int i) {
        this.f = i;
    }

    @Override // defpackage.ljp
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
