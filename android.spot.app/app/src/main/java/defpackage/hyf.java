package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyf {
    public final /* synthetic */ hyg e;
    Optional a = Optional.empty();
    Optional b = Optional.empty();
    Optional c = Optional.empty();
    Optional d = Optional.empty();
    private boolean f = false;

    public hyf(hyg hygVar) {
        this.e = hygVar;
    }

    private static final int c(hys hysVar) {
        return ((Integer) hyg.b.getOrDefault(hysVar.f, 1)).intValue();
    }

    public final void a(hyu hyuVar) {
        boolean z;
        boolean z2;
        boolean z3;
        jer jerVar;
        hyf hyfVar = this;
        hyu hyuVar2 = hyuVar;
        synchronized (hyfVar.e.e) {
            if (hyfVar.e.p != 5) {
                return;
            }
            Object obj = hyfVar.e.e;
            Instant now = Instant.now();
            synchronized (obj) {
                if (hyfVar.a.isEmpty()) {
                    hyfVar.a = Optional.of(now);
                }
            }
            if (!hyfVar.f && hyuVar2.b.isPresent() && ((hys) hyuVar2.b.get()).e < hyfVar.e.f.h) {
                hyfVar.f = true;
            }
            if (!hyfVar.f && hyuVar2.b.isPresent() && ((hys) hyuVar2.b.get()).d < hyfVar.e.f.i) {
                hyfVar.f = true;
            }
            boolean isPresent = hyuVar2.a.isPresent();
            if (hyfVar.f && hyuVar2.b.isPresent() && ((hys) hyuVar2.b.get()).f == hyr.OK) {
                z = true;
            } else {
                z = false;
            }
            if (hyfVar.d.isEmpty()) {
                if (z) {
                    hyfVar.d = Optional.of(0);
                } else {
                    if (!now.isBefore(((Instant) hyfVar.a.get()).plus(hyfVar.e.f.b))) {
                        hyfVar.d = Optional.of(2);
                    } else {
                        return;
                    }
                }
            }
            if (isPresent) {
                hyfVar.b = Optional.of(now);
            }
            if (z) {
                hyfVar.c = Optional.of(now);
                z2 = true;
            } else {
                z2 = false;
            }
            if (hyuVar2.b.isPresent()) {
                hyfVar.e.o = c((hys) hyuVar2.b.get());
            }
            int intValue = ((Integer) hyfVar.d.get()).intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (z2) {
                        hyfVar.d = Optional.of(0);
                        z3 = true;
                    }
                    z3 = false;
                } else if (z2) {
                    if (isPresent) {
                        hyfVar.d = Optional.of(0);
                    }
                    z3 = true;
                } else {
                    if (now.isAfter(((Instant) hyfVar.c.get()).plus(hyfVar.e.f.d))) {
                        hyfVar.d = Optional.of(2);
                    }
                    z3 = false;
                }
            } else if (z2) {
                if (!isPresent) {
                    if (now.isAfter(((Instant) hyfVar.b.get()).plus(hyfVar.e.f.d))) {
                        hyfVar.d = Optional.of(1);
                    }
                }
                z3 = true;
            } else {
                if (now.isAfter(((Instant) hyfVar.c.get()).plus(hyfVar.e.f.d))) {
                    hyfVar.d = Optional.of(2);
                }
                z3 = false;
            }
            if (((((Integer) hyfVar.d.get()).intValue() == 0 || ((Integer) hyfVar.d.get()).intValue() == 1) && z3) || (((Integer) hyfVar.d.get()).intValue() == 2 && isPresent)) {
                hyb hybVar = new hyb();
                hybVar.a = ((Integer) hyfVar.d.get()).intValue();
                hybVar.h = (byte) (hybVar.h | 1);
                int intValue2 = ((Integer) hyfVar.d.get()).intValue();
                if (intValue2 != 0 && intValue2 != 1) {
                    hyz hyzVar = (hyz) ((jis) hyuVar2.a.get()).get(0);
                    if (hyuVar2.b.isPresent()) {
                        hybVar.a(c((hys) hyuVar2.b.get()));
                    } else {
                        hybVar.a(hyfVar.e.o);
                    }
                    hybVar.e(hyzVar.b);
                    hybVar.d(0.0d);
                    hybVar.c(0.0d);
                    hybVar.b(0.0d);
                    hybVar.f(now.toEpochMilli());
                } else {
                    hys hysVar = (hys) hyuVar2.b.get();
                    hybVar.a(c(hysVar));
                    hybVar.e(hysVar.a);
                    hybVar.d(hysVar.b);
                    hybVar.c(hysVar.c);
                    hybVar.b(hysVar.d);
                    hybVar.f(now.toEpochMilli());
                }
                if (hybVar.h != Byte.MAX_VALUE) {
                    StringBuilder sb = new StringBuilder();
                    if ((hybVar.h & 1) == 0) {
                        sb.append(" estimateLevel");
                    }
                    if ((hybVar.h & 2) == 0) {
                        sb.append(" arCoreState");
                    }
                    if ((hybVar.h & 4) == 0) {
                        sb.append(" rangeM");
                    }
                    if ((hybVar.h & 8) == 0) {
                        sb.append(" rangeErrorStdDevM");
                    }
                    if ((hybVar.h & 16) == 0) {
                        sb.append(" bearingRad");
                    }
                    if ((hybVar.h & 32) == 0) {
                        sb.append(" bearingErrorStdDevRad");
                    }
                    if ((hybVar.h & 64) == 0) {
                        sb.append(" timestampMs");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                hyc hycVar = new hyc(hybVar.a, hybVar.b, hybVar.c, hybVar.d, hybVar.e, hybVar.f, hybVar.g);
                hyfVar = this;
                synchronized (hyfVar.e.e) {
                    hyg hygVar = hyfVar.e;
                    if (hygVar.p == 5) {
                        njz njzVar = hygVar.s;
                        synchronized (((ifh) njzVar.a).g) {
                            Object obj2 = njzVar.a;
                            iff iffVar = ((ifh) obj2).h;
                            jer jerVar2 = iffVar.a;
                            int i = iffVar.d;
                            jer i2 = jer.i(Double.valueOf(hycVar.b));
                            if (hycVar.a != 2) {
                                jerVar = jer.i(Double.valueOf(hycVar.c));
                            } else {
                                jerVar = jdl.a;
                            }
                            ((ifh) obj2).d(hqk.f(jerVar2, i2, jerVar, i));
                        }
                    }
                }
                hyuVar2 = hyuVar;
            }
            if (hyuVar2.b.isPresent() && ((hys) hyuVar2.b.get()).f != hyr.OK) {
                hyfVar.f = false;
            }
        }
    }

    public final void b() {
        synchronized (this.e.e) {
            hyg hygVar = this.e;
            if (hygVar.p == 4) {
                hygVar.n = true;
                this.e.c();
            }
        }
    }
}
