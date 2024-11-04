package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtu {
    public static final nbj a = new nbj("REMOVED_TASK");
    public static final nbj b = new nbj("CLOSED_EMPTY");

    public static final long a(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }
}
