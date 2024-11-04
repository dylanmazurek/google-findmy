package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ceu {
    public static final cev a(cew cewVar) {
        cewVar.getClass();
        int ordinal = cewVar.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    return null;
                }
                return cev.ON_PAUSE;
            }
            return cev.ON_STOP;
        }
        return cev.ON_DESTROY;
    }

    public static final cev b(cew cewVar) {
        cewVar.getClass();
        int ordinal = cewVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return null;
                }
                return cev.ON_RESUME;
            }
            return cev.ON_START;
        }
        return cev.ON_CREATE;
    }
}
