package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ghi extends jef {
    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        lcq lcqVar = (lcq) obj;
        switch (lcqVar) {
            case DROP_REASON_UNKNOWN:
                return gxz.a;
            case INVALID_PAYLOAD:
                return gxz.b;
            case SILENT_NOTIFICATION:
                return gxz.c;
            case USER_SUPPRESSED:
                return gxz.e;
            case INVALID_TARGET_STATE:
                return gxz.f;
            case WORK_PROFILE:
                return gxz.g;
            case HANDLED_BY_APP:
                return gxz.d;
            case UNICORN_OR_GRIFFIN_ACCOUNT:
                return gxz.h;
            case SEARCH_DISCOVER_DISABLED:
                return gxz.i;
            case SEARCH_OUTSIDE_CONTEXT_FENCE:
                return gxz.j;
            case SEARCH_ACCOUNT_MISSING_OR_MISMATCH:
                return gxz.k;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(lcqVar.toString()));
        }
    }

    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        gxz gxzVar = (gxz) obj;
        switch (gxzVar.ordinal()) {
            case 0:
                return lcq.DROP_REASON_UNKNOWN;
            case 1:
                return lcq.INVALID_PAYLOAD;
            case 2:
                return lcq.SILENT_NOTIFICATION;
            case 3:
                return lcq.HANDLED_BY_APP;
            case 4:
                return lcq.USER_SUPPRESSED;
            case 5:
                return lcq.INVALID_TARGET_STATE;
            case 6:
                return lcq.WORK_PROFILE;
            case 7:
                return lcq.UNICORN_OR_GRIFFIN_ACCOUNT;
            case 8:
                return lcq.SEARCH_DISCOVER_DISABLED;
            case 9:
                return lcq.SEARCH_OUTSIDE_CONTEXT_FENCE;
            case 10:
                return lcq.SEARCH_ACCOUNT_MISSING_OR_MISMATCH;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(gxzVar.toString()));
        }
    }
}
