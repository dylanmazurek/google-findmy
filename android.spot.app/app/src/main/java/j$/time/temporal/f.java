package j$.time.temporal;

import j$.time.chrono.AbstractC0032a;
import j$.time.chrono.AbstractC0040i;
import j$.time.chrono.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
abstract class f implements o {
    public static final f DAY_OF_QUARTER;
    public static final f QUARTER_OF_YEAR;
    public static final f WEEK_BASED_YEAR;
    public static final f WEEK_OF_WEEK_BASED_YEAR;
    private static final int[] a;
    private static final /* synthetic */ f[] b;

    static {
        f fVar = new f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.o
            public final s k() {
                return s.k(90L, 92L);
            }

            @Override // j$.time.temporal.o
            public final long n(l lVar) {
                int[] iArr;
                int i;
                if (q(lVar)) {
                    int n = lVar.n(a.DAY_OF_YEAR);
                    int n2 = lVar.n(a.MONTH_OF_YEAR);
                    long w = lVar.w(a.YEAR);
                    iArr = f.a;
                    int i2 = (n2 - 1) / 3;
                    u.d.getClass();
                    if (u.q(w)) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    return n - iArr[i2 + i];
                }
                throw new RuntimeException("Unsupported field: DayOfQuarter");
            }

            @Override // j$.time.temporal.o
            public final boolean q(l lVar) {
                if (lVar.g(a.DAY_OF_YEAR) && lVar.g(a.MONTH_OF_YEAR) && lVar.g(a.YEAR)) {
                    o oVar = h.a;
                    if (((AbstractC0032a) AbstractC0040i.p(lVar)).equals(u.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.o
            public final Temporal r(Temporal temporal, long j) {
                long n = n(temporal);
                k().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.d((j - n) + temporal.w(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.o
            public final s w(l lVar) {
                if (q(lVar)) {
                    long w = lVar.w(f.QUARTER_OF_YEAR);
                    if (w == 1) {
                        long w2 = lVar.w(a.YEAR);
                        u.d.getClass();
                        if (u.q(w2)) {
                            return s.j(1L, 91L);
                        }
                        return s.j(1L, 90L);
                    }
                    if (w == 2) {
                        return s.j(1L, 91L);
                    }
                    if (w != 3 && w != 4) {
                        return k();
                    }
                    return s.j(1L, 92L);
                }
                throw new RuntimeException("Unsupported field: DayOfQuarter");
            }
        };
        DAY_OF_QUARTER = fVar;
        f fVar2 = new f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.o
            public final s k() {
                return s.j(1L, 4L);
            }

            @Override // j$.time.temporal.o
            public final long n(l lVar) {
                if (q(lVar)) {
                    return (lVar.w(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new RuntimeException("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.o
            public final boolean q(l lVar) {
                if (lVar.g(a.MONTH_OF_YEAR)) {
                    o oVar = h.a;
                    if (((AbstractC0032a) AbstractC0040i.p(lVar)).equals(u.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.o
            public final Temporal r(Temporal temporal, long j) {
                long n = n(temporal);
                k().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.d(((j - n) * 3) + temporal.w(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.o
            public final s w(l lVar) {
                if (q(lVar)) {
                    return k();
                }
                throw new RuntimeException("Unsupported field: QuarterOfYear");
            }
        };
        QUARTER_OF_YEAR = fVar2;
        f fVar3 = new f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.o
            public final s k() {
                return s.k(52L, 53L);
            }

            @Override // j$.time.temporal.o
            public final long n(l lVar) {
                if (q(lVar)) {
                    return f.R(j$.time.g.T(lVar));
                }
                throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.o
            public final boolean q(l lVar) {
                if (lVar.g(a.EPOCH_DAY)) {
                    o oVar = h.a;
                    if (((AbstractC0032a) AbstractC0040i.p(lVar)).equals(u.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.o
            public final Temporal r(Temporal temporal, long j) {
                k().b(j, this);
                return temporal.e(j$.lang.a.h(j, n(temporal)), ChronoUnit.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.o
            public final s w(l lVar) {
                if (q(lVar)) {
                    return f.U(j$.time.g.T(lVar));
                }
                throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        f fVar4 = new f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.o
            public final s k() {
                return a.YEAR.k();
            }

            @Override // j$.time.temporal.o
            public final long n(l lVar) {
                int V;
                if (q(lVar)) {
                    V = f.V(j$.time.g.T(lVar));
                    return V;
                }
                throw new RuntimeException("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.o
            public final boolean q(l lVar) {
                if (lVar.g(a.EPOCH_DAY)) {
                    o oVar = h.a;
                    if (((AbstractC0032a) AbstractC0040i.p(lVar)).equals(u.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.o
            public final Temporal r(Temporal temporal, long j) {
                int W;
                if (q(temporal)) {
                    int a2 = a.YEAR.k().a(j, f.WEEK_BASED_YEAR);
                    j$.time.g T = j$.time.g.T(temporal);
                    int n = T.n(a.DAY_OF_WEEK);
                    int R = f.R(T);
                    if (R == 53) {
                        W = f.W(a2);
                        if (W == 52) {
                            R = 52;
                        }
                    }
                    return temporal.q(j$.time.g.f0(a2, 1, 4).j0(((R - 1) * 7) + (n - r6.n(r0))));
                }
                throw new RuntimeException("Unsupported field: WeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.o
            public final s w(l lVar) {
                if (q(lVar)) {
                    return k();
                }
                throw new RuntimeException("Unsupported field: WeekBasedYear");
            }
        };
        WEEK_BASED_YEAR = fVar4;
        b = new f[]{fVar, fVar2, fVar3, fVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int R(j$.time.g gVar) {
        int ordinal = gVar.W().ordinal();
        int i = 1;
        int X = gVar.X() - 1;
        int i2 = (3 - ordinal) + X;
        int i3 = i2 - ((i2 / 7) * 7);
        int i4 = i3 - 3;
        if (i4 < -3) {
            i4 = i3 + 4;
        }
        if (X < i4) {
            return (int) s.j(1L, W(V(gVar.p0(180).l0(-1L)))).d();
        }
        int i5 = ((X - i4) / 7) + 1;
        if (i5 != 53 || i4 == -3 || (i4 == -2 && gVar.c0())) {
            i = i5;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s U(j$.time.g gVar) {
        return s.j(1L, W(V(gVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int V(j$.time.g gVar) {
        int a0 = gVar.a0();
        int X = gVar.X();
        if (X <= 3) {
            if (X - gVar.W().ordinal() < -2) {
                return a0 - 1;
            }
            return a0;
        }
        if (X >= 363) {
            if (((X - 363) - (gVar.c0() ? 1 : 0)) - gVar.W().ordinal() >= 0) {
                return a0 + 1;
            }
            return a0;
        }
        return a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int W(int i) {
        j$.time.g f0 = j$.time.g.f0(i, 1, 1);
        if (f0.W() != j$.time.d.THURSDAY) {
            if (f0.W() != j$.time.d.WEDNESDAY || !f0.c0()) {
                return 52;
            }
            return 53;
        }
        return 53;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) b.clone();
    }

    @Override // j$.time.temporal.o
    public final boolean B() {
        return true;
    }
}
