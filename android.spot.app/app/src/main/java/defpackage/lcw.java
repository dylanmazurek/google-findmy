package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcw implements ljq {
    private final /* synthetic */ int v;
    public static final ljq u = new lcw(20);
    public static final ljq t = new lcw(19);
    public static final ljq s = new lcw(18);
    public static final ljq r = new lcw(17);
    public static final ljq q = new lcw(16);
    public static final ljq p = new lcw(15);
    public static final ljq o = new lcw(14);
    public static final ljq n = new lcw(13);
    public static final ljq m = new lcw(12);
    public static final ljq l = new lcw(11);
    public static final ljq k = new lcw(10);
    public static final ljq j = new lcw(9);
    public static final ljq i = new lcw(8);
    public static final ljq h = new lcw(7);
    static final ljq g = new lcw(6);
    static final ljq f = new lcw(5);
    static final ljq e = new lcw(4);
    static final ljq d = new lcw(3);
    static final ljq c = new lcw(2);
    static final ljq b = new lcw(1);
    static final ljq a = new lcw(0);

    private lcw(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ljq
    public final boolean a(int i2) {
        lfa lfaVar;
        switch (this.v) {
            case 0:
                return a.Q(i2);
            case 1:
                return a.P(i2);
            case 2:
                return a.Q(i2);
            case 3:
                return a.R(i2);
            case 4:
                return a.P(i2);
            case 5:
                return a.T(i2);
            case 6:
                if (lde.b(i2) == null) {
                    return false;
                }
                return true;
            case 7:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        return false;
                }
            case 8:
                return a.P(i2);
            case 9:
                if (a.M(i2) == 0) {
                    return false;
                }
                return true;
            case 10:
                return a.R(i2);
            case 11:
                return a.P(i2);
            case 12:
                return a.Q(i2);
            case 13:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        lfaVar = null;
                                    } else {
                                        lfaVar = lfa.CHROME_OS;
                                    }
                                } else {
                                    lfaVar = lfa.BATTLESTAR;
                                }
                            } else {
                                lfaVar = lfa.AUTOMOTIVE;
                            }
                        } else {
                            lfaVar = lfa.WEARABLE;
                        }
                    } else {
                        lfaVar = lfa.TV;
                    }
                } else {
                    lfaVar = lfa.DEFAULT;
                }
                if (lfaVar == null) {
                    return false;
                }
                return true;
            case 14:
                if (lfb.b(i2) == null) {
                    return false;
                }
                return true;
            case 15:
                if (lfc.b(i2) == null) {
                    return false;
                }
                return true;
            case 16:
                if (lfe.b(i2) == null) {
                    return false;
                }
                return true;
            case 17:
                return a.S(i2);
            case 18:
                return a.T(i2);
            case 19:
                return a.P(i2);
            default:
                return a.Q(i2);
        }
    }
}
