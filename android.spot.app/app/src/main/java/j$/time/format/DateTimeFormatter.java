package j$.time.format;

import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter e;
    private final e a;
    private final Locale b;
    private final s c;
    private final j$.time.chrono.u d;

    static {
        n nVar = new n();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        u uVar = u.EXCEEDS_PAD;
        nVar.l(aVar, 4, 10, uVar);
        nVar.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        nVar.k(aVar2, 2);
        nVar.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        nVar.k(aVar3, 2);
        t tVar = t.STRICT;
        j$.time.chrono.u uVar2 = j$.time.chrono.u.d;
        DateTimeFormatter t = nVar.t(tVar, uVar2);
        ISO_LOCAL_DATE = t;
        n nVar2 = new n();
        nVar2.p();
        nVar2.a(t);
        nVar2.h();
        nVar2.t(tVar, uVar2);
        n nVar3 = new n();
        nVar3.p();
        nVar3.a(t);
        nVar3.o();
        nVar3.h();
        nVar3.t(tVar, uVar2);
        n nVar4 = new n();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        nVar4.k(aVar4, 2);
        nVar4.e(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        nVar4.k(aVar5, 2);
        nVar4.o();
        nVar4.e(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        nVar4.k(aVar6, 2);
        nVar4.o();
        nVar4.b(j$.time.temporal.a.NANO_OF_SECOND);
        DateTimeFormatter t2 = nVar4.t(tVar, null);
        n nVar5 = new n();
        nVar5.p();
        nVar5.a(t2);
        nVar5.h();
        nVar5.t(tVar, null);
        n nVar6 = new n();
        nVar6.p();
        nVar6.a(t2);
        nVar6.o();
        nVar6.h();
        nVar6.t(tVar, null);
        n nVar7 = new n();
        nVar7.p();
        nVar7.a(t);
        nVar7.e('T');
        nVar7.a(t2);
        DateTimeFormatter t3 = nVar7.t(tVar, uVar2);
        n nVar8 = new n();
        nVar8.p();
        nVar8.a(t3);
        nVar8.r();
        nVar8.h();
        nVar8.s();
        DateTimeFormatter t4 = nVar8.t(tVar, uVar2);
        n nVar9 = new n();
        nVar9.a(t4);
        nVar9.o();
        nVar9.e('[');
        nVar9.q();
        nVar9.m();
        nVar9.e(']');
        nVar9.t(tVar, uVar2);
        n nVar10 = new n();
        nVar10.a(t3);
        nVar10.o();
        nVar10.h();
        nVar10.o();
        nVar10.e('[');
        nVar10.q();
        nVar10.m();
        nVar10.e(']');
        nVar10.t(tVar, uVar2);
        n nVar11 = new n();
        nVar11.p();
        nVar11.l(aVar, 4, 10, uVar);
        nVar11.e('-');
        nVar11.k(j$.time.temporal.a.DAY_OF_YEAR, 3);
        nVar11.o();
        nVar11.h();
        nVar11.t(tVar, uVar2);
        n nVar12 = new n();
        nVar12.p();
        nVar12.l(j$.time.temporal.h.c, 4, 10, uVar);
        nVar12.f("-W");
        nVar12.k(j$.time.temporal.h.b, 2);
        nVar12.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        nVar12.k(aVar7, 1);
        nVar12.o();
        nVar12.h();
        nVar12.t(tVar, uVar2);
        n nVar13 = new n();
        nVar13.p();
        nVar13.c();
        e = nVar13.t(tVar, null);
        n nVar14 = new n();
        nVar14.p();
        nVar14.k(aVar, 4);
        nVar14.k(aVar2, 2);
        nVar14.k(aVar3, 2);
        nVar14.o();
        nVar14.r();
        nVar14.g("+HHMMss", "Z");
        nVar14.s();
        nVar14.t(tVar, uVar2);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        n nVar15 = new n();
        nVar15.p();
        nVar15.r();
        nVar15.o();
        nVar15.i(aVar7, hashMap);
        nVar15.f(", ");
        nVar15.n();
        nVar15.l(aVar3, 1, 2, u.NOT_NEGATIVE);
        nVar15.e(' ');
        nVar15.i(aVar2, hashMap2);
        nVar15.e(' ');
        nVar15.k(aVar, 4);
        nVar15.e(' ');
        nVar15.k(aVar4, 2);
        nVar15.e(':');
        nVar15.k(aVar5, 2);
        nVar15.o();
        nVar15.e(':');
        nVar15.k(aVar6, 2);
        nVar15.n();
        nVar15.e(' ');
        nVar15.g("+HHMM", "GMT");
        nVar15.t(t.SMART, uVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeFormatter(e eVar, Locale locale, t tVar, j$.time.chrono.u uVar) {
        s sVar = s.a;
        this.a = eVar;
        Objects.a(locale, "locale");
        this.b = locale;
        this.c = sVar;
        Objects.a(tVar, "resolverStyle");
        this.d = uVar;
    }

    public final String a(j$.time.temporal.l lVar) {
        StringBuilder sb = new StringBuilder(32);
        try {
            this.a.k(new p(lVar, this), sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public final j$.time.chrono.n b() {
        return this.d;
    }

    public final s c() {
        return this.c;
    }

    public final Locale d() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final e e() {
        return this.a.a();
    }

    public final String toString() {
        String eVar = this.a.toString();
        if (!eVar.startsWith("[")) {
            return eVar.substring(1, eVar.length() - 1);
        }
        return eVar;
    }
}
