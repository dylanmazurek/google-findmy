package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum cev {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static final ceu Companion = new ceu();

    public final cew a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return cew.DESTROYED;
                            }
                            toString();
                            throw new IllegalArgumentException(toString().concat(" has no target state"));
                        }
                    }
                } else {
                    return cew.RESUMED;
                }
            }
            return cew.STARTED;
        }
        return cew.CREATED;
    }
}
