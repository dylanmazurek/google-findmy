package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum eox {
    NO_RUNNING_OPERATION(false),
    UNKNOWN_OPERATION(false),
    SCANNING(false),
    UNPROVISIONING(false),
    DELETING_DEVICE(false),
    FAILED_SCANNING(true),
    FAILED_MISC(true),
    SUCCEEDED(false);

    public final boolean i;

    eox(boolean z) {
        this.i = z;
    }
}
