package defpackage;

import j$.util.function.Predicate$CC;
import java.util.AbstractMap;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eju implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ eju(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 0:
                return Predicate$CC.$default$and(this, predicate);
            case 1:
                return Predicate$CC.$default$and(this, predicate);
            case 2:
                return Predicate$CC.$default$and(this, predicate);
            case 3:
                return Predicate$CC.$default$and(this, predicate);
            case 4:
                return Predicate$CC.$default$and(this, predicate);
            case 5:
                return Predicate$CC.$default$and(this, predicate);
            case 6:
                return Predicate$CC.$default$and(this, predicate);
            case 7:
                return Predicate$CC.$default$and(this, predicate);
            case 8:
                return Predicate$CC.$default$and(this, predicate);
            case 9:
                return Predicate$CC.$default$and(this, predicate);
            case 10:
                return Predicate$CC.$default$and(this, predicate);
            case 11:
                return Predicate$CC.$default$and(this, predicate);
            case 12:
                return Predicate$CC.$default$and(this, predicate);
            case 13:
                return Predicate$CC.$default$and(this, predicate);
            case 14:
                return Predicate$CC.$default$and(this, predicate);
            case 15:
                return Predicate$CC.$default$and(this, predicate);
            case 16:
                return Predicate$CC.$default$and(this, predicate);
            case 17:
                return Predicate$CC.$default$and(this, predicate);
            default:
                return Predicate$CC.$default$and(this, predicate);
        }
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            case 2:
                return Predicate$CC.$default$negate(this);
            case 3:
                return Predicate$CC.$default$negate(this);
            case 4:
                return Predicate$CC.$default$negate(this);
            case 5:
                return Predicate$CC.$default$negate(this);
            case 6:
                return Predicate$CC.$default$negate(this);
            case 7:
                return Predicate$CC.$default$negate(this);
            case 8:
                return Predicate$CC.$default$negate(this);
            case 9:
                return Predicate$CC.$default$negate(this);
            case 10:
                return Predicate$CC.$default$negate(this);
            case 11:
                return Predicate$CC.$default$negate(this);
            case 12:
                return Predicate$CC.$default$negate(this);
            case 13:
                return Predicate$CC.$default$negate(this);
            case 14:
                return Predicate$CC.$default$negate(this);
            case 15:
                return Predicate$CC.$default$negate(this);
            case 16:
                return Predicate$CC.$default$negate(this);
            case 17:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 0:
                return Predicate$CC.$default$or(this, predicate);
            case 1:
                return Predicate$CC.$default$or(this, predicate);
            case 2:
                return Predicate$CC.$default$or(this, predicate);
            case 3:
                return Predicate$CC.$default$or(this, predicate);
            case 4:
                return Predicate$CC.$default$or(this, predicate);
            case 5:
                return Predicate$CC.$default$or(this, predicate);
            case 6:
                return Predicate$CC.$default$or(this, predicate);
            case 7:
                return Predicate$CC.$default$or(this, predicate);
            case 8:
                return Predicate$CC.$default$or(this, predicate);
            case 9:
                return Predicate$CC.$default$or(this, predicate);
            case 10:
                return Predicate$CC.$default$or(this, predicate);
            case 11:
                return Predicate$CC.$default$or(this, predicate);
            case 12:
                return Predicate$CC.$default$or(this, predicate);
            case 13:
                return Predicate$CC.$default$or(this, predicate);
            case 14:
                return Predicate$CC.$default$or(this, predicate);
            case 15:
                return Predicate$CC.$default$or(this, predicate);
            case 16:
                return Predicate$CC.$default$or(this, predicate);
            case 17:
                return Predicate$CC.$default$or(this, predicate);
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        lpz lpzVar;
        switch (this.a) {
            case 0:
                lqc lqcVar = (lqc) obj;
                if (lqcVar.b == 4) {
                    lpzVar = (lpz) lqcVar.c;
                } else {
                    lpzVar = lpz.e;
                }
                kyf kyfVar = lpzVar.b;
                if (kyfVar == null) {
                    kyfVar = kyf.r;
                }
                kyq kyqVar = kyfVar.f;
                if (kyqVar == null) {
                    kyqVar = kyq.g;
                }
                if (kyqVar.e.z()) {
                    return false;
                }
                return true;
            case 1:
                lqd lqdVar = ((dzs) obj).a.d;
                if (lqdVar == null) {
                    lqdVar = lqd.d;
                }
                lqf b = lqf.b(lqdVar.c);
                if (b == null) {
                    b = lqf.UNRECOGNIZED;
                }
                return b.equals(lqf.SUPERVISED_ANDROID_DEVICE);
            case 2:
                return ((jer) obj).g();
            case 3:
                jiy jiyVar = ekh.am;
                kym kymVar = ((kzb) obj).b;
                if (kymVar == null) {
                    kymVar = kym.f;
                }
                if (kymVar.b != 9) {
                    return false;
                }
                return true;
            case 4:
                kzq kzqVar = (kzq) obj;
                jnk jnkVar = eku.a;
                if (kzqVar.c || (kzqVar.a & 1) == 0) {
                    return false;
                }
                return true;
            case 5:
                return ((jer) obj).g();
            case 6:
                if ((((kzb) obj).a & 1) != 0) {
                    return false;
                }
                return true;
            case 7:
                return eik.b(obj);
            case 8:
                return eik.b(obj);
            case 9:
                kym kymVar2 = ((kzb) obj).b;
                if (kymVar2 == null) {
                    kymVar2 = kym.f;
                }
                if ((kymVar2.a & 1) == 0) {
                    return false;
                }
                return true;
            case 10:
                if (((cfn) ((Map.Entry) obj).getValue()).m()) {
                    return false;
                }
                return true;
            case 11:
                kzq kzqVar2 = (kzq) obj;
                if (kzqVar2.e || kzqVar2.d) {
                    return false;
                }
                return true;
            case 12:
                return ((dya) obj).c;
            case 13:
                return ((dya) obj).c;
            case 14:
                dxx dxxVar = (dxx) obj;
                if (!dxxVar.equals(dxx.BITMAP) && !dxxVar.equals(dxx.URL)) {
                    return false;
                }
                return true;
            case 15:
                if (((eis) obj) == eis.NOT_IN_RANGE) {
                    return false;
                }
                return true;
            case 16:
                lqd lqdVar2 = ((lqc) obj).d;
                if (lqdVar2 == null) {
                    lqdVar2 = lqd.d;
                }
                lqf b2 = lqf.b(lqdVar2.c);
                if (b2 == null) {
                    b2 = lqf.UNRECOGNIZED;
                }
                return b2.equals(lqf.SPOT_DEVICE);
            case 17:
                jiy jiyVar2 = hyg.a;
                if (((Integer) ((Map.Entry) obj).getValue()).intValue() != 2) {
                    return false;
                }
                return true;
            default:
                jnk jnkVar2 = iey.a;
                return ((jer) ((AbstractMap.SimpleEntry) obj).getValue()).g();
        }
    }
}
