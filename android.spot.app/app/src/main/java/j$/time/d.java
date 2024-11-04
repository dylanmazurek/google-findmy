package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d implements j$.time.temporal.l, j$.time.temporal.m {
    public static final d FRIDAY;
    public static final d MONDAY;
    public static final d SATURDAY;
    public static final d SUNDAY;
    public static final d THURSDAY;
    public static final d TUESDAY;
    public static final d WEDNESDAY;
    private static final d[] a;
    private static final /* synthetic */ d[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, j$.time.d] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, j$.time.d] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, j$.time.d] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, j$.time.d] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, j$.time.d] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, j$.time.d] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, j$.time.d] */
    static {
        ?? r7 = new Enum("MONDAY", 0);
        MONDAY = r7;
        ?? r8 = new Enum("TUESDAY", 1);
        TUESDAY = r8;
        ?? r9 = new Enum("WEDNESDAY", 2);
        WEDNESDAY = r9;
        ?? r10 = new Enum("THURSDAY", 3);
        THURSDAY = r10;
        ?? r11 = new Enum("FRIDAY", 4);
        FRIDAY = r11;
        ?? r12 = new Enum("SATURDAY", 5);
        SATURDAY = r12;
        ?? r13 = new Enum("SUNDAY", 6);
        SUNDAY = r13;
        b = new d[]{r7, r8, r9, r10, r11, r12, r13};
        a = values();
    }

    public static d R(int i) {
        if (i >= 1 && i <= 7) {
            return a[i - 1];
        }
        throw new RuntimeException("Invalid value for DayOfWeek: " + i);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) b.clone();
    }

    @Override // j$.time.temporal.l
    public final Object B(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.k.i()) {
            return ChronoUnit.DAYS;
        }
        return j$.time.temporal.k.c(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal F(Temporal temporal) {
        return temporal.d(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }

    @Override // j$.time.temporal.l
    public final boolean g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar != j$.time.temporal.a.DAY_OF_WEEK) {
                return false;
            }
            return true;
        }
        if (oVar == null || !oVar.q(this)) {
            return false;
        }
        return true;
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.l
    public final int n(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        return j$.time.temporal.k.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return oVar.k();
        }
        return j$.time.temporal.k.d(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final long w(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.n(this);
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
    }
}
