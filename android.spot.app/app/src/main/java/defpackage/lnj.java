package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnj implements ljq {
    private final /* synthetic */ int v;
    public static final ljq u = new lnj(20);
    public static final ljq t = new lnj(19);
    public static final ljq s = new lnj(18);
    public static final ljq r = new lnj(17);
    public static final ljq q = new lnj(16);
    public static final ljq p = new lnj(15);
    public static final ljq o = new lnj(14);
    public static final ljq n = new lnj(13);
    public static final ljq m = new lnj(12);
    public static final ljq l = new lnj(11);
    public static final ljq k = new lnj(10);
    public static final ljq j = new lnj(9);
    public static final ljq i = new lnj(8);
    public static final ljq h = new lnj(7);
    public static final ljq g = new lnj(6);
    public static final ljq f = new lnj(5);
    public static final ljq e = new lnj(4);
    public static final ljq d = new lnj(3);
    public static final ljq c = new lnj(2);
    public static final ljq b = new lnj(1);
    public static final ljq a = new lnj(0);

    private lnj(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ljq
    public final boolean a(int i2) {
        loa loaVar;
        switch (this.v) {
            case 0:
                return a.T(i2);
            case 1:
                if (hzc.ar(i2) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (hzc.aq(i2) != 0) {
                    return true;
                }
                return false;
            case 3:
                return a.P(i2);
            case 4:
                switch (i2) {
                    case 0:
                        loaVar = loa.NOT_SET;
                        break;
                    case 1:
                        loaVar = loa.CPS_APP_PROCESS_GLOBAL_PROVIDER;
                        break;
                    case 2:
                        loaVar = loa.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER;
                        break;
                    case 3:
                        loaVar = loa.LOGGER_OVERRIDE_PROVIDER;
                        break;
                    case 4:
                        loaVar = loa.LOGGER_DEFERRING_PROVIDER;
                        break;
                    case 5:
                        loaVar = loa.EVENT_OVERRIDE;
                        break;
                    case 6:
                        loaVar = loa.EVENT_DEFERRING;
                        break;
                    case 7:
                        loaVar = loa.LOG_SOURCE_MAPPED;
                        break;
                    case 8:
                        loaVar = loa.SERVER_INFRASTRUCTURE;
                        break;
                    case 9:
                        loaVar = loa.LOG_REQUEST_SETTER_WEB;
                        break;
                    case 10:
                        loaVar = loa.PRIVACY_CONTEXT_RESOLVER;
                        break;
                    default:
                        loaVar = null;
                        break;
                }
                if (loaVar != null) {
                    return true;
                }
                return false;
            case 5:
                return a.P(i2);
            case 6:
                if (lon.b(i2) != null) {
                    return true;
                }
                return false;
            case 7:
                if (hzc.an(i2) != 0) {
                    return true;
                }
                return false;
            case 8:
                if (lqf.b(i2) != null) {
                    return true;
                }
                return false;
            case 9:
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
                    case 9:
                        return true;
                    default:
                        return false;
                }
            case 10:
                if (mpp.t(i2) != 0) {
                    return true;
                }
                return false;
            case 11:
                if (ndf.b(i2) != null) {
                    return true;
                }
                return false;
            case 12:
                return a.R(i2);
            case 13:
                if (mpp.s(i2) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (ndy.b(i2) != null) {
                    return true;
                }
                return false;
            case 15:
                return a.Q(i2);
            case 16:
                if (a.K(i2) != 0) {
                    return true;
                }
                return false;
            case 17:
                return a.R(i2);
            case 18:
                return a.T(i2);
            case 19:
                return a.T(i2);
            default:
                return a.P(i2);
        }
    }
}
