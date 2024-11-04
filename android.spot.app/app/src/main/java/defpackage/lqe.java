package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lqe implements ljp {
    RESPONSE_NO_ERROR(0),
    RESPONSE_FAILURE(1),
    RESPONSE_MISSING_ACCOUNT(2),
    RESPONSE_LOCATION_DISABLED_IN_SYSTEM(3),
    RESPONSE_LOCATION_DISABLED_IN_GOOGLE_SETTINGS(4),
    RESPONSE_FIND_MY_DEVICE_DISABLED(5),
    RESPONSE_LOCATION_TIME_OUT(6),
    RESPONSE_PASSWORD_NOT_STRONG_ENOUGH(7),
    RESPONSE_LOCKSCREEN_ALREADY_ENABLED(8),
    RESPONSE_SCREEN_UNLOCKED(9),
    RESPONSE_LOCKSCREEN_PHONE_NUMBER_INVALID(10),
    RESPONSE_RING_DEVICE_INTERRUPTED(11),
    RESPONSE_LOCATION_DISABLED_FOR_DEVICE_TYPE(12),
    RESPONSE_REMOVE_USER_NOT_SUPPORTED_FOR_DEVICE_TYPE(13),
    RESPONSE_USER_NOT_PRIVILEGED(14),
    RESPONSE_SUPERVISED_LOCATION_SHARING_DISABLED(15),
    RESPONSE_GLA_DISABLED_IN_SYSTEM(16),
    UNRECOGNIZED(-1);

    private final int s;

    lqe(int i) {
        this.s = i;
    }

    public static lqe b(int i) {
        switch (i) {
            case 0:
                return RESPONSE_NO_ERROR;
            case 1:
                return RESPONSE_FAILURE;
            case 2:
                return RESPONSE_MISSING_ACCOUNT;
            case 3:
                return RESPONSE_LOCATION_DISABLED_IN_SYSTEM;
            case 4:
                return RESPONSE_LOCATION_DISABLED_IN_GOOGLE_SETTINGS;
            case 5:
                return RESPONSE_FIND_MY_DEVICE_DISABLED;
            case 6:
                return RESPONSE_LOCATION_TIME_OUT;
            case 7:
                return RESPONSE_PASSWORD_NOT_STRONG_ENOUGH;
            case 8:
                return RESPONSE_LOCKSCREEN_ALREADY_ENABLED;
            case 9:
                return RESPONSE_SCREEN_UNLOCKED;
            case 10:
                return RESPONSE_LOCKSCREEN_PHONE_NUMBER_INVALID;
            case 11:
                return RESPONSE_RING_DEVICE_INTERRUPTED;
            case 12:
                return RESPONSE_LOCATION_DISABLED_FOR_DEVICE_TYPE;
            case 13:
                return RESPONSE_REMOVE_USER_NOT_SUPPORTED_FOR_DEVICE_TYPE;
            case 14:
                return RESPONSE_USER_NOT_PRIVILEGED;
            case 15:
                return RESPONSE_SUPERVISED_LOCATION_SHARING_DISABLED;
            case 16:
                return RESPONSE_GLA_DISABLED_IN_SYSTEM;
            default:
                return null;
        }
    }

    @Override // defpackage.ljp
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
