package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqn implements nrc, nra {
    private static final Map a = new ConcurrentHashMap();
    private final nns b;
    private final boolean c;

    public nqn(nns nnsVar, boolean z) {
        this.b = nnsVar;
        this.c = z;
    }

    @Override // defpackage.nra
    public final int a() {
        return b();
    }

    @Override // defpackage.nrc
    public final int b() {
        if (this.c) {
            return 6;
        }
        return 20;
    }

    @Override // defpackage.nra
    public final int c(nqw nqwVar, CharSequence charSequence, int i) {
        int intValue;
        Map map;
        Map map2 = a;
        Locale locale = nqwVar.b;
        Map map3 = (Map) map2.get(locale);
        if (map3 == null) {
            map3 = new ConcurrentHashMap();
            map2.put(locale, map3);
        }
        Object[] objArr = (Object[]) map3.get(this.b);
        if (objArr == null) {
            map = new ConcurrentHashMap(32);
            nof nofVar = new nof(nnw.a);
            nns nnsVar = this.b;
            nnq a2 = nnsVar.a(nofVar.b);
            if (a2.w()) {
                noe noeVar = new noe(nofVar, a2);
                int d = noeVar.b.d();
                int c = noeVar.b.c();
                if (c - d <= 32) {
                    intValue = noeVar.b.b(locale);
                    while (d <= c) {
                        nof nofVar2 = noeVar.a;
                        long h = noeVar.b.h(nofVar2.a, d);
                        nno nnoVar = nofVar2.b;
                        nofVar2.a = h;
                        map.put(noeVar.e(locale), Boolean.TRUE);
                        map.put(noeVar.e(locale).toLowerCase(locale), Boolean.TRUE);
                        map.put(noeVar.e(locale).toUpperCase(locale), Boolean.TRUE);
                        map.put(noeVar.f(locale), Boolean.TRUE);
                        map.put(noeVar.f(locale).toLowerCase(locale), Boolean.TRUE);
                        map.put(noeVar.f(locale).toUpperCase(locale), Boolean.TRUE);
                        d++;
                    }
                    if ("en".equals(locale.getLanguage()) && this.b == nns.b) {
                        map.put("BCE", Boolean.TRUE);
                        map.put("bce", Boolean.TRUE);
                        map.put("CE", Boolean.TRUE);
                        map.put("ce", Boolean.TRUE);
                        intValue = 3;
                    }
                    map3.put(this.b, new Object[]{map, Integer.valueOf(intValue)});
                }
                return ~i;
            }
            throw new IllegalArgumentException("Field '" + nnsVar.y + "' is not supported");
        }
        Map map4 = (Map) objArr[0];
        intValue = ((Integer) objArr[1]).intValue();
        map = map4;
        for (int min = Math.min(charSequence.length(), i + intValue); min > i; min--) {
            String charSequence2 = charSequence.subSequence(i, min).toString();
            if (map.containsKey(charSequence2)) {
                nns nnsVar2 = this.b;
                nqu c2 = nqwVar.c();
                c2.a = nnsVar2.a(nqwVar.a);
                c2.b = 0;
                c2.c = charSequence2;
                c2.d = locale;
                return min;
            }
        }
        return ~i;
    }

    @Override // defpackage.nrc
    public final void d(Appendable appendable, noh nohVar, Locale locale) {
        String str;
        try {
            if (nohVar.f(this.b)) {
                nnq a2 = this.b.a(((nod) nohVar).a);
                if (this.c) {
                    str = a2.m(nohVar, locale);
                } else {
                    str = a2.p(nohVar, locale);
                }
            } else {
                str = "�";
            }
            appendable.append(str);
        } catch (RuntimeException unused) {
            appendable.append((char) 65533);
        }
    }

    @Override // defpackage.nrc
    public final void e(Appendable appendable, long j, nno nnoVar, int i, nnw nnwVar, Locale locale) {
        String o;
        try {
            nnq a2 = this.b.a(nnoVar);
            if (this.c) {
                o = a2.l(j, locale);
            } else {
                o = a2.o(j, locale);
            }
            appendable.append(o);
        } catch (RuntimeException unused) {
            appendable.append((char) 65533);
        }
    }
}
