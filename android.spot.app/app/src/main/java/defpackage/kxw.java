package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum kxw {
    RING_DATA,
    TRIGGER_EID_SYNC_DATA,
    FINALIZE_SHARING_APPLICATION_DATA,
    TRIGGER_DEVICE_LIST_REFRESH_DATA,
    AGGREGATION_ATTEMPT_DATA,
    ACTION_NOT_SET;

    public static kxw a(int i) {
        if (i != 0) {
            if (i != 3) {
                if (i != 8) {
                    switch (i) {
                        case 10:
                            return FINALIZE_SHARING_APPLICATION_DATA;
                        case 11:
                            return TRIGGER_DEVICE_LIST_REFRESH_DATA;
                        case 12:
                            return AGGREGATION_ATTEMPT_DATA;
                        default:
                            return null;
                    }
                }
                return TRIGGER_EID_SYNC_DATA;
            }
            return RING_DATA;
        }
        return ACTION_NOT_SET;
    }
}
