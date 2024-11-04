package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxd implements ljs {
    private final /* synthetic */ int a;

    public gxd(int i) {
        this.a = i;
    }

    @Override // defpackage.ljs
    public final /* synthetic */ Object a(int i) {
        lqg lqgVar;
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                if (i != 0) {
                                    if (i != 1) {
                                        lqgVar = null;
                                    } else {
                                        lqgVar = lqg.TOKEN_TYPE_CAR;
                                    }
                                } else {
                                    lqgVar = lqg.TOKEN_TYPE_UNKNOWN;
                                }
                                if (lqgVar == null) {
                                    return lqg.UNRECOGNIZED;
                                }
                                return lqgVar;
                            }
                            jac b = jac.b(i);
                            if (b == null) {
                                return jac.OWNER_USER_TYPE_UNKNOWN;
                            }
                            return b;
                        }
                        knd b2 = knd.b(i);
                        if (b2 == null) {
                            return knd.UNKNOWN;
                        }
                        return b2;
                    }
                    knd b3 = knd.b(i);
                    if (b3 == null) {
                        return knd.UNKNOWN;
                    }
                    return b3;
                }
                lgp b4 = lgp.b(i);
                if (b4 == null) {
                    return lgp.REGISTRATION_REASON_UNSPECIFIED;
                }
                return b4;
            }
            lgp b5 = lgp.b(i);
            if (b5 == null) {
                return lgp.REGISTRATION_REASON_UNSPECIFIED;
            }
            return b5;
        }
        lgd b6 = lgd.b(i);
        if (b6 == null) {
            return lgd.FETCH_REASON_UNSPECIFIED;
        }
        return b6;
    }
}
