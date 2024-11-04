package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum cew {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean a(cew cewVar) {
        cewVar.getClass();
        if (compareTo(cewVar) >= 0) {
            return true;
        }
        return false;
    }
}
