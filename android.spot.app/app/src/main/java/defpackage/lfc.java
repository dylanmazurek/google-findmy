package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lfc implements ljp {
    IMPORTANCE_UNSPECIFIED(0),
    IMPORTANCE_NONE(1),
    IMPORTANCE_DEFAULT(2),
    IMPORTANCE_HIGH(3),
    IMPORTANCE_LOW(4),
    IMPORTANCE_MAX(5),
    IMPORTANCE_MIN(6);

    public final int h;

    lfc(int i2) {
        this.h = i2;
    }

    public static lfc b(int i2) {
        switch (i2) {
            case 0:
                return IMPORTANCE_UNSPECIFIED;
            case 1:
                return IMPORTANCE_NONE;
            case 2:
                return IMPORTANCE_DEFAULT;
            case 3:
                return IMPORTANCE_HIGH;
            case 4:
                return IMPORTANCE_LOW;
            case 5:
                return IMPORTANCE_MAX;
            case 6:
                return IMPORTANCE_MIN;
            default:
                return null;
        }
    }

    @Override // defpackage.ljp
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
