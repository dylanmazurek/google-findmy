package j$.time;

import j$.time.chrono.AbstractC0032a;
import j$.time.chrono.AbstractC0040i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k implements j$.time.temporal.l, j$.time.temporal.m {
    public static final k APRIL;
    public static final k AUGUST;
    public static final k DECEMBER;
    public static final k FEBRUARY;
    public static final k JANUARY;
    public static final k JULY;
    public static final k JUNE;
    public static final k MARCH;
    public static final k MAY;
    public static final k NOVEMBER;
    public static final k OCTOBER;
    public static final k SEPTEMBER;
    private static final k[] a;
    private static final /* synthetic */ k[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, j$.time.k] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, j$.time.k] */
    static {
        ?? r12 = new Enum("JANUARY", 0);
        JANUARY = r12;
        ?? r13 = new Enum("FEBRUARY", 1);
        FEBRUARY = r13;
        ?? r14 = new Enum("MARCH", 2);
        MARCH = r14;
        ?? r15 = new Enum("APRIL", 3);
        APRIL = r15;
        ?? r9 = new Enum("MAY", 4);
        MAY = r9;
        ?? r8 = new Enum("JUNE", 5);
        JUNE = r8;
        ?? r7 = new Enum("JULY", 6);
        JULY = r7;
        ?? r6 = new Enum("AUGUST", 7);
        AUGUST = r6;
        ?? r5 = new Enum("SEPTEMBER", 8);
        SEPTEMBER = r5;
        ?? r4 = new Enum("OCTOBER", 9);
        OCTOBER = r4;
        ?? r3 = new Enum("NOVEMBER", 10);
        NOVEMBER = r3;
        ?? r2 = new Enum("DECEMBER", 11);
        DECEMBER = r2;
        b = new k[]{r12, r13, r14, r15, r9, r8, r7, r6, r5, r4, r3, r2};
        a = values();
    }

    public static k U(int i) {
        if (i >= 1 && i <= 12) {
            return a[i - 1];
        }
        throw new RuntimeException("Invalid value for MonthOfYear: " + i);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) b.clone();
    }

    @Override // j$.time.temporal.l
    public final Object B(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.k.e()) {
            return j$.time.chrono.u.d;
        }
        if (qVar == j$.time.temporal.k.i()) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.k.c(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal F(Temporal temporal) {
        if (((AbstractC0032a) AbstractC0040i.p(temporal)).equals(j$.time.chrono.u.d)) {
            return temporal.d(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    public final int R(boolean z) {
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 60;
            case 3:
                return (z ? 1 : 0) + 91;
            case 4:
                return (z ? 1 : 0) + 121;
            case 5:
                return (z ? 1 : 0) + 152;
            case 6:
                return (z ? 1 : 0) + 182;
            case 7:
                return (z ? 1 : 0) + 213;
            case 8:
                return (z ? 1 : 0) + 244;
            case 9:
                return (z ? 1 : 0) + 274;
            case 10:
                return (z ? 1 : 0) + 305;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    public final int S(boolean z) {
        int ordinal = ordinal();
        if (ordinal != 1) {
            if (ordinal != 3 && ordinal != 5 && ordinal != 8 && ordinal != 10) {
                return 31;
            }
            return 30;
        }
        if (z) {
            return 29;
        }
        return 28;
    }

    public final int T() {
        int ordinal = ordinal();
        if (ordinal != 1) {
            if (ordinal != 3 && ordinal != 5 && ordinal != 8 && ordinal != 10) {
                return 31;
            }
            return 30;
        }
        return 29;
    }

    public final k V() {
        return a[((((int) 1) + 12) + ordinal()) % 12];
    }

    @Override // j$.time.temporal.l
    public final boolean g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar != j$.time.temporal.a.MONTH_OF_YEAR) {
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
        if (oVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        return j$.time.temporal.k.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return oVar.k();
        }
        return j$.time.temporal.k.d(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final long w(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.n(this);
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
    }
}
