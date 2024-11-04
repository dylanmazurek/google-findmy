package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes2.dex */
enum g implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));

    private final String a;
    private final Duration b;

    g(String str, Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long k(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.f(temporal2, this);
        }
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return temporal.f(temporal2, ChronoUnit.MONTHS) / 3;
            }
            throw new IllegalStateException("Unreachable");
        }
        o oVar = h.c;
        return j$.lang.a.h(temporal2.w(oVar), temporal.w(oVar));
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal n(Temporal temporal, long j) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return temporal.e(j / 4, ChronoUnit.YEARS).e((j % 4) * 3, ChronoUnit.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }
        return temporal.d(j$.lang.a.d(temporal.n(r0), j), h.c);
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration q() {
        return this.b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
