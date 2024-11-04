package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum fvg implements ljp {
    UNKNOWN(0),
    NONE(1),
    EXACT(2),
    SUBSTRING(3),
    HEURISTIC(4),
    SHEEPDOG_ELIGIBLE(5);

    public final int g;

    fvg(int i) {
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
