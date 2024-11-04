package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.hardware.techeng.sensors.finder.Estimate;
import com.google.hardware.techeng.sensors.finder.SessionWithArCoreNative;
import com.google.hardware.techeng.sensors.finder.Status;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwu implements Application.ActivityLifecycleCallbacks {
    public static final jnk a = jnk.l("com/google/hardware/techeng/sensors/finder/ArCoreMultiSensorFinder");
    public HandlerThread b;
    public Handler c;
    public final ncr d;
    public final boolean e;
    public final Object f;
    public final long g;
    public final SessionWithArCoreNative h;
    public boolean i;
    public final Estimate j;
    public boolean k;
    public long l;
    public final List m;
    public final Runnable n;

    static {
        Duration.ofMillis(200L);
        Duration.ofSeconds(2L);
    }

    public kwu(ncr ncrVar) {
        long j;
        SessionWithArCoreNative sessionWithArCoreNative = new SessionWithArCoreNative();
        this.f = new Object();
        this.i = false;
        this.j = new Estimate();
        this.k = false;
        this.l = 0L;
        this.m = new ArrayList();
        this.n = new jxe(this, 17);
        this.d = ncrVar;
        Executors.newSingleThreadExecutor();
        this.h = sessionWithArCoreNative;
        this.e = true;
        double d = ncrVar.h;
        if (d > 0.0d) {
            j = (long) (1000.0d / d);
        } else {
            j = 100;
        }
        this.g = j;
    }

    public final Status a() {
        synchronized (this.f) {
            if (!this.k) {
                return Status.OK;
            }
            Status stop = this.h.stop(this.l);
            if (stop != Status.OK) {
                ((jni) ((jni) a.g()).j("com/google/hardware/techeng/sensors/finder/ArCoreMultiSensorFinder", "stop", 307, "ArCoreMultiSensorFinder.java")).u("Could not stop session: %s", stop);
            }
            this.k = false;
            return stop;
        }
    }

    public final void b(Estimate estimate) {
        Status status;
        if (estimate.status != Status.OK && (status = estimate.status) != Status.ESTIMATE_NOT_AVAILABLE && status != Status.RECOVERING && status != Status.RECOVERING_FROM_FAILURE_DUE_TO_INSUFFICIENT_LIGHT && status != Status.RECOVERING_FROM_FAILURE_DUE_TO_EXCESSIVE_MOTION && status != Status.RECOVERING_FROM_FAILURE_DUE_TO_INSUFFICIENT_FEATURES && status != Status.RECOVERING_FROM_FAILURE_DUE_TO_CAMERA_UNAVAILABILITY && status != Status.RECOVERING_FROM_FAILURE_DUE_TO_BAD_ODOMETRY_STATE) {
            a();
        }
    }

    public final void c(Estimate estimate) {
        hyr hyrVar;
        Estimate estimate2 = estimate;
        for (njz njzVar : this.m) {
            synchronized (((hyy) njzVar.a).c) {
                Object obj = njzVar.a;
                hyx hyxVar = ((hyy) obj).d;
                if (hyxVar != hyx.STOPPED) {
                    if (hyxVar == hyx.STARTING) {
                        ((hyy) obj).d = hyx.ACTIVE;
                        ((hyf) ((hyy) obj).k.get()).b();
                    }
                    double d = estimate2.rangeM;
                    double d2 = estimate2.rangeErrorStdDevM;
                    double d3 = estimate2.bearingRad;
                    double d4 = estimate2.bearingErrorStdDevRad;
                    Status status = estimate2.status;
                    Status status2 = Status.OK;
                    switch (status) {
                        case OK:
                            hyrVar = hyr.OK;
                            break;
                        case ESTIMATE_NOT_AVAILABLE:
                        case RECOVERING:
                        case RECOVERING_FROM_FAILURE_DUE_TO_BAD_ODOMETRY_STATE:
                        case ODOMETRY_ERROR:
                        case BEACON_MOVING_ERROR:
                        case CONFIGURATION_ERROR:
                        case SENSOR_PERMISSION_DENIED_ERROR:
                        case UNKNOWN_ERROR:
                            hyrVar = hyr.BAD_STATE;
                            break;
                        case RECOVERING_FROM_FAILURE_DUE_TO_INSUFFICIENT_LIGHT:
                            hyrVar = hyr.POOR_LIGHTNING;
                            break;
                        case RECOVERING_FROM_FAILURE_DUE_TO_EXCESSIVE_MOTION:
                            hyrVar = hyr.EXCESSIVE_MOTION;
                            break;
                        case RECOVERING_FROM_FAILURE_DUE_TO_INSUFFICIENT_FEATURES:
                            hyrVar = hyr.INSUFFICIENT_FEATURES;
                            break;
                        case RECOVERING_FROM_FAILURE_DUE_TO_CAMERA_UNAVAILABILITY:
                            hyrVar = hyr.CAMERA_UNAVAILABLE;
                            break;
                        default:
                            hyrVar = hyr.BAD_STATE;
                            break;
                    }
                    hyr hyrVar2 = hyrVar;
                    if (hyrVar2 != null) {
                        hys hysVar = new hys(d, d2, d3, d4, estimate2.estimatedBeaconPositionErrorStdDevM, hyrVar2);
                        if (hysVar.f == hyr.OK) {
                            ((hyy) njzVar.a).v = Instant.now();
                            ((hyy) njzVar.a).w = true;
                        }
                        synchronized (((hyy) njzVar.a).c) {
                            ((hyy) njzVar.a).r = Optional.of(hysVar);
                        }
                        if (((hyy) njzVar.a).j.c.isZero()) {
                            hyt hytVar = new hyt(null);
                            hytVar.b(hysVar);
                            hytVar.d(Instant.now().toEpochMilli());
                            hyu a2 = hytVar.a();
                            synchronized (((hyy) njzVar.a).c) {
                                Object obj2 = njzVar.a;
                                if (((hyy) obj2).d != hyx.STOPPED) {
                                    ((hyf) ((hyy) obj2).k.get()).a(a2);
                                }
                            }
                        }
                        estimate2 = estimate;
                    } else {
                        throw new NullPointerException("Null arCoreState");
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f) {
            if (this.l != 0) {
                Status a2 = a();
                if (a2 != Status.OK) {
                    ((jni) ((jni) a.g()).j("com/google/hardware/techeng/sensors/finder/ArCoreMultiSensorFinder", "delete", 320, "ArCoreMultiSensorFinder.java")).u("Could not stop session: %s", a2);
                }
                this.h.deleteSession(this.l);
                this.l = 0L;
            }
            HandlerThread handlerThread = this.b;
            if (handlerThread != null) {
                handlerThread.quit();
                this.b = null;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
