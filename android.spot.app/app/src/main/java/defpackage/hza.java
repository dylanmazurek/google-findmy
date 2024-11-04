package defpackage;

import com.google.hardware.techeng.sensors.finder.Status;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hza implements ftp {
    final /* synthetic */ hzb a;

    public hza(hzb hzbVar) {
        this.a = hzbVar;
    }

    @Override // defpackage.ftp
    public final void a() {
        ((jni) ((jni) hzb.a.e()).j("com/google/android/libraries/precisionfinding/ranging/UwbAdapter$UwbListener", "onRangingInitialized", 229, "UwbAdapter.java")).r("onRangingInitialized");
        synchronized (this.a.f) {
            hzb hzbVar = this.a;
            if (hzbVar.h != 2) {
                ((jni) ((jni) hzb.a.f()).j("com/google/android/libraries/precisionfinding/ranging/UwbAdapter$UwbListener", "onRangingInitialized", 232, "UwbAdapter.java")).r("Uwb initialized but wasn't in STARTING state.");
                return;
            }
            hzbVar.h = 3;
            Object obj = hzbVar.e.get();
            synchronized (((hyy) ((izl) obj).b).c) {
                Object obj2 = ((izl) obj).b;
                hyx hyxVar = ((hyy) obj2).d;
                if (hyxVar != hyx.STOPPED) {
                    if (hyxVar == hyx.STARTING) {
                        ((hyy) obj2).d = hyx.ACTIVE;
                        ((hyf) ((hyy) obj2).k.get()).b();
                    }
                    ((hyy) ((izl) obj).b).e.put(((izl) obj).a, hyx.ACTIVE);
                }
            }
        }
    }

    @Override // defpackage.ftp
    public final void b(fto ftoVar) {
        synchronized (this.a.f) {
            hzb hzbVar = this.a;
            if (hzbVar.h != 3) {
                ((jni) ((jni) hzb.a.f()).j("com/google/android/libraries/precisionfinding/ranging/UwbAdapter$UwbListener", "onRangingResult", 244, "UwbAdapter.java")).r("onRangingResult callback received but UwbAdapter not in STARTED state.");
                return;
            }
            hyh hyhVar = hyh.UWB;
            if (hyhVar != null) {
                hyz hyzVar = new hyz(hyhVar, ftoVar.a.a, ftoVar.c, ftoVar.b);
                Object obj = hzbVar.e.get();
                synchronized (((hyy) ((izl) obj).b).c) {
                    if (((hyy) ((izl) obj).b).d != hyx.STOPPED) {
                        ((hyy) ((izl) obj).b).u = Instant.now();
                        Object obj2 = ((izl) obj).b;
                        int ordinal = hyzVar.a.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                throw new UnsupportedOperationException("CS support not implemented. Can't update fusion alg.");
                            }
                        } else {
                            Object obj3 = ((hyy) obj2).l.get();
                            final double d = hyzVar.b;
                            final long j = hyzVar.c;
                            final kwu kwuVar = (kwu) obj3;
                            ((kwu) obj3).c.post(new Runnable() { // from class: kwt
                                @Override // java.lang.Runnable
                                public final void run() {
                                    double d2 = d;
                                    long j2 = j;
                                    kwu kwuVar2 = kwu.this;
                                    synchronized (kwuVar2.f) {
                                        if (!kwuVar2.k) {
                                            return;
                                        }
                                        kwuVar2.h.updateWithUwbMeasurement(kwuVar2.l, d2, j2);
                                        kwuVar2.h.getEstimate(kwuVar2.l, kwuVar2.j);
                                        if (kwuVar2.j.status != Status.ESTIMATE_NOT_AVAILABLE) {
                                            kwuVar2.c(kwuVar2.j);
                                        }
                                        kwuVar2.b(kwuVar2.j);
                                    }
                                }
                            });
                        }
                        if (((hyy) ((izl) obj).b).j.c.isZero()) {
                            hyt hytVar = new hyt(null);
                            hytVar.c(jis.q(hyzVar));
                            hytVar.d(Instant.now().toEpochMilli());
                            hyu a = hytVar.a();
                            synchronized (((hyy) ((izl) obj).b).c) {
                                Object obj4 = ((izl) obj).b;
                                if (((hyy) obj4).d != hyx.STOPPED) {
                                    ((hyf) ((hyy) obj4).k.get()).a(a);
                                }
                            }
                        }
                        int ordinal2 = hyzVar.a.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 == 1) {
                                throw new UnsupportedOperationException("CS support not implemented.");
                            }
                        } else {
                            synchronized (((hyy) ((izl) obj).b).c) {
                                ((hyy) ((izl) obj).b).p = Optional.of(hyzVar);
                            }
                        }
                    }
                }
                return;
            }
            throw new NullPointerException("Null rangingTechnology");
        }
    }

    @Override // defpackage.ftp
    public final void c(int i) {
        ((jni) ((jni) hzb.a.e()).j("com/google/android/libraries/precisionfinding/ranging/UwbAdapter$UwbListener", "onRangingSuspended", 261, "UwbAdapter.java")).s("onRangingSuspended: %d", i);
        synchronized (this.a.f) {
            hzb hzbVar = this.a;
            if (hzbVar.h == 1) {
                ((jni) ((jni) hzb.a.f()).j("com/google/android/libraries/precisionfinding/ranging/UwbAdapter$UwbListener", "onRangingSuspended", 264, "UwbAdapter.java")).r("onRangingSuspended callback received but UwbAdapter was in STOPPED state.");
                return;
            }
            hzbVar.h = 1;
            hzbVar.b();
            if (i == 4) {
                ((izl) this.a.e.get()).b();
            } else {
                ((izl) this.a.e.get()).b();
            }
            this.a.a();
        }
    }
}
