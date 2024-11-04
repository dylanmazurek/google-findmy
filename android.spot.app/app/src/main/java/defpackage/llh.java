package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class llh {
    public static final kzy a;

    static {
        lkz lkzVar = lkz.a;
        a = new kzy();
    }

    public static void A(int i, List list, ktd ktdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof lkh) {
                lkh lkhVar = (lkh) list;
                if (z) {
                    ((liv) ktdVar.a).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < lkhVar.b; i4++) {
                        i3 += liv.ac(lkhVar.a(i4));
                    }
                    ((liv) ktdVar.a).C(i3);
                    while (i2 < lkhVar.b) {
                        ((liv) ktdVar.a).E(lkhVar.a(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < lkhVar.b) {
                    ((liv) ktdVar.a).D(i, lkhVar.a(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((liv) ktdVar.a).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += liv.ac(((Long) list.get(i6)).longValue());
                }
                ((liv) ktdVar.a).C(i5);
                while (i2 < list.size()) {
                    ((liv) ktdVar.a).E(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((liv) ktdVar.a).D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static Object B(Object obj, int i, List list, ljq ljqVar, Object obj2, kzy kzyVar) {
        if (ljqVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (ljqVar.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = m(obj, i, intValue, obj2);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!ljqVar.a(intValue2)) {
                    obj2 = m(obj, i, intValue2, obj2);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static int a(List list) {
        return list.size() * 4;
    }

    public static int b(List list) {
        return list.size() * 8;
    }

    public static int c(int i, Object obj, llg llgVar) {
        if (obj instanceof lke) {
            return liv.N(i, (lke) obj);
        }
        return liv.Y(i) + liv.R((lkq) obj, llgVar);
    }

    public static int d(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ljo) {
            ljo ljoVar = (ljo) list;
            i = 0;
            while (i2 < size) {
                i += liv.T(ljoVar.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += liv.T(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int e(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lkh) {
            lkh lkhVar = (lkh) list;
            i = 0;
            while (i2 < size) {
                i += liv.V(lkhVar.a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += liv.V(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int f(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ljo) {
            ljo ljoVar = (ljo) list;
            i = 0;
            while (i2 < size) {
                i += liv.aa(ljoVar.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += liv.aa(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * liv.at(i);
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * liv.au(i);
    }

    public static /* synthetic */ int i(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ljo) {
            ljo ljoVar = (ljo) list;
            i = 0;
            while (i2 < size) {
                i += liv.L(ljoVar.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += liv.L(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static /* synthetic */ int j(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lkh) {
            lkh lkhVar = (lkh) list;
            i = 0;
            while (i2 < size) {
                i += liv.ac(lkhVar.a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += liv.ac(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void k(Object obj, Object obj2) {
        ljd k = kzv.k(obj2);
        if (!k.h()) {
            ljd l = kzv.l(obj);
            for (int i = 0; i < k.b.a(); i++) {
                l.f(k.b.e(i));
            }
            Iterator it = k.b.b().iterator();
            while (it.hasNext()) {
                l.f((Map.Entry) it.next());
            }
        }
    }

    public static void l(Object obj, Object obj2) {
        llp C = kzy.C(obj);
        llp C2 = kzy.C(obj2);
        if (!llp.a.equals(C2)) {
            if (llp.a.equals(C)) {
                int i = C.b + C2.b;
                int[] copyOf = Arrays.copyOf(C.c, i);
                System.arraycopy(C2.c, 0, copyOf, C.b, C2.b);
                Object[] copyOf2 = Arrays.copyOf(C.d, i);
                System.arraycopy(C2.d, 0, copyOf2, C.b, C2.b);
                C = new llp(i, copyOf, copyOf2, true);
            } else if (!C2.equals(llp.a)) {
                C.b();
                int i2 = C.b + C2.b;
                C.c(i2);
                System.arraycopy(C2.c, 0, C.c, C.b, C2.b);
                System.arraycopy(C2.d, 0, C.d, C.b, C2.b);
                C.b = i2;
            }
        }
        kzy.D(obj, C);
    }

    public static Object m(Object obj, int i, int i2, Object obj2) {
        if (obj2 == null) {
            obj2 = kzy.E(obj);
        }
        kzy.B(obj2, i, i2);
        return obj2;
    }

    public static void n(int i, List list, ktd ktdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof lid) {
                lid lidVar = (lid) list;
                if (z) {
                    ((liv) ktdVar.a).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < lidVar.a; i4++) {
                        lidVar.f(i4);
                        i3++;
                    }
                    ((liv) ktdVar.a).C(i3);
                    while (i2 < lidVar.a) {
                        ((liv) ktdVar.a).j(lidVar.f(i2) ? (byte) 1 : (byte) 0);
                        i2++;
                    }
                    return;
                }
                while (i2 < lidVar.a) {
                    ((liv) ktdVar.a).l(i, lidVar.f(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((liv) ktdVar.a).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Boolean) list.get(i6)).booleanValue();
                    i5++;
                }
                ((liv) ktdVar.a).C(i5);
                while (i2 < list.size()) {
                    ((liv) ktdVar.a).j(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((liv) ktdVar.a).l(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void o(int i, List list, ktd ktdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof liw) {
                liw liwVar = (liw) list;
                if (z) {
                    ((liv) ktdVar.a).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < liwVar.a; i4++) {
                        liwVar.e(i4);
                        i3 += 8;
                    }
                    ((liv) ktdVar.a).C(i3);
                    while (i2 < liwVar.a) {
                        ((liv) ktdVar.a).aj(liwVar.e(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < liwVar.a) {
                    ((liv) ktdVar.a).ai(i, liwVar.e(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((liv) ktdVar.a).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Double) list.get(i6)).doubleValue();
                    i5 += 8;
                }
                ((liv) ktdVar.a).C(i5);
                while (i2 < list.size()) {
                    ((liv) ktdVar.a).aj(((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((liv) ktdVar.a).ai(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
        }
    }

    public static void p(int i, List list, ktd ktdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof ljo) {
                ljo ljoVar = (ljo) list;
                if (z) {
                    ((liv) ktdVar.a).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ljoVar.b; i4++) {
                        i3 += liv.L(ljoVar.e(i4));
                    }
                    ((liv) ktdVar.a).C(i3);
                    while (i2 < ljoVar.b) {
                        ((liv) ktdVar.a).t(ljoVar.e(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ljoVar.b) {
                    ((liv) ktdVar.a).s(i, ljoVar.e(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((liv) ktdVar.a).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += liv.L(((Integer) list.get(i6)).intValue());
                }
                ((liv) ktdVar.a).C(i5);
                while (i2 < list.size()) {
                    ((liv) ktdVar.a).t(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((liv) ktdVar.a).s(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void q(int i, List list, ktd ktdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof ljo) {
                ljo ljoVar = (ljo) list;
                if (z) {
                    ((liv) ktdVar.a).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ljoVar.b; i4++) {
                        ljoVar.e(i4);
                        i3 += 4;
                    }
                    ((liv) ktdVar.a).C(i3);
                    while (i2 < ljoVar.b) {
                        ((liv) ktdVar.a).p(ljoVar.e(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ljoVar.b) {
                    ((liv) ktdVar.a).o(i, ljoVar.e(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((liv) ktdVar.a).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).intValue();
                    i5 += 4;
                }
                ((liv) ktdVar.a).C(i5);
                while (i2 < list.size()) {
                    ((liv) ktdVar.a).p(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((liv) ktdVar.a).o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void r(int i, List list, ktd ktdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof lkh) {
                lkh lkhVar = (lkh) list;
                if (z) {
                    ((liv) ktdVar.a).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < lkhVar.b; i4++) {
                        lkhVar.a(i4);
                        i3 += 8;
                    }
                    ((liv) ktdVar.a).C(i3);
                    while (i2 < lkhVar.b) {
                        ((liv) ktdVar.a).r(lkhVar.a(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < lkhVar.b) {
                    ((liv) ktdVar.a).q(i, lkhVar.a(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((liv) ktdVar.a).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) list.get(i6)).longValue();
                    i5 += 8;
                }
                ((liv) ktdVar.a).C(i5);
                while (i2 < list.size()) {
                    ((liv) ktdVar.a).r(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((liv) ktdVar.a).q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void s(int i, List list, ktd ktdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof ljf) {
                ljf ljfVar = (ljf) list;
                if (z) {
                    ((liv) ktdVar.a).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ljfVar.a; i4++) {
                        ljfVar.e(i4);
                        i3 += 4;
                    }
                    ((liv) ktdVar.a).C(i3);
                    while (i2 < ljfVar.a) {
                        ((liv) ktdVar.a).al(ljfVar.e(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ljfVar.a) {
                    ((liv) ktdVar.a).ak(i, ljfVar.e(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((liv) ktdVar.a).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Float) list.get(i6)).floatValue();
                    i5 += 4;
                }
                ((liv) ktdVar.a).C(i5);
                while (i2 < list.size()) {
                    ((liv) ktdVar.a).al(((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((liv) ktdVar.a).ak(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
        }
    }

    public static void t(int i, List list, ktd ktdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof ljo) {
                ljo ljoVar = (ljo) list;
                if (z) {
                    ((liv) ktdVar.a).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ljoVar.b; i4++) {
                        i3 += liv.L(ljoVar.e(i4));
                    }
                    ((liv) ktdVar.a).C(i3);
                    while (i2 < ljoVar.b) {
                        ((liv) ktdVar.a).t(ljoVar.e(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ljoVar.b) {
                    ((liv) ktdVar.a).s(i, ljoVar.e(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((liv) ktdVar.a).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += liv.L(((Integer) list.get(i6)).intValue());
                }
                ((liv) ktdVar.a).C(i5);
                while (i2 < list.size()) {
                    ((liv) ktdVar.a).t(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((liv) ktdVar.a).s(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void u(int i, List list, ktd ktdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof lkh) {
                lkh lkhVar = (lkh) list;
                if (z) {
                    ((liv) ktdVar.a).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < lkhVar.b; i4++) {
                        i3 += liv.ac(lkhVar.a(i4));
                    }
                    ((liv) ktdVar.a).C(i3);
                    while (i2 < lkhVar.b) {
                        ((liv) ktdVar.a).E(lkhVar.a(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < lkhVar.b) {
                    ((liv) ktdVar.a).D(i, lkhVar.a(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((liv) ktdVar.a).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += liv.ac(((Long) list.get(i6)).longValue());
                }
                ((liv) ktdVar.a).C(i5);
                while (i2 < list.size()) {
                    ((liv) ktdVar.a).E(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((liv) ktdVar.a).D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void v(int i, List list, ktd ktdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof ljo) {
                ljo ljoVar = (ljo) list;
                if (z) {
                    ((liv) ktdVar.a).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ljoVar.b; i4++) {
                        ljoVar.e(i4);
                        i3 += 4;
                    }
                    ((liv) ktdVar.a).C(i3);
                    while (i2 < ljoVar.b) {
                        ((liv) ktdVar.a).p(ljoVar.e(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ljoVar.b) {
                    ((liv) ktdVar.a).o(i, ljoVar.e(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((liv) ktdVar.a).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).intValue();
                    i5 += 4;
                }
                ((liv) ktdVar.a).C(i5);
                while (i2 < list.size()) {
                    ((liv) ktdVar.a).p(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((liv) ktdVar.a).o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void w(int i, List list, ktd ktdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof lkh) {
                lkh lkhVar = (lkh) list;
                if (z) {
                    ((liv) ktdVar.a).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < lkhVar.b; i4++) {
                        lkhVar.a(i4);
                        i3 += 8;
                    }
                    ((liv) ktdVar.a).C(i3);
                    while (i2 < lkhVar.b) {
                        ((liv) ktdVar.a).r(lkhVar.a(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < lkhVar.b) {
                    ((liv) ktdVar.a).q(i, lkhVar.a(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((liv) ktdVar.a).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) list.get(i6)).longValue();
                    i5 += 8;
                }
                ((liv) ktdVar.a).C(i5);
                while (i2 < list.size()) {
                    ((liv) ktdVar.a).r(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((liv) ktdVar.a).q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void x(int i, List list, ktd ktdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof ljo) {
                ljo ljoVar = (ljo) list;
                if (z) {
                    ((liv) ktdVar.a).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ljoVar.b; i4++) {
                        i3 += liv.T(ljoVar.e(i4));
                    }
                    ((liv) ktdVar.a).C(i3);
                    while (i2 < ljoVar.b) {
                        ((liv) ktdVar.a).ao(ljoVar.e(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ljoVar.b) {
                    ((liv) ktdVar.a).an(i, ljoVar.e(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((liv) ktdVar.a).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += liv.T(((Integer) list.get(i6)).intValue());
                }
                ((liv) ktdVar.a).C(i5);
                while (i2 < list.size()) {
                    ((liv) ktdVar.a).ao(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((liv) ktdVar.a).an(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void y(int i, List list, ktd ktdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof lkh) {
                lkh lkhVar = (lkh) list;
                if (z) {
                    ((liv) ktdVar.a).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < lkhVar.b; i4++) {
                        i3 += liv.V(lkhVar.a(i4));
                    }
                    ((liv) ktdVar.a).C(i3);
                    while (i2 < lkhVar.b) {
                        ((liv) ktdVar.a).aq(lkhVar.a(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < lkhVar.b) {
                    ((liv) ktdVar.a).ap(i, lkhVar.a(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((liv) ktdVar.a).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += liv.V(((Long) list.get(i6)).longValue());
                }
                ((liv) ktdVar.a).C(i5);
                while (i2 < list.size()) {
                    ((liv) ktdVar.a).aq(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((liv) ktdVar.a).ap(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void z(int i, List list, ktd ktdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof ljo) {
                ljo ljoVar = (ljo) list;
                if (z) {
                    ((liv) ktdVar.a).A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ljoVar.b; i4++) {
                        i3 += liv.aa(ljoVar.e(i4));
                    }
                    ((liv) ktdVar.a).C(i3);
                    while (i2 < ljoVar.b) {
                        ((liv) ktdVar.a).C(ljoVar.e(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ljoVar.b) {
                    ((liv) ktdVar.a).B(i, ljoVar.e(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ((liv) ktdVar.a).A(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += liv.aa(((Integer) list.get(i6)).intValue());
                }
                ((liv) ktdVar.a).C(i5);
                while (i2 < list.size()) {
                    ((liv) ktdVar.a).C(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((liv) ktdVar.a).B(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }
}
