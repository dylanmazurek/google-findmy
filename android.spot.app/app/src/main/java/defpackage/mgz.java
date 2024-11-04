package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mgz extends WeakReference {
    private static final boolean a = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException b;
    private final ReferenceQueue c;
    private final ConcurrentMap d;
    private final String e;
    private final Reference f;
    private final AtomicBoolean g;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        b = runtimeException;
    }

    public mgz(mha mhaVar, mav mavVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(mhaVar, referenceQueue);
        RuntimeException runtimeException;
        this.g = new AtomicBoolean();
        if (a) {
            runtimeException = new RuntimeException("ManagedChannel allocation site");
        } else {
            runtimeException = b;
        }
        this.f = new SoftReference(runtimeException);
        this.e = mavVar.toString();
        this.c = referenceQueue;
        this.d = concurrentMap;
        concurrentMap.put(this, this);
        a(referenceQueue);
    }

    static void a(ReferenceQueue referenceQueue) {
        while (true) {
            mgz mgzVar = (mgz) referenceQueue.poll();
            if (mgzVar != null) {
                RuntimeException runtimeException = (RuntimeException) mgzVar.f.get();
                mgzVar.b();
                if (!mgzVar.g.get()) {
                    Level level = Level.SEVERE;
                    if (mha.a.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                        logRecord.setLoggerName(mha.a.getName());
                        logRecord.setParameters(new Object[]{mgzVar.e});
                        logRecord.setThrown(runtimeException);
                        mha.a.log(logRecord);
                    }
                }
            } else {
                return;
            }
        }
    }

    private final void b() {
        super.clear();
        this.d.remove(this);
        this.f.clear();
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        b();
        a(this.c);
    }
}
