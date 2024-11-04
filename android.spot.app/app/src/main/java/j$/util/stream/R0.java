package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class R0 {
    public static final R0 DISTINCT;
    public static final R0 ORDERED;
    public static final R0 SHORT_CIRCUIT;
    public static final R0 SIZED;
    public static final R0 SORTED;
    static final int f;
    static final int g;
    static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    static final int l;
    static final int m;
    static final int n;
    static final int o;
    static final int p;
    static final int q;
    static final int r;
    static final int s;
    private static final /* synthetic */ R0[] t;
    private final EnumMap a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    static {
        Q0 q0 = Q0.SPLITERATOR;
        P0 w = w(q0);
        Q0 q02 = Q0.STREAM;
        w.a(q02);
        Q0 q03 = Q0.OP;
        w.a.put((EnumMap) q03, (Q0) 3);
        R0 r0 = new R0("DISTINCT", 0, 0, w);
        DISTINCT = r0;
        P0 w2 = w(q0);
        w2.a(q02);
        w2.a.put((EnumMap) q03, (Q0) 3);
        R0 r02 = new R0("SORTED", 1, 1, w2);
        SORTED = r02;
        P0 w3 = w(q0);
        w3.a(q02);
        EnumMap enumMap = w3.a;
        enumMap.put((EnumMap) q03, (Q0) 3);
        Q0 q04 = Q0.TERMINAL_OP;
        enumMap.put((EnumMap) q04, (Q0) 2);
        Q0 q05 = Q0.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) q05, (Q0) 2);
        R0 r03 = new R0("ORDERED", 2, 2, w3);
        ORDERED = r03;
        P0 w4 = w(q0);
        w4.a(q02);
        w4.a.put((EnumMap) q03, (Q0) 2);
        R0 r04 = new R0("SIZED", 3, 3, w4);
        SIZED = r04;
        P0 w5 = w(q03);
        w5.a(q04);
        R0 r05 = new R0("SHORT_CIRCUIT", 4, 12, w5);
        SHORT_CIRCUIT = r05;
        t = new R0[]{r0, r02, r03, r04, r05};
        f = n(q0);
        g = n(q02);
        h = n(q03);
        n(q04);
        n(q05);
        int i2 = 0;
        for (R0 r06 : values()) {
            i2 |= r06.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        R0 r07 = DISTINCT;
        int i5 = r07.c;
        m = r07.d;
        R0 r08 = SORTED;
        int i6 = r08.c;
        n = r08.d;
        R0 r09 = ORDERED;
        o = r09.c;
        p = r09.d;
        R0 r010 = SIZED;
        q = r010.c;
        r = r010.d;
        s = SHORT_CIRCUIT.c;
    }

    private R0(String str, int i2, int i3, P0 p0) {
        Q0[] values = Q0.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            EnumMap enumMap = p0.a;
            if (i4 < length) {
                Map.EL.putIfAbsent(enumMap, values[i4], 0);
                i4++;
            } else {
                this.a = enumMap;
                int i5 = i3 * 2;
                this.b = i5;
                this.c = 1 << i5;
                this.d = 2 << i5;
                this.e = 3 << i5;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            i4 = i;
        } else {
            i4 = ~(((j & i2) << 1) | i2 | ((k & i2) >> 1));
        }
        return i2 | (i3 & i4);
    }

    private static int n(Q0 q0) {
        int i2 = 0;
        for (R0 r0 : values()) {
            i2 |= ((Integer) r0.a.get(q0)).intValue() << r0.b;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i2 = characteristics & 4;
        int i3 = f;
        if (i2 != 0 && spliterator.getComparator() != null) {
            return characteristics & i3 & (-5);
        }
        return characteristics & i3;
    }

    public static R0 valueOf(String str) {
        return (R0) Enum.valueOf(R0.class, str);
    }

    public static R0[] values() {
        return (R0[]) t.clone();
    }

    private static P0 w(Q0 q0) {
        P0 p0 = new P0(new EnumMap(Q0.class));
        p0.a(q0);
        return p0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r(int i2) {
        if ((i2 & this.e) == this.c) {
            return true;
        }
        return false;
    }
}
