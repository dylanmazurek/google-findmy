package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imw implements Application.ActivityLifecycleCallbacks, imt {
    private static final long g = TimeUnit.MINUTES.toMillis(1);
    public final ScheduledExecutorService a;
    public ScheduledFuture d;
    public kpb f;
    private final imu h;
    public final AtomicLong c = new AtomicLong(0);
    public final long b = g;
    protected final Object e = new Object();

    private imw(kpb kpbVar, ScheduledExecutorService scheduledExecutorService, imu imuVar) {
        this.f = kpbVar;
        this.a = scheduledExecutorService;
        this.h = imuVar;
    }

    public static imw c(kpb kpbVar, ScheduledExecutorService scheduledExecutorService, imu imuVar, Application application) {
        imw imwVar = new imw(kpbVar, scheduledExecutorService, imuVar);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(imwVar);
        }
        imuVar.c = imwVar;
        return imwVar;
    }

    public final void a() {
        synchronized (this.e) {
            ScheduledFuture scheduledFuture = this.d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.d = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map, java.lang.Object] */
    public final void b() {
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        int i2;
        int i3;
        int i4;
        this.c.set(0L);
        kpb kpbVar = this.f;
        ArrayList arrayList3 = new ArrayList();
        imu imuVar = this.h;
        synchronized (imuVar.b) {
            for (ims imsVar : imuVar.a.values()) {
                if (imsVar.c.length > 0) {
                    i4 = 10;
                } else {
                    i4 = 1;
                }
                HashMap hashMap = new HashMap(i4);
                imr imrVar = new imr(imsVar.b, imsVar.c);
                synchronized (imsVar.a) {
                    imrVar.d = imsVar.d;
                    imrVar.a = imsVar.e;
                    imsVar.d = hashMap;
                    imsVar.e = 0;
                }
                arrayList3.add(imrVar);
            }
        }
        ljh k = jdf.b.k();
        int size = arrayList3.size();
        int i5 = 0;
        while (true) {
            ffb ffbVar = null;
            kwq kwqVar = null;
            if (i5 < size) {
                imr imrVar2 = (imr) arrayList3.get(i5);
                if (imrVar2.a == 0) {
                    arrayList = arrayList3;
                    i = size;
                } else {
                    ljh k2 = kwq.e.k();
                    long b = imu.b((String) imrVar2.b);
                    if (!k2.b.y()) {
                        k2.t();
                    }
                    kwq kwqVar2 = (kwq) k2.b;
                    kwqVar2.a |= 2;
                    kwqVar2.b = b;
                    for (imp impVar : (imp[]) imrVar2.c) {
                        long b2 = imu.b(impVar.a);
                        if (!k2.b.y()) {
                            k2.t();
                        }
                        kwq kwqVar3 = (kwq) k2.b;
                        lju ljuVar = kwqVar3.c;
                        if (!ljuVar.c()) {
                            kwqVar3.c = ljn.o(ljuVar);
                        }
                        kwqVar3.c.g(b2);
                    }
                    for (Map.Entry entry : imrVar2.d.entrySet()) {
                        ljh k3 = kwp.d.k();
                        imk imkVar = (imk) entry.getKey();
                        iml imlVar = (iml) entry.getValue();
                        if (((imp[]) imrVar2.c).length > 0) {
                            Object obj = imrVar2.b;
                            ArrayList arrayList4 = new ArrayList(imkVar.c.length);
                            int i6 = 0;
                            while (i6 < imkVar.c.length) {
                                ljh k4 = kwn.c.k();
                                Object obj2 = imkVar.c[i6];
                                ArrayList arrayList5 = arrayList3;
                                if (obj2 instanceof String) {
                                    String str = (String) obj2;
                                    if (!k4.b.y()) {
                                        k4.t();
                                    }
                                    kwn kwnVar = (kwn) k4.b;
                                    str.getClass();
                                    i3 = size;
                                    kwnVar.a = 1;
                                    kwnVar.b = str;
                                } else {
                                    i3 = size;
                                    if (obj2 instanceof Integer) {
                                        Integer num = (Integer) obj2;
                                        num.intValue();
                                        if (!k4.b.y()) {
                                            k4.t();
                                        }
                                        kwn kwnVar2 = (kwn) k4.b;
                                        kwnVar2.a = 2;
                                        kwnVar2.b = num;
                                    } else if (obj2 instanceof Boolean) {
                                        Boolean bool = (Boolean) obj2;
                                        bool.booleanValue();
                                        if (!k4.b.y()) {
                                            k4.t();
                                        }
                                        kwn kwnVar3 = (kwn) k4.b;
                                        kwnVar3.a = 3;
                                        kwnVar3.b = bool;
                                    } else {
                                        throw new IllegalArgumentException("Metric " + ((String) obj) + " has field " + i6 + " with an unexpected value: " + String.valueOf(obj2));
                                    }
                                }
                                arrayList4.add((kwn) k4.q());
                                i6++;
                                arrayList3 = arrayList5;
                                size = i3;
                            }
                            arrayList2 = arrayList3;
                            i2 = size;
                            if (!k3.b.y()) {
                                k3.t();
                            }
                            kwp kwpVar = (kwp) k3.b;
                            ljv ljvVar = kwpVar.b;
                            if (!ljvVar.c()) {
                                kwpVar.b = ljn.p(ljvVar);
                            }
                            lhv.g(arrayList4, kwpVar.b);
                        } else {
                            arrayList2 = arrayList3;
                            i2 = size;
                        }
                        kwo a = imlVar.a();
                        if (!k3.b.y()) {
                            k3.t();
                        }
                        kwp kwpVar2 = (kwp) k3.b;
                        a.getClass();
                        kwpVar2.c = a;
                        kwpVar2.a |= 1;
                        if (!k2.b.y()) {
                            k2.t();
                        }
                        kwq kwqVar4 = (kwq) k2.b;
                        kwp kwpVar3 = (kwp) k3.q();
                        kwpVar3.getClass();
                        ljv ljvVar2 = kwqVar4.d;
                        if (!ljvVar2.c()) {
                            kwqVar4.d = ljn.p(ljvVar2);
                        }
                        kwqVar4.d.add(kwpVar3);
                        arrayList3 = arrayList2;
                        size = i2;
                    }
                    arrayList = arrayList3;
                    i = size;
                    kwqVar = (kwq) k2.q();
                }
                if (kwqVar != null) {
                    if (!k.b.y()) {
                        k.t();
                    }
                    jdf jdfVar = (jdf) k.b;
                    ljv ljvVar3 = jdfVar.a;
                    if (!ljvVar3.c()) {
                        jdfVar.a = ljn.p(ljvVar3);
                    }
                    jdfVar.a.add(kwqVar);
                }
                i5++;
                arrayList3 = arrayList;
                size = i;
            } else {
                jdf jdfVar2 = (jdf) k.q();
                if (jdfVar2.a.size() != 0) {
                    ffbVar = ((ffc) kpbVar.a).g(jdfVar2);
                    ffbVar.j = (String) kpbVar.c;
                    Iterator it = ((CopyOnWriteArrayList) kpbVar.b).iterator();
                    while (it.hasNext()) {
                        ffbVar.f((String) it.next());
                    }
                }
                if (ffbVar != null) {
                    ffbVar.c();
                    return;
                }
                return;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        synchronized (this.e) {
            b();
            a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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
