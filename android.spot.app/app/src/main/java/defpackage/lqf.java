package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lqf implements ljp {
    UNKNOWN_DEVICE_TYPE(0),
    TEST_DEVICE_TYPE(3),
    ANDROID_DEVICE(1),
    SPOT_DEVICE(2),
    AUTO_DEVICE(4),
    FASTPAIR_DEVICE(5),
    SUPERVISED_ANDROID_DEVICE(6),
    UNRECOGNIZED(-1);

    private final int i;

    lqf(int i) {
        this.i = i;
    }

    public static lqf b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_DEVICE_TYPE;
            case 1:
                return ANDROID_DEVICE;
            case 2:
                return SPOT_DEVICE;
            case 3:
                return TEST_DEVICE_TYPE;
            case 4:
                return AUTO_DEVICE;
            case 5:
                return FASTPAIR_DEVICE;
            case 6:
                return SUPERVISED_ANDROID_DEVICE;
            default:
                return null;
        }
    }

    @Override // defpackage.ljp
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
