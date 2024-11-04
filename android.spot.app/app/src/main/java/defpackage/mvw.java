package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvw {
    public static final mwd a = new mwd(-1, null, null, 0);
    public static final int b = mpp.A("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
    public static final int c = mpp.A("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
    public static final nbj d = new nbj("BUFFERED");
    public static final nbj e = new nbj("SHOULD_BUFFER");
    public static final nbj f = new nbj("S_RESUMING_BY_RCV");
    public static final nbj g = new nbj("RESUMING_BY_EB");
    public static final nbj h = new nbj("POISONED");
    public static final nbj i = new nbj("DONE_RCV");
    public static final nbj j = new nbj("INTERRUPTED_SEND");
    public static final nbj k = new nbj("INTERRUPTED_RCV");
    public static final nbj l = new nbj("CHANNEL_CLOSED");
    public static final nbj m = new nbj("SUSPEND");
    public static final nbj n = new nbj("SUSPEND_NO_WAITER");
    public static final nbj o = new nbj("FAILED");
    public static final nbj p = new nbj("NO_RECEIVE_RESULT");
    public static final nbj q = new nbj("CLOSE_HANDLER_CLOSED");
    public static final nbj r = new nbj("CLOSE_HANDLER_INVOKED");
    public static final nbj s = new nbj("NO_CLOSE_CAUSE");

    public static final long a(long j2, boolean z) {
        long j3;
        if (true != z) {
            j3 = 0;
        } else {
            j3 = 4611686018427387904L;
        }
        return j3 + j2;
    }

    public static final long b(long j2, int i2) {
        return (i2 << 60) + j2;
    }

    public static final boolean c(msd msdVar, Object obj) {
        Object h2 = msdVar.h(obj, null);
        if (h2 != null) {
            msdVar.c(h2);
            return true;
        }
        return false;
    }
}
