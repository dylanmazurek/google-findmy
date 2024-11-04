package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ehc implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ehc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
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
            default:
                return Predicate$CC.$default$and(this, predicate);
        }
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.b) {
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
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
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
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, ele] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, ele] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.b) {
            case 0:
                lpo lpoVar = ((lqi) obj).b;
                if (lpoVar == null) {
                    lpoVar = lpo.c;
                }
                return lpk.a(lpoVar.a).equals(this.a);
            case 1:
                lpo lpoVar2 = ((lqi) obj).b;
                if (lpoVar2 == null) {
                    lpoVar2 = lpo.c;
                }
                return lpk.a(lpoVar2.a).equals(this.a);
            case 2:
                return eku.j((lqc) obj, ((emz) this.a).b);
            case 3:
                return ((eon) obj).a.b.equals(this.a);
            case 4:
                if (!eku.g((lqc) obj, ((gml) this.a).c).isEmpty()) {
                    return true;
                }
                return false;
            case 5:
                return ((jis) this.a).contains((ewo) obj);
            case 6:
                if (!eku.g((lqc) obj, ((exa) this.a).a).isEmpty()) {
                    return true;
                }
                return false;
            case 7:
                return this.a.b((lqc) obj);
            case 8:
                return ((ag) this.a).az((String) obj);
            case 9:
                int i = eyf.a;
                lqd lqdVar = ((lqc) obj).d;
                if (lqdVar == null) {
                    lqdVar = lqd.d;
                }
                return lqdVar.equals(this.a);
            default:
                return ((ihx) obj).g.contains(this.a);
        }
    }
}
