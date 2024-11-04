package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lcq implements ljp {
    DROP_REASON_UNKNOWN(0),
    INVALID_PAYLOAD(1),
    SILENT_NOTIFICATION(2),
    USER_SUPPRESSED(3),
    INVALID_TARGET_STATE(4),
    WORK_PROFILE(5),
    HANDLED_BY_APP(6),
    UNICORN_OR_GRIFFIN_ACCOUNT(7),
    SEARCH_DISCOVER_DISABLED(1000),
    SEARCH_OUTSIDE_CONTEXT_FENCE(10001),
    SEARCH_ACCOUNT_MISSING_OR_MISMATCH(10002);

    public final int l;

    lcq(int i) {
        this.l = i;
    }

    @Override // defpackage.ljp
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
