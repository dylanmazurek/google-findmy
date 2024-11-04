package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class npb {
    private static final ConcurrentMap n = new ConcurrentHashMap();
    public final String[] a;
    public final String[] b;
    public final String[] c;
    public final String[] d;
    public final String[] e;
    public final String[] f;
    public final TreeMap g;
    public final TreeMap h;
    public final TreeMap i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    private npb(Locale locale) {
        DateFormatSymbols b = nnt.b(locale);
        this.a = b.getEras();
        this.b = d(b.getWeekdays());
        this.c = d(b.getShortWeekdays());
        this.d = e(b.getMonths());
        this.e = e(b.getShortMonths());
        this.f = b.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i = 0; i < 13; i++) {
            numArr[i] = Integer.valueOf(i);
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        this.g = treeMap;
        c(treeMap, this.a, numArr);
        if ("en".equals(locale.getLanguage())) {
            treeMap.put("BCE", numArr[0]);
            treeMap.put("CE", numArr[1]);
        }
        TreeMap treeMap2 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        this.h = treeMap2;
        c(treeMap2, this.b, numArr);
        c(treeMap2, this.c, numArr);
        f(treeMap2, 7, numArr);
        TreeMap treeMap3 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        this.i = treeMap3;
        c(treeMap3, this.d, numArr);
        c(treeMap3, this.e, numArr);
        f(treeMap3, 12, numArr);
        this.j = b(this.a);
        this.k = b(this.b);
        b(this.c);
        this.l = b(this.d);
        b(this.e);
        this.m = b(this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static npb a(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        ConcurrentMap concurrentMap = n;
        npb npbVar = (npb) concurrentMap.get(locale);
        if (npbVar == null) {
            npbVar = new npb(locale);
            npb npbVar2 = (npb) concurrentMap.putIfAbsent(locale, npbVar);
            if (npbVar2 != null) {
                return npbVar2;
            }
        }
        return npbVar;
    }

    private static int b(String[] strArr) {
        int length;
        int length2 = strArr.length;
        int i = 0;
        while (true) {
            length2--;
            if (length2 >= 0) {
                String str = strArr[length2];
                if (str != null && (length = str.length()) > i) {
                    i = length;
                }
            } else {
                return i;
            }
        }
    }

    private static void c(TreeMap treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                String str = strArr[length];
                if (str != null) {
                    treeMap.put(str, numArr[length]);
                }
            } else {
                return;
            }
        }
    }

    private static String[] d(String[] strArr) {
        int i;
        String[] strArr2 = new String[8];
        int i2 = 1;
        while (i2 < 8) {
            int i3 = i2 + 1;
            if (i2 < 7) {
                i = i3;
            } else {
                i = 1;
            }
            strArr2[i2] = strArr[i];
            i2 = i3;
        }
        return strArr2;
    }

    private static String[] e(String[] strArr) {
        String[] strArr2 = new String[13];
        for (int i = 1; i < 13; i++) {
            strArr2[i] = strArr[i - 1];
        }
        return strArr2;
    }

    private static void f(TreeMap treeMap, int i, Integer[] numArr) {
        for (int i2 = 1; i2 <= i; i2++) {
            treeMap.put(String.valueOf(i2).intern(), numArr[i2]);
        }
    }
}
