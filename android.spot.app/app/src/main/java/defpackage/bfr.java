package defpackage;

import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfr implements Comparator {
    private final /* synthetic */ int a;

    public bfr(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = 1;
        switch (this.a) {
            case 0:
                return mjo.C(Integer.valueOf(((bfq) obj).b), Integer.valueOf(((bfq) obj2).b));
            case 1:
                ayr ayrVar = (ayr) obj;
                ayr ayrVar2 = (ayr) obj2;
                mnw mnwVar = ayr.b;
                if (ayrVar.i() == ayrVar2.i()) {
                    return mpd.a(ayrVar.k(), ayrVar2.k());
                }
                return Float.compare(ayrVar.i(), ayrVar2.i());
            case 2:
                mkw mkwVar = (mkw) obj;
                mkw mkwVar2 = (mkw) obj2;
                return (((Number) mkwVar.b).intValue() - ((Number) mkwVar.a).intValue()) - (((Number) mkwVar2.b).intValue() - ((Number) mkwVar2.a).intValue());
            case 3:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                int length = bArr.length;
                int length2 = bArr2.length;
                if (length != length2) {
                    return length - length2;
                }
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    byte b = bArr[i4];
                    byte b2 = bArr2[i4];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 4:
                return mjo.C((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 5:
                return mjo.C((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 6:
                return mjo.C(((cjq) obj).a, ((cjq) obj2).a);
            case 7:
                return mjo.C(((cjs) obj).a, ((cjs) obj2).a);
            case 8:
                int i5 = gjs.a;
                return Long.compare(((lgf) obj).j, ((lgf) obj2).j);
            case 9:
                int i6 = glo.a;
                return Long.compare(((lgf) obj).j, ((lgf) obj2).j);
            case 10:
                int i7 = glp.a;
                return Long.compare(((lgf) obj).j, ((lgf) obj2).j);
            case 11:
                lga lgaVar = ((ggk) obj).d;
                ggk ggkVar = (ggk) obj2;
                joo jooVar = glz.a;
                int D = a.D(lgaVar.k);
                if (D == 0) {
                    D = 1;
                }
                int D2 = a.D(ggkVar.d.k);
                if (D2 != 0) {
                    i3 = D2;
                }
                return glz.f(D) - glz.f(i3);
            case 12:
                lel lelVar = (lel) obj;
                if (lelVar.y()) {
                    i = lelVar.i();
                } else {
                    int i8 = lelVar.y;
                    if (i8 == 0) {
                        i8 = lelVar.i();
                        lelVar.y = i8;
                    }
                    i = i8;
                }
                Integer valueOf = Integer.valueOf(i);
                lel lelVar2 = (lel) obj2;
                if (lelVar2.y()) {
                    i2 = lelVar2.i();
                } else {
                    int i9 = lelVar2.y;
                    if (i9 == 0) {
                        i9 = lelVar2.i();
                        lelVar2.y = i9;
                    }
                    i2 = i9;
                }
                return mjo.C(valueOf, Integer.valueOf(i2));
            case 13:
                Object obj3 = ((hnu) obj).a;
                throw null;
            case 14:
                return 0;
            case 15:
                jqr a = jqr.a(obj);
                jqr a2 = jqr.a(obj2);
                if (a == a2) {
                    int ordinal = a.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    return ((Double) obj).compareTo((Double) obj2);
                                }
                                throw null;
                            }
                            return ((Long) obj).compareTo((Long) obj2);
                        }
                        return ((String) obj).compareTo((String) obj2);
                    }
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                return a.compareTo(a2);
            default:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
        }
    }
}
