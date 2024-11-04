package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum kyh implements ljp {
    DEVICE_COMPONENT_UNSPECIFIED(0),
    DEVICE_COMPONENT_RIGHT(1),
    DEVICE_COMPONENT_LEFT(2),
    DEVICE_COMPONENT_CASE(3),
    UNRECOGNIZED(-1);

    private final int f;

    kyh(int i) {
        this.f = i;
    }

    public static kyh b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return DEVICE_COMPONENT_CASE;
                }
                return DEVICE_COMPONENT_LEFT;
            }
            return DEVICE_COMPONENT_RIGHT;
        }
        return DEVICE_COMPONENT_UNSPECIFIED;
    }

    @Override // defpackage.ljp
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
