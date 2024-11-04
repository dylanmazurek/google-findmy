package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum kzl implements ljp {
    RINGING_VOLUME_DEFAULT(0),
    RINGING_VOLUME_LOW(1),
    RINGING_VOLUME_MEDIUM(2),
    RINGING_VOLUME_HIGH(3),
    UNRECOGNIZED(-1);

    private final int f;

    kzl(int i) {
        this.f = i;
    }

    public static kzl b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return RINGING_VOLUME_HIGH;
                }
                return RINGING_VOLUME_MEDIUM;
            }
            return RINGING_VOLUME_LOW;
        }
        return RINGING_VOLUME_DEFAULT;
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
