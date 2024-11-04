package defpackage;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tu extends mpe implements mol {
    private final /* synthetic */ int u;
    public static final tu t = new tu(20);
    public static final tu s = new tu(19);
    public static final tu r = new tu(18);
    public static final tu q = new tu(17);
    public static final tu p = new tu(16);
    public static final tu o = new tu(15);
    public static final tu n = new tu(14);
    public static final tu m = new tu(13);
    public static final tu l = new tu(12);
    public static final tu k = new tu(11);
    public static final tu j = new tu(10);
    public static final tu i = new tu(9);
    public static final tu h = new tu(8);
    public static final tu g = new tu(7);
    public static final tu f = new tu(6);
    public static final tu e = new tu(5);
    public static final tu d = new tu(4);
    public static final tu c = new tu(2);
    public static final tu b = new tu(1);
    public static final tu a = new tu(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(int i2) {
        super(2);
        this.u = i2;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        boolean z = true;
        switch (this.u) {
            case 0:
                ub ubVar = (ub) obj2;
                if (((ub) obj) != ubVar || ubVar != ub.PostExit) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                long j2 = ((blm) obj).a;
                long j3 = ((blm) obj2).a;
                Map map = xa.a;
                return qh.b(400.0f, new blm(xa.a()), 1);
            case 2:
                String str = (String) obj;
                aov aovVar = (aov) obj2;
                if (str.length() == 0) {
                    return aovVar.toString();
                }
                return str + ", " + aovVar;
            case 3:
                aox aoxVar = (aox) obj;
                aov aovVar2 = (aov) obj2;
                if (!(aovVar2 instanceof aos)) {
                    return aoxVar.a(aovVar2);
                }
                throw null;
            case 4:
                return a.r(obj, obj2);
            case 5:
                ((Number) obj2).intValue();
                ((axu) obj).h();
                return mlh.a;
            case 6:
                ((axu) obj).f((awh) obj2);
                return mlh.a;
            case 7:
                ((axu) obj).g((aox) obj2);
                return mlh.a;
            case 8:
                ((axu) obj).e((acd) obj2);
                return mlh.a;
            case 9:
                bfe bfeVar = ((bfh) obj).c;
                bfn bfnVar = bfj.a;
                return Integer.valueOf(Float.compare(((Number) bfeVar.b(bfj.n, bbi.b)).floatValue(), ((Number) ((bfh) obj2).c.b(bfj.n, bbi.a)).floatValue()));
            case 10:
                return a.r(obj, obj2);
            case 11:
                ((bch) obj).k((Matrix) obj2);
                return mlh.a;
            case 12:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                return mlh.a;
            case 13:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.addAll(list2);
                    return arrayList;
                }
                return list2;
            case 14:
                return (mlh) obj;
            case 15:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 16:
                throw null;
            case 17:
                return (String) obj;
            case 18:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 != null) {
                    ArrayList arrayList2 = new ArrayList(list3);
                    arrayList2.addAll(list4);
                    return arrayList2;
                }
                return list4;
            case 19:
                Float f2 = (Float) obj;
                ((Number) obj2).floatValue();
                return f2;
            default:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
        }
    }
}
