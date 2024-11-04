package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbj extends mpe implements mol {
    private final /* synthetic */ int l;
    public static final cbj k = new cbj(10);
    public static final cbj j = new cbj(9);
    public static final cbj i = new cbj(8);
    public static final cbj h = new cbj(7);
    public static final cbj g = new cbj(6);
    public static final cbj f = new cbj(5);
    public static final cbj e = new cbj(4);
    public static final cbj d = new cbj(3);
    public static final cbj c = new cbj(2);
    public static final cbj b = new cbj(1);
    public static final cbj a = new cbj(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbj(int i2) {
        super(2);
        this.l = i2;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        mkq mkqVar;
        int i2;
        Integer num = null;
        boolean z = true;
        switch (this.l) {
            case 0:
                eld eldVar = (eld) obj;
                Throwable th = (Throwable) obj2;
                eldVar.getClass();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                ((msk) eldVar.a).e(th);
                return mlh.a;
            case 1:
                bev bevVar = (bev) obj;
                bev bevVar2 = (bev) obj2;
                if (bevVar != null) {
                    mkqVar = bevVar.a;
                } else {
                    mkqVar = bevVar2.a;
                }
                return new bev(mkqVar);
            case 2:
                String str = (String) obj;
                mmz mmzVar = (mmz) obj2;
                str.getClass();
                mmzVar.getClass();
                if (str.length() == 0) {
                    return mmzVar.toString();
                }
                return str + ", " + mmzVar;
            case 3:
                mnb mnbVar = (mnb) obj;
                mmz mmzVar2 = (mmz) obj2;
                mnbVar.getClass();
                mmzVar2.getClass();
                mnb minusKey = mnbVar.minusKey(mmzVar2.getKey());
                if (minusKey != mnc.a) {
                    mmy mmyVar = (mmy) minusKey.get(mmy.k);
                    if (mmyVar == null) {
                        return new mmw(minusKey, mmzVar2);
                    }
                    mnb minusKey2 = minusKey.minusKey(mmy.k);
                    if (minusKey2 == mnc.a) {
                        return new mmw(mmzVar2, mmyVar);
                    }
                    return new mmw(new mmw(minusKey2, mmzVar2), mmyVar);
                }
                return mmzVar2;
            case 4:
                mnb mnbVar2 = (mnb) obj;
                mmz mmzVar3 = (mmz) obj2;
                if (mmzVar3 instanceof msp) {
                    return mnbVar2.plus(((msp) mmzVar3).a());
                }
                return mnbVar2.plus(mmzVar3);
            case 5:
                mmz mmzVar4 = (mmz) obj2;
                if (!((Boolean) obj).booleanValue() && !(mmzVar4 instanceof msp)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                return Boolean.valueOf(amr.i(obj, obj2));
            case 7:
                return Integer.valueOf(((Number) obj).intValue() + 1);
            case 8:
                mmz mmzVar5 = (mmz) obj2;
                if (mmzVar5 instanceof mvb) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    }
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 1;
                    }
                    if (i2 == 0) {
                        return mmzVar5;
                    }
                    return Integer.valueOf(i2 + 1);
                }
                return obj;
            case 9:
                mvb mvbVar = (mvb) obj;
                mmz mmzVar6 = (mmz) obj2;
                if (mvbVar == null) {
                    if (!(mmzVar6 instanceof mvb)) {
                        return null;
                    }
                    return (mvb) mmzVar6;
                }
                return mvbVar;
            default:
                nbo nboVar = (nbo) obj;
                mmz mmzVar7 = (mmz) obj2;
                if (mmzVar7 instanceof mvb) {
                    mvb mvbVar2 = (mvb) mmzVar7;
                    Object dg = mvbVar2.dg(nboVar.a);
                    Object[] objArr = nboVar.b;
                    int i3 = nboVar.d;
                    objArr[i3] = dg;
                    mvb[] mvbVarArr = nboVar.c;
                    nboVar.d = i3 + 1;
                    mvbVar2.getClass();
                    mvbVarArr[i3] = mvbVar2;
                    return nboVar;
                }
                return nboVar;
        }
    }
}
