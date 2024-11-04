package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kys implements ljq {
    private final /* synthetic */ int v;
    public static final ljq u = new kys(20);
    public static final ljq t = new kys(19);
    public static final ljq s = new kys(18);
    public static final ljq r = new kys(17);
    public static final ljq q = new kys(16);
    public static final ljq p = new kys(15);
    public static final ljq o = new kys(14);
    public static final ljq n = new kys(13);
    public static final ljq m = new kys(12);
    public static final ljq l = new kys(11);
    public static final ljq k = new kys(10);
    public static final ljq j = new kys(9);
    public static final ljq i = new kys(8);
    public static final ljq h = new kys(7);
    public static final ljq g = new kys(6);
    public static final ljq f = new kys(5);
    public static final ljq e = new kys(4);
    public static final ljq d = new kys(3);
    public static final ljq c = new kys(2);
    public static final ljq b = new kys(1);
    public static final ljq a = new kys(0);

    private kys(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ljq
    public final boolean a(int i2) {
        ljp ljpVar = null;
        switch (this.v) {
            case 0:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    ljpVar = kyt.FMDN_CONTRIBUTOR_ALL_LOCATIONS;
                                }
                            } else {
                                ljpVar = kyt.FMDN_CONTRIBUTOR_HIGH_TRAFFIC;
                            }
                        } else {
                            ljpVar = kyt.FMDN_ALL_LOCATIONS;
                        }
                    } else {
                        ljpVar = kyt.FMDN_HIGH_TRAFFIC;
                    }
                } else {
                    ljpVar = kyt.FMDN_DISABLED_DEFAULT;
                }
                if (ljpVar == null) {
                    return false;
                }
                return true;
            case 1:
                if (hwx.ab(i2) == 0) {
                    return false;
                }
                return true;
            case 2:
                if (a.x(i2) == 0) {
                    return false;
                }
                return true;
            case 3:
                if (a.x(i2) == 0) {
                    return false;
                }
                return true;
            case 4:
                if (kzv.d(i2) == 0) {
                    return false;
                }
                return true;
            case 5:
                if (a.M(i2) == 0) {
                    return false;
                }
                return true;
            case 6:
                return a.R(i2);
            case 7:
                return a.S(i2);
            case 8:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ljpVar = lbw.BANNED;
                        }
                    } else {
                        ljpVar = lbw.ALLOWED;
                    }
                } else {
                    ljpVar = lbw.CHANNEL_GROUP_STATE_UNKNOWN;
                }
                if (ljpVar == null) {
                    return false;
                }
                return true;
            case 9:
                switch (i2) {
                    case 0:
                        ljpVar = lby.IMPORTANCE_UNSPECIFIED;
                        break;
                    case 1:
                        ljpVar = lby.IMPORTANCE_NONE;
                        break;
                    case 2:
                        ljpVar = lby.IMPORTANCE_DEFAULT;
                        break;
                    case 3:
                        ljpVar = lby.IMPORTANCE_HIGH;
                        break;
                    case 4:
                        ljpVar = lby.IMPORTANCE_LOW;
                        break;
                    case 5:
                        ljpVar = lby.IMPORTANCE_MAX;
                        break;
                    case 6:
                        ljpVar = lby.IMPORTANCE_MIN;
                        break;
                }
                if (ljpVar == null) {
                    return false;
                }
                return true;
            case 10:
                return a.P(i2);
            case 11:
                if (kzy.a(i2) == 0) {
                    return false;
                }
                return true;
            case 12:
                return a.U(i2);
            case 13:
                return a.P(i2);
            case 14:
                return a.Q(i2);
            case 15:
                switch (i2) {
                    case 0:
                        ljpVar = lcn.UNKNOWN;
                        break;
                    case 1:
                        ljpVar = lcn.DELIVERED_FCM_PUSH;
                        break;
                    case 2:
                        ljpVar = lcn.SCHEDULED_RECEIVER;
                        break;
                    case 3:
                        ljpVar = lcn.FETCHED_LATEST_THREADS;
                        break;
                    case 4:
                        ljpVar = lcn.FETCHED_UPDATED_THREADS;
                        break;
                    case 5:
                        ljpVar = lcn.LOCAL_NOTIFICATION_CREATED;
                        break;
                    case 6:
                        ljpVar = lcn.LOCAL_NOTIFICATION_UPDATED;
                        break;
                }
                if (ljpVar == null) {
                    return false;
                }
                return true;
            case 16:
                if (i2 != 1000) {
                    if (i2 != 10001) {
                        if (i2 != 10002) {
                            switch (i2) {
                                case 0:
                                    ljpVar = lcq.DROP_REASON_UNKNOWN;
                                    break;
                                case 1:
                                    ljpVar = lcq.INVALID_PAYLOAD;
                                    break;
                                case 2:
                                    ljpVar = lcq.SILENT_NOTIFICATION;
                                    break;
                                case 3:
                                    ljpVar = lcq.USER_SUPPRESSED;
                                    break;
                                case 4:
                                    ljpVar = lcq.INVALID_TARGET_STATE;
                                    break;
                                case 5:
                                    ljpVar = lcq.WORK_PROFILE;
                                    break;
                                case 6:
                                    ljpVar = lcq.HANDLED_BY_APP;
                                    break;
                                case 7:
                                    ljpVar = lcq.UNICORN_OR_GRIFFIN_ACCOUNT;
                                    break;
                            }
                        } else {
                            ljpVar = lcq.SEARCH_ACCOUNT_MISSING_OR_MISMATCH;
                        }
                    } else {
                        ljpVar = lcq.SEARCH_OUTSIDE_CONTEXT_FENCE;
                    }
                } else {
                    ljpVar = lcq.SEARCH_DISCOVER_DISABLED;
                }
                if (ljpVar == null) {
                    return false;
                }
                return true;
            case 17:
                if (lcr.b(i2) == null) {
                    return false;
                }
                return true;
            case 18:
                return a.T(i2);
            case 19:
                if (lct.b(i2) == null) {
                    return false;
                }
                return true;
            default:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ljpVar = lcu.BANNED;
                        }
                    } else {
                        ljpVar = lcu.ALLOWED;
                    }
                } else {
                    ljpVar = lcu.APP_BLOCK_STATE_UNKNOWN;
                }
                if (ljpVar == null) {
                    return false;
                }
                return true;
        }
    }
}
