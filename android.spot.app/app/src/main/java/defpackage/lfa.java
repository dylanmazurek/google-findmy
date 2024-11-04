package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lfa implements ljp {
    DEFAULT(0),
    TV(1),
    WEARABLE(2),
    AUTOMOTIVE(3),
    BATTLESTAR(4),
    CHROME_OS(5);

    public final int g;

    lfa(int i) {
        this.g = i;
    }

    @Override // defpackage.ljp
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
